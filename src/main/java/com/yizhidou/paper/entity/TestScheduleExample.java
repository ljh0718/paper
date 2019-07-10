package com.yizhidou.paper.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TestScheduleExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TestScheduleExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andTsidIsNull() {
            addCriterion("tsId is null");
            return (Criteria) this;
        }

        public Criteria andTsidIsNotNull() {
            addCriterion("tsId is not null");
            return (Criteria) this;
        }

        public Criteria andTsidEqualTo(Integer value) {
            addCriterion("tsId =", value, "tsid");
            return (Criteria) this;
        }

        public Criteria andTsidNotEqualTo(Integer value) {
            addCriterion("tsId <>", value, "tsid");
            return (Criteria) this;
        }

        public Criteria andTsidGreaterThan(Integer value) {
            addCriterion("tsId >", value, "tsid");
            return (Criteria) this;
        }

        public Criteria andTsidGreaterThanOrEqualTo(Integer value) {
            addCriterion("tsId >=", value, "tsid");
            return (Criteria) this;
        }

        public Criteria andTsidLessThan(Integer value) {
            addCriterion("tsId <", value, "tsid");
            return (Criteria) this;
        }

        public Criteria andTsidLessThanOrEqualTo(Integer value) {
            addCriterion("tsId <=", value, "tsid");
            return (Criteria) this;
        }

        public Criteria andTsidIn(List<Integer> values) {
            addCriterion("tsId in", values, "tsid");
            return (Criteria) this;
        }

        public Criteria andTsidNotIn(List<Integer> values) {
            addCriterion("tsId not in", values, "tsid");
            return (Criteria) this;
        }

        public Criteria andTsidBetween(Integer value1, Integer value2) {
            addCriterion("tsId between", value1, value2, "tsid");
            return (Criteria) this;
        }

        public Criteria andTsidNotBetween(Integer value1, Integer value2) {
            addCriterion("tsId not between", value1, value2, "tsid");
            return (Criteria) this;
        }

        public Criteria andPaperidIsNull() {
            addCriterion("paperId is null");
            return (Criteria) this;
        }

        public Criteria andPaperidIsNotNull() {
            addCriterion("paperId is not null");
            return (Criteria) this;
        }

        public Criteria andPaperidEqualTo(Integer value) {
            addCriterion("paperId =", value, "paperid");
            return (Criteria) this;
        }

        public Criteria andPaperidNotEqualTo(Integer value) {
            addCriterion("paperId <>", value, "paperid");
            return (Criteria) this;
        }

        public Criteria andPaperidGreaterThan(Integer value) {
            addCriterion("paperId >", value, "paperid");
            return (Criteria) this;
        }

        public Criteria andPaperidGreaterThanOrEqualTo(Integer value) {
            addCriterion("paperId >=", value, "paperid");
            return (Criteria) this;
        }

        public Criteria andPaperidLessThan(Integer value) {
            addCriterion("paperId <", value, "paperid");
            return (Criteria) this;
        }

        public Criteria andPaperidLessThanOrEqualTo(Integer value) {
            addCriterion("paperId <=", value, "paperid");
            return (Criteria) this;
        }

        public Criteria andPaperidIn(List<Integer> values) {
            addCriterion("paperId in", values, "paperid");
            return (Criteria) this;
        }

        public Criteria andPaperidNotIn(List<Integer> values) {
            addCriterion("paperId not in", values, "paperid");
            return (Criteria) this;
        }

        public Criteria andPaperidBetween(Integer value1, Integer value2) {
            addCriterion("paperId between", value1, value2, "paperid");
            return (Criteria) this;
        }

        public Criteria andPaperidNotBetween(Integer value1, Integer value2) {
            addCriterion("paperId not between", value1, value2, "paperid");
            return (Criteria) this;
        }

        public Criteria andJoinIsNull() {
            addCriterion("join is null");
            return (Criteria) this;
        }

        public Criteria andJoinIsNotNull() {
            addCriterion("join is not null");
            return (Criteria) this;
        }

        public Criteria andJoinEqualTo(String value) {
            addCriterion("join =", value, "join");
            return (Criteria) this;
        }

        public Criteria andJoinNotEqualTo(String value) {
            addCriterion("join <>", value, "join");
            return (Criteria) this;
        }

        public Criteria andJoinGreaterThan(String value) {
            addCriterion("join >", value, "join");
            return (Criteria) this;
        }

        public Criteria andJoinGreaterThanOrEqualTo(String value) {
            addCriterion("join >=", value, "join");
            return (Criteria) this;
        }

        public Criteria andJoinLessThan(String value) {
            addCriterion("join <", value, "join");
            return (Criteria) this;
        }

        public Criteria andJoinLessThanOrEqualTo(String value) {
            addCriterion("join <=", value, "join");
            return (Criteria) this;
        }

        public Criteria andJoinLike(String value) {
            addCriterion("join like", value, "join");
            return (Criteria) this;
        }

        public Criteria andJoinNotLike(String value) {
            addCriterion("join not like", value, "join");
            return (Criteria) this;
        }

        public Criteria andJoinIn(List<String> values) {
            addCriterion("join in", values, "join");
            return (Criteria) this;
        }

        public Criteria andJoinNotIn(List<String> values) {
            addCriterion("join not in", values, "join");
            return (Criteria) this;
        }

        public Criteria andJoinBetween(String value1, String value2) {
            addCriterion("join between", value1, value2, "join");
            return (Criteria) this;
        }

        public Criteria andJoinNotBetween(String value1, String value2) {
            addCriterion("join not between", value1, value2, "join");
            return (Criteria) this;
        }

        public Criteria andStartIsNull() {
            addCriterion("start is null");
            return (Criteria) this;
        }

        public Criteria andStartIsNotNull() {
            addCriterion("start is not null");
            return (Criteria) this;
        }

        public Criteria andStartEqualTo(Date value) {
            addCriterion("start =", value, "start");
            return (Criteria) this;
        }

        public Criteria andStartNotEqualTo(Date value) {
            addCriterion("start <>", value, "start");
            return (Criteria) this;
        }

        public Criteria andStartGreaterThan(Date value) {
            addCriterion("start >", value, "start");
            return (Criteria) this;
        }

        public Criteria andStartGreaterThanOrEqualTo(Date value) {
            addCriterion("start >=", value, "start");
            return (Criteria) this;
        }

        public Criteria andStartLessThan(Date value) {
            addCriterion("start <", value, "start");
            return (Criteria) this;
        }

        public Criteria andStartLessThanOrEqualTo(Date value) {
            addCriterion("start <=", value, "start");
            return (Criteria) this;
        }

        public Criteria andStartIn(List<Date> values) {
            addCriterion("start in", values, "start");
            return (Criteria) this;
        }

        public Criteria andStartNotIn(List<Date> values) {
            addCriterion("start not in", values, "start");
            return (Criteria) this;
        }

        public Criteria andStartBetween(Date value1, Date value2) {
            addCriterion("start between", value1, value2, "start");
            return (Criteria) this;
        }

        public Criteria andStartNotBetween(Date value1, Date value2) {
            addCriterion("start not between", value1, value2, "start");
            return (Criteria) this;
        }

        public Criteria andOverIsNull() {
            addCriterion("over is null");
            return (Criteria) this;
        }

        public Criteria andOverIsNotNull() {
            addCriterion("over is not null");
            return (Criteria) this;
        }

        public Criteria andOverEqualTo(Date value) {
            addCriterion("over =", value, "over");
            return (Criteria) this;
        }

        public Criteria andOverNotEqualTo(Date value) {
            addCriterion("over <>", value, "over");
            return (Criteria) this;
        }

        public Criteria andOverGreaterThan(Date value) {
            addCriterion("over >", value, "over");
            return (Criteria) this;
        }

        public Criteria andOverGreaterThanOrEqualTo(Date value) {
            addCriterion("over >=", value, "over");
            return (Criteria) this;
        }

        public Criteria andOverLessThan(Date value) {
            addCriterion("over <", value, "over");
            return (Criteria) this;
        }

        public Criteria andOverLessThanOrEqualTo(Date value) {
            addCriterion("over <=", value, "over");
            return (Criteria) this;
        }

        public Criteria andOverIn(List<Date> values) {
            addCriterion("over in", values, "over");
            return (Criteria) this;
        }

        public Criteria andOverNotIn(List<Date> values) {
            addCriterion("over not in", values, "over");
            return (Criteria) this;
        }

        public Criteria andOverBetween(Date value1, Date value2) {
            addCriterion("over between", value1, value2, "over");
            return (Criteria) this;
        }

        public Criteria andOverNotBetween(Date value1, Date value2) {
            addCriterion("over not between", value1, value2, "over");
            return (Criteria) this;
        }

        public Criteria andTimeIsNull() {
            addCriterion("time is null");
            return (Criteria) this;
        }

        public Criteria andTimeIsNotNull() {
            addCriterion("time is not null");
            return (Criteria) this;
        }

        public Criteria andTimeEqualTo(Integer value) {
            addCriterion("time =", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeNotEqualTo(Integer value) {
            addCriterion("time <>", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeGreaterThan(Integer value) {
            addCriterion("time >", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("time >=", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeLessThan(Integer value) {
            addCriterion("time <", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeLessThanOrEqualTo(Integer value) {
            addCriterion("time <=", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeIn(List<Integer> values) {
            addCriterion("time in", values, "time");
            return (Criteria) this;
        }

        public Criteria andTimeNotIn(List<Integer> values) {
            addCriterion("time not in", values, "time");
            return (Criteria) this;
        }

        public Criteria andTimeBetween(Integer value1, Integer value2) {
            addCriterion("time between", value1, value2, "time");
            return (Criteria) this;
        }

        public Criteria andTimeNotBetween(Integer value1, Integer value2) {
            addCriterion("time not between", value1, value2, "time");
            return (Criteria) this;
        }

        public Criteria andIsAdvanceIsNull() {
            addCriterion("is_advance is null");
            return (Criteria) this;
        }

        public Criteria andIsAdvanceIsNotNull() {
            addCriterion("is_advance is not null");
            return (Criteria) this;
        }

        public Criteria andIsAdvanceEqualTo(Integer value) {
            addCriterion("is_advance =", value, "isAdvance");
            return (Criteria) this;
        }

        public Criteria andIsAdvanceNotEqualTo(Integer value) {
            addCriterion("is_advance <>", value, "isAdvance");
            return (Criteria) this;
        }

        public Criteria andIsAdvanceGreaterThan(Integer value) {
            addCriterion("is_advance >", value, "isAdvance");
            return (Criteria) this;
        }

        public Criteria andIsAdvanceGreaterThanOrEqualTo(Integer value) {
            addCriterion("is_advance >=", value, "isAdvance");
            return (Criteria) this;
        }

        public Criteria andIsAdvanceLessThan(Integer value) {
            addCriterion("is_advance <", value, "isAdvance");
            return (Criteria) this;
        }

        public Criteria andIsAdvanceLessThanOrEqualTo(Integer value) {
            addCriterion("is_advance <=", value, "isAdvance");
            return (Criteria) this;
        }

        public Criteria andIsAdvanceIn(List<Integer> values) {
            addCriterion("is_advance in", values, "isAdvance");
            return (Criteria) this;
        }

        public Criteria andIsAdvanceNotIn(List<Integer> values) {
            addCriterion("is_advance not in", values, "isAdvance");
            return (Criteria) this;
        }

        public Criteria andIsAdvanceBetween(Integer value1, Integer value2) {
            addCriterion("is_advance between", value1, value2, "isAdvance");
            return (Criteria) this;
        }

        public Criteria andIsAdvanceNotBetween(Integer value1, Integer value2) {
            addCriterion("is_advance not between", value1, value2, "isAdvance");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}