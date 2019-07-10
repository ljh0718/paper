package com.yizhidou.paper.entity;

import java.util.ArrayList;
import java.util.List;

public class PapersExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PapersExample() {
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

        public Criteria andPaperIdIsNull() {
            addCriterion("paper_id is null");
            return (Criteria) this;
        }

        public Criteria andPaperIdIsNotNull() {
            addCriterion("paper_id is not null");
            return (Criteria) this;
        }

        public Criteria andPaperIdEqualTo(Integer value) {
            addCriterion("paper_id =", value, "paperId");
            return (Criteria) this;
        }

        public Criteria andPaperIdNotEqualTo(Integer value) {
            addCriterion("paper_id <>", value, "paperId");
            return (Criteria) this;
        }

        public Criteria andPaperIdGreaterThan(Integer value) {
            addCriterion("paper_id >", value, "paperId");
            return (Criteria) this;
        }

        public Criteria andPaperIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("paper_id >=", value, "paperId");
            return (Criteria) this;
        }

        public Criteria andPaperIdLessThan(Integer value) {
            addCriterion("paper_id <", value, "paperId");
            return (Criteria) this;
        }

        public Criteria andPaperIdLessThanOrEqualTo(Integer value) {
            addCriterion("paper_id <=", value, "paperId");
            return (Criteria) this;
        }

        public Criteria andPaperIdIn(List<Integer> values) {
            addCriterion("paper_id in", values, "paperId");
            return (Criteria) this;
        }

        public Criteria andPaperIdNotIn(List<Integer> values) {
            addCriterion("paper_id not in", values, "paperId");
            return (Criteria) this;
        }

        public Criteria andPaperIdBetween(Integer value1, Integer value2) {
            addCriterion("paper_id between", value1, value2, "paperId");
            return (Criteria) this;
        }

        public Criteria andPaperIdNotBetween(Integer value1, Integer value2) {
            addCriterion("paper_id not between", value1, value2, "paperId");
            return (Criteria) this;
        }

        public Criteria andPapernameIsNull() {
            addCriterion("papername is null");
            return (Criteria) this;
        }

        public Criteria andPapernameIsNotNull() {
            addCriterion("papername is not null");
            return (Criteria) this;
        }

        public Criteria andPapernameEqualTo(String value) {
            addCriterion("papername =", value, "papername");
            return (Criteria) this;
        }

        public Criteria andPapernameNotEqualTo(String value) {
            addCriterion("papername <>", value, "papername");
            return (Criteria) this;
        }

        public Criteria andPapernameGreaterThan(String value) {
            addCriterion("papername >", value, "papername");
            return (Criteria) this;
        }

        public Criteria andPapernameGreaterThanOrEqualTo(String value) {
            addCriterion("papername >=", value, "papername");
            return (Criteria) this;
        }

        public Criteria andPapernameLessThan(String value) {
            addCriterion("papername <", value, "papername");
            return (Criteria) this;
        }

        public Criteria andPapernameLessThanOrEqualTo(String value) {
            addCriterion("papername <=", value, "papername");
            return (Criteria) this;
        }

        public Criteria andPapernameLike(String value) {
            addCriterion("papername like", value, "papername");
            return (Criteria) this;
        }

        public Criteria andPapernameNotLike(String value) {
            addCriterion("papername not like", value, "papername");
            return (Criteria) this;
        }

        public Criteria andPapernameIn(List<String> values) {
            addCriterion("papername in", values, "papername");
            return (Criteria) this;
        }

        public Criteria andPapernameNotIn(List<String> values) {
            addCriterion("papername not in", values, "papername");
            return (Criteria) this;
        }

        public Criteria andPapernameBetween(String value1, String value2) {
            addCriterion("papername between", value1, value2, "papername");
            return (Criteria) this;
        }

        public Criteria andPapernameNotBetween(String value1, String value2) {
            addCriterion("papername not between", value1, value2, "papername");
            return (Criteria) this;
        }

        public Criteria andTotalScoreIsNull() {
            addCriterion("total_score is null");
            return (Criteria) this;
        }

        public Criteria andTotalScoreIsNotNull() {
            addCriterion("total_score is not null");
            return (Criteria) this;
        }

        public Criteria andTotalScoreEqualTo(Integer value) {
            addCriterion("total_score =", value, "totalScore");
            return (Criteria) this;
        }

        public Criteria andTotalScoreNotEqualTo(Integer value) {
            addCriterion("total_score <>", value, "totalScore");
            return (Criteria) this;
        }

        public Criteria andTotalScoreGreaterThan(Integer value) {
            addCriterion("total_score >", value, "totalScore");
            return (Criteria) this;
        }

        public Criteria andTotalScoreGreaterThanOrEqualTo(Integer value) {
            addCriterion("total_score >=", value, "totalScore");
            return (Criteria) this;
        }

        public Criteria andTotalScoreLessThan(Integer value) {
            addCriterion("total_score <", value, "totalScore");
            return (Criteria) this;
        }

        public Criteria andTotalScoreLessThanOrEqualTo(Integer value) {
            addCriterion("total_score <=", value, "totalScore");
            return (Criteria) this;
        }

        public Criteria andTotalScoreIn(List<Integer> values) {
            addCriterion("total_score in", values, "totalScore");
            return (Criteria) this;
        }

        public Criteria andTotalScoreNotIn(List<Integer> values) {
            addCriterion("total_score not in", values, "totalScore");
            return (Criteria) this;
        }

        public Criteria andTotalScoreBetween(Integer value1, Integer value2) {
            addCriterion("total_score between", value1, value2, "totalScore");
            return (Criteria) this;
        }

        public Criteria andTotalScoreNotBetween(Integer value1, Integer value2) {
            addCriterion("total_score not between", value1, value2, "totalScore");
            return (Criteria) this;
        }

        public Criteria andPassIsNull() {
            addCriterion("pass is null");
            return (Criteria) this;
        }

        public Criteria andPassIsNotNull() {
            addCriterion("pass is not null");
            return (Criteria) this;
        }

        public Criteria andPassEqualTo(Integer value) {
            addCriterion("pass =", value, "pass");
            return (Criteria) this;
        }

        public Criteria andPassNotEqualTo(Integer value) {
            addCriterion("pass <>", value, "pass");
            return (Criteria) this;
        }

        public Criteria andPassGreaterThan(Integer value) {
            addCriterion("pass >", value, "pass");
            return (Criteria) this;
        }

        public Criteria andPassGreaterThanOrEqualTo(Integer value) {
            addCriterion("pass >=", value, "pass");
            return (Criteria) this;
        }

        public Criteria andPassLessThan(Integer value) {
            addCriterion("pass <", value, "pass");
            return (Criteria) this;
        }

        public Criteria andPassLessThanOrEqualTo(Integer value) {
            addCriterion("pass <=", value, "pass");
            return (Criteria) this;
        }

        public Criteria andPassIn(List<Integer> values) {
            addCriterion("pass in", values, "pass");
            return (Criteria) this;
        }

        public Criteria andPassNotIn(List<Integer> values) {
            addCriterion("pass not in", values, "pass");
            return (Criteria) this;
        }

        public Criteria andPassBetween(Integer value1, Integer value2) {
            addCriterion("pass between", value1, value2, "pass");
            return (Criteria) this;
        }

        public Criteria andPassNotBetween(Integer value1, Integer value2) {
            addCriterion("pass not between", value1, value2, "pass");
            return (Criteria) this;
        }

        public Criteria andScopeIsNull() {
            addCriterion("scope is null");
            return (Criteria) this;
        }

        public Criteria andScopeIsNotNull() {
            addCriterion("scope is not null");
            return (Criteria) this;
        }

        public Criteria andScopeEqualTo(String value) {
            addCriterion("scope =", value, "scope");
            return (Criteria) this;
        }

        public Criteria andScopeNotEqualTo(String value) {
            addCriterion("scope <>", value, "scope");
            return (Criteria) this;
        }

        public Criteria andScopeGreaterThan(String value) {
            addCriterion("scope >", value, "scope");
            return (Criteria) this;
        }

        public Criteria andScopeGreaterThanOrEqualTo(String value) {
            addCriterion("scope >=", value, "scope");
            return (Criteria) this;
        }

        public Criteria andScopeLessThan(String value) {
            addCriterion("scope <", value, "scope");
            return (Criteria) this;
        }

        public Criteria andScopeLessThanOrEqualTo(String value) {
            addCriterion("scope <=", value, "scope");
            return (Criteria) this;
        }

        public Criteria andScopeLike(String value) {
            addCriterion("scope like", value, "scope");
            return (Criteria) this;
        }

        public Criteria andScopeNotLike(String value) {
            addCriterion("scope not like", value, "scope");
            return (Criteria) this;
        }

        public Criteria andScopeIn(List<String> values) {
            addCriterion("scope in", values, "scope");
            return (Criteria) this;
        }

        public Criteria andScopeNotIn(List<String> values) {
            addCriterion("scope not in", values, "scope");
            return (Criteria) this;
        }

        public Criteria andScopeBetween(String value1, String value2) {
            addCriterion("scope between", value1, value2, "scope");
            return (Criteria) this;
        }

        public Criteria andScopeNotBetween(String value1, String value2) {
            addCriterion("scope not between", value1, value2, "scope");
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