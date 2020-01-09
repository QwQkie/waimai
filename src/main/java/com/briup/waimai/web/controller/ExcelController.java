package com.briup.waimai.web.controller;


import com.briup.waimai.bean.Oder;
import com.briup.waimai.service.impl.OrderServiceImpl;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.net.URLEncoder;
import java.util.List;

@RestController
public class ExcelController {

    @Autowired
    private OrderServiceImpl orderService;

    @GetMapping("/download")
    public void download(HttpServletResponse response) throws IOException {

        List<Oder> orders = orderService.selectAll();

        XSSFWorkbook workbook=new XSSFWorkbook();
        XSSFSheet sheet=workbook.createSheet();
        XSSFRow row=sheet.createRow(0);
        XSSFCell cell=row.createCell(0);
        cell.setCellType(CellType.STRING);
        cell.setCellValue("订单统计");
        XSSFRow row1=sheet.createRow(1);
        row1.createCell(0).setCellValue("订单id");
        row1.createCell(1).setCellValue("时间");
        row1.createCell(2).setCellValue("价格");
        row1.createCell(3).setCellValue("状态");
        row1.createCell(4).setCellValue("用户id");
        for (int i=0;i<orders.size();i++ ){
            XSSFRow row2=sheet.createRow(i + 2);
            row2.createCell(0).setCellValue(orders.get(i).getId());
            row2.createCell(1).setCellValue(orders.get(i).getTime());
            row2.createCell(2).setCellValue(orders.get(i).getPrice());
            row2.createCell(3).setCellValue(orders.get(i).getState());
            row2.createCell(4).setCellValue(orders.get(i).getUserId());

        }



        response.setHeader("content-Type", "application/vnd.ms-excel");
        response.setHeader("Content-Disposition", "attachment;filename="+ URLEncoder.encode("订单.xlsx", "utf-8"));
        workbook.write(response.getOutputStream());
    }
}
