package com.yizhidou.paper.entity;

import java.util.Date;

/**
 * 考试安排实体类
 */
public class TestSchedule {
    private Integer tsid;

    private Integer paperid;

    private String join;

    private Date start;

    private Date over;

    private Integer time;

    private Integer isAdvance;

    public TestSchedule(Integer tsid, Integer paperid, String join, Date start, Date over, Integer time, Integer isAdvance) {
        this.tsid = tsid;
        this.paperid = paperid;
        this.join = join;
        this.start = start;
        this.over = over;
        this.time = time;
        this.isAdvance = isAdvance;
    }

    public TestSchedule() {
        super();
    }

    public Integer getTsid() {
        return tsid;
    }

    public void setTsid(Integer tsid) {
        this.tsid = tsid;
    }

    public Integer getPaperid() {
        return paperid;
    }

    public void setPaperid(Integer paperid) {
        this.paperid = paperid;
    }

    public String getJoin() {
        return join;
    }

    public void setJoin(String join) {
        this.join = join == null ? null : join.trim();
    }

    public Date getStart() {
        return start;
    }

    public void setStart(Date start) {
        this.start = start;
    }

    public Date getOver() {
        return over;
    }

    public void setOver(Date over) {
        this.over = over;
    }

    public Integer getTime() {
        return time;
    }

    public void setTime(Integer time) {
        this.time = time;
    }

    public Integer getIsAdvance() {
        return isAdvance;
    }

    public void setIsAdvance(Integer isAdvance) {
        this.isAdvance = isAdvance;
    }
}