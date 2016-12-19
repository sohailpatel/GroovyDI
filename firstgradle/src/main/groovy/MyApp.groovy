import com.google.inject.Guice
import com.google.inject.Injector
import com.google.inject.Key
import com.google.inject.name.Names

/**
 * Created by webonise on 17-12-2016.
 */
class MyApp {
    public static void main(String[] args){
        Injector inject= Guice.createInjector(new AppModule())
        //SendEmail email=inject.getInstance(MessageService)
        SendEmail email=inject.getInstance(Key.get(MessageService, Names.named("SendEmail")))
        println email.sendMessage("Hi","EmailGradle")
        SendSMS sms=inject.getInstance(Key.get(MessageService,Names.named("SendSms")))
        println sms.sendMessage("Hi","SMSGradle")
    }
}
