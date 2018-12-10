insert into setting_definition
values
(
uuid_generate_v1(),
'urn:SettingDefinition:EnableCarConfiguration',
'Enable Car Configuration'
,'This setting enables the car configuration link appears on the MMS application under the configuration section',
false, '79140a4b-23ab-408f-8d42-9a9215702ad9', null,now(), now());

insert into setting_definition
values
(
uuid_generate_v1(),
'urn:SettingDefinition:UmlerAPILevelIntegration',
'Umler API Level Integration'
,'This setting enables the umler API level integration when Car Configuration setting is enabled',
false, '79140a4b-23ab-408f-8d42-9a9215702ad9', null,now(), now());

insert into setting_definition
values
(
uuid_generate_v1(),
'urn:SettingDefinition:EnableNewFleetGridScreen',
'Enable new fleet grid-car-Details'
,'This setting enables the user to view the new fleet grid and car details screen.',
false, '79140a4b-23ab-408f-8d42-9a9215702ad9', null,now(), now());


----------------------------------------------------------------------
-- Table: data_types

-- DROP TABLE data_types;

CREATE TABLE data_types
(
  id integer NOT NULL,
  datatype_name character varying(30),
  allowed_size integer,
  delete_time timestamp with time zone,
  create_time timestamp with time zone NOT NULL DEFAULT now(),
  update_time timestamp with time zone NOT NULL DEFAULT now(),
  CONSTRAINT id_pk PRIMARY KEY (id)
)
WITH (
  OIDS=FALSE
);
  
CREATE TRIGGER car_configuration_data_type_time_stamp
 BEFORE UPDATE
 ON data_types
 FOR EACH ROW
 EXECUTE PROCEDURE update_stamp();
--------------------------------------------------------------------------
-- Table: car_kind

-- DROP TABLE car_kind;

CREATE TABLE car_kind
(
  id integer NOT NULL,
  car_kind character varying(50),
  code character varying(50),
  delete_time timestamp with time zone,
 create_time timestamp with time zone NOT NULL DEFAULT now(),
 update_time timestamp with time zone NOT NULL DEFAULT now(),
  CONSTRAINT car_kind_pk PRIMARY KEY (id)
)
WITH (
  OIDS=FALSE
);

CREATE TRIGGER car_configuration_car_kind_time_stamp
 BEFORE UPDATE
 ON car_kind
 FOR EACH ROW
 EXECUTE PROCEDURE update_stamp();
----------------------------------------------------------------------------
-- Table: car_configuration_details

-- DROP TABLE car_configuration_details;

CREATE TABLE car_configuration_details
(
  id uuid NOT NULL,
  car_kind_id integer NOT NULL,
  create_time timestamp with time zone,
  create_by uuid,
  update_time timestamp with time zone,
  update_by uuid,
  CONSTRAINT car_configuration_details_pk PRIMARY KEY (id),
  CONSTRAINT car_config_details_carkind_fk FOREIGN KEY (car_kind_id) REFERENCES car_kind (id) MATCH SIMPLE ON UPDATE NO ACTION ON DELETE NO ACTION,
  CONSTRAINT car_configuration_details_carkind_uk UNIQUE (car_kind_id)
)
WITH (
  OIDS=FALSE
);
  
--------------------------------------------------------------------------
-- Table: car_configuration_categories

-- DROP TABLE car_configuration_categories;

CREATE TABLE car_configuration_categories
(
  id uuid NOT NULL,
  category_name character varying(50),
  car_configuration_details_id uuid,
  CONSTRAINT car_configuration_category_fields_pk PRIMARY KEY (id),
  CONSTRAINT car_configuration_details_category_fields_fk FOREIGN KEY (car_configuration_details_id)
      REFERENCES car_configuration_details (id) MATCH SIMPLE ON UPDATE CASCADE ON DELETE CASCADE,
  CONSTRAINT car_configuration_category_details_id_uk UNIQUE (category_name, car_configuration_details_id)
)
WITH (
  OIDS=FALSE
);

