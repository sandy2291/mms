  --- Insert new record for Rejected status in payment_status table---
INSERT INTO payment_status(
            id, name)
    SELECT '813edd00-f2a5-11e6-aa4e-6fcf65c25266', 'Rejected' 
WHERE NOT EXISTS (
    SELECT 1 FROM payment_status WHERE id='813edd00-f2a5-11e6-aa4e-6fcf65c25266'
);
	
ALTER TABLE invoice ADD COLUMN original_payment_status_id uuid;

CREATE TYPE rejection_contact AS
   (contact_name character varying,
    contact_email_id character varying);

CREATE TYPE rejection_template AS
   ("Id" uuid,
    invoice_number character varying,
    reporting_mark character varying,
    from_contacts rejection_contact[],
    to_contacts rejection_contact[],
	cc_contact_ids character varying,
    no_of_exceptions integer,
    rejection_amount numeric,
    rejection_number text,
    rejection_reason text,
    rejection_message character varying,
    exception_amount numeric,
    is_over_threshold boolean);
	
CREATE TYPE rejection_letter_type AS
   ("Id" uuid,
    from_contact_name character varying,
    from_contact_id character varying,
    to_contact_name character varying,
    to_contact_id character varying,
	cc_contact_ids character varying,
    no_of_exceptions integer,
    rejection_amount numeric,
    rejection_number text,
    rejection_reason text,
    rejection_message character varying,
    exception_amount numeric,
    is_over_threshold boolean,
    invoice_report_id uuid,
    rejection_letter_report_id uuid);

	-- Table: rejection_status
CREATE TABLE IF NOT EXISTS rejection_status
(
  id uuid NOT NULL,
  status character varying,
  delete_time timestamp with time zone,
  create_time timestamp with time zone NOT NULL DEFAULT now(),
  update_time timestamp with time zone NOT NULL DEFAULT now(),
  CONSTRAINT status_id PRIMARY KEY (id)
)
WITH (
  OIDS=FALSE
);

	-- Table: rejection_letter
CREATE TABLE IF NOT EXISTS rejection_letter
(
  id uuid NOT NULL,
  "number" character varying,
  invoice_id uuid NOT NULL,
  delete_time timestamp with time zone,
  create_time timestamp with time zone NOT NULL DEFAULT now(),
  update_time timestamp with time zone NOT NULL DEFAULT now(),
  rejection_reason text NOT NULL,
  resubmitted_invoice_number character varying,
  from_contact_name character varying,
  from_contact_mail_id character varying NOT NULL,
  to_contact_name character varying,
  to_contact_mail_id character varying NOT NULL,
  cc_contact_mail_id character varying,
  rejection_status_id uuid NOT NULL,
  invoice_report_id uuid NOT NULL,
  rejection_letter_report_id uuid,
  is_over_threshold boolean NOT NULL,
  exception_amount numeric,
  exception_count integer,
  rejection_message character varying NOT NULL,
  invoice_amount numeric,
  CONSTRAINT rejection_letter_pkey PRIMARY KEY (id),
  CONSTRAINT fk_rejection_letter_invoice FOREIGN KEY (invoice_id)
      REFERENCES invoice (id) MATCH SIMPLE
      ON UPDATE CASCADE ON DELETE CASCADE,
  CONSTRAINT fk_rejection_status FOREIGN KEY (rejection_status_id)
      REFERENCES rejection_status (id) MATCH SIMPLE
      ON UPDATE CASCADE ON DELETE RESTRICT
)
WITH (
  OIDS=FALSE
);

CREATE INDEX rejection_letter_invoice_idx
  ON rejection_letter
  USING btree
  (invoice_id);

CREATE TRIGGER rejection_letter_stamp
  BEFORE UPDATE
  ON rejection_letter
  FOR EACH ROW
  EXECUTE PROCEDURE update_stamp();
	


INSERT INTO rejection_status(
            id, status)
    SELECT '0cadd47c-f756-11e6-9e8f-47ce61d3b26c', 'Email Sent Manually' 
WHERE NOT EXISTS (
    SELECT 1 FROM rejection_status WHERE id='0cadd47c-f756-11e6-9e8f-47ce61d3b26c'
);
INSERT INTO rejection_status(
            id, status)
    SELECT '199af368-d069-11e6-942e-d37523e60d45', 'Email Sent' 
