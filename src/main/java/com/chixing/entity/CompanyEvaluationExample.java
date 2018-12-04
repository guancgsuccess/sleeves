package com.chixing.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CompanyEvaluationExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Long offset;

    public CompanyEvaluationExample() {
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

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public Integer getLimit() {
        return limit;
    }

    public void setOffset(Long offset) {
        this.offset = offset;
    }

    public Long getOffset() {
        return offset;
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

        public Criteria andEvaluationIdIsNull() {
            addCriterion("evaluation_id is null");
            return (Criteria) this;
        }

        public Criteria andEvaluationIdIsNotNull() {
            addCriterion("evaluation_id is not null");
            return (Criteria) this;
        }

        public Criteria andEvaluationIdEqualTo(Integer value) {
            addCriterion("evaluation_id =", value, "evaluationId");
            return (Criteria) this;
        }

        public Criteria andEvaluationIdNotEqualTo(Integer value) {
            addCriterion("evaluation_id <>", value, "evaluationId");
            return (Criteria) this;
        }

        public Criteria andEvaluationIdGreaterThan(Integer value) {
            addCriterion("evaluation_id >", value, "evaluationId");
            return (Criteria) this;
        }

        public Criteria andEvaluationIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("evaluation_id >=", value, "evaluationId");
            return (Criteria) this;
        }

        public Criteria andEvaluationIdLessThan(Integer value) {
            addCriterion("evaluation_id <", value, "evaluationId");
            return (Criteria) this;
        }

        public Criteria andEvaluationIdLessThanOrEqualTo(Integer value) {
            addCriterion("evaluation_id <=", value, "evaluationId");
            return (Criteria) this;
        }

        public Criteria andEvaluationIdIn(List<Integer> values) {
            addCriterion("evaluation_id in", values, "evaluationId");
            return (Criteria) this;
        }

        public Criteria andEvaluationIdNotIn(List<Integer> values) {
            addCriterion("evaluation_id not in", values, "evaluationId");
            return (Criteria) this;
        }

        public Criteria andEvaluationIdBetween(Integer value1, Integer value2) {
            addCriterion("evaluation_id between", value1, value2, "evaluationId");
            return (Criteria) this;
        }

        public Criteria andEvaluationIdNotBetween(Integer value1, Integer value2) {
            addCriterion("evaluation_id not between", value1, value2, "evaluationId");
            return (Criteria) this;
        }

        public Criteria andEvaluationOrderIdIsNull() {
            addCriterion("evaluation_order_id is null");
            return (Criteria) this;
        }

        public Criteria andEvaluationOrderIdIsNotNull() {
            addCriterion("evaluation_order_id is not null");
            return (Criteria) this;
        }

        public Criteria andEvaluationOrderIdEqualTo(Integer value) {
            addCriterion("evaluation_order_id =", value, "evaluationOrderId");
            return (Criteria) this;
        }

        public Criteria andEvaluationOrderIdNotEqualTo(Integer value) {
            addCriterion("evaluation_order_id <>", value, "evaluationOrderId");
            return (Criteria) this;
        }

        public Criteria andEvaluationOrderIdGreaterThan(Integer value) {
            addCriterion("evaluation_order_id >", value, "evaluationOrderId");
            return (Criteria) this;
        }

        public Criteria andEvaluationOrderIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("evaluation_order_id >=", value, "evaluationOrderId");
            return (Criteria) this;
        }

        public Criteria andEvaluationOrderIdLessThan(Integer value) {
            addCriterion("evaluation_order_id <", value, "evaluationOrderId");
            return (Criteria) this;
        }

        public Criteria andEvaluationOrderIdLessThanOrEqualTo(Integer value) {
            addCriterion("evaluation_order_id <=", value, "evaluationOrderId");
            return (Criteria) this;
        }

        public Criteria andEvaluationOrderIdIn(List<Integer> values) {
            addCriterion("evaluation_order_id in", values, "evaluationOrderId");
            return (Criteria) this;
        }

        public Criteria andEvaluationOrderIdNotIn(List<Integer> values) {
            addCriterion("evaluation_order_id not in", values, "evaluationOrderId");
            return (Criteria) this;
        }

        public Criteria andEvaluationOrderIdBetween(Integer value1, Integer value2) {
            addCriterion("evaluation_order_id between", value1, value2, "evaluationOrderId");
            return (Criteria) this;
        }

        public Criteria andEvaluationOrderIdNotBetween(Integer value1, Integer value2) {
            addCriterion("evaluation_order_id not between", value1, value2, "evaluationOrderId");
            return (Criteria) this;
        }

        public Criteria andEvaluationCompanyIdIsNull() {
            addCriterion("evaluation_company_id is null");
            return (Criteria) this;
        }

        public Criteria andEvaluationCompanyIdIsNotNull() {
            addCriterion("evaluation_company_id is not null");
            return (Criteria) this;
        }

        public Criteria andEvaluationCompanyIdEqualTo(Integer value) {
            addCriterion("evaluation_company_id =", value, "evaluationCompanyId");
            return (Criteria) this;
        }

        public Criteria andEvaluationCompanyIdNotEqualTo(Integer value) {
            addCriterion("evaluation_company_id <>", value, "evaluationCompanyId");
            return (Criteria) this;
        }

        public Criteria andEvaluationCompanyIdGreaterThan(Integer value) {
            addCriterion("evaluation_company_id >", value, "evaluationCompanyId");
            return (Criteria) this;
        }

        public Criteria andEvaluationCompanyIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("evaluation_company_id >=", value, "evaluationCompanyId");
            return (Criteria) this;
        }

        public Criteria andEvaluationCompanyIdLessThan(Integer value) {
            addCriterion("evaluation_company_id <", value, "evaluationCompanyId");
            return (Criteria) this;
        }

        public Criteria andEvaluationCompanyIdLessThanOrEqualTo(Integer value) {
            addCriterion("evaluation_company_id <=", value, "evaluationCompanyId");
            return (Criteria) this;
        }

        public Criteria andEvaluationCompanyIdIn(List<Integer> values) {
            addCriterion("evaluation_company_id in", values, "evaluationCompanyId");
            return (Criteria) this;
        }

        public Criteria andEvaluationCompanyIdNotIn(List<Integer> values) {
            addCriterion("evaluation_company_id not in", values, "evaluationCompanyId");
            return (Criteria) this;
        }

        public Criteria andEvaluationCompanyIdBetween(Integer value1, Integer value2) {
            addCriterion("evaluation_company_id between", value1, value2, "evaluationCompanyId");
            return (Criteria) this;
        }

        public Criteria andEvaluationCompanyIdNotBetween(Integer value1, Integer value2) {
            addCriterion("evaluation_company_id not between", value1, value2, "evaluationCompanyId");
            return (Criteria) this;
        }

        public Criteria andEvaluationTimeIsNull() {
            addCriterion("evaluation_time is null");
            return (Criteria) this;
        }

        public Criteria andEvaluationTimeIsNotNull() {
            addCriterion("evaluation_time is not null");
            return (Criteria) this;
        }

        public Criteria andEvaluationTimeEqualTo(Date value) {
            addCriterion("evaluation_time =", value, "evaluationTime");
            return (Criteria) this;
        }

        public Criteria andEvaluationTimeNotEqualTo(Date value) {
            addCriterion("evaluation_time <>", value, "evaluationTime");
            return (Criteria) this;
        }

        public Criteria andEvaluationTimeGreaterThan(Date value) {
            addCriterion("evaluation_time >", value, "evaluationTime");
            return (Criteria) this;
        }

        public Criteria andEvaluationTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("evaluation_time >=", value, "evaluationTime");
            return (Criteria) this;
        }

        public Criteria andEvaluationTimeLessThan(Date value) {
            addCriterion("evaluation_time <", value, "evaluationTime");
            return (Criteria) this;
        }

        public Criteria andEvaluationTimeLessThanOrEqualTo(Date value) {
            addCriterion("evaluation_time <=", value, "evaluationTime");
            return (Criteria) this;
        }

        public Criteria andEvaluationTimeIn(List<Date> values) {
            addCriterion("evaluation_time in", values, "evaluationTime");
            return (Criteria) this;
        }

        public Criteria andEvaluationTimeNotIn(List<Date> values) {
            addCriterion("evaluation_time not in", values, "evaluationTime");
            return (Criteria) this;
        }

        public Criteria andEvaluationTimeBetween(Date value1, Date value2) {
            addCriterion("evaluation_time between", value1, value2, "evaluationTime");
            return (Criteria) this;
        }

        public Criteria andEvaluationTimeNotBetween(Date value1, Date value2) {
            addCriterion("evaluation_time not between", value1, value2, "evaluationTime");
            return (Criteria) this;
        }

        public Criteria andEvaluationContentIsNull() {
            addCriterion("evaluation_content is null");
            return (Criteria) this;
        }

        public Criteria andEvaluationContentIsNotNull() {
            addCriterion("evaluation_content is not null");
            return (Criteria) this;
        }

        public Criteria andEvaluationContentEqualTo(String value) {
            addCriterion("evaluation_content =", value, "evaluationContent");
            return (Criteria) this;
        }

        public Criteria andEvaluationContentNotEqualTo(String value) {
            addCriterion("evaluation_content <>", value, "evaluationContent");
            return (Criteria) this;
        }

        public Criteria andEvaluationContentGreaterThan(String value) {
            addCriterion("evaluation_content >", value, "evaluationContent");
            return (Criteria) this;
        }

        public Criteria andEvaluationContentGreaterThanOrEqualTo(String value) {
            addCriterion("evaluation_content >=", value, "evaluationContent");
            return (Criteria) this;
        }

        public Criteria andEvaluationContentLessThan(String value) {
            addCriterion("evaluation_content <", value, "evaluationContent");
            return (Criteria) this;
        }

        public Criteria andEvaluationContentLessThanOrEqualTo(String value) {
            addCriterion("evaluation_content <=", value, "evaluationContent");
            return (Criteria) this;
        }

        public Criteria andEvaluationContentLike(String value) {
            addCriterion("evaluation_content like", value, "evaluationContent");
            return (Criteria) this;
        }

        public Criteria andEvaluationContentNotLike(String value) {
            addCriterion("evaluation_content not like", value, "evaluationContent");
            return (Criteria) this;
        }

        public Criteria andEvaluationContentIn(List<String> values) {
            addCriterion("evaluation_content in", values, "evaluationContent");
            return (Criteria) this;
        }

        public Criteria andEvaluationContentNotIn(List<String> values) {
            addCriterion("evaluation_content not in", values, "evaluationContent");
            return (Criteria) this;
        }

        public Criteria andEvaluationContentBetween(String value1, String value2) {
            addCriterion("evaluation_content between", value1, value2, "evaluationContent");
            return (Criteria) this;
        }

        public Criteria andEvaluationContentNotBetween(String value1, String value2) {
            addCriterion("evaluation_content not between", value1, value2, "evaluationContent");
            return (Criteria) this;
        }

        public Criteria andEvaluationCompanyFractionIsNull() {
            addCriterion("evaluation_company_fraction is null");
            return (Criteria) this;
        }

        public Criteria andEvaluationCompanyFractionIsNotNull() {
            addCriterion("evaluation_company_fraction is not null");
            return (Criteria) this;
        }

        public Criteria andEvaluationCompanyFractionEqualTo(Double value) {
            addCriterion("evaluation_company_fraction =", value, "evaluationCompanyFraction");
            return (Criteria) this;
        }

        public Criteria andEvaluationCompanyFractionNotEqualTo(Double value) {
            addCriterion("evaluation_company_fraction <>", value, "evaluationCompanyFraction");
            return (Criteria) this;
        }

        public Criteria andEvaluationCompanyFractionGreaterThan(Double value) {
            addCriterion("evaluation_company_fraction >", value, "evaluationCompanyFraction");
            return (Criteria) this;
        }

        public Criteria andEvaluationCompanyFractionGreaterThanOrEqualTo(Double value) {
            addCriterion("evaluation_company_fraction >=", value, "evaluationCompanyFraction");
            return (Criteria) this;
        }

        public Criteria andEvaluationCompanyFractionLessThan(Double value) {
            addCriterion("evaluation_company_fraction <", value, "evaluationCompanyFraction");
            return (Criteria) this;
        }

        public Criteria andEvaluationCompanyFractionLessThanOrEqualTo(Double value) {
            addCriterion("evaluation_company_fraction <=", value, "evaluationCompanyFraction");
            return (Criteria) this;
        }

        public Criteria andEvaluationCompanyFractionIn(List<Double> values) {
            addCriterion("evaluation_company_fraction in", values, "evaluationCompanyFraction");
            return (Criteria) this;
        }

        public Criteria andEvaluationCompanyFractionNotIn(List<Double> values) {
            addCriterion("evaluation_company_fraction not in", values, "evaluationCompanyFraction");
            return (Criteria) this;
        }

        public Criteria andEvaluationCompanyFractionBetween(Double value1, Double value2) {
            addCriterion("evaluation_company_fraction between", value1, value2, "evaluationCompanyFraction");
            return (Criteria) this;
        }

        public Criteria andEvaluationCompanyFractionNotBetween(Double value1, Double value2) {
            addCriterion("evaluation_company_fraction not between", value1, value2, "evaluationCompanyFraction");
            return (Criteria) this;
        }

        public Criteria andField1IsNull() {
            addCriterion("field1 is null");
            return (Criteria) this;
        }

        public Criteria andField1IsNotNull() {
            addCriterion("field1 is not null");
            return (Criteria) this;
        }

        public Criteria andField1EqualTo(String value) {
            addCriterion("field1 =", value, "field1");
            return (Criteria) this;
        }

        public Criteria andField1NotEqualTo(String value) {
            addCriterion("field1 <>", value, "field1");
            return (Criteria) this;
        }

        public Criteria andField1GreaterThan(String value) {
            addCriterion("field1 >", value, "field1");
            return (Criteria) this;
        }

        public Criteria andField1GreaterThanOrEqualTo(String value) {
            addCriterion("field1 >=", value, "field1");
            return (Criteria) this;
        }

        public Criteria andField1LessThan(String value) {
            addCriterion("field1 <", value, "field1");
            return (Criteria) this;
        }

        public Criteria andField1LessThanOrEqualTo(String value) {
            addCriterion("field1 <=", value, "field1");
            return (Criteria) this;
        }

        public Criteria andField1Like(String value) {
            addCriterion("field1 like", value, "field1");
            return (Criteria) this;
        }

        public Criteria andField1NotLike(String value) {
            addCriterion("field1 not like", value, "field1");
            return (Criteria) this;
        }

        public Criteria andField1In(List<String> values) {
            addCriterion("field1 in", values, "field1");
            return (Criteria) this;
        }

        public Criteria andField1NotIn(List<String> values) {
            addCriterion("field1 not in", values, "field1");
            return (Criteria) this;
        }

        public Criteria andField1Between(String value1, String value2) {
            addCriterion("field1 between", value1, value2, "field1");
            return (Criteria) this;
        }

        public Criteria andField1NotBetween(String value1, String value2) {
            addCriterion("field1 not between", value1, value2, "field1");
            return (Criteria) this;
        }

        public Criteria andField2IsNull() {
            addCriterion("field2 is null");
            return (Criteria) this;
        }

        public Criteria andField2IsNotNull() {
            addCriterion("field2 is not null");
            return (Criteria) this;
        }

        public Criteria andField2EqualTo(Integer value) {
            addCriterion("field2 =", value, "field2");
            return (Criteria) this;
        }

        public Criteria andField2NotEqualTo(Integer value) {
            addCriterion("field2 <>", value, "field2");
            return (Criteria) this;
        }

        public Criteria andField2GreaterThan(Integer value) {
            addCriterion("field2 >", value, "field2");
            return (Criteria) this;
        }

        public Criteria andField2GreaterThanOrEqualTo(Integer value) {
            addCriterion("field2 >=", value, "field2");
            return (Criteria) this;
        }

        public Criteria andField2LessThan(Integer value) {
            addCriterion("field2 <", value, "field2");
            return (Criteria) this;
        }

        public Criteria andField2LessThanOrEqualTo(Integer value) {
            addCriterion("field2 <=", value, "field2");
            return (Criteria) this;
        }

        public Criteria andField2In(List<Integer> values) {
            addCriterion("field2 in", values, "field2");
            return (Criteria) this;
        }

        public Criteria andField2NotIn(List<Integer> values) {
            addCriterion("field2 not in", values, "field2");
            return (Criteria) this;
        }

        public Criteria andField2Between(Integer value1, Integer value2) {
            addCriterion("field2 between", value1, value2, "field2");
            return (Criteria) this;
        }

        public Criteria andField2NotBetween(Integer value1, Integer value2) {
            addCriterion("field2 not between", value1, value2, "field2");
            return (Criteria) this;
        }
    }

    /**
     */
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