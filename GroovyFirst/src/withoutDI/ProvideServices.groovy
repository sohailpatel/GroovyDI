package withoutDI

class ProvideServices {
	EmailService emailservice=new EmailService()
	
	public void requestMail(String message,String receiver){
		this.emailservice.sendemail(message, receiver)
	}
}
