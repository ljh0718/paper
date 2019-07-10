package com.yizhidou.paper.entity;

import java.io.Serializable;

/**
 * 选择题实体类
 */

public class Choice implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer  cqId;
    private Integer questionTypeChoice;
    private String questionContent;
    private String choice1;
    private String choice2;
    private String choice3;
    private String choice4;
    private String questionResult;
    private String questionKey;
    private Integer questionValue;

    public Integer getCqId() {
        return cqId;
    }

    public void setCqId(Integer cqId) {
        this.cqId = cqId;
    }

    public Integer getQuestionTypeChoice() {
        return questionTypeChoice;
    }

    public void setQuestionTypeChoice(Integer questionTypeChoice) {
        this.questionTypeChoice = questionTypeChoice;
    }

    public String getQuestionContent() {
        return questionContent;
    }

    public void setQuestionContent(String questionContent) {
        this.questionContent = questionContent;
    }

    public String getChoice1() {
        return choice1;
    }

    public void setChoice1(String choice1) {
        this.choice1 = choice1;
    }

    public String getChoice2() {
        return choice2;
    }

    public void setChoice2(String choice2) {
        this.choice2 = choice2;
    }

    public String getChoice3() {
        return choice3;
    }

    public void setChoice3(String choice3) {
        this.choice3 = choice3;
    }

    public String getChoice4() {
        return choice4;
    }

    public void setChoice4(String choice4) {
        this.choice4 = choice4;
    }

    public String getQuestionResult() {
        return questionResult;
    }

    public void setQuestionResult(String questionResult) {
        this.questionResult = questionResult;
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

    @Override
    public String toString() {
        return "Choice{" +
                "cqId=" + cqId +
                ", questionTypeChoice=" + questionTypeChoice +
                ", questionContent='" + questionContent + '\'' +
                ", choice1='" + choice1 + '\'' +
                ", choice2='" + choice2 + '\'' +
                ", choice3='" + choice3 + '\'' +
                ", choice4='" + choice4 + '\'' +
                ", questionResult='" + questionResult + '\'' +
                ", questionKey='" + questionKey + '\'' +
                ", questionValue=" + questionValue +
                '}';
    }
}