----------------------------------------------------------------------------------------
-- Table: car_configuration_select_categories

-- DROP TABLE car_configuration_select_categories;

CREATE TABLE car_configuration_select_categories
(
  id uuid NOT NULL,
  category_name character varying(50),
  create_time timestamp with time zone,
  update_time timestamp with time zone,
  create_by uuid,
  update_by uuid,
  CONSTRAINT car_configuration_select_category_fields_pk PRIMARY KEY (id),
  CONSTRAINT car_configuration_select_category_uk UNIQUE (category_name)
)
WITH (
  OIDS=FALSE
);
 
-------------------------------------------------------------

-- Table: car_configuration_category_fields

-- DROP TABLE car_configuration_category_fields;

CREATE TABLE car_configuration_category_fields
(
  id uuid NOT NULL,
  field_name character varying(100),
  category_id uuid,
  "order" integer,
  data_types_id integer,
  CONSTRAINT "categoryFields_pk" PRIMARY KEY (id),
  CONSTRAINT car_configuration_categories_fk FOREIGN KEY (category_id)
      REFERENCES car_configuration_categories (id) MATCH SIMPLE ON UPDATE CASCADE ON DELETE CASCADE,
  CONSTRAINT data_types_fk FOREIGN KEY (data_types_id) REFERENCES data_types (id) MATCH SIMPLE ON UPDATE CASCADE ON DELETE CASCADE,
  CONSTRAINT car_configuration_category_field_uk UNIQUE (field_name, category_id)
)
WITH (
  OIDS=FALSE
);

------------------------------------------------------------------------------
-- Table: car_configuration_select_category_fields

-- DROP TABLE car_configuration_select_category_fields;

CREATE TABLE car_configuration_select_category_fields
(
  id uuid NOT NULL,
  field_name character varying(100),
  category_id uuid,
  "order" integer,
  data_types_id integer,
  CONSTRAINT "car_config_select_categoryFields_pk" PRIMARY KEY (id),
  CONSTRAINT car_configuration_select_categories_fk FOREIGN KEY (category_id)
      REFERENCES car_configuration_select_categories (id) MATCH SIMPLE ON UPDATE CASCADE ON DELETE CASCADE,
  CONSTRAINT data_types_fk FOREIGN KEY (data_types_id)
  REFERENCES data_types (id) MATCH SIMPLE ON UPDATE NO ACTION ON DELETE NO ACTION,
  CONSTRAINT car_configuration_select_category_field_uk UNIQUE (field_name, category_id)
)
WITH (
  OIDS=FALSE
);
---------------------------------------------------------------------------------
-- Table: car_configuration_custom_fields

-- DROP TABLE car_configuration_custom_fields;

CREATE TABLE car_configuration_custom_fields
(
  id uuid NOT NULL,
  field_name character varying(100),
  data_types_id integer,
  create_time timestamp with time zone,
  create_by uuid,
  update_time timestamp with time zone,
  update_by uuid,
  delete_time timestamp with time zone,
  CONSTRAINT "car_config_custom_categoryFields_pk" PRIMARY KEY (id),
  CONSTRAINT data_types_fk FOREIGN KEY (data_types_id)
      REFERENCES data_types (id) MATCH SIMPLE
      ON UPDATE NO ACTION ON DELETE NO ACTION,
  CONSTRAINT car_configuration_custom_fields_uk UNIQUE (field_name)
)
WITH (
  OIDS=FALSE
);

------------------------------------------------------------------------------------
-- Table: car_configuration_dynamic_field_values
-- DROP TABLE car_configuration_dynamic_field_values;

