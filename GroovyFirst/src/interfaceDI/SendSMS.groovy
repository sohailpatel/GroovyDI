package interfaceDI

class SendSMS implements MessageServices {

	@Override
	public void sendMessages(String msg, String to) {
		println "sending msgs "
	}

}
