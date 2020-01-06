package com.spring.core.examples.bean.lifecycle;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class BeanPostProcessorsExample implements BeanPostProcessor {

	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		System.out.println("postProcessBeforeInitialization is called.....");
		return BeanPostProcessor.super.postProcessBeforeInitialization(bean, beanName);
	}

	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		System.out.println("postProcessAfterInitialization is called.....");
		return BeanPostProcessor.super.postProcessAfterInitialization(bean, beanName);
	}

}
