package com.yizhidou.paper.entity;

/**
 * 试卷题库实体类
 */
public class PaperQuestion {
    private Integer id;

    private Integer qid;

    private Integer pid;

    public PaperQuestion(Integer id, Integer qid, Integer pid) {
        this.id = id;
        this.qid = qid;
        this.pid = pid;
    }

    public PaperQuestion() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getQid() {
        return qid;
    }

    public void setQid(Integer qid) {
        this.qid = qid;
    }

    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }
}