package com.eee.mari.sample;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class SampleAOP {
	public static final Logger logger=LoggerFactory.getLogger("com.eee.mari");
	
	
	@Around("within(com.eee.mari.sample.SampleDAO)")
	public void sampleAop(ProceedingJoinPoint jp) {
			logger.info("aop실행");
			try {
				jp.proceed();
			} catch (Throwable e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			logger.info("aop실행");
	}
}
