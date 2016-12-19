/**
 * Created by webonise on 17-12-2016.
 */
class SendSMS implements MessageService {
    @Override
    String sendMessage(String data, String to) {
        return "Sending SMS to "+to
    }
}
