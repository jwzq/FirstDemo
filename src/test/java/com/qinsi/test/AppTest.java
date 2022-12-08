package com.qinsi.test;

import com.qinsi.config.SpringConfig;
import com.qinsi.dao.AccountDao;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppTest {
    @Test
    public void Test01(){
        ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
        AccountDao dao =  context.getBean(AccountDao.class);
        dao.hello();
    }
    @Test
    public void Test02(){
        ApplicationContext ac = new AnnotationConfigApplicationContext(SpringConfig.class);
        AccountDao dao =  ac.getBean(AccountDao.class);
        dao.hello();
    }
}
