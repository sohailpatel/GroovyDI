package interfaceDI;

public class MsgInjector implements InjectMsg{

	@Override
	public MessageProcessor getMsgType() {
		return new MyApplication(new SendSMS());
	}

}
