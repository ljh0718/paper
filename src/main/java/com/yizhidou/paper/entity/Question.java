package com.yizhidou.paper.entity;

import java.io.Serializable;

/**
 * 题目类型型实体类
 */

public class Question implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer questionTypeId;
    private String questionType;
    private String questionKnows;
    private String questionLevel;

    public Integer getQuestionTypeId() {
        return questionTypeId;
    }

    public void setQuestionTypeId(Integer questionTypeId) {
        this.questionTypeId = questionTypeId;
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
        return "Question{" +
                "questionTypeId=" + questionTypeId +
                ", questionType='" + questionType + '\'' +
                ", questionKnows='" + questionKnows + '\'' +
                ", questionLevel='" + questionLevel + '\'' +
                '}';
    }
}
