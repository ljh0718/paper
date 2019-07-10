package com.yizhidou.paper.entity;

import java.io.Serializable;

/**
 * 填空题实体类
 */

public class GapFilling implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer gfId ;
    private Integer gfTypeChoice;
    private String gfContent;
    private String gfResult;
    private String gfKey;
    private Integer gfValue;

    public Integer getGfId() {
        return gfId;
    }

    public void setGfId(Integer gfId) {
        this.gfId = gfId;
    }

    public Integer getGfTypeChoice() {
        return gfTypeChoice;
    }

    public void setGfTypeChoice(Integer gfTypeChoice) {
        this.gfTypeChoice = gfTypeChoice;
    }

    public String getGfContent() {
        return gfContent;
    }

    public void setGfContent(String gfContent) {
        this.gfContent = gfContent;
    }

    public String getGfResult() {
        return gfResult;
    }

    public void setGfResult(String gfResult) {
        this.gfResult = gfResult;
    }

    public String getGfKey() {
        return gfKey;
    }

    public void setGfKey(String gfKey) {
        this.gfKey = gfKey;
    }

    public Integer getGfValue() {
        return gfValue;
    }

    public void setGfValue(Integer gfValue) {
        this.gfValue = gfValue;
    }

    @Override
    public String toString() {
        return "GapFilling{" +
                "gfId=" + gfId +
                ", gfTypeChoice=" + gfTypeChoice +
                ", gfContent='" + gfContent + '\'' +
                ", gfResult='" + gfResult + '\'' +
                ", gfKey='" + gfKey + '\'' +
                ", gfValue=" + gfValue +
                '}';
    }
}

