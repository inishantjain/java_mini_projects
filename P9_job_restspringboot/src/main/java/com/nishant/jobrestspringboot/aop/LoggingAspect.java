package com.nishant.jobrestspringboot.aop;

import java.util.Date;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.LoggerFactory;
import org.slf4j.Logger;

import org.springframework.stereotype.Component;

@Component
@Aspect
public class LoggingAspect {
    private static final Logger LOGGER = LoggerFactory.getLogger(LoggingAspect.class);

    // return type, class name, method name, args
    @Before("execution(* com.nishant.jobrestspringboot.service.JobService.*(..))")
    public void logMethodCall() {
        LOGGER.info(new Date().toString() + " LOGGED HERE BY LOGGER/////////////");
    }
}
