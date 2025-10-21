package com.spring.aop.logging;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {
	
	private static final Logger log = LoggerFactory.getLogger(LoggingAspect.class);
	
	@Before("execution(* com.spring..*(..))")//point-cut
	private void logMethodCall(JoinPoint jp) {
		log.info("Method called: {}", jp.getSignature().getName());
	}
	
	@After("execution(* com.spring..*(..))")//point-cut
	private void logMethodExecuted(JoinPoint jp) {
		log.info("Method Executed: {}", jp.getSignature().getName());
	}

	
	@AfterThrowing("execution(* com.spring..*(..))")//point-cut
	private void logMethodIssue(JoinPoint jp) {
		log.info("Method Issue: {}", jp.getSignature().getName());
	}

}
