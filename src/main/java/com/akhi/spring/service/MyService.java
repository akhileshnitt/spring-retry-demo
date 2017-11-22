package com.akhi.spring.service;

import com.akhi.spring.exception.MyException;

public interface MyService {
    boolean mayFailedCall()throws MyException;

    int getMayFailedCallTimes();
}
