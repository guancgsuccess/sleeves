package com.chixing.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class DesignOrderExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Long offset;

    public DesignOrderExample() {
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

        public Criteria andDesignOrderIdIsNull() {
            addCriterion("design_order_id is null");
            return (Criteria) this;
        }

        public Criteria andDesignOrderIdIsNotNull() {
            addCriterion("design_order_id is not null");
            return (Criteria) this;
        }

        public Criteria andDesignOrderIdEqualTo(Integer value) {
            addCriterion("design_order_id =", value, "designOrderId");
            return (Criteria) this;
        }

        public Criteria andDesignOrderIdNotEqualTo(Integer value) {
            addCriterion("design_order_id <>", value, "designOrderId");
            return (Criteria) this;
        }

        public Criteria andDesignOrderIdGreaterThan(Integer value) {
            addCriterion("design_order_id >", value, "designOrderId");
            return (Criteria) this;
        }

        public Criteria andDesignOrderIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("design_order_id >=", value, "designOrderId");
            return (Criteria) this;
        }

        public Criteria andDesignOrderIdLessThan(Integer value) {
            addCriterion("design_order_id <", value, "designOrderId");
            return (Criteria) this;
        }

        public Criteria andDesignOrderIdLessThanOrEqualTo(Integer value) {
            addCriterion("design_order_id <=", value, "designOrderId");
            return (Criteria) this;
        }

        public Criteria andDesignOrderIdIn(List<Integer> values) {
            addCriterion("design_order_id in", values, "designOrderId");
            return (Criteria) this;
        }

        public Criteria andDesignOrderIdNotIn(List<Integer> values) {
            addCriterion("design_order_id not in", values, "designOrderId");
            return (Criteria) this;
        }

        public Criteria andDesignOrderIdBetween(Integer value1, Integer value2) {
            addCriterion("design_order_id between", value1, value2, "designOrderId");
            return (Criteria) this;
        }

        public Criteria andDesignOrderIdNotBetween(Integer value1, Integer value2) {
            addCriterion("design_order_id not between", value1, value2, "designOrderId");
            return (Criteria) this;
        }

        public Criteria andDesignOrderNoIsNull() {
            addCriterion("design_order_no is null");
            return (Criteria) this;
        }

        public Criteria andDesignOrderNoIsNotNull() {
            addCriterion("design_order_no is not null");
            return (Criteria) this;
        }

        public Criteria andDesignOrderNoEqualTo(String value) {
            addCriterion("design_order_no =", value, "designOrderNo");
            return (Criteria) this;
        }

        public Criteria andDesignOrderNoNotEqualTo(String value) {
            addCriterion("design_order_no <>", value, "designOrderNo");
            return (Criteria) this;
        }

        public Criteria andDesignOrderNoGreaterThan(String value) {
            addCriterion("design_order_no >", value, "designOrderNo");
            return (Criteria) this;
        }

        public Criteria andDesignOrderNoGreaterThanOrEqualTo(String value) {
            addCriterion("design_order_no >=", value, "designOrderNo");
            return (Criteria) this;
        }

        public Criteria andDesignOrderNoLessThan(String value) {
            addCriterion("design_order_no <", value, "designOrderNo");
            return (Criteria) this;
        }

        public Criteria andDesignOrderNoLessThanOrEqualTo(String value) {
            addCriterion("design_order_no <=", value, "designOrderNo");
            return (Criteria) this;
        }

        public Criteria andDesignOrderNoLike(String value) {
            addCriterion("design_order_no like", value, "designOrderNo");
            return (Criteria) this;
        }

        public Criteria andDesignOrderNoNotLike(String value) {
            addCriterion("design_order_no not like", value, "designOrderNo");
            return (Criteria) this;
        }

        public Criteria andDesignOrderNoIn(List<String> values) {
            addCriterion("design_order_no in", values, "designOrderNo");
            return (Criteria) this;
        }

        public Criteria andDesignOrderNoNotIn(List<String> values) {
            addCriterion("design_order_no not in", values, "designOrderNo");
            return (Criteria) this;
        }

        public Criteria andDesignOrderNoBetween(String value1, String value2) {
            addCriterion("design_order_no between", value1, value2, "designOrderNo");
            return (Criteria) this;
        }

        public Criteria andDesignOrderNoNotBetween(String value1, String value2) {
            addCriterion("design_order_no not between", value1, value2, "designOrderNo");
            return (Criteria) this;
        }

        public Criteria andClientIdIsNull() {
            addCriterion("client_id is null");
            return (Criteria) this;
        }

        public Criteria andClientIdIsNotNull() {
            addCriterion("client_id is not null");
            return (Criteria) this;
        }

        public Criteria andClientIdEqualTo(Integer value) {
            addCriterion("client_id =", value, "clientId");
            return (Criteria) this;
        }

        public Criteria andClientIdNotEqualTo(Integer value) {
            addCriterion("client_id <>", value, "clientId");
            return (Criteria) this;
        }

        public Criteria andClientIdGreaterThan(Integer value) {
            addCriterion("client_id >", value, "clientId");
            return (Criteria) this;
        }

        public Criteria andClientIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("client_id >=", value, "clientId");
            return (Criteria) this;
        }

        public Criteria andClientIdLessThan(Integer value) {
            addCriterion("client_id <", value, "clientId");
            return (Criteria) this;
        }

        public Criteria andClientIdLessThanOrEqualTo(Integer value) {
            addCriterion("client_id <=", value, "clientId");
            return (Criteria) this;
        }

        public Criteria andClientIdIn(List<Integer> values) {
            addCriterion("client_id in", values, "clientId");
            return (Criteria) this;
        }

        public Criteria andClientIdNotIn(List<Integer> values) {
            addCriterion("client_id not in", values, "clientId");
            return (Criteria) this;
        }

        public Criteria andClientIdBetween(Integer value1, Integer value2) {
            addCriterion("client_id between", value1, value2, "clientId");
            return (Criteria) this;
        }

        public Criteria andClientIdNotBetween(Integer value1, Integer value2) {
            addCriterion("client_id not between", value1, value2, "clientId");
            return (Criteria) this;
        }

        public Criteria andDesignIdIsNull() {
            addCriterion("design_id is null");
            return (Criteria) this;
        }

        public Criteria andDesignIdIsNotNull() {
            addCriterion("design_id is not null");
            return (Criteria) this;
        }

        public Criteria andDesignIdEqualTo(Integer value) {
            addCriterion("design_id =", value, "designId");
            return (Criteria) this;
        }

        public Criteria andDesignIdNotEqualTo(Integer value) {
            addCriterion("design_id <>", value, "designId");
            return (Criteria) this;
        }

        public Criteria andDesignIdGreaterThan(Integer value) {
            addCriterion("design_id >", value, "designId");
            return (Criteria) this;
        }

        public Criteria andDesignIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("design_id >=", value, "designId");
            return (Criteria) this;
        }

        public Criteria andDesignIdLessThan(Integer value) {
            addCriterion("design_id <", value, "designId");
            return (Criteria) this;
        }

        public Criteria andDesignIdLessThanOrEqualTo(Integer value) {
            addCriterion("design_id <=", value, "designId");
            return (Criteria) this;
        }

        public Criteria andDesignIdIn(List<Integer> values) {
            addCriterion("design_id in", values, "designId");
            return (Criteria) this;
        }

        public Criteria andDesignIdNotIn(List<Integer> values) {
            addCriterion("design_id not in", values, "designId");
            return (Criteria) this;
        }

        public Criteria andDesignIdBetween(Integer value1, Integer value2) {
            addCriterion("design_id between", value1, value2, "designId");
            return (Criteria) this;
        }

        public Criteria andDesignIdNotBetween(Integer value1, Integer value2) {
            addCriterion("design_id not between", value1, value2, "designId");
            return (Criteria) this;
        }

        public Criteria andDesignOrderTimeIsNull() {
            addCriterion("design_order_time is null");
            return (Criteria) this;
        }

        public Criteria andDesignOrderTimeIsNotNull() {
            addCriterion("design_order_time is not null");
            return (Criteria) this;
        }

        public Criteria andDesignOrderTimeEqualTo(Date value) {
            addCriterion("design_order_time =", value, "designOrderTime");
            return (Criteria) this;
        }

        public Criteria andDesignOrderTimeNotEqualTo(Date value) {
            addCriterion("design_order_time <>", value, "designOrderTime");
            return (Criteria) this;
        }

        public Criteria andDesignOrderTimeGreaterThan(Date value) {
            addCriterion("design_order_time >", value, "designOrderTime");
            return (Criteria) this;
        }

        public Criteria andDesignOrderTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("design_order_time >=", value, "designOrderTime");
            return (Criteria) this;
        }

        public Criteria andDesignOrderTimeLessThan(Date value) {
            addCriterion("design_order_time <", value, "designOrderTime");
            return (Criteria) this;
        }

        public Criteria andDesignOrderTimeLessThanOrEqualTo(Date value) {
            addCriterion("design_order_time <=", value, "designOrderTime");
            return (Criteria) this;
        }

        public Criteria andDesignOrderTimeIn(List<Date> values) {
            addCriterion("design_order_time in", values, "designOrderTime");
            return (Criteria) this;
        }

        public Criteria andDesignOrderTimeNotIn(List<Date> values) {
            addCriterion("design_order_time not in", values, "designOrderTime");
            return (Criteria) this;
        }

        public Criteria andDesignOrderTimeBetween(Date value1, Date value2) {
            addCriterion("design_order_time between", value1, value2, "designOrderTime");
            return (Criteria) this;
        }

        public Criteria andDesignOrderTimeNotBetween(Date value1, Date value2) {
            addCriterion("design_order_time not between", value1, value2, "designOrderTime");
            return (Criteria) this;
        }

        public Criteria andDesignOrderStatusIsNull() {
            addCriterion("design_order_status is null");
            return (Criteria) this;
        }

        public Criteria andDesignOrderStatusIsNotNull() {
            addCriterion("design_order_status is not null");
            return (Criteria) this;
        }

        public Criteria andDesignOrderStatusEqualTo(Integer value) {
            addCriterion("design_order_status =", value, "designOrderStatus");
            return (Criteria) this;
        }

        public Criteria andDesignOrderStatusNotEqualTo(Integer value) {
            addCriterion("design_order_status <>", value, "designOrderStatus");
            return (Criteria) this;
        }

        public Criteria andDesignOrderStatusGreaterThan(Integer value) {
            addCriterion("design_order_status >", value, "designOrderStatus");
            return (Criteria) this;
        }

        public Criteria andDesignOrderStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("design_order_status >=", value, "designOrderStatus");
            return (Criteria) this;
        }

        public Criteria andDesignOrderStatusLessThan(Integer value) {
            addCriterion("design_order_status <", value, "designOrderStatus");
            return (Criteria) this;
        }

        public Criteria andDesignOrderStatusLessThanOrEqualTo(Integer value) {
            addCriterion("design_order_status <=", value, "designOrderStatus");
            return (Criteria) this;
        }

        public Criteria andDesignOrderStatusIn(List<Integer> values) {
            addCriterion("design_order_status in", values, "designOrderStatus");
            return (Criteria) this;
        }

        public Criteria andDesignOrderStatusNotIn(List<Integer> values) {
            addCriterion("design_order_status not in", values, "designOrderStatus");
            return (Criteria) this;
        }

        public Criteria andDesignOrderStatusBetween(Integer value1, Integer value2) {
            addCriterion("design_order_status between", value1, value2, "designOrderStatus");
            return (Criteria) this;
        }

        public Criteria andDesignOrderStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("design_order_status not between", value1, value2, "designOrderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderFields1IsNull() {
            addCriterion("order_fields1 is null");
            return (Criteria) this;
        }

        public Criteria andOrderFields1IsNotNull() {
            addCriterion("order_fields1 is not null");
            return (Criteria) this;
        }

        public Criteria andOrderFields1EqualTo(String value) {
            addCriterion("order_fields1 =", value, "orderFields1");
            return (Criteria) this;
        }

        public Criteria andOrderFields1NotEqualTo(String value) {
            addCriterion("order_fields1 <>", value, "orderFields1");
            return (Criteria) this;
        }

        public Criteria andOrderFields1GreaterThan(String value) {
            addCriterion("order_fields1 >", value, "orderFields1");
            return (Criteria) this;
        }

        public Criteria andOrderFields1GreaterThanOrEqualTo(String value) {
            addCriterion("order_fields1 >=", value, "orderFields1");
            return (Criteria) this;
        }

        public Criteria andOrderFields1LessThan(String value) {
            addCriterion("order_fields1 <", value, "orderFields1");
            return (Criteria) this;
        }

        public Criteria andOrderFields1LessThanOrEqualTo(String value) {
            addCriterion("order_fields1 <=", value, "orderFields1");
            return (Criteria) this;
        }

        public Criteria andOrderFields1Like(String value) {
            addCriterion("order_fields1 like", value, "orderFields1");
            return (Criteria) this;
        }

        public Criteria andOrderFields1NotLike(String value) {
            addCriterion("order_fields1 not like", value, "orderFields1");
            return (Criteria) this;
        }

        public Criteria andOrderFields1In(List<String> values) {
            addCriterion("order_fields1 in", values, "orderFields1");
            return (Criteria) this;
        }

        public Criteria andOrderFields1NotIn(List<String> values) {
            addCriterion("order_fields1 not in", values, "orderFields1");
            return (Criteria) this;
        }

        public Criteria andOrderFields1Between(String value1, String value2) {
            addCriterion("order_fields1 between", value1, value2, "orderFields1");
            return (Criteria) this;
        }

        public Criteria andOrderFields1NotBetween(String value1, String value2) {
            addCriterion("order_fields1 not between", value1, value2, "orderFields1");
            return (Criteria) this;
        }

        public Criteria andOrderFields2IsNull() {
            addCriterion("order_fields2 is null");
            return (Criteria) this;
        }

        public Criteria andOrderFields2IsNotNull() {
            addCriterion("order_fields2 is not null");
            return (Criteria) this;
        }

        public Criteria andOrderFields2EqualTo(String value) {
            addCriterion("order_fields2 =", value, "orderFields2");
            return (Criteria) this;
        }

        public Criteria andOrderFields2NotEqualTo(String value) {
            addCriterion("order_fields2 <>", value, "orderFields2");
            return (Criteria) this;
        }

        public Criteria andOrderFields2GreaterThan(String value) {
            addCriterion("order_fields2 >", value, "orderFields2");
            return (Criteria) this;
        }

        public Criteria andOrderFields2GreaterThanOrEqualTo(String value) {
            addCriterion("order_fields2 >=", value, "orderFields2");
            return (Criteria) this;
        }

        public Criteria andOrderFields2LessThan(String value) {
            addCriterion("order_fields2 <", value, "orderFields2");
            return (Criteria) this;
        }

        public Criteria andOrderFields2LessThanOrEqualTo(String value) {
            addCriterion("order_fields2 <=", value, "orderFields2");
            return (Criteria) this;
        }

        public Criteria andOrderFields2Like(String value) {
            addCriterion("order_fields2 like", value, "orderFields2");
            return (Criteria) this;
        }

        public Criteria andOrderFields2NotLike(String value) {
            addCriterion("order_fields2 not like", value, "orderFields2");
            return (Criteria) this;
        }

        public Criteria andOrderFields2In(List<String> values) {
            addCriterion("order_fields2 in", values, "orderFields2");
            return (Criteria) this;
        }

        public Criteria andOrderFields2NotIn(List<String> values) {
            addCriterion("order_fields2 not in", values, "orderFields2");
            return (Criteria) this;
        }

        public Criteria andOrderFields2Between(String value1, String value2) {
            addCriterion("order_fields2 between", value1, value2, "orderFields2");
            return (Criteria) this;
        }

        public Criteria andOrderFields2NotBetween(String value1, String value2) {
            addCriterion("order_fields2 not between", value1, value2, "orderFields2");
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