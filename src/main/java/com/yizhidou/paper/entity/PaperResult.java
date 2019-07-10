package com.yizhidou.paper.entity;

public class PaperResult {
    private Integer resId;

    private Integer paperId;

    private Integer personId;

    private Integer quesId;

    private String res;

    public PaperResult(Integer resId, Integer paperId, Integer personId, Integer quesId, String res) {
        this.resId = resId;
        this.paperId = paperId;
        this.personId = personId;
        this.quesId = quesId;
        this.res = res;
    }

    public PaperResult() {
        super();
    }

    public Integer getResId() {
        return resId;
    }

    public void setResId(Integer resId) {
        this.resId = resId;
    }

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

    public Integer getQuesId() {
        return quesId;
    }

    public void setQuesId(Integer quesId) {
        this.quesId = quesId;
    }

    public String getRes() {
        return res;
    }

    public void setRes(String res) {
        this.res = res == null ? null : res.trim();
    }
}