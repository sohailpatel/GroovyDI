import com.google.inject.Guice
import com.google.inject.Injector
import com.google.inject.Key
import com.google.inject.name.Names
import org.junit.After
import org.junit.Assert
import org.junit.Before
import org.junit.Test

/**
 * Created by webonise on 18-12-2016.
 */
class MyAppTest extends GroovyTestCase {
    Injector inject;
    SendSMS sms
    SendEmail email

    @Before
    public void setUp(){
        inject=Guice.createInjector(new AppModule());
        email=inject.getInstance(Key.get(MessageService, Names.named("SendEmail")))
        sms=inject.getInstance(Key.get(MessageService, Names.named("SendSms")))
    }

    @Test
    public void testMsgService() {
        Assert.assertEquals("Sending Email to Test1",email.sendMessage("hi","Test1"))
        Assert.assertEquals("Sending SMS to Test2",sms.sendMessage("hi","Test2"))
    }

    @After
    public void tearUp(){
        inject=null;
        email=null;
        sms=null;
    }
}