WHERE NOT EXISTS (
    SELECT 1 FROM rejection_status WHERE id='199af368-d069-11e6-942e-d37523e60d45'
);
INSERT INTO rejection_status(
            id, status)
    SELECT '1f9a7194-d069-11e6-942f-c7b15ba86c52', 'Closed' 
WHERE NOT EXISTS (
    SELECT 1 FROM rejection_status WHERE id='1f9a7194-d069-11e6-942f-c7b15ba86c52'
);
INSERT INTO rejection_status(
            id, status)
    SELECT 'fc8dfd24-d068-11e6-942a-4b38b34283d6', 'Generated' 
WHERE NOT EXISTS (
    SELECT 1 FROM rejection_status WHERE id='fc8dfd24-d068-11e6-942a-4b38b34283d6'
);

INSERT INTO rejection_status(
            id, status)
    SELECT 'ea87cd90-fa0b-11e6-a866-87b0680bbfc9', 'New' 
WHERE NOT EXISTS (
    SELECT 1 FROM rejection_status WHERE id='ea87cd90-fa0b-11e6-a866-87b0680bbfc9'
);
  
CREATE OR REPLACE VIEW vw_rejection_letters AS 
 SELECT DISTINCT letter.id,
    inv.billing_party,
    inv.invoice_number,
    inv.invoice_date,
    letter.number,
    letter.create_time,
    letter.invoice_amount,
    letter.rejection_reason,
    ps.status,
    letter.resubmitted_invoice_number,
    letter.update_time,
    letter.rejection_status_id,
    letter.to_contact_name,
    letter.to_contact_mail_id,
    letter.cc_contact_mail_id,
    letter.invoice_id
   FROM rejection_letter letter
     JOIN invoice inv ON letter.invoice_id = inv.id
     JOIN rejection_status ps ON letter.rejection_status_id = ps.id
  WHERE letter.delete_time IS NULL AND inv.delete_time IS NULL AND ps.status::text <> 'New'::text;

CREATE OR REPLACE VIEW vw_rejection_letter_details AS 
 SELECT letter.id,
    letter.invoice_id,
    letter.exception_amount,
    letter.invoice_amount,
    letter.exception_count,
    letter.rejection_message,
    inv.billing_party,
    inv.billed_party,
    inv.account_date,
    inv.invoice_number,
    inv.currency_indicator,
    inv.invoice_date,
    inv.taxpayer_id,
    inv.payment_terms,
    inv.payment_due_date,
    letter.from_contact_mail_id,
    letter.to_contact_mail_id
   FROM rejection_letter letter
     JOIN invoice inv ON letter.invoice_id = inv.id
  WHERE letter.delete_time IS NULL AND inv.delete_time IS NULL;

CREATE OR REPLACE VIEW vw_company_contact_details AS 
 SELECT DISTINCT cct.display_name,
    cc.name,
    cc.title,
    cc.phone,
    cc.fax,
    cc.email,
    cc.street1,
    cc.street2,
    cc.street3,
    cc.street4,
    cc.city,
    cc.state,
    cc.country_code,
    cc.zip_code,
    cc.delete_time,
    cc.create_time,
    cc.update_time,
    c.name AS company_name,
    c.is_me,
    cct.urn,
    c.reporting_mark
   FROM company_contact cc
     JOIN company c ON cc.company_id = c.id
     JOIN company_contact_to_company_contact_type cccct ON cc.id = cccct.company_contact_id
     JOIN company_contact_type cct ON cccct.company_contact_type_id = cct.id
  WHERE c.enabled = true AND cc.enabled = true AND c.delete_time IS NULL AND cc.delete_time IS NULL AND cct.delete_time IS NULL AND cccct.delete_time IS NULL;

CREATE OR REPLACE VIEW vw_invoice_car_details AS 
 SELECT inv_car.document_reference_number,
    inv_car.initial,
    inv_car.number,
    inv_car.kind,
    inv_car.load_indicator,
    inv_car.repair_date,
    inv_car.splc,
    inv_car.repairing_party,
    inv_car.repairing_party_invoice_number,
    inv_car.repairing_party_document_reference_number,
    inv_car.repair_facility_type,
    inv_car.invoice_id,
    inv_car.id
   FROM invoice_car inv_car
  WHERE inv_car.delete_time IS NULL;
 
