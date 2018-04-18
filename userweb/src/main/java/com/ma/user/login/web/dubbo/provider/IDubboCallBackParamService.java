package com.ma.user.login.web.dubbo.provider;

public interface IDubboCallBackParamService {

   String sayHello(String name, DubboCallBackListener listener);
}
