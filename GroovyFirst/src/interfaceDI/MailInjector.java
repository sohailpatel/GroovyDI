package interfaceDI;

public class MailInjector implements InjectMsg{

	@Override
	public MessageProcessor getMsgType() {
		return new MyApplication(new SendEmail());
	}

}