CREATE OR REPLACE VIEW vw_invoice_car_repair_details AS 
 SELECT inv_car_rep.detail_source,
    inv_car_rep.location_on_car,
    inv_car_rep.quantity,
    inv_car_rep.condition_code,
    inv_car_rep.applied_job_code,
    inv_car_rep.applied_qualifier,
    inv_car_rep.why_made_code,
    inv_car_rep.removed_job_code,
    inv_car_rep.removed_qualifier,
    inv_car_rep.responsibility_code,
    inv_car_rep.defect_card_or_jic_party,
    inv_car_rep.defect_card_or_jic_date,
    inv_car_rep.labor_charge,
    inv_car_rep.material_charge,
    inv_car_rep.machine_pricable,
    inv_car_rep.wrong_repair,
    inv_car_rep.description,
    inv_car_rep.applied_wheel_date,
    inv_car_rep.applied_wheel_manufacture_code,
    inv_car_rep.applied_wheel_class_code,
    inv_car_rep.applied_side_reading,
    inv_car_rep.applied_finger_reading,
    inv_car_rep.removed_wheel_date,
    inv_car_rep.removed_wheel_manufacture_code,
    inv_car_rep.removed_wheel_class_code,
    inv_car_rep.removed_side_reading,
    inv_car_rep.removed_finger_reading,
    inv_car_rep.labor_rate,
    inv_car_rep.expanded_splc,
    inv_car_rep.cif_repairing_party,
    inv_car_rep.cif_billing_party,
    inv_car_rep.cif_billed_party,
    inv_car_rep.cif_defect_party,
    inv_car_rep.repair_facility_arrival_date,
    inv_car_rep.line_number,
    inv_car_rep.resubmitted_invoice_indicator,
    inv_car_rep.original_invoice_number,
    inv_car_rep.original_account_date,
    inv_car_rep.aar_component_id,
    inv_car_rep.invoice_car_id
   FROM invoice_car_repair inv_car_rep
  WHERE inv_car_rep.delete_time IS NULL;
  
INSERT INTO report_type(id, name, urn)
    SELECT '3801a188-0491-11e7-b7a0-6be202d76ce7', 'Rejection Letter', 'urn:report:type:RejectionLetter'
WHERE NOT EXISTS (
    SELECT 1 FROM report_type WHERE id='3801a188-0491-11e7-b7a0-6be202d76ce7');

CREATE OR REPLACE FUNCTION sf_check_unique_rejection_number(rejection_number text)
  RETURNS text AS
$BODY$
DECLARE 
	db_rejection_number text;
BEGIN
		SELECT  NUMBER INTO db_rejection_number
		FROM rejection_letter  
		WHERE lower(trim(NUMBER)) = lower(trim(rejection_number)) and delete_time is null;

		RETURN db_rejection_number;
END;
$BODY$
  LANGUAGE plpgsql VOLATILE
  COST 100;	
  
CREATE OR REPLACE FUNCTION sf_get_rejection_template_details(
    invoice_ids uuid[],
    module text)
  RETURNS json AS
$BODY$
DECLARE
        templates rejection_template[];
        template rejection_template;
	letter rejection_letter;
	repair_invoice invoice;
        count INTEGER;
		invoice_amount numeric;	
		exception_amount numeric;	
		exception_count INTEGER;
		number_of_ids integer := array_length(invoice_ids, 1);
		report_mark text;
		contacts rejection_contact[];
		from_contact_list rejection_contact[];
		from_contact rejection_contact;
		to_contact rejection_contact;
		inv_number text;
		invoice_count integer;
		threshold numeric;
		allowed_amount numeric;
		reject_message character varying;
				
BEGIN
		if (lower(module) != lower('RejectionTracking')) then
			reject_message := '';

			count := 1;
			select array_agg(concat('("', contact.contact_name, '","', contact.contact_email_id, '")')) into from_contact_list from 
			(select distinct cc.name as contact_name, cc.email as contact_email_id from company_contact cc join company c on cc.company_id = c.id join  company_contact_to_company_contact_type cccct on cc.id = cccct.company_contact_id join company_contact_type cct on cccct.company_contact_type_id = cct.id where c.is_me = true and urn = 'urn://Company/Contact/Type/Payable' and c.enabled = true and cc.enabled = true and c.delete_time is null and cc.delete_time is null and cct.delete_time is null and cccct.delete_time is null) contact;

			WHILE count <= number_of_ids LOOP
				repair_invoice := null;
				select * into repair_invoice from invoice where id = invoice_ids[count];
				if repair_invoice.id is not null then
					template."Id" := repair_invoice.id;
						
					template.rejection_amount :=  repair_invoice.repair_labor_charge + repair_invoice.repair_material_charge + repair_invoice.tax_charge + repair_invoice.counter_billing_charge + repair_invoice.destroyed_charge + repair_invoice.dismantled_charge + repair_invoice.material_supplied_charge + repair_invoice.other_charge;
					template.reporting_mark := repair_invoice.billing_party;
					template.invoice_number := repair_invoice.invoice_number;

					template.from_contacts := from_contact_list;

					select array_agg(concat('("', contact.contact_name, '","', contact.contact_email_id, '")')) into contacts from 
					(select distinct cc.name as contact_name, cc.email as contact_email_id from company_contact cc join company c on cc.company_id = c.id join  company_contact_to_company_contact_type cccct on cc.id =		      cccct.company_contact_id join company_contact_type cct on cccct.company_contact_type_id = cct.id where c.reporting_mark = repair_invoice.billing_party and urn = 'urn://Company/Contact/Type/Exceptions' and c.enabled = true and cc.enabled = true and c.delete_time is null and cc.delete_time is null and cct.delete_time is null and cccct.delete_time is null) contact;
					template.to_contacts := contacts;

					select (inv.exception_count + car.exception_count + repair.exception_count ) into exception_count from 
					(select count(*) as exception_count from invoice inv where inv.id = repair_invoice.id and inv.exception_id is not null) as inv,
					(select count(*) as exception_count from invoice inv join invoice_car ic on inv.id = ic.invoice_id where inv.id = repair_invoice.id and ic.exception_id is not null) as car,
					(select count(*) as exception_count from invoice inv join invoice_car ic on inv.id = ic.invoice_id join invoice_car_repair icr on ic.id = icr.invoice_car_id
					where inv.id = repair_invoice.id and icr.exception_id is not null) as repair;
					template.no_of_exceptions := exception_count;

					select (inv.amount + car.amount + repair.amount) into exception_amount from ( select coalesce(sum(amount), 0) as amount from exception ex join invoice_car_repair icr on ex.id=icr.exception_id join invoice_car ic on ic.id = icr.invoice_car_id	join invoice i on i.id = ic.invoice_id	join process p on p.id = i.process_id where i.id = repair_invoice.id and icr.exception_id is not null and ic.exception_id is null and i.exception_id is null	and i.exception_letter_generated is null and i.delete_time is null and p.delete_time is null) repair,
					(select coalesce(sum(amount), 0) as amount from exception ex join invoice_car ic on ex.id = ic.exception_id	join invoice i on i.id = ic.invoice_id join process p on p.id = i.process_id where i.id = repair_invoice.id 	and ic.exception_id is not null	and i.exception_id is null and i.exception_letter_generated is null	and i.delete_time is null and p.delete_time is null) car, 
					(select coalesce(sum(amount), 0) as amount from exception ex join invoice i on ex.id = i.exception_id join process p on p.id = i.process_id	where i.id = repair_invoice.id	and i.exception_id is null and i.exception_letter_generated is null	and i.delete_time is null and p.delete_time is null) inv;

					template.exception_amount := exception_amount;

					
					threshold := 0;
					if ( template.rejection_amount <= 10000) then
						threshold := 10;
					elsif (template.rejection_amount <= 200000) then
						threshold := 7.5;
					else
						threshold := 5;
					end if;
					allowed_amount := threshold * template.rejection_amount / 100 ;
					template.is_over_threshold := exception_amount > allowed_amount;

					templates[count] := template;
					
				end if;
				count := count + 1;

			END LOOP;
		else
			count := 1;
			WHILE count <= number_of_ids LOOP
				letter := null;
				SELECT * into letter FROM rejection_letter where invoice_id = invoice_ids[count] and delete_time is null;
				if (letter.id is not null) then
					template."Id" := letter.invoice_id;
					template.rejection_amount := letter.invoice_amount;

					select * into repair_invoice from invoice where id = letter.invoice_id;
					template.reporting_mark := repair_invoice.billing_party;
					template.invoice_number := repair_invoice.invoice_number;
					from_contact.contact_name := letter.from_contact_name;
					from_contact.contact_email_id := letter.from_contact_mail_id;
					template.from_contacts[count] := from_contact;
					
					to_contact.contact_name := letter.to_contact_name;
					to_contact.contact_email_id = letter.to_contact_mail_id;
					template.to_contacts[count] := to_contact;

					template.cc_contact_ids := letter.cc_contact_mail_id;
					template.exception_amount := letter.exception_amount;
					template.no_of_exceptions := letter.exception_count;
					template.is_over_threshold := letter.is_over_threshold;
					template.rejection_message := letter.rejection_message;
					template.rejection_number := letter."number";
					templates[count] := template;
				end if;
				count := count + 1;
			END LOOP;
		end if;
		return array_to_json(templates);
