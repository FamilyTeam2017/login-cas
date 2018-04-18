package com.ma.user.login.web.dubbo.provider;

public class DubboCallBackParamServiceImpl implements IDubboCallBackParamService{

  @Override
  public String sayHello(String name, DubboCallBackListener listener) {
    for (int i= 0; i<10; i ++){
      listener.callback(i);
    }
    return name;
  }
}
