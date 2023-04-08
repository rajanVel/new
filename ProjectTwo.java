package Mavenproject.Automation;


public class ProjectTwo extends Base_class2 {
	
//	public static proj2Login login = new proj2Login(driver);
//	
//	public static proj2sendpage page2 = new proj2sendpage(driver);

	public static void main(String[] args) {
		
		Browserlanunch("chrome");
		
		proj2POM POM = new proj2POM(driver);
		
		maximize();
		
		URL("https://adactinhotelapp.com/index.php");
		
		Wait(30);
	
		sendinput(POM.getnstanceLogin().getUsername(),"Rajarajanv");
		
		sendinput(POM.getnstanceLogin().getPasword(),"2I6Y7I");
		
		Click(POM.getnstanceLogin().getLogin());
		

		
	
		
		
		
		
		

	}
}
