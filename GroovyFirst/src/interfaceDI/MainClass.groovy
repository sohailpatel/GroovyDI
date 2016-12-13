package interfaceDI

class MainClass {
	
	public static void main(String[] args){
		MailInjector sendEmail;
		MyApplication myApp;
		MsgInjector sendMsg;
		
		sendEmail=new MailInjector();
		myApp=sendEmail.getMsgType()
		myApp.processMesage("","");
		
		sendMsg=new MsgInjector();
		myApp=sendMsg.getMsgType();
		myApp.processMesage("", "");		
	}

}
