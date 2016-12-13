package interfaceDI

class MyApplication implements MessageProcessor {

	private MessageServices msgServices;
	
	MyApplication(MessageServices services){
		this.msgServices=services;
	}
		
	@Override
	public void processMesage(String msg, String to) {
		this.msgServices.sendMessages(msg, to);
	}

}
