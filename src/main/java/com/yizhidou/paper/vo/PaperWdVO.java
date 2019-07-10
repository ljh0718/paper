package com.yizhidou.paper.vo;

import java.io.Serializable;

/**
 * 题库和问答题VO类
 */

public class PaperWdVO implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer paperId;
    private Integer personId;
    private String qaContent;
    private String qaKey;
    private Integer qaValue;
    private String result;

    public Integer getPaperId() {
        return paperId;
    }

    public void setPaperId(Integer paperId) {
        this.paperId = paperId;
    }

    public Integer getPersonId() {
        return personId;
    }

    public void setPersonId(Integer personId) {
        this.personId = personId;
    }

    public String getQaContent() {
        return qaContent;
    }

    public void setQaContent(String qaContent) {
        this.qaContent = qaContent;
    }

    public String getQaKey() {
        return qaKey;
    }

    public void setQaKey(String qaKey) {
        this.qaKey = qaKey;
    }

    public Integer getQaValue() {
        return qaValue;
    }

    public void setQaValue(Integer qaValue) {
        this.qaValue = qaValue;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    @Override
    public String toString() {
        return "PaperWdVO{" +
                "paperId=" + paperId +
                ", personId=" + personId +
                ", qaContent='" + qaContent + '\'' +
                ", qaKey='" + qaKey + '\'' +
                ", qaValue=" + qaValue +
                ", result='" + result + '\'' +
                '}';
    }
}
