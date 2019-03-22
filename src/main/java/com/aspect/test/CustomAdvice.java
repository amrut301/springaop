package com.aspect.test;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

import com.test.service.OrderServiceImpl;

@Aspect
@Component
public class CustomAdvice {
	@Before("execution(* com.test.service.OrderServiceImpl.buyOrder(..))")
	public void logBefore(JoinPoint joinPoint) {

		((OrderServiceImpl) joinPoint.getTarget()).print();

		System.out.println("Before");
	}
	

	@AfterThrowing("execution(* com.test.service.OrderServiceImpl.handleOrders(..))")
	public void logException(JoinPoint joinPoint) {
		System.out.println("There is an Exception occured");
	}
}
