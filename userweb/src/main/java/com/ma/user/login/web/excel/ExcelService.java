package com.ma.user.login.web.excel;


import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.springframework.stereotype.Service;

import java.io.IOException;

@Service
public class ExcelService {

  public String loadExcel(){
//    File file = new File("classpath:templates.excels/00001.xlsx");
    String result = "1";
    try {
//      File file = new ClassPathResource("classpath*:templates.excels/00001.xlsx").getFile();
//      File file = ResourceUtils.getFile("classpath*:templates.excels/00001.xlsx");
      Workbook workbook = WorkbookFactory.create(getClass().getResourceAsStream("/excels/00001.xlsx"));
      result = "SUCCESS.V4";
    } catch (IOException | InvalidFormatException e) {
      e.printStackTrace();
      result = e.getMessage();
    }
    return result;
  }

}
