package com.yizhidou.paper.entity;

public class QuestionAnswer {
    private Integer qaid;

    private Integer qaTypeChoice;

    private String qaContent;

    private String qaKey;

    private Integer qaValue;

    public QuestionAnswer(Integer qaid, Integer qaTypeChoice, String qaContent, String qaKey, Integer qaValue) {
        this.qaid = qaid;
        this.qaTypeChoice = qaTypeChoice;
        this.qaContent = qaContent;
        this.qaKey = qaKey;
        this.qaValue = qaValue;
    }

    public QuestionAnswer() {
        super();
    }

    public Integer getQaid() {
        return qaid;
    }

    public void setQaid(Integer qaid) {
        this.qaid = qaid;
    }

    public Integer getQaTypeChoice() {
        return qaTypeChoice;
    }

    public void setQaTypeChoice(Integer qaTypeChoice) {
        this.qaTypeChoice = qaTypeChoice;
    }

    public String getQaContent() {
        return qaContent;
    }

    public void setQaContent(String qaContent) {
        this.qaContent = qaContent == null ? null : qaContent.trim();
    }

    public String getQaKey() {
        return qaKey;
    }

    public void setQaKey(String qaKey) {
        this.qaKey = qaKey == null ? null : qaKey.trim();
    }

    public Integer getQaValue() {
        return qaValue;
    }

    public void setQaValue(Integer qaValue) {
        this.qaValue = qaValue;
    }
}