package com.ido.demo.config;

import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

/**
 * Created by Ido on 2017/7/13.
 */
@Aspect
public class UsageTracking {
    @Before("execution(* com.xyz.myapp.dao.*.*(..))")
    public void doAccessCheck() {
        // ...
    }

    //this String is where the point cut live
    @AfterReturning("com.xyz.myapp.SystemArchitecture.dataAccessOperation()")
    public void doAfterCheck() {
        // ...
    }
}
