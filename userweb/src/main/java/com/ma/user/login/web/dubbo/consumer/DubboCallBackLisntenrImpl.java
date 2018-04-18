package com.ma.user.login.web.dubbo.consumer;

import com.ma.user.login.web.dubbo.provider.DubboCallBackListener;

public class DubboCallBackLisntenrImpl implements DubboCallBackListener{

  @Override
  public String callback(int num) {
    System.out.println("######------" + num);
    return "" + num;
  }
}
