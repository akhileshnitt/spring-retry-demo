package com.akhi.spring.service;

import com.akhi.spring.exception.MyException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.retry.annotation.Backoff;
import org.springframework.retry.annotation.Retryable;
import org.springframework.stereotype.Service;

@Service("myService")
public class MyServiceImpl implements MyService{

    private static Logger log = LoggerFactory.getLogger(MyServiceImpl.class);
    private int mayFailedCallTimes;


    @Override
    @Retryable(maxAttempts = 5, backoff = @Backoff(delay=2000))
    public boolean mayFailedCall() throws MyException {
        mayFailedCallTimes++;
        System.out.println("================>>> mayFailedCallTimes = "+mayFailedCallTimes);
        log.debug("================>>> mayFailedCallTimes = "+mayFailedCallTimes);
        if(mayFailedCallTimes>=5) {
            return true;
        }
        throw new MyException("exception "+mayFailedCallTimes);
    }

    @Override
    public int getMayFailedCallTimes() {
        return mayFailedCallTimes;
    }
}