CREATE TABLE car_configuration_dynamic_field_values
(
  id uuid NOT NULL,
  car_id uuid,
  car_configuration_category_field_id uuid,
  field_value character varying(100),
  create_time timestamp with time zone,
  create_by uuid,
  update_time timestamp with time zone,
  update_by uuid,
  CONSTRAINT "car_config_dynamic_id_PK" PRIMARY KEY (id),
  CONSTRAINT "car_configuration_category_field_id_FK" FOREIGN KEY (car_configuration_category_field_id)
      REFERENCES car_configuration_category_fields (id) MATCH SIMPLE
      ON UPDATE CASCADE ON DELETE CASCADE,
  CONSTRAINT car_id_fk FOREIGN KEY (car_id)
      REFERENCES car (id) MATCH SIMPLE
      ON UPDATE NO ACTION ON DELETE NO ACTION,
  CONSTRAINT car_configuration_dynamic_field_value_uk UNIQUE (car_id, car_configuration_category_field_id)
)
WITH (
  OIDS=FALSE
);
------------------------------------------------------------------------------------
-- View: car_configuration_details_view

-- DROP VIEW car_configuration_details_view;

CREATE OR REPLACE VIEW car_configuration_details_view AS 
 SELECT ccd.id AS conf_details_id,
    ccd.car_kind_id,
    ccd.create_time AS conf_details_create_time,
    ccd.create_by AS conf_details_create_by,
    ccd.update_by AS conf_details_update_by,
    ccd.update_time AS conf_details_update_time,
    ccc.id AS conf_category_id,
    ccc.category_name AS conf_category_name,
    ccc.car_configuration_details_id AS conf_category_configuration_details_id,
    ccf.id AS category_field_id,
    ccf.field_name AS category_field_name,
    ccf.category_id AS field_category_id,
    ccf."order" AS category_field_order,
    ccf.data_types_id AS field_data_type_id,
    ck.id AS carkind_id,
    ck.car_kind,
	ck.code as ck_code,
    ck.delete_time AS ck_delete_time,
    dt.id AS datatypes_id,
    dt.datatype_name,
    dt.allowed_size,
    dt.delete_time AS data_types_delete_time
   FROM car_configuration_details ccd
     JOIN car_configuration_categories ccc ON ccd.id = ccc.car_configuration_details_id
     JOIN car_configuration_category_fields ccf ON ccf.category_id = ccc.id
     JOIN car_kind ck ON ck.id = ccd.car_kind_id  AND ck.delete_time IS NULL
     JOIN data_types dt ON dt.id = ccf.data_types_id AND dt.delete_time IS NULL;

----------------------------------------------------------------------------------------------

-- View: car_configuration_custom_fields_view
-- DROP VIEW car_configuration_custom_fields_view;

CREATE OR REPLACE VIEW car_configuration_custom_fields_view AS 
SELECT cf.id AS custom_field_id,
    cf.field_name,    
    cf.data_types_id AS custom_field_dt_id,
    cf.create_time,
    cf.create_by,
    cf.update_time,
    cf.update_by,
    cf.delete_time,    
    dt.id AS data_type_id,
    dt.datatype_name,
    dt.allowed_size,
    dt.delete_time AS datatype_del_time,
    (select true from car_configuration_select_category_fields where field_name = cf.field_name) as isUsed
   FROM car_configuration_custom_fields cf     
     JOIN data_types dt ON dt.id = cf.data_types_id AND cf.delete_time IS NULL AND dt.delete_time IS NULL;

----------------------------------------------------------------------------------------------

-- View: car_configuration_select_category_field_view

-- DROP VIEW car_configuration_select_category_field_view;

CREATE OR REPLACE VIEW car_configuration_select_category_field_view AS 
 SELECT sel_cat.id AS sel_cat_id,
    sel_cat.category_name AS sel_cat_category_name,
    sel_cat.create_time AS sel_cat_created_time,
    sel_cat.update_time AS sel_cat_updated_time,
    sel_cat.create_by AS sel_cat_created_by,
    sel_cat.update_by AS sel_cat_updated_by,
    sel_cat_fld.id AS sel_cat_fld_id,
    sel_cat_fld.field_name AS sel_cat_fld_field_name,
    sel_cat_fld.category_id AS sel_cat_fld_category_id,
    sel_cat_fld."order" AS sel_cat_fld_order,
    sel_cat_fld.data_types_id AS sel_cat_fld_dt_id,
    dt.id AS dt_id,
    dt.datatype_name AS dt_name,
    dt.allowed_size AS dt_size,
    dt.delete_time AS dt_del_time
   FROM car_configuration_select_categories sel_cat
     JOIN car_configuration_select_category_fields sel_cat_fld ON sel_cat_fld.category_id = sel_cat.id 
     JOIN data_types dt ON dt.id = sel_cat_fld.data_types_id AND dt.delete_time IS NULL;


