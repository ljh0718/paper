package com.yizhidou.paper.entity;

import java.util.ArrayList;
import java.util.List;

public class QuestionAnswerExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public QuestionAnswerExample() {
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

        public Criteria andQaidIsNull() {
            addCriterion("qaId is null");
            return (Criteria) this;
        }

        public Criteria andQaidIsNotNull() {
            addCriterion("qaId is not null");
            return (Criteria) this;
        }

        public Criteria andQaidEqualTo(Integer value) {
            addCriterion("qaId =", value, "qaid");
            return (Criteria) this;
        }

        public Criteria andQaidNotEqualTo(Integer value) {
            addCriterion("qaId <>", value, "qaid");
            return (Criteria) this;
        }

        public Criteria andQaidGreaterThan(Integer value) {
            addCriterion("qaId >", value, "qaid");
            return (Criteria) this;
        }

        public Criteria andQaidGreaterThanOrEqualTo(Integer value) {
            addCriterion("qaId >=", value, "qaid");
            return (Criteria) this;
        }

        public Criteria andQaidLessThan(Integer value) {
            addCriterion("qaId <", value, "qaid");
            return (Criteria) this;
        }

        public Criteria andQaidLessThanOrEqualTo(Integer value) {
            addCriterion("qaId <=", value, "qaid");
            return (Criteria) this;
        }

        public Criteria andQaidIn(List<Integer> values) {
            addCriterion("qaId in", values, "qaid");
            return (Criteria) this;
        }

        public Criteria andQaidNotIn(List<Integer> values) {
            addCriterion("qaId not in", values, "qaid");
            return (Criteria) this;
        }

        public Criteria andQaidBetween(Integer value1, Integer value2) {
            addCriterion("qaId between", value1, value2, "qaid");
            return (Criteria) this;
        }

        public Criteria andQaidNotBetween(Integer value1, Integer value2) {
            addCriterion("qaId not between", value1, value2, "qaid");
            return (Criteria) this;
        }

        public Criteria andQaTypeChoiceIsNull() {
            addCriterion("qa_type_choice is null");
            return (Criteria) this;
        }

        public Criteria andQaTypeChoiceIsNotNull() {
            addCriterion("qa_type_choice is not null");
            return (Criteria) this;
        }

        public Criteria andQaTypeChoiceEqualTo(Integer value) {
            addCriterion("qa_type_choice =", value, "qaTypeChoice");
            return (Criteria) this;
        }

        public Criteria andQaTypeChoiceNotEqualTo(Integer value) {
            addCriterion("qa_type_choice <>", value, "qaTypeChoice");
            return (Criteria) this;
        }

        public Criteria andQaTypeChoiceGreaterThan(Integer value) {
            addCriterion("qa_type_choice >", value, "qaTypeChoice");
            return (Criteria) this;
        }

        public Criteria andQaTypeChoiceGreaterThanOrEqualTo(Integer value) {
            addCriterion("qa_type_choice >=", value, "qaTypeChoice");
            return (Criteria) this;
        }

        public Criteria andQaTypeChoiceLessThan(Integer value) {
            addCriterion("qa_type_choice <", value, "qaTypeChoice");
            return (Criteria) this;
        }

        public Criteria andQaTypeChoiceLessThanOrEqualTo(Integer value) {
            addCriterion("qa_type_choice <=", value, "qaTypeChoice");
            return (Criteria) this;
        }

        public Criteria andQaTypeChoiceIn(List<Integer> values) {
            addCriterion("qa_type_choice in", values, "qaTypeChoice");
            return (Criteria) this;
        }

        public Criteria andQaTypeChoiceNotIn(List<Integer> values) {
            addCriterion("qa_type_choice not in", values, "qaTypeChoice");
            return (Criteria) this;
        }

        public Criteria andQaTypeChoiceBetween(Integer value1, Integer value2) {
            addCriterion("qa_type_choice between", value1, value2, "qaTypeChoice");
            return (Criteria) this;
        }

        public Criteria andQaTypeChoiceNotBetween(Integer value1, Integer value2) {
            addCriterion("qa_type_choice not between", value1, value2, "qaTypeChoice");
            return (Criteria) this;
        }

        public Criteria andQaContentIsNull() {
            addCriterion("qa_content is null");
            return (Criteria) this;
        }

        public Criteria andQaContentIsNotNull() {
            addCriterion("qa_content is not null");
            return (Criteria) this;
        }

        public Criteria andQaContentEqualTo(String value) {
            addCriterion("qa_content =", value, "qaContent");
            return (Criteria) this;
        }

        public Criteria andQaContentNotEqualTo(String value) {
            addCriterion("qa_content <>", value, "qaContent");
            return (Criteria) this;
        }

        public Criteria andQaContentGreaterThan(String value) {
            addCriterion("qa_content >", value, "qaContent");
            return (Criteria) this;
        }

        public Criteria andQaContentGreaterThanOrEqualTo(String value) {
            addCriterion("qa_content >=", value, "qaContent");
            return (Criteria) this;
        }