END;
$BODY$
  LANGUAGE plpgsql VOLATILE
  COST 100;
  
  CREATE OR REPLACE FUNCTION sf_update_rejection_tables(
    templates json,
    module text)
  RETURNS json AS
$BODY$
DECLARE
        record_length int;
        rejection_letter_id uuid;
         
        count int;
        letter rejection_letter_type%rowtype;
	rejectionletter rejection_letter%rowtype;
        inv invoice%rowtype;
        inv_car invoice_car%rowtype;
        inv_car_rep invoice_car_repair%rowtype;
        output uuid[];
        exception_message text[];        
        exception_amt numeric;
        rejection_status uuid; 
		MANUAL_REJECTION_REASON text;
		THRESHOLD_REJECTION_REASON text;
BEGIN
	record_length := json_array_length(templates);
	rejection_status := 'ea87cd90-fa0b-11e6-a866-87b0680bbfc9';
	MANUAL_REJECTION_REASON := 'Manual';
	THRESHOLD_REJECTION_REASON := 'Threshold';
	count := 0;
	output[count] := null;
	WHILE count < record_length LOOP
		-- parse the input
		for letter in  SELECT
		 (rec->>'id')::TEXT as id,
		 (rec->'fromContacts'->0->>'contactName')::text as from_contact_name,
		(rec->'fromContacts'->0->>'contactEmailId')::text as from_contact_id,
		(rec->'toContacts'->0->>'contactName')::text as to_contact_name,
		(rec->'toContacts'->0->>'contactEmailId')::text as to_contact_id,
		(rec->>'ccContactEmailIds')::text as cc_contact_ids,		
		(rec->>'noOfExceptions')::text as no_of_exceptions,
		(rec->>'rejectionAmount')::text as rejection_amount,		
		 (rec->>'rejectionNumber')::text as rejection_number,
		(rec->>'rejectionReason')::text as rejection_reason,
		(rec->>'rejectionMessage')::text as rejection_message,
		(rec->>'exceptionAmount')::text as exception_amount,
		(rec->>'isOverThreshold')::text as is_over_threshold,
		(rec->>'invoiceReportId')::text as invoice_report_id
		FROM json_array_elements(templates::json) rec loop
		
		if letter.is_over_threshold = true then
			letter.rejection_reason := THRESHOLD_REJECTION_REASON;
		else
			letter.rejection_reason := MANUAL_REJECTION_REASON;
		end if;
		if (lower(module) != lower('RejectionTracking')) then
			-- Get invocie details from invoice table
			for inv in select * from invoice where invoice.id = letter."Id" loop
				rejection_letter_id := uuid_generate_v1();
				output[count] := rejection_letter_id;
				count := count + 1;
				-- insert data into rejection_letter table
				
				insert into rejection_letter(id, "number", invoice_id, rejection_reason, from_contact_name, from_contact_mail_id, to_contact_name, to_contact_mail_id, rejection_status_id, invoice_report_id, rejection_letter_report_id, is_over_threshold, exception_amount, exception_count, rejection_message, invoice_amount, cc_contact_mail_id) values(rejection_letter_id, letter.rejection_number, letter."Id", letter.rejection_reason, letter.from_contact_name, letter.from_contact_id, letter.to_contact_name, letter.to_contact_id, rejection_status, letter.invoice_report_id, letter.rejection_letter_report_id, letter.is_over_threshold, letter.exception_amount, letter.no_of_exceptions, letter.rejection_message, letter.rejection_amount, letter.cc_contact_ids); 					
				
			end loop;
		else
			for rejectionletter in select * from rejection_letter where invoice_id = letter."Id" and delete_time is null loop
				output[count] := rejectionletter.id;
				count := count + 1;
				
				-- insert data into rejection_letter table
				UPDATE rejection_letter SET rejection_reason=letter.rejection_reason, rejection_status_id=rejection_status, invoice_report_id=letter.invoice_report_id, is_over_threshold=letter.is_over_threshold, rejection_message=letter.rejection_message, cc_contact_mail_id=letter.cc_contact_ids, "number"=letter.rejection_number, to_contact_name = letter.to_contact_name,  to_contact_mail_id = letter.to_contact_id  WHERE id = rejectionletter.id;		
				
			end loop;
		end if;
		end loop;
	end loop;
	return array_to_json(output);
