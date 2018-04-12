package com.ma.user.login.web.controller;

import com.ma.user.login.web.excel.ExcelService;
import com.sun.org.apache.regexp.internal.RE;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("/excel")
public class ExcelController {

  @Resource
  private ExcelService excelService;

  @GetMapping("load")
  public String loadExcel(){
   return excelService.loadExcel();
  }

}