        public Criteria andQaContentLessThan(String value) {
            addCriterion("qa_content <", value, "qaContent");
            return (Criteria) this;
        }

        public Criteria andQaContentLessThanOrEqualTo(String value) {
            addCriterion("qa_content <=", value, "qaContent");
            return (Criteria) this;
        }

        public Criteria andQaContentLike(String value) {
            addCriterion("qa_content like", value, "qaContent");
            return (Criteria) this;
        }

        public Criteria andQaContentNotLike(String value) {
            addCriterion("qa_content not like", value, "qaContent");
            return (Criteria) this;
        }

        public Criteria andQaContentIn(List<String> values) {
            addCriterion("qa_content in", values, "qaContent");
            return (Criteria) this;
        }

        public Criteria andQaContentNotIn(List<String> values) {
            addCriterion("qa_content not in", values, "qaContent");
            return (Criteria) this;
        }

        public Criteria andQaContentBetween(String value1, String value2) {
            addCriterion("qa_content between", value1, value2, "qaContent");
            return (Criteria) this;
        }

        public Criteria andQaContentNotBetween(String value1, String value2) {
            addCriterion("qa_content not between", value1, value2, "qaContent");
            return (Criteria) this;
        }

        public Criteria andQaKeyIsNull() {
            addCriterion("qa_key is null");
            return (Criteria) this;
        }

        public Criteria andQaKeyIsNotNull() {
            addCriterion("qa_key is not null");
            return (Criteria) this;
        }

        public Criteria andQaKeyEqualTo(String value) {
            addCriterion("qa_key =", value, "qaKey");
            return (Criteria) this;
        }

        public Criteria andQaKeyNotEqualTo(String value) {
            addCriterion("qa_key <>", value, "qaKey");
            return (Criteria) this;
        }

        public Criteria andQaKeyGreaterThan(String value) {
            addCriterion("qa_key >", value, "qaKey");
            return (Criteria) this;
        }

        public Criteria andQaKeyGreaterThanOrEqualTo(String value) {
            addCriterion("qa_key >=", value, "qaKey");
            return (Criteria) this;
        }

        public Criteria andQaKeyLessThan(String value) {
            addCriterion("qa_key <", value, "qaKey");
            return (Criteria) this;
        }

        public Criteria andQaKeyLessThanOrEqualTo(String value) {
            addCriterion("qa_key <=", value, "qaKey");
            return (Criteria) this;
        }

        public Criteria andQaKeyLike(String value) {
            addCriterion("qa_key like", value, "qaKey");
            return (Criteria) this;
        }

        public Criteria andQaKeyNotLike(String value) {
            addCriterion("qa_key not like", value, "qaKey");
            return (Criteria) this;
        }

        public Criteria andQaKeyIn(List<String> values) {
            addCriterion("qa_key in", values, "qaKey");
            return (Criteria) this;
        }

        public Criteria andQaKeyNotIn(List<String> values) {
            addCriterion("qa_key not in", values, "qaKey");
            return (Criteria) this;
        }

        public Criteria andQaKeyBetween(String value1, String value2) {
            addCriterion("qa_key between", value1, value2, "qaKey");
            return (Criteria) this;
        }

        public Criteria andQaKeyNotBetween(String value1, String value2) {
            addCriterion("qa_key not between", value1, value2, "qaKey");
            return (Criteria) this;
        }

        public Criteria andQaValueIsNull() {
            addCriterion("qa_value is null");
            return (Criteria) this;
        }

        public Criteria andQaValueIsNotNull() {
            addCriterion("qa_value is not null");
            return (Criteria) this;
        }

        public Criteria andQaValueEqualTo(Integer value) {
            addCriterion("qa_value =", value, "qaValue");
            return (Criteria) this;
        }

        public Criteria andQaValueNotEqualTo(Integer value) {
            addCriterion("qa_value <>", value, "qaValue");
            return (Criteria) this;
        }

        public Criteria andQaValueGreaterThan(Integer value) {
            addCriterion("qa_value >", value, "qaValue");
            return (Criteria) this;
        }

        public Criteria andQaValueGreaterThanOrEqualTo(Integer value) {
            addCriterion("qa_value >=", value, "qaValue");
            return (Criteria) this;
        }

        public Criteria andQaValueLessThan(Integer value) {
            addCriterion("qa_value <", value, "qaValue");
            return (Criteria) this;
        }

        public Criteria andQaValueLessThanOrEqualTo(Integer value) {
            addCriterion("qa_value <=", value, "qaValue");
            return (Criteria) this;
        }

        public Criteria andQaValueIn(List<Integer> values) {
            addCriterion("qa_value in", values, "qaValue");
            return (Criteria) this;
        }

        public Criteria andQaValueNotIn(List<Integer> values) {
            addCriterion("qa_value not in", values, "qaValue");
            return (Criteria) this;
        }

        public Criteria andQaValueBetween(Integer value1, Integer value2) {
            addCriterion("qa_value between", value1, value2, "qaValue");
            return (Criteria) this;
        }

        public Criteria andQaValueNotBetween(Integer value1, Integer value2) {
            addCriterion("qa_value not between", value1, value2, "qaValue");
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