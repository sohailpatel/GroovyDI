package withoutDI;

public class EmailService{
	
	public void sendemail(String message,String receiver){
		System.out.println( "Msg send to "+receiver);
	}
}