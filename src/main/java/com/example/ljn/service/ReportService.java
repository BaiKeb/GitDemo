package com.example.ljn.service;


import com.example.ljn.utils.InvokeResult;
import com.example.ljn.vo.GReportSlVo;
import org.bouncycastle.asn1.ocsp.ResponseData;

import javax.servlet.http.HttpServletRequest;

public interface ReportService {

    InvokeResult<Boolean> addReport (GReportSlVo vo, HttpServletRequest request);

    //lijianan 20220610 报表查询
//    List<Map<String, Object>> querReport(GReportSlVo vo);

    //lijianan 20220610 报表修改
    InvokeResult updateReport(GReportSlVo vo);

//    ResponseData delectReport(GReportSlVo vo, HttpServletRequest request);
}
