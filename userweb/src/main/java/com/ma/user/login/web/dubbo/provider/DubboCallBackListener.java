package com.ma.user.login.web.dubbo.provider;

import java.io.Serializable;

public interface DubboCallBackListener extends Serializable{

  String callback(int num);
}