------------------------------------------------------------------------------------------------------------
---Inserting Carkind values

INSERT INTO car_kind(id, car_kind, code)VALUES (1, 'Articulated', 'A');
INSERT INTO car_kind(id, car_kind, code)VALUES (2, 'Box', 'B');
INSERT INTO car_kind(id, car_kind, code)VALUES (3, 'Drawbar', 'D');
INSERT INTO car_kind(id, car_kind, code)VALUES (4, 'End of Train Device', 'E');
INSERT INTO car_kind(id, car_kind, code)VALUES (5, 'Flat', 'F');
INSERT INTO car_kind(id, car_kind, code)VALUES (6, 'Gondola', 'G');
INSERT INTO car_kind(id, car_kind, code)VALUES (7, 'Hopper (Other than covered)', 'H');
INSERT INTO car_kind(id, car_kind, code)VALUES (8, 'Covered Hopper', 'L');
INSERT INTO car_kind(id, car_kind, code)VALUES (9, 'Miscellaneous', 'M');
INSERT INTO car_kind(id, car_kind, code)VALUES (10, 'Passenger', 'P');
INSERT INTO car_kind(id, car_kind, code)VALUES (11, 'Refrigerator', 'R');
INSERT INTO car_kind(id, car_kind, code)VALUES (12, 'Stack', 'S');
INSERT INTO car_kind(id, car_kind, code)VALUES (13, 'Tank', 'T');
-------------------------------------------------------------------------------------------------------
---InSerting datatypes
INSERT INTO data_types(id, datatype_name, allowed_size)VALUES (1, 'Text', 100);
INSERT INTO data_types(id, datatype_name)VALUES (2, 'Date');
INSERT INTO data_types(id, datatype_name)VALUES (3, 'Number');
INSERT INTO data_types(id, datatype_name)VALUES (4, 'Boolean');

-------------------------------------------------------------------------------------------------------
---Inserting car kind column
ALTER TABLE car ADD COLUMN car_kind character varying(50);
-------------------------------------------------------------------------------------------------------
--vw_select_field_info
CREATE OR REPLACE VIEW vw_select_field_info AS 

SELECT  DYN.car_id, 
json_agg( json_build_object('FieldName',CONFDATA.field_name,'FieldValue', DYN.field_value,'Order', CONFDATA.order)) as "FieldData"
FROM 
car_configuration_dynamic_field_values DYN,
(
SELECT CONF.id,CONF.field_name, SEL.order
FROM car_configuration_category_fields CONF
INNER JOIN car_configuration_select_category_fields SEL 
ON CONF.field_name=SEL.field_name
) as CONFDATA
WHERE DYN.car_configuration_category_field_id = CONFDATA.id
GROUP BY DYN.car_id;
	
------------------------------------------------------------------------------------------------------------------------
--View for Fleet list grid 
CREATE OR REPLACE VIEW vw_fleet_list AS 
SELECT DISTINCT c.car_identifier_id AS CarIdentifierId,
		c.create_time       AS CreateTime,
		c.delete_time       AS DeleteTime,
		end_date          AS EndDate,
		c.id                AS carid,
		initial           AS Initial,
		number            AS Number,
		CI.ein as EIN,
		initial|| LPAD(number,10,'0') AS EquipmentId,
		c.car_kind as CarKind,
		COALESCE(NULLIF(string_agg(distinct s.name,',')::TEXT, '[null]'), ''):: text as SubFleet,
		process_id        AS ProcessId,
		start_date        AS StartDate,
		c.update_time       AS UpdateTime,
		CI.custom_Id as CustomId,
		CI.built_date as BuiltDate,
		vw_select_field_info."FieldData" ::text as FieldData
