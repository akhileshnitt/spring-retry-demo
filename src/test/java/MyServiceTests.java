import com.akhi.spring.MyApp;
import com.akhi.spring.exception.MyException;
import com.akhi.spring.service.MyService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static junit.framework.TestCase.assertTrue;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = MyApp.class)
public class MyServiceTests {
    @Autowired
    private MyService myService;

    @Test
    public void testRetry1() throws MyException {
        myService.mayFailedCall();
       // assertTrue(myService.mayFailedCall());
        //assertTrue(myService.getMayFailedCallTimes()==3);
    }
}