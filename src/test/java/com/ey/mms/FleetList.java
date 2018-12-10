/**
 * @Copyright Copyright (C) 2016 General Electric Company. All rights reserved.
 */

package com.ey.mms;

import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;

import org.junit.BeforeClass;
import org.junit.runner.RunWith;

import com.ey.mms.util.EY_FW_Utility;
import com.ey.mms.util.PropertyReader;

/**
 * <h1>Runner Class</h1> MMS Runner Class for Configuration Theme containing
 * Feature MMS fleet and lease net.
 * 
 * @author Ankur Chaudhry
 * @version 1.1
 * @since 2016-07-17
 */

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/features/Fleet/fleet_list.feature")
public class FleetList {
	@BeforeClass
	public static void setup() {
		System.out.println("I'm in fleet list\n");
		String dbbackupfilename = new PropertyReader().readProperty("dbbackup");
		String dbName = new PropertyReader().readProperty("dbName");
		String backup = EY_FW_Utility.getConfigProperty(dbbackupfilename, "fleetListBackup");
		String dbNameMgmt = new PropertyReader().readProperty("dbNameMgmt");
		String backupMgmt = EY_FW_Utility.getConfigProperty(dbbackupfilename, "fleetListMgmtBackup");
		String dbVersion = new PropertyReader().readProperty("dbversion");
		String port = new PropertyReader().readProperty("port");
		String update_dbversion = "UPDATE system_information SET value=" + dbVersion;
		String update_port = "UPDATE company  SET db_port=" + port;// +" WHERE
																	// name="+companyname;

		if (EY_FW_Utility.restoreDB(dbName, backup) == 0 && EY_FW_Utility.restoreDB(dbNameMgmt, backupMgmt) == 0) {
			// EY_FW_Utility.setupDBRestore(dbName, update_dbversion);
			// EY_FW_Utility.setupDBRestore(dbNameMgmt, update_dbversion);
			// EY_FW_Utility.setupDBRestore(dbNameMgmt, update_port);
		} else {
			System.exit(1);
		}
	}
}