END;
$BODY$
  LANGUAGE plpgsql VOLATILE
  COST 100;
  
CREATE OR REPLACE FUNCTION sf_get_rejection_letter_details(
    whereclause text,
    orderby text)
  RETURNS SETOF vw_rejection_letters AS
$BODY$
DECLARE
                queryStatement text;
BEGIN

                queryStatement :=  'select * from vw_rejection_letters rejection_view  ';

                IF coalesce(whereClause, '') != '' THEN
                                queryStatement := queryStatement || whereClause;
                END IF;

                IF coalesce(orderBy, '') != '' THEN
                                queryStatement := queryStatement || orderBy;
                END IF;

                RETURN query
                EXECUTE(queryStatement);

END;
$BODY$
  LANGUAGE plpgsql VOLATILE
  COST 100
  ROWS 1000;
  
CREATE OR REPLACE FUNCTION sf_delete_rejection_references(rejection_letter_id uuid)
  RETURNS integer AS
$BODY$
BEGIN	
		delete from report where id in ( select distinct report_id from report_bundle rb join report_file rf on rb.id = rf.report_bundle_id join rejection_letter letter on rf.id = letter.rejection_letter_report_id where letter.id = rejection_letter_id);

		update rejection_letter set delete_time = now() where id = rejection_letter_id;

		update invoice set payment_status_id = original_payment_status_id, original_payment_status_id = null where id in (select distinct invoice_id from rejection_letter where id = rejection_letter_id) and payment_status_id = '813edd00-f2a5-11e6-aa4e-6fcf65c25266';

		return 0;
	EXCEPTION
	WHEN OTHERS THEN
		return -1;
END;
$BODY$
  LANGUAGE plpgsql VOLATILE
  COST 100;  

--user
	
INSERT INTO role_permission(
            id, role_id, permission_id)
    VALUES ('555a5faa-5a6c-11e2-a4a0-ef58ddf4d1da', '4b7ce8ab-fa1e-4f83-b9e0-5b0c49b7e331', '7e948cae-6b99-407b-ad94-1c28a100cb84');		
	
	
--admin

INSERT INTO role_permission(
            id, role_id, permission_id)
    VALUES ('555a1112-5a6c-11e2-a4bc-1f4b6c15d00a', '30b8e171-236a-40f0-ad8e-130063a0620e', 'fde987f2-80c4-4c2a-8ab5-983e2de4dd0e');	
	
INSERT INTO role_permission(
            id, role_id, permission_id)
    VALUES ('555a0cee-5a6c-11e2-b892-4381077895c8', '30b8e171-236a-40f0-ad8e-130063a0620e', '16b2960d-ad08-4010-9244-dd024b5850e8');		
	
INSERT INTO role_permission(
            id, role_id, permission_id)
    VALUES ('555a100e-5a6c-11e2-b9b0-5b88fe1c0614', '30b8e171-236a-40f0-ad8e-130063a0620e', '88efbd5c-5f56-423a-8250-ddcf0d79626d');		
	
INSERT INTO role_permission(
            id, role_id, permission_id)
    VALUES ('555a1216-5a6c-11e2-8142-835828855a18', '30b8e171-236a-40f0-ad8e-130063a0620e', '0a486f59-2480-4fe8-8c9d-099056b30f1a');		
	
