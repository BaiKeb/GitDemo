package com.example.ljn.service.impl;


import com.example.ljn.dao.ReportMapper;
import com.example.ljn.service.ReportService;
import com.example.ljn.utils.InvokeResult;
import com.example.ljn.utils.ResponseData;
import com.example.ljn.vo.GReportSlVo;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletRequest;

@Service
@AllArgsConstructor
public class ReportServiceImpl implements ReportService {
    private ReportMapper reportMapper;

    @Override
    public InvokeResult<Boolean> addReport(GReportSlVo vo, HttpServletRequest request) {
        InvokeResult<Boolean> invokeResult = new InvokeResult<>();
        String msg = "新增报表模板成功";
        try {
            reportMapper.insert(vo);
            invokeResult.setStatus(200);
            invokeResult.setCode(0);
        }catch (Exception e){
            invokeResult.setCode(1);
            msg = "新增报表模板失败";
//            log.error("新增告警配置信息失败:" + e.getMessage());
        }
        invokeResult.setMsg(msg);
        return invokeResult;
    }

//    @Override
//    public List<Map<String, Object>> querReport(ReportModelVo vo) {
//
//        List<Map<String, Object>> maps = reportMapper.queryData(vo);
//        return maps;
//    }

    @Override
    public InvokeResult updateReport(GReportSlVo vo) {
        InvokeResult<Object> invokeResult = new InvokeResult<>();
        invokeResult.setCode(0);
        invokeResult.setStatus(200);
        String msg = "更改成功";
        try {
            reportMapper.updateReport(vo);
        } catch (Exception e) {
            invokeResult.setCode(1);
            invokeResult.setStatus(500);
            msg = "更改失败";
            //有异常，则将异常信息记录日志中
//            log.error("更改失败:" + e.getMessage());
            e.printStackTrace();
        }
        invokeResult.setMsg(msg);
        return invokeResult;
    }

//    @Override
//    public ResponseData delectReport(GReportSlVo vo, HttpServletRequest request) {
//        ResponseData res = new ResponseData(200,"删除成功");
//        int i = 0;
//        try {
//            i = reportMapper.batchDelect(vo);
//            if (i <= 0){
//                throw new RuntimeException("删除失败");
//            }
//        } catch (Exception e) {
////            log.error(e.getMessage(),e);
//            res.setData("删除失败");
//            res.setStatus(500);
//        }
//        return res;
//    }
}
