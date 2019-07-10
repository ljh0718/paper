package com.yizhidou.paper.vo;

import java.io.Serializable;

/**
 * 题库和问答题VO类
 */

public class PaperQuestionVO implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer qId;
    private Integer qtId;
    private String questionInfo;
    private String questionKey;
    private Integer questionValue;
    private String questionType;
    private String questionKnows;
    private String questionLevel;

    public Integer getqId() {
        return qId;
    }

    public void setqId(Integer qId) {
        this.qId = qId;
    }

    public Integer getQtId() {
        return qtId;
    }

    public void setQtId(Integer qtId) {
        this.qtId = qtId;
    }

    public String getQuestionInfo() {
        return questionInfo;
    }

    public void setQuestionInfo(String questionInfo) {
        this.questionInfo = questionInfo;
    }

    public String getQuestionKey() {
        return questionKey;
    }

    public void setQuestionKey(String questionKey) {
        this.questionKey = questionKey;
    }

    public Integer getQuestionValue() {
        return questionValue;
    }

    public void setQuestionValue(Integer questionValue) {
        this.questionValue = questionValue;
    }

    public String getQuestionType() {
        return questionType;
    }

    public void setQuestionType(String questionType) {
        this.questionType = questionType;
    }

    public String getQuestionKnows() {
        return questionKnows;
    }

    public void setQuestionKnows(String questionKnows) {
        this.questionKnows = questionKnows;
    }

    public String getQuestionLevel() {
        return questionLevel;
    }

    public void setQuestionLevel(String questionLevel) {
        this.questionLevel = questionLevel;
    }

    @Override
    public String toString() {
        return "PaperQuestionVO{" +
                "qId=" + qId +
                ", qtId=" + qtId +
                ", questionInfo='" + questionInfo + '\'' +
                ", questionKey='" + questionKey + '\'' +
                ", questionValue=" + questionValue +
                ", questionType='" + questionType + '\'' +
                ", questionKnows='" + questionKnows + '\'' +
                ", questionLevel='" + questionLevel + '\'' +
                '}';
    }
}
