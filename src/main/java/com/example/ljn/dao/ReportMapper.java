package com.example.ljn.dao;


import com.example.ljn.utils.BaseMapper;
import com.example.ljn.vo.GReportSlVo;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author lijianan
 * @since 2022-06-10
 */
@Repository
//public interface ReportMapper extends BaseMapper<GReportSlVo> {
public interface ReportMapper {

    List<Map<String, Object>> queryData(GReportSlVo vo);

    int updateReport(GReportSlVo vo);

    int batchDelect(GReportSlVo vo);

    void insert(GReportSlVo vo);
}