FROM car_identifier CI
RIGHT JOIN car c on
CI.id= c.car_identifier_id
RIGHT JOIN process proc ON
proc.id = c.process_id
LEFT JOIN vw_select_field_info
ON vw_select_field_info.car_id = c.id
LEFT JOIN car_identifier_subfleet CIS on 
CIS.car_identifier_id = c.car_identifier_id
LEFT join subfleet s on s.id =  CIS.subfleet_id
WHERE CI.id IN 
                (
                                       SELECT car_identifier_id FROM car c
                                                LEFT JOIN process proc on
                                                proc.id = c.process_id
                                                WHERE (c.process_id IS NULL OR proc.delete_time  IS NULL)
                                                AND c.delete_time  IS NULL
                )

GROUP BY c.car_identifier_id,c.update_time ,vw_select_field_info."FieldData" ::text,CI.built_date,CI.custom_Id,c.update_time 
,start_date, end_date,c.car_kind,CI.ein ,c.create_time,c.delete_time,c.id,process_id;
------------------------------------------------------------------------------------------------------------------------
--sf_get_fleet_list
CREATE OR REPLACE FUNCTION sf_get_fleet_list(whereClause text, orderBy text, limitVal integer, offsetVal integer, isExport boolean default false)
                               RETURNS SETOF vw_fleet_list AS $func$
DECLARE
                queryStatement text;
                defaultWhereClause text;
                defaultSortClause text;
                defaultPagination text;
                defaultTime text;                
BEGIN

defaultTime := TO_CHAR(now(),'YYYYMMDD');
defaultWhereClause:= 'WHERE (EndDate IS NULL AND StartDate <=''X'' OR (EndDate >=''X'' AND StartDate <=''X''))';
defaultWhereClause:=  replace(defaultWhereClause,'X',defaultTime);
defaultSortClause:= ' order by initial, number';
defaultPagination:= ' limit 25 offset 0';

IF whereClause  ~* 'inactiveCars' THEN
                                whereClause:= REPLACE(whereClause,'inactiveCars','');
                                defaultWhereClause:='';
END IF;

IF whereClause is not null AND whereClause <> '' THEN

                                IF defaultWhereClause is not null AND defaultWhereClause <>'' THEN
                                                defaultWhereClause :=  defaultWhereClause || ' AND ' || whereClause;
                                ELSE
                                                defaultWhereClause := 'wHERE ' || whereClause;
                                END IF;
                                
                
END IF;

raise notice '%',whereClause;

IF orderBy is not null AND orderBy <> '' THEN
                defaultSortClause := ' ORDER BY ' || orderBy;
END IF;

IF limitVal <> -1 AND offsetVal <> -1 THEN
                defaultPagination := ' limit ' || limitVal || ' offset '||offsetVal;
END IF;

--This call is for getting the count
IF limitVal= -9 THEN
                defaultPagination := '';
END IF;

queryStatement :=  'select * from vw_fleet_list ';

IF isExport THEN
	queryStatement := queryStatement || defaultWhereClause || defaultSortClause;
ELSE
	queryStatement := queryStatement || defaultWhereClause || defaultSortClause || defaultPagination;
END IF;

raise notice '%',queryStatement;

RETURN query
                EXECUTE(queryStatement);
END;
$func$
LANGUAGE plpgsql VOLATILE;
------------------------------------------------------------------------------------------------------------------------
--View: car_configuration_fields_view

CREATE OR REPLACE VIEW car_configuration_fields_view AS 
 SELECT ck.car_kind,
    ccc.category_name,
    cccf.category_id,
    cccf.id AS config_field_id,
    cccf.field_name,
    cccf."order" AS field_order,
    dt.id AS datatype_id,
    dt.datatype_name,
    dt.allowed_size
   FROM car_configuration_details ccd
     JOIN car_kind ck ON ck.id = ccd.car_kind_id AND ck.delete_time IS NULL
     JOIN car c ON c.car_kind = ck.car_kind::text
     JOIN car_configuration_categories ccc ON ccd.id = ccc.car_configuration_details_id
     JOIN car_configuration_category_fields cccf ON ccc.id = cccf.category_id
     JOIN data_types dt ON cccf.data_types_id = dt.id AND dt.delete_time IS NULL;
