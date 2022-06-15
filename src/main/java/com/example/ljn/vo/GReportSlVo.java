package com.example.ljn.vo;

import lombok.Data;

import java.io.Serializable;

/**
 * g_report_sl
 * @author
 */
@Data
public class GReportSlVo implements Serializable {
    private Integer repNameId;

    private Integer repTmpId;

    private String repName;

    private String repTmpCode;

    private String repCycle;

    private String urlPageClass;

    private Integer orgId;

    private Integer sortNo;

    private String objectMaxCount;

    private String objectType;

    private String repTmpStyle;

    private String dataFlag;

    private String remark;

    private String orgIds;

    private String reserved1;

    private String objectIds;

    private static final long serialVersionUID = 1L;
}