INSERT INTO role_permission(
            id, role_id, permission_id)
    VALUES ('555a0be0-5a6c-11e2-a4a2-ab48a9ded6b9', '30b8e171-236a-40f0-ad8e-130063a0620e', '00b22005-a573-46be-9fe8-048dc4e4aa49');		
	
INSERT INTO role_permission(
            id, role_id, permission_id)
    VALUES ('555a1c34-5a6c-11e2-b9f5-336821454f0f', '30b8e171-236a-40f0-ad8e-130063a0620e', '9d2afb35-68b7-4960-911f-aff7d71e2a31');		
	
INSERT INTO role_permission(
            id, role_id, permission_id)
    VALUES ('555a0ac8-5a6c-11e2-9ed7-53f7ccf5f25a', '30b8e171-236a-40f0-ad8e-130063a0620e', 'a9b4730d-4b6c-426f-bd13-910074493e44');		
	
INSERT INTO role_permission(
            id, role_id, permission_id)
    VALUES ('555a1b30-5a6c-11e2-b1ea-1fccf8190275', '30b8e171-236a-40f0-ad8e-130063a0620e', '6d3a7a40-3ee3-45ad-9afc-bb299978787a');		
	
INSERT INTO role_permission(
            id, role_id, permission_id)
    VALUES ('5559056a-5a6c-11e2-9f41-bf79a07bb662', '30b8e171-236a-40f0-ad8e-130063a0620e', '394513d5-3802-43e0-bcff-638715e986b4');		
	
INSERT INTO role_permission(
            id, role_id, permission_id)
    VALUES ('555a092e-5a6c-11e2-bafd-2b6012f4cb0b', '30b8e171-236a-40f0-ad8e-130063a0620e', '26b447c2-df8d-4a0b-a016-2efd18e6ccfa');		
	
INSERT INTO role_permission(
            id, role_id, permission_id)
    VALUES ('555a0dfc-5a6c-11e2-9547-87a36f335075', '30b8e171-236a-40f0-ad8e-130063a0620e', 'f5002ea1-516b-424c-bad0-000c9aa50d53');		
	
INSERT INTO role_permission(
            id, role_id, permission_id)
    VALUES ('555a159a-5a6c-11e2-855b-6bbde16fbfb1', '30b8e171-236a-40f0-ad8e-130063a0620e', '2e00c386-65df-467c-974f-c3ceff345775');		
	
INSERT INTO role_permission(
            id, role_id, permission_id)
    VALUES ('555a0f0a-5a6c-11e2-9f4d-6f053d866419', '30b8e171-236a-40f0-ad8e-130063a0620e', '4c7175de-e736-405e-b08f-8a81e14af438');		
	
INSERT INTO role_permission(
            id, role_id, permission_id)
    VALUES ('555a131a-5a6c-11e2-bb41-9b0276b3e1ad', '30b8e171-236a-40f0-ad8e-130063a0620e', '52b3ca8a-c4c2-4a9d-b39b-4e4fe41c2f5c');		
	
INSERT INTO role_permission(
            id, role_id, permission_id)
    VALUES ('555a1a0e-5a6c-11e2-a1ac-2b996ae60a5f', '30b8e171-236a-40f0-ad8e-130063a0620e', 'ec4a53e3-2ee7-4ef8-a580-b8a4e58b25c7');		
	
INSERT INTO role_permission(
            id, role_id, permission_id)
    VALUES ('555a141e-5a6c-11e2-9823-5f0371f290b4', '30b8e171-236a-40f0-ad8e-130063a0620e', '01199543-1b87-4369-92b7-26bf76979895');		
	
INSERT INTO role_permission(
            id, role_id, permission_id)
    VALUES ('555a1900-5a6c-11e2-8e73-e38c9054467a', '30b8e171-236a-40f0-ad8e-130063a0620e', '135980ca-52c1-4ac5-a57b-06d96736e5f9');		
	
INSERT INTO role_permission(
            id, role_id, permission_id)
    VALUES ('555a16a8-5a6c-11e2-8914-8b61208fd21a', '30b8e171-236a-40f0-ad8e-130063a0620e', '778867cd-fa44-4b10-a6cc-280b73cbfe32');		
	
