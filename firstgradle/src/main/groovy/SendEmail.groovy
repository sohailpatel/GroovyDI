/**
 * Created by webonise on 17-12-2016.
 */
class SendEmail implements MessageService{

    @Override
    String sendMessage(String data, String to) {
        return "Sending Email to "+to;
    }
}
