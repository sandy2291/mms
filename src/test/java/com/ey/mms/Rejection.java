package com.ey.mms;

import org.junit.BeforeClass;
import org.junit.runner.RunWith;

import com.ey.mms.util.EY_FW_Utility;
import com.ey.mms.util.PropertyReader;

import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features="src/test/resources/features/InvoiceRejection/rejection_work_flow.feature")
public class Rejection {
	
	@BeforeClass
	public static void setup() {
		System.out.println("I'm in Exception and Rejection \n");

		String dbbackupfilename = new PropertyReader().readProperty("dbbackup");
		String dbversion = new PropertyReader().readProperty("dbversion");
		String dbName = new PropertyReader().readProperty("dbName");
		String companyname = new PropertyReader().readProperty("companyname");
		String backup = EY_FW_Utility.getConfigProperty(dbbackupfilename,"RejectionOfInvoices");
		String dbNameMgmt = new PropertyReader().readProperty("dbNameMgmt");
		String backupMgmt = EY_FW_Utility.getConfigProperty(dbbackupfilename,"RejectionOfInvoicesMgmtBackup");
		String dbVersion = new PropertyReader().readProperty("dbversion");
		String port = new PropertyReader().readProperty("port");
		String update_dbversion="UPDATE system_information SET value="+dbVersion;
		String update_port="UPDATE company  SET db_port="+port;//+" WHERE name="+companyname;
		
if(EY_FW_Utility.restoreDB(dbName, backup) == 0 && EY_FW_Utility.restoreDB(dbNameMgmt, backupMgmt) == 0){
	//EY_FW_Utility.setupDBRestore(dbName, update_dbversion);
	//EY_FW_Utility.setupDBRestore(dbNameMgmt, update_dbversion);
	//EY_FW_Utility.setupDBRestore(dbNameMgmt, update_port);
		}else{
			System.exit(1);
		}

	}

}
