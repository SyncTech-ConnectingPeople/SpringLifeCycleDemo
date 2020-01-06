package com.spring.core.examples.bean.lifecycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanClassLoaderAware;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;
import org.springframework.context.MessageSource;
import org.springframework.context.MessageSourceAware;
import org.springframework.context.ResourceLoaderAware;
import org.springframework.context.weaving.LoadTimeWeaverAware;
import org.springframework.core.io.ResourceLoader;
import org.springframework.instrument.classloading.LoadTimeWeaver;
import org.springframework.jmx.export.notification.NotificationPublisher;
import org.springframework.jmx.export.notification.NotificationPublisherAware;

public class SpringBeanLifeCycleExamples implements InitializingBean,DisposableBean,ApplicationContextAware,ApplicationEventPublisherAware,BeanNameAware,BeanFactoryAware,BeanClassLoaderAware,MessageSourceAware,NotificationPublisherAware,LoadTimeWeaverAware,ResourceLoaderAware{
	
	
	public SpringBeanLifeCycleExamples() {
		
	}
	
	public void init() {
		System.out.println("init method is called...");
	}
	
	public void destory1() {
		System.out.println("destory1 method is called...");
	}

	@Override
	public void destroy() throws Exception {
		System.out.println("destroy method is called...");	
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("afterPropertiesSet method is called...");		
	}

	@Override
	public void setResourceLoader(ResourceLoader resourceLoader) {
		System.out.println("setResourceLoader is called...");
	}

	@Override
	public void setLoadTimeWeaver(LoadTimeWeaver loadTimeWeaver) {
		System.out.println("setLoadTimeWeaver is called...");
	}

	@Override
	public void setNotificationPublisher(NotificationPublisher notificationPublisher) {
		System.out.println("setNotificationPublisher is called...");
	}

	@Override
	public void setMessageSource(MessageSource messageSource) {
		System.out.println("setMessageSource is called...");
	}

	@Override
	public void setBeanClassLoader(ClassLoader classLoader) {
		System.out.println("setBeanClassLoader is called...");	
	}

	@Override
	public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
		System.out.println("setBeanFactory is called...");	
	}

	@Override
	public void setBeanName(String name) {
		System.out.println("setBeanName is called...");		
	}

	@Override
	public void setApplicationEventPublisher(ApplicationEventPublisher applicationEventPublisher) {
		System.out.println("setApplicationEventPublisher is called...");
	}

	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		System.out.println("setApplicationContext is called...");
	}
}
