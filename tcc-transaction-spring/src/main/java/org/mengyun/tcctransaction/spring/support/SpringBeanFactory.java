package org.mengyun.tcctransaction.spring.support;

import org.mengyun.tcctransaction.support.BeanFactory;
import org.mengyun.tcctransaction.support.FactoryBuilder;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

import java.util.Map;

/**
 * Created by changmingxie on 11/22/15.
 */
public class SpringBeanFactory implements BeanFactory, ApplicationContextAware {

    private ApplicationContext applicationContext;

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContext = applicationContext;
        FactoryBuilder.registerBeanFactory(this);
    }

    @Override
    public boolean isFactoryOf(Class classType) {
        Map map = this.applicationContext.getBeansOfType(classType);
        return map.size() > 0;
    }

    @Override
    public <T> T getBean(Class<T> classType) {
        return this.applicationContext.getBean(classType);
    }
}