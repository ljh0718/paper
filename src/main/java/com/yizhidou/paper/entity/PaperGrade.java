package com.yizhidou.paper.entity;

public class PaperGrade {
    private Integer paperGradeId;

    private Integer paperId;

    private Integer personId;

    private Integer gradeTx;

    private Integer gradeWd;

    private Integer grade;

    public PaperGrade(Integer paperGradeId, Integer paperId, Integer personId, Integer gradeTx, Integer gradeWd, Integer grade) {
        this.paperGradeId = paperGradeId;
        this.paperId = paperId;
        this.personId = personId;
        this.gradeTx = gradeTx;
        this.gradeWd = gradeWd;
        this.grade = grade;
    }

    public PaperGrade() {
        super();
    }

    public Integer getPaperGradeId() {
        return paperGradeId;
    }

    public void setPaperGradeId(Integer paperGradeId) {
        this.paperGradeId = paperGradeId;
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

    public Integer getGradeTx() {
        return gradeTx;
    }

    public void setGradeTx(Integer gradeTx) {
        this.gradeTx = gradeTx;
    }

    public Integer getGradeWd() {
        return gradeWd;
    }

    public void setGradeWd(Integer gradeWd) {
        this.gradeWd = gradeWd;
    }

    public Integer getGrade() {
        return grade;
    }

    public void setGrade(Integer grade) {
        this.grade = grade;
    }
}