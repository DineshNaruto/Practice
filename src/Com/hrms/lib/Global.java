package Com.hrms.lib;

import org.openqa.selenium.WebDriver;

public class Global {

	//std rule: To provide all re-usable fun:/methods related to whole application


		public    WebDriver driver;
		//std:rule: To provide TestData & objects related to whole application
		//*TestData
		//	     DT VAR VV
		public String url = "http://183.82.103.245/nareshit/login.php";
		public String un = "nareshit";
		public String pw = "nareshit";
		public String efn = "selenium";
		public String eln = "suresh";

		//*objects/elements
		public String txt_loginame = "txtUserName";
		public String txt_password = "txtPassword";
		public String btn_login = "Submit";
		public String link_logout = "Logout";
		public String frm_empinfo = "rightMenu";
		public String btn_add = "//input[@value='Add']";
		public String txt_efn = "txtEmpFirstName";
		public String txt_eln = "txtEmpLastName";
		public String btn_save="btnEdit";



	}


