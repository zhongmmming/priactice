package com.shuai.prictice;

import com.shuai.prictice.config.SpringConfig;
import com.shuai.prictice.dao.BookDao;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringConfig.class);
        BookDao bookDao = applicationContext.getBean(BookDao.class);
        System.out.println(bookDao.save(1));
    }
}
