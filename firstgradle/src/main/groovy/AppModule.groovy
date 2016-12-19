/**
 * Created by webonise on 17-12-2016.
 */
import com.google.inject.AbstractModule
import com.google.inject.name.Names

class AppModule extends AbstractModule{

    @Override
    void configure(){
        bind(MessageService).annotatedWith(Names.named("SendEmail")).to(SendEmail)
        bind(MessageService).annotatedWith(Names.named("SendSms")).to(SendSMS)
    }

}
