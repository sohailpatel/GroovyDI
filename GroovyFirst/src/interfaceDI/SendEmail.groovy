package interfaceDI

class SendEmail implements MessageServices {

	@Override
	public void sendMessages(String msg, String to) {
		println "Sending mail"
	}

}
