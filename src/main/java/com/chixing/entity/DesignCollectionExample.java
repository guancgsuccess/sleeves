package com.chixing.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class DesignCollectionExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Long offset;

    public DesignCollectionExample() {
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

        public Criteria andDesignCollectionIdIsNull() {
            addCriterion("design_collection_id is null");
            return (Criteria) this;
        }

        public Criteria andDesignCollectionIdIsNotNull() {
            addCriterion("design_collection_id is not null");
            return (Criteria) this;
        }

        public Criteria andDesignCollectionIdEqualTo(Integer value) {
            addCriterion("design_collection_id =", value, "designCollectionId");
            return (Criteria) this;
        }

        public Criteria andDesignCollectionIdNotEqualTo(Integer value) {
            addCriterion("design_collection_id <>", value, "designCollectionId");
            return (Criteria) this;
        }

        public Criteria andDesignCollectionIdGreaterThan(Integer value) {
            addCriterion("design_collection_id >", value, "designCollectionId");
            return (Criteria) this;
        }

        public Criteria andDesignCollectionIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("design_collection_id >=", value, "designCollectionId");
            return (Criteria) this;
        }

        public Criteria andDesignCollectionIdLessThan(Integer value) {
            addCriterion("design_collection_id <", value, "designCollectionId");
            return (Criteria) this;
        }

        public Criteria andDesignCollectionIdLessThanOrEqualTo(Integer value) {
            addCriterion("design_collection_id <=", value, "designCollectionId");
            return (Criteria) this;
        }

        public Criteria andDesignCollectionIdIn(List<Integer> values) {
            addCriterion("design_collection_id in", values, "designCollectionId");
            return (Criteria) this;
        }

        public Criteria andDesignCollectionIdNotIn(List<Integer> values) {
            addCriterion("design_collection_id not in", values, "designCollectionId");
            return (Criteria) this;
        }

        public Criteria andDesignCollectionIdBetween(Integer value1, Integer value2) {
            addCriterion("design_collection_id between", value1, value2, "designCollectionId");
            return (Criteria) this;
        }

        public Criteria andDesignCollectionIdNotBetween(Integer value1, Integer value2) {
            addCriterion("design_collection_id not between", value1, value2, "designCollectionId");
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

        public Criteria andDesignCollectionTimeIsNull() {
            addCriterion("design_collection_time is null");
            return (Criteria) this;
        }

        public Criteria andDesignCollectionTimeIsNotNull() {
            addCriterion("design_collection_time is not null");
            return (Criteria) this;
        }

        public Criteria andDesignCollectionTimeEqualTo(Date value) {
            addCriterion("design_collection_time =", value, "designCollectionTime");
            return (Criteria) this;
        }

        public Criteria andDesignCollectionTimeNotEqualTo(Date value) {
            addCriterion("design_collection_time <>", value, "designCollectionTime");
            return (Criteria) this;
        }

        public Criteria andDesignCollectionTimeGreaterThan(Date value) {
            addCriterion("design_collection_time >", value, "designCollectionTime");
            return (Criteria) this;
        }

        public Criteria andDesignCollectionTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("design_collection_time >=", value, "designCollectionTime");
            return (Criteria) this;
        }

        public Criteria andDesignCollectionTimeLessThan(Date value) {
            addCriterion("design_collection_time <", value, "designCollectionTime");
            return (Criteria) this;
        }

        public Criteria andDesignCollectionTimeLessThanOrEqualTo(Date value) {
            addCriterion("design_collection_time <=", value, "designCollectionTime");
            return (Criteria) this;
        }

        public Criteria andDesignCollectionTimeIn(List<Date> values) {
            addCriterion("design_collection_time in", values, "designCollectionTime");
            return (Criteria) this;
        }

        public Criteria andDesignCollectionTimeNotIn(List<Date> values) {
            addCriterion("design_collection_time not in", values, "designCollectionTime");
            return (Criteria) this;
        }

        public Criteria andDesignCollectionTimeBetween(Date value1, Date value2) {
            addCriterion("design_collection_time between", value1, value2, "designCollectionTime");
            return (Criteria) this;
        }

        public Criteria andDesignCollectionTimeNotBetween(Date value1, Date value2) {
            addCriterion("design_collection_time not between", value1, value2, "designCollectionTime");
            return (Criteria) this;
        }

        public Criteria andDesignCollectionStatusIsNull() {
            addCriterion("design_collection_status is null");
            return (Criteria) this;
        }

        public Criteria andDesignCollectionStatusIsNotNull() {
            addCriterion("design_collection_status is not null");
            return (Criteria) this;
        }

        public Criteria andDesignCollectionStatusEqualTo(Integer value) {
            addCriterion("design_collection_status =", value, "designCollectionStatus");
            return (Criteria) this;
        }

        public Criteria andDesignCollectionStatusNotEqualTo(Integer value) {
            addCriterion("design_collection_status <>", value, "designCollectionStatus");
            return (Criteria) this;
        }

        public Criteria andDesignCollectionStatusGreaterThan(Integer value) {
            addCriterion("design_collection_status >", value, "designCollectionStatus");
            return (Criteria) this;
        }

        public Criteria andDesignCollectionStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("design_collection_status >=", value, "designCollectionStatus");
            return (Criteria) this;
        }

        public Criteria andDesignCollectionStatusLessThan(Integer value) {
            addCriterion("design_collection_status <", value, "designCollectionStatus");
            return (Criteria) this;
        }

        public Criteria andDesignCollectionStatusLessThanOrEqualTo(Integer value) {
            addCriterion("design_collection_status <=", value, "designCollectionStatus");
            return (Criteria) this;
        }

        public Criteria andDesignCollectionStatusIn(List<Integer> values) {
            addCriterion("design_collection_status in", values, "designCollectionStatus");
            return (Criteria) this;
        }

        public Criteria andDesignCollectionStatusNotIn(List<Integer> values) {
            addCriterion("design_collection_status not in", values, "designCollectionStatus");
            return (Criteria) this;
        }

        public Criteria andDesignCollectionStatusBetween(Integer value1, Integer value2) {
            addCriterion("design_collection_status between", value1, value2, "designCollectionStatus");
            return (Criteria) this;
        }

        public Criteria andDesignCollectionStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("design_collection_status not between", value1, value2, "designCollectionStatus");
            return (Criteria) this;
        }

        public Criteria andFields1IsNull() {
            addCriterion("fields1 is null");
            return (Criteria) this;
        }

        public Criteria andFields1IsNotNull() {
            addCriterion("fields1 is not null");
            return (Criteria) this;
        }

        public Criteria andFields1EqualTo(String value) {
            addCriterion("fields1 =", value, "fields1");
            return (Criteria) this;
        }

        public Criteria andFields1NotEqualTo(String value) {
            addCriterion("fields1 <>", value, "fields1");
            return (Criteria) this;
        }

        public Criteria andFields1GreaterThan(String value) {
            addCriterion("fields1 >", value, "fields1");
            return (Criteria) this;
        }

        public Criteria andFields1GreaterThanOrEqualTo(String value) {
            addCriterion("fields1 >=", value, "fields1");
            return (Criteria) this;
        }

        public Criteria andFields1LessThan(String value) {
            addCriterion("fields1 <", value, "fields1");
            return (Criteria) this;
        }

        public Criteria andFields1LessThanOrEqualTo(String value) {
            addCriterion("fields1 <=", value, "fields1");
            return (Criteria) this;
        }

        public Criteria andFields1Like(String value) {
            addCriterion("fields1 like", value, "fields1");
            return (Criteria) this;
        }

        public Criteria andFields1NotLike(String value) {
            addCriterion("fields1 not like", value, "fields1");
            return (Criteria) this;
        }

        public Criteria andFields1In(List<String> values) {
            addCriterion("fields1 in", values, "fields1");
            return (Criteria) this;
        }

        public Criteria andFields1NotIn(List<String> values) {
            addCriterion("fields1 not in", values, "fields1");
            return (Criteria) this;
        }

        public Criteria andFields1Between(String value1, String value2) {
            addCriterion("fields1 between", value1, value2, "fields1");
            return (Criteria) this;
        }

        public Criteria andFields1NotBetween(String value1, String value2) {
            addCriterion("fields1 not between", value1, value2, "fields1");
            return (Criteria) this;
        }

        public Criteria andFields2IsNull() {
            addCriterion("fields2 is null");
            return (Criteria) this;
        }

        public Criteria andFields2IsNotNull() {
            addCriterion("fields2 is not null");
            return (Criteria) this;
        }

        public Criteria andFields2EqualTo(String value) {
            addCriterion("fields2 =", value, "fields2");
            return (Criteria) this;
        }

        public Criteria andFields2NotEqualTo(String value) {
            addCriterion("fields2 <>", value, "fields2");
            return (Criteria) this;
        }

        public Criteria andFields2GreaterThan(String value) {
            addCriterion("fields2 >", value, "fields2");
            return (Criteria) this;
        }

        public Criteria andFields2GreaterThanOrEqualTo(String value) {
            addCriterion("fields2 >=", value, "fields2");
            return (Criteria) this;
        }

        public Criteria andFields2LessThan(String value) {
            addCriterion("fields2 <", value, "fields2");
            return (Criteria) this;
        }

        public Criteria andFields2LessThanOrEqualTo(String value) {
            addCriterion("fields2 <=", value, "fields2");
            return (Criteria) this;
        }

        public Criteria andFields2Like(String value) {
            addCriterion("fields2 like", value, "fields2");
            return (Criteria) this;
        }

        public Criteria andFields2NotLike(String value) {
            addCriterion("fields2 not like", value, "fields2");
            return (Criteria) this;
        }

        public Criteria andFields2In(List<String> values) {
            addCriterion("fields2 in", values, "fields2");
            return (Criteria) this;
        }

        public Criteria andFields2NotIn(List<String> values) {
            addCriterion("fields2 not in", values, "fields2");
            return (Criteria) this;
        }

        public Criteria andFields2Between(String value1, String value2) {
            addCriterion("fields2 between", value1, value2, "fields2");
            return (Criteria) this;
        }

        public Criteria andFields2NotBetween(String value1, String value2) {
            addCriterion("fields2 not between", value1, value2, "fields2");
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