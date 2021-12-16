package testRuns;

import org.junit.runner.RunWith;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import io.cucumber.junit.Cucumber;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import util.AddCsvDataToPropertyFile;
import util.PropertyModify;

@RunWith(Cucumber.class)
@CucumberOptions(
		
		features = "src/test/resources/features",
		glue = {"stepDefination","hooks"},
		monochrome = true,
		dryRun = false
		
		
		)


public class TestRunner1 extends AbstractTestNGCucumberTests {

	
	int count=0;
	
	@Parameters({"csvFile","propertyFile","server"})
	@BeforeTest
	
	public void getDetails(String csvFile,String propertyFile, String serverName) {
		//getting url,username,pwd depending on server name given in testng.xml
		AddCsvDataToPropertyFile obj_AddCsvDataToPropertyFile=new AddCsvDataToPropertyFile();
		String[] url_Uname_Pwd =obj_AddCsvDataToPropertyFile.addCsvDataToPropertyFile(csvFile, serverName);
		
		
		//update property file with the data got from csv fle (url,username,pwd)
		PropertyModify obj_PropertyModify=new PropertyModify();
		
		obj_PropertyModify.propertyModify(propertyFile, "server", serverName);
		obj_PropertyModify.propertyModify(propertyFile, "url", url_Uname_Pwd[0]);
		obj_PropertyModify.propertyModify(propertyFile, "username", url_Uname_Pwd[1]);
		obj_PropertyModify.propertyModify(propertyFile, "pwd", url_Uname_Pwd[2]);
	
	
	}
	
	
	@Parameters({"propertyFile","browser"})
	@BeforeTest
	public void modifyBrowserInPropertyFile(String path,String browserValue) {
		PropertyModify obj_PropertyModify=new PropertyModify();
		obj_PropertyModify.propertyModify(path,"browser",browserValue);
		
	}

}
