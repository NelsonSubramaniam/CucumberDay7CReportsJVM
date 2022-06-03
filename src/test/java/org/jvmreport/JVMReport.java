package org.jvmreport;

import java.io.File;
import java.util.LinkedList;
import java.util.List;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

public class JVMReport {
	
	public static void generateJVMReport(String json) {
		
		// 1. File Location --> Where need to store report
		File loc = new File(System.getProperty("user.dir") + "\\src\\test\\resources\\Reports\\JVMReports");
		
		// 2. Configuration --> Give some details about execution
		Configuration con = new Configuration(loc, "Facebook");
		con.addClassifications("Browser Name", "Chrome");
		con.addClassifications("Browser Version", "100");
		con.addClassifications("OS Name", "Windows 10");
		con.addClassifications("Sprint", "25");
		con.addClassifications("Environment", "QA");
		
		List<String> jsonFiles = new LinkedList<String>();
		jsonFiles.add(json);
		
		// 3. ReportBuilder --> Class --> To generate report
		ReportBuilder r = new ReportBuilder(jsonFiles, con);
		r.generateReports(); // To generate report
		
	}

}
