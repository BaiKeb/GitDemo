package com.example.ljn.controller;


import com.example.ljn.service.ReportService;
import com.example.ljn.utils.InvokeResult;
import com.example.ljn.vo.GReportSlVo;
import org.apache.pulsar.shade.io.swagger.annotations.ApiOperation;
import org.bouncycastle.asn1.ocsp.ResponseData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;

/**
 * 报表模板数据业务控制类
 * @author lijianan
 * @date 2022-06-10 14:12:20
 */
@RestController
@RequestMapping("/reportController")
public class ReportController {

    @Autowired
    private ReportService reportService;

    @ApiOperation(value = "新增模板信息")
    @PostMapping(value = "/addReport")
    public InvokeResult<Boolean> addenergy(@RequestBody GReportSlVo vo, HttpServletRequest request){
        InvokeResult<Boolean> invokeResult = reportService.addReport(vo,request);
        return invokeResult;
    }


    @ApiOperation(value = "更改模板信息")
    @RequestMapping("/updateReport")
    public InvokeResult updateReport(@RequestBody GReportSlVo vo){
        InvokeResult invokeResult = reportService.updateReport(vo);
        System.out.printf("传入的对象："+vo);
        return invokeResult;
    }

//    @ApiOperation(value = "删除模板信息")
//    @RequestMapping(value = "/delectReports", method = RequestMethod.POST)
//    public ResponseData delectReportClac(GReportSlVo vo, HttpServletRequest request){
//        ResponseData reportClac = reportService.delectReport(vo, request);
//        return reportClac;
//    }
}
