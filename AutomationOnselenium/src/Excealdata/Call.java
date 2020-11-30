package Excealdata;

import java.io.IOException;

public class Call {

	public static void main(String[] args) throws IOException, InterruptedException {
		String exclpath = "C:\\Users\\monu\\Desktop\\Book1.xlsx";
		Excelutilies.setfilepath(exclpath, 0);
		
		for(int i =1;i<=6;i++) 
		{
			String keywords=Excelutilies.getdata(i, 2);
			if(keywords.equals("Openbrowser")) {
				Actionkey.openbrowser();	
			}
			
			else if (keywords.equals("checkhome"))
			{
				Actionkey.checkhome();
			}
			else if (keywords.equals("enterid"))
			{
		 Actionkey.enterid("monukumarmrt@gmail.com");	
			}
			else if (keywords.equals("enterpass")) {
				Actionkey.enterpass("8899294129@#");
			}
			else if (keywords.equals("clicklogin")) {
				Actionkey.clicklogin();
			}
			else if (keywords.equals("clicklogout")) {
				Actionkey.clicklogout();
			}
		}
		
	}	
		
}
