package com.ma.user.login.web.dubbo;

import com.ma.user.login.web.dubbo.DemoService;
import com.ma.user.login.web.dubbo.consumer.DubboCallBackLisntenrImpl;
import com.ma.user.login.web.dubbo.provider.DubboCallBackListener;
import com.ma.user.login.web.dubbo.provider.IDubboCallBackParamService;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DubboConsumerApplication {

  public static void main(String[] args) {
    ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath:dubbo/dubbo-demo-consumer.xml");
    context.start();
    DemoService demoService = (DemoService) context.getBean("demoService");
    String hello = demoService.sayHello("maxg");
    System.out.println("------------" + hello);
    IDubboCallBackParamService callbackService = (IDubboCallBackParamService) context.getBean("callbackService");
    DubboCallBackListener dubboCallBackListener = (DubboCallBackListener) context.getBean("callbackListener");
    callbackService.sayHello("maxiaogang", dubboCallBackListener);
  }
}