-------------------------------------------------------------------------------------------------------------------------
-- View: car_details_dynamic_field_view
CREATE OR REPLACE VIEW car_details_dynamic_field_view AS 
 SELECT c.id AS car_id,
    c.initial,
    c.number,
    c.create_time AS car_create_time,
    c.update_time AS car_update_time,
    c.car_identifier_id,
    c.start_date,
    c.end_date,
    c.process_id,
    c.car_kind,
    ci.ein,
    ci.custom_id,
    ci.create_time AS ci_create_time,
    ci.update_time AS ci_update_time,
    ci.built_date,
    ccdf.id AS dynamic_field_id,
    ccdf.car_configuration_category_field_id AS car_config_field_id,
    ccdf.field_value
   FROM car c
     LEFT JOIN car_identifier ci ON c.car_identifier_id = ci.id
     LEFT JOIN car_configuration_dynamic_field_values ccdf ON ccdf.car_id = c.id;
---------------------------------------------------------------------------------------------------------------------------
-- Function: create_table_triggers() to skip car_configuration tables

CREATE OR REPLACE FUNCTION create_table_triggers()
  RETURNS character varying AS
$BODY$
DECLARE
rec RECORD;
query TEXT;
BEGIN
PERFORM set_config('client_min_messages', 'WARNING', false);
FOR rec IN SELECT * FROM pg_tables WHERE (schemaname = 'public' AND tablename !~ '^log_' AND tablename !~ '^car_configuration_') LOOP
PERFORM t.tgrelid FROM pg_trigger AS t INNER JOIN pg_class AS c ON t.tgrelid=c.oid INNER JOIN pg_namespace AS n ON n.oid=c.relnamespace
WHERE t.tgname = rec.tablename || '_stamp' AND c.relname = rec.tablename AND n.nspname = rec.schemaname;
IF NOT FOUND THEN
query := 'CREATE TRIGGER ' || rec.tablename || '_stamp ' || ' BEFORE UPDATE ON ' ||
rec.schemaname || '.' || rec.tablename || ' FOR EACH ROW EXECUTE PROCEDURE public.update_stamp()';
EXECUTE query;
END IF;
END LOOP;
PERFORM set_config('client_min_messages', 'INFO', false);
RETURN 'done';
END;
$BODY$
  LANGUAGE plpgsql VOLATILE
  COST 100;
--------------------------------------------------------------------------------------------------------------------------------
--Creating indices
CREATE INDEX  car_kind_idx on car_kind USING btree (car_kind);

CREATE INDEX  car_car_kind_idx on car USING btree (car_kind);

CREATE INDEX car_configuration_category_idx  ON car_configuration_category_fields  USING btree (category_id);

CREATE INDEX car_configuration_details_idx  ON car_configuration_categories  USING btree (car_configuration_details_id);

CREATE INDEX car_configuration_category_field_idx  ON car_configuration_dynamic_field_values  USING btree (car_configuration_category_field_id);

CREATE INDEX car_configuration_select_category_idx  ON car_configuration_select_category_fields  USING btree (category_id);

--------------------------------------------------------------------------------------------------------------------------------
--sf_get_fleet_list_inactiveCars : would be used in case inactive cars are to be included
CREATE OR REPLACE FUNCTION sf_get_fleet_list_inactiveCars(whereClause text, orderBy text, limitVal integer, offsetVal integer, isExport boolean,dateOfReference text )
                               RETURNS SETOF vw_fleet_list AS $func$
DECLARE
                queryStatement text;
                defaultWhereClause text;
                defaultSortClause text;
                defaultPagination text;
                defaultTime text;                
BEGIN

defaultSortClause:= ' order by initial, number';
defaultPagination:= ' limit 25 offset 0';

