package com.yztc.test;

import com.yztc.di.User;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by lbb on 2017/7/17.
 */
public class UserTest {

    @Test
    public void test(){
//        装载配置文件
        ClassPathXmlApplicationContext factory = new ClassPathXmlApplicationContext("user.xml");
//        获取Bean
        User user = (User) factory.getBean("user");
        System.out.println("用户姓名:"+user.getName());
        System.out.println("用户密码:"+user.getPassword());
        System.out.println("用户年龄:"+user.getAge());
        System.out.println("用户性别:"+user.getSex());
    }
}
