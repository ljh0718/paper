package com.yizhidou.paper.vo;

import java.io.Serializable;

/**
 * 题库和选择题VO类
 */

public class PaperChoiceVO implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer qId;
    private Integer qtId;
    private String questionInfo;
    private String choice1;
    private String choice2;
    private String choice3;
    private String choice4;
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
        return "PaperChoiceVO{" +
                "qId=" + qId +
                ", qtId=" + qtId +
                ", questionInfo='" + questionInfo + '\'' +
                ", choice1='" + choice1 + '\'' +
                ", choice2='" + choice2 + '\'' +
                ", choice3='" + choice3 + '\'' +
                ", choice4='" + choice4 + '\'' +
                ", questionKey='" + questionKey + '\'' +
                ", questionValue=" + questionValue +
                ", questionType='" + questionType + '\'' +
                ", questionKnows='" + questionKnows + '\'' +
                ", questionLevel='" + questionLevel + '\'' +
                '}';
    }
}
