package com.yizhidou.paper.entity;

/**
 * 试卷表
 */
public class Papers {
    private Integer paperId;

    private String papername;

    private Integer totalScore;

    private Integer pass;

    private String scope;

    public Papers(Integer paperId, String papername, Integer totalScore, Integer pass, String scope) {
        this.paperId = paperId;
        this.papername = papername;
        this.totalScore = totalScore;
        this.pass = pass;
        this.scope = scope;
    }

    public Papers() {
        super();
    }

    public Integer getPaperId() {
        return paperId;
    }

    public void setPaperId(Integer paperId) {
        this.paperId = paperId;
    }

    public String getPapername() {
        return papername;
    }

    public void setPapername(String papername) {
        this.papername = papername == null ? null : papername.trim();
    }

    public Integer getTotalScore() {
        return totalScore;
    }

    public void setTotalScore(Integer totalScore) {
        this.totalScore = totalScore;
    }

    public Integer getPass() {
        return pass;
    }

    public void setPass(Integer pass) {
        this.pass = pass;
    }

    public String getScope() {
        return scope;
    }

    public void setScope(String scope) {
        this.scope = scope == null ? null : scope.trim();
    }
}