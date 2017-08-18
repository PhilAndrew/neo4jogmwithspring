package jumpmicro.jmrightsmanagement.springpart;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TestSpring2 {

    //@Autowired
    //WebclientMicroserviceServerApplication app;
    @Test
    public void testThing(){

        System.out.println("Hello");
    }
}
