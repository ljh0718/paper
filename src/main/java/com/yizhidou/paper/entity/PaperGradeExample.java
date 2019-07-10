package com.yizhidou.paper.entity;

import java.util.ArrayList;
import java.util.List;

public class PaperGradeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PaperGradeExample() {
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

        public Criteria andPaperGradeIdIsNull() {
            addCriterion("paper_grade_id is null");
            return (Criteria) this;
        }

        public Criteria andPaperGradeIdIsNotNull() {
            addCriterion("paper_grade_id is not null");
            return (Criteria) this;
        }

        public Criteria andPaperGradeIdEqualTo(Integer value) {
            addCriterion("paper_grade_id =", value, "paperGradeId");
            return (Criteria) this;
        }

        public Criteria andPaperGradeIdNotEqualTo(Integer value) {
            addCriterion("paper_grade_id <>", value, "paperGradeId");
            return (Criteria) this;
        }

        public Criteria andPaperGradeIdGreaterThan(Integer value) {
            addCriterion("paper_grade_id >", value, "paperGradeId");
            return (Criteria) this;
        }

        public Criteria andPaperGradeIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("paper_grade_id >=", value, "paperGradeId");
            return (Criteria) this;
        }

        public Criteria andPaperGradeIdLessThan(Integer value) {
            addCriterion("paper_grade_id <", value, "paperGradeId");
            return (Criteria) this;
        }

        public Criteria andPaperGradeIdLessThanOrEqualTo(Integer value) {
            addCriterion("paper_grade_id <=", value, "paperGradeId");
            return (Criteria) this;
        }

        public Criteria andPaperGradeIdIn(List<Integer> values) {
            addCriterion("paper_grade_id in", values, "paperGradeId");
            return (Criteria) this;
        }

        public Criteria andPaperGradeIdNotIn(List<Integer> values) {
            addCriterion("paper_grade_id not in", values, "paperGradeId");
            return (Criteria) this;
        }

        public Criteria andPaperGradeIdBetween(Integer value1, Integer value2) {
            addCriterion("paper_grade_id between", value1, value2, "paperGradeId");
            return (Criteria) this;
        }

        public Criteria andPaperGradeIdNotBetween(Integer value1, Integer value2) {
            addCriterion("paper_grade_id not between", value1, value2, "paperGradeId");
            return (Criteria) this;
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

        public Criteria andPersonIdIsNull() {
            addCriterion("person_id is null");
            return (Criteria) this;
        }

        public Criteria andPersonIdIsNotNull() {
            addCriterion("person_id is not null");
            return (Criteria) this;
        }

        public Criteria andPersonIdEqualTo(Integer value) {
            addCriterion("person_id =", value, "personId");
            return (Criteria) this;
        }

        public Criteria andPersonIdNotEqualTo(Integer value) {
            addCriterion("person_id <>", value, "personId");
            return (Criteria) this;
        }

        public Criteria andPersonIdGreaterThan(Integer value) {
            addCriterion("person_id >", value, "personId");
            return (Criteria) this;
        }

        public Criteria andPersonIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("person_id >=", value, "personId");
            return (Criteria) this;
        }

        public Criteria andPersonIdLessThan(Integer value) {
            addCriterion("person_id <", value, "personId");
            return (Criteria) this;
        }

        public Criteria andPersonIdLessThanOrEqualTo(Integer value) {
            addCriterion("person_id <=", value, "personId");
            return (Criteria) this;
        }

        public Criteria andPersonIdIn(List<Integer> values) {
            addCriterion("person_id in", values, "personId");
            return (Criteria) this;
        }

        public Criteria andPersonIdNotIn(List<Integer> values) {
            addCriterion("person_id not in", values, "personId");
            return (Criteria) this;
        }

        public Criteria andPersonIdBetween(Integer value1, Integer value2) {
            addCriterion("person_id between", value1, value2, "personId");
            return (Criteria) this;
        }

        public Criteria andPersonIdNotBetween(Integer value1, Integer value2) {
            addCriterion("person_id not between", value1, value2, "personId");
            return (Criteria) this;
        }

        public Criteria andGradeTxIsNull() {
            addCriterion("grade_tx is null");
            return (Criteria) this;
        }

        public Criteria andGradeTxIsNotNull() {
            addCriterion("grade_tx is not null");
            return (Criteria) this;
        }

        public Criteria andGradeTxEqualTo(Integer value) {
            addCriterion("grade_tx =", value, "gradeTx");
            return (Criteria) this;
        }

        public Criteria andGradeTxNotEqualTo(Integer value) {
            addCriterion("grade_tx <>", value, "gradeTx");
            return (Criteria) this;
        }

        public Criteria andGradeTxGreaterThan(Integer value) {
            addCriterion("grade_tx >", value, "gradeTx");
            return (Criteria) this;
        }

        public Criteria andGradeTxGreaterThanOrEqualTo(Integer value) {
            addCriterion("grade_tx >=", value, "gradeTx");
            return (Criteria) this;
        }

        public Criteria andGradeTxLessThan(Integer value) {
            addCriterion("grade_tx <", value, "gradeTx");
            return (Criteria) this;
        }

        public Criteria andGradeTxLessThanOrEqualTo(Integer value) {
            addCriterion("grade_tx <=", value, "gradeTx");
            return (Criteria) this;
        }

        public Criteria andGradeTxIn(List<Integer> values) {
            addCriterion("grade_tx in", values, "gradeTx");
            return (Criteria) this;
        }

        public Criteria andGradeTxNotIn(List<Integer> values) {
            addCriterion("grade_tx not in", values, "gradeTx");
            return (Criteria) this;
        }

        public Criteria andGradeTxBetween(Integer value1, Integer value2) {
            addCriterion("grade_tx between", value1, value2, "gradeTx");
            return (Criteria) this;
        }

        public Criteria andGradeTxNotBetween(Integer value1, Integer value2) {
            addCriterion("grade_tx not between", value1, value2, "gradeTx");
            return (Criteria) this;
        }

        public Criteria andGradeWdIsNull() {
            addCriterion("grade_wd is null");
            return (Criteria) this;
        }

        public Criteria andGradeWdIsNotNull() {
            addCriterion("grade_wd is not null");
            return (Criteria) this;
        }

        public Criteria andGradeWdEqualTo(Integer value) {
            addCriterion("grade_wd =", value, "gradeWd");
            return (Criteria) this;
        }

        public Criteria andGradeWdNotEqualTo(Integer value) {
            addCriterion("grade_wd <>", value, "gradeWd");
            return (Criteria) this;
        }

        public Criteria andGradeWdGreaterThan(Integer value) {
            addCriterion("grade_wd >", value, "gradeWd");
            return (Criteria) this;
        }

        public Criteria andGradeWdGreaterThanOrEqualTo(Integer value) {
            addCriterion("grade_wd >=", value, "gradeWd");
            return (Criteria) this;
        }

        public Criteria andGradeWdLessThan(Integer value) {
            addCriterion("grade_wd <", value, "gradeWd");
            return (Criteria) this;
        }

        public Criteria andGradeWdLessThanOrEqualTo(Integer value) {
            addCriterion("grade_wd <=", value, "gradeWd");
            return (Criteria) this;
        }

        public Criteria andGradeWdIn(List<Integer> values) {
            addCriterion("grade_wd in", values, "gradeWd");
            return (Criteria) this;
        }

        public Criteria andGradeWdNotIn(List<Integer> values) {
            addCriterion("grade_wd not in", values, "gradeWd");
            return (Criteria) this;
        }

        public Criteria andGradeWdBetween(Integer value1, Integer value2) {
            addCriterion("grade_wd between", value1, value2, "gradeWd");
            return (Criteria) this;
        }

        public Criteria andGradeWdNotBetween(Integer value1, Integer value2) {
            addCriterion("grade_wd not between", value1, value2, "gradeWd");
            return (Criteria) this;
        }

        public Criteria andGradeIsNull() {
            addCriterion("grade is null");
            return (Criteria) this;
        }

        public Criteria andGradeIsNotNull() {
            addCriterion("grade is not null");
            return (Criteria) this;
        }

        public Criteria andGradeEqualTo(Integer value) {
            addCriterion("grade =", value, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeNotEqualTo(Integer value) {
            addCriterion("grade <>", value, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeGreaterThan(Integer value) {
            addCriterion("grade >", value, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeGreaterThanOrEqualTo(Integer value) {
            addCriterion("grade >=", value, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeLessThan(Integer value) {
            addCriterion("grade <", value, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeLessThanOrEqualTo(Integer value) {
            addCriterion("grade <=", value, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeIn(List<Integer> values) {
            addCriterion("grade in", values, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeNotIn(List<Integer> values) {
            addCriterion("grade not in", values, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeBetween(Integer value1, Integer value2) {
            addCriterion("grade between", value1, value2, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeNotBetween(Integer value1, Integer value2) {
            addCriterion("grade not between", value1, value2, "grade");
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