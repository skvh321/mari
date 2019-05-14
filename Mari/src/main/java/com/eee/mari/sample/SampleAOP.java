package com.eee.mari.sample;

import java.util.List;

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
	public List sampleAop(ProceedingJoinPoint jp) {
			logger.info("aop실행");
			List list=null;
			try {
				logger.info(jp.getKind());
				list=(List)jp.proceed();
			} catch (Throwable e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			logger.info("aop실행");
			return list;
	}
}