--replace the constant of inactiveCars
 whereClause:= REPLACE(whereClause,'inactiveCars','');

IF dateOfReference is not null AND dateOfReference <> '' THEN
		defaultTime:= dateOfReference;
ELSE 
		defaultTime := TO_CHAR(now(),'YYYYMMDD');
END IF;

DROP TABLE IF EXISTS temp_fleet_list_inactive_cars;
	CREATE TEMP TABLE temp_fleet_list_inactive_cars AS
	SELECT * FROM vw_fleet_list  
	WHERE  (EndDate IS NULL AND StartDate <= defaultTime::date)
	OR (EndDate >= defaultTime::date AND StartDate <=defaultTime::date)
	ORDER BY startDate desc;

queryStatement:= '
SELECT * FROM 
		(select * from temp_fleet_list_inactive_cars
		union
			(select * from vw_fleet_list  
			WHERE   StartDate >'''||defaultTime||'''
			AND caridentifierid NOT IN (SELECT DISTINCT caridentifierid from temp_fleet_list_inactive_cars)
			order by startDate)
		union
			(select * from vw_fleet_list  
			WHERE   StartDate <'''||defaultTime||'''
			AND caridentifierid NOT IN (SELECT DISTINCT caridentifierid from temp_fleet_list_inactive_cars)
			order by startDate desc) ) AS TMP';

IF orderBy is not null AND orderBy <> '' THEN
                defaultSortClause := ' ORDER BY ' || orderBy;
END IF;

IF limitVal <> -1 AND offsetVal <> -1 THEN
                defaultPagination := ' limit ' || limitVal || ' offset '||offsetVal;
END IF;

--This call is for getting the count
IF limitVal= -9 THEN
                defaultPagination := '';
END IF;

IF whereClause IS NOT NULL AND whereClause <>'' THEN
	whereClause := ' WHERE ' || whereClause;
	queryStatement:=queryStatement || whereClause || defaultSortClause ;
ELSE
	queryStatement:=queryStatement || defaultSortClause ;
END IF;


IF isExport THEN
	queryStatement:= queryStatement;
ELSE
	queryStatement := queryStatement || defaultPagination;
END IF;

raise notice '%',queryStatement;

RETURN query
                EXECUTE(queryStatement);
END;
$func$
LANGUAGE plpgsql VOLATILE;

--function:sf_delete_custom_fields_data to delete custum fields and related tables
CREATE OR REPLACE FUNCTION sf_delete_custom_fields_data(fields text)  RETURNS int AS
$BODY$
DECLARE  
rows_affected integer;
BEGIN
	
	DELETE from car_configuration_select_category_fields where field_name = ANY((fields::TEXT[]));
	GET DIAGNOSTICS rows_affected = ROW_COUNT;
	RAISE NOTICE 'Deleted config select category fields : %',rows_affected;
	
	DELETE from car_configuration_category_fields where field_name = ANY ((fields::TEXT[]));
	RAISE NOTICE 'Deleted config category fields : %',rows_affected;
	
	DELETE from car_configuration_categories ccc where 0 = (select count(*) from car_configuration_category_fields where category_id = ccc.id);
	RAISE NOTICE 'Deleted config catetories : %',rows_affected;
	
	DELETE from car_configuration_details ccd where 0 = (select count(*) from car_configuration_categories where car_configuration_details_id = ccd.id);
	RAISE NOTICE 'Deleted config details : %',rows_affected;
	
	DELETE from car_configuration_select_categories ccsc where 0 = (select count(*) from car_configuration_select_category_fields where category_id = ccsc.id);
	RAISE NOTICE 'Deleted config select categories : %',rows_affected;
	
	UPDATE car_configuration_custom_fields SET delete_time = now() where field_name = ANY ((fields::TEXT[]));
	RAISE NOTICE 'Updated customfields as deleted : %',rows_affected;
	
    RETURN 0;
END;
$BODY$
  LANGUAGE plpgsql VOLATILE STRICT
  COST 100;

