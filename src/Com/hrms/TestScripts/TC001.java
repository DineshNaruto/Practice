package Com.hrms.TestScripts;

import org.apache.log4j.xml.DOMConfigurator;
import org.testng.annotations.Test;

import Com.hrms.lib.General;

public class TC001 {
	

	@Test
	public static void Tc001() {
	
		DOMConfigurator.configure("Log4j.xml");
		General gen=new General();
		
		gen.openApplication();
		gen.login();
		gen.enterFrame();
		gen.addNewEmp();
		gen.exitFrame();
		gen.exitFrame();
		gen.closeApplication();
	}
	


}
