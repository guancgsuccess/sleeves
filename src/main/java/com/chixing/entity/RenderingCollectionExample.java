package com.chixing.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class RenderingCollectionExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Long offset;

    public RenderingCollectionExample() {
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

        public Criteria andRenderingCollectionIdIsNull() {
            addCriterion("rendering_collection_id is null");
            return (Criteria) this;
        }

        public Criteria andRenderingCollectionIdIsNotNull() {
            addCriterion("rendering_collection_id is not null");
            return (Criteria) this;
        }

        public Criteria andRenderingCollectionIdEqualTo(Integer value) {
            addCriterion("rendering_collection_id =", value, "renderingCollectionId");
            return (Criteria) this;
        }

        public Criteria andRenderingCollectionIdNotEqualTo(Integer value) {
            addCriterion("rendering_collection_id <>", value, "renderingCollectionId");
            return (Criteria) this;
        }

        public Criteria andRenderingCollectionIdGreaterThan(Integer value) {
            addCriterion("rendering_collection_id >", value, "renderingCollectionId");
            return (Criteria) this;
        }

        public Criteria andRenderingCollectionIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("rendering_collection_id >=", value, "renderingCollectionId");
            return (Criteria) this;
        }

        public Criteria andRenderingCollectionIdLessThan(Integer value) {
            addCriterion("rendering_collection_id <", value, "renderingCollectionId");
            return (Criteria) this;
        }

        public Criteria andRenderingCollectionIdLessThanOrEqualTo(Integer value) {
            addCriterion("rendering_collection_id <=", value, "renderingCollectionId");
            return (Criteria) this;
        }

        public Criteria andRenderingCollectionIdIn(List<Integer> values) {
            addCriterion("rendering_collection_id in", values, "renderingCollectionId");
            return (Criteria) this;
        }

        public Criteria andRenderingCollectionIdNotIn(List<Integer> values) {
            addCriterion("rendering_collection_id not in", values, "renderingCollectionId");
            return (Criteria) this;
        }

        public Criteria andRenderingCollectionIdBetween(Integer value1, Integer value2) {
            addCriterion("rendering_collection_id between", value1, value2, "renderingCollectionId");
            return (Criteria) this;
        }

        public Criteria andRenderingCollectionIdNotBetween(Integer value1, Integer value2) {
            addCriterion("rendering_collection_id not between", value1, value2, "renderingCollectionId");
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

        public Criteria andRenderingIdIsNull() {
            addCriterion("rendering_id is null");
            return (Criteria) this;
        }

        public Criteria andRenderingIdIsNotNull() {
            addCriterion("rendering_id is not null");
            return (Criteria) this;
        }

        public Criteria andRenderingIdEqualTo(Integer value) {
            addCriterion("rendering_id =", value, "renderingId");
            return (Criteria) this;
        }

        public Criteria andRenderingIdNotEqualTo(Integer value) {
            addCriterion("rendering_id <>", value, "renderingId");
            return (Criteria) this;
        }

        public Criteria andRenderingIdGreaterThan(Integer value) {
            addCriterion("rendering_id >", value, "renderingId");
            return (Criteria) this;
        }

        public Criteria andRenderingIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("rendering_id >=", value, "renderingId");
            return (Criteria) this;
        }

        public Criteria andRenderingIdLessThan(Integer value) {
            addCriterion("rendering_id <", value, "renderingId");
            return (Criteria) this;
        }

        public Criteria andRenderingIdLessThanOrEqualTo(Integer value) {
            addCriterion("rendering_id <=", value, "renderingId");
            return (Criteria) this;
        }

        public Criteria andRenderingIdIn(List<Integer> values) {
            addCriterion("rendering_id in", values, "renderingId");
            return (Criteria) this;
        }

        public Criteria andRenderingIdNotIn(List<Integer> values) {
            addCriterion("rendering_id not in", values, "renderingId");
            return (Criteria) this;
        }

        public Criteria andRenderingIdBetween(Integer value1, Integer value2) {
            addCriterion("rendering_id between", value1, value2, "renderingId");
            return (Criteria) this;
        }

        public Criteria andRenderingIdNotBetween(Integer value1, Integer value2) {
            addCriterion("rendering_id not between", value1, value2, "renderingId");
            return (Criteria) this;
        }

        public Criteria andRenderingCollectionTimeIsNull() {
            addCriterion("rendering_collection_time is null");
            return (Criteria) this;
        }

        public Criteria andRenderingCollectionTimeIsNotNull() {
            addCriterion("rendering_collection_time is not null");
            return (Criteria) this;
        }

        public Criteria andRenderingCollectionTimeEqualTo(Date value) {
            addCriterion("rendering_collection_time =", value, "renderingCollectionTime");
            return (Criteria) this;
        }

        public Criteria andRenderingCollectionTimeNotEqualTo(Date value) {
            addCriterion("rendering_collection_time <>", value, "renderingCollectionTime");
            return (Criteria) this;
        }

        public Criteria andRenderingCollectionTimeGreaterThan(Date value) {
            addCriterion("rendering_collection_time >", value, "renderingCollectionTime");
            return (Criteria) this;
        }

        public Criteria andRenderingCollectionTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("rendering_collection_time >=", value, "renderingCollectionTime");
            return (Criteria) this;
        }

        public Criteria andRenderingCollectionTimeLessThan(Date value) {
            addCriterion("rendering_collection_time <", value, "renderingCollectionTime");
            return (Criteria) this;
        }

        public Criteria andRenderingCollectionTimeLessThanOrEqualTo(Date value) {
            addCriterion("rendering_collection_time <=", value, "renderingCollectionTime");
            return (Criteria) this;
        }

        public Criteria andRenderingCollectionTimeIn(List<Date> values) {
            addCriterion("rendering_collection_time in", values, "renderingCollectionTime");
            return (Criteria) this;
        }

        public Criteria andRenderingCollectionTimeNotIn(List<Date> values) {
            addCriterion("rendering_collection_time not in", values, "renderingCollectionTime");
            return (Criteria) this;
        }

        public Criteria andRenderingCollectionTimeBetween(Date value1, Date value2) {
            addCriterion("rendering_collection_time between", value1, value2, "renderingCollectionTime");
            return (Criteria) this;
        }

        public Criteria andRenderingCollectionTimeNotBetween(Date value1, Date value2) {
            addCriterion("rendering_collection_time not between", value1, value2, "renderingCollectionTime");
            return (Criteria) this;
        }

        public Criteria andRenderingCollectionStatusIsNull() {
            addCriterion("rendering_collection_status is null");
            return (Criteria) this;
        }

        public Criteria andRenderingCollectionStatusIsNotNull() {
            addCriterion("rendering_collection_status is not null");
            return (Criteria) this;
        }

        public Criteria andRenderingCollectionStatusEqualTo(Integer value) {
            addCriterion("rendering_collection_status =", value, "renderingCollectionStatus");
            return (Criteria) this;
        }

        public Criteria andRenderingCollectionStatusNotEqualTo(Integer value) {
            addCriterion("rendering_collection_status <>", value, "renderingCollectionStatus");
            return (Criteria) this;
        }

        public Criteria andRenderingCollectionStatusGreaterThan(Integer value) {
            addCriterion("rendering_collection_status >", value, "renderingCollectionStatus");
            return (Criteria) this;
        }

        public Criteria andRenderingCollectionStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("rendering_collection_status >=", value, "renderingCollectionStatus");
            return (Criteria) this;
        }

        public Criteria andRenderingCollectionStatusLessThan(Integer value) {
            addCriterion("rendering_collection_status <", value, "renderingCollectionStatus");
            return (Criteria) this;
        }

        public Criteria andRenderingCollectionStatusLessThanOrEqualTo(Integer value) {
            addCriterion("rendering_collection_status <=", value, "renderingCollectionStatus");
            return (Criteria) this;
        }

        public Criteria andRenderingCollectionStatusIn(List<Integer> values) {
            addCriterion("rendering_collection_status in", values, "renderingCollectionStatus");
            return (Criteria) this;
        }

        public Criteria andRenderingCollectionStatusNotIn(List<Integer> values) {
            addCriterion("rendering_collection_status not in", values, "renderingCollectionStatus");
            return (Criteria) this;
        }

        public Criteria andRenderingCollectionStatusBetween(Integer value1, Integer value2) {
            addCriterion("rendering_collection_status between", value1, value2, "renderingCollectionStatus");
            return (Criteria) this;
        }

        public Criteria andRenderingCollectionStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("rendering_collection_status not between", value1, value2, "renderingCollectionStatus");
            return (Criteria) this;
        }

        public Criteria andFirlds1IsNull() {
            addCriterion("firlds1 is null");
            return (Criteria) this;
        }

        public Criteria andFirlds1IsNotNull() {
            addCriterion("firlds1 is not null");
            return (Criteria) this;
        }

        public Criteria andFirlds1EqualTo(String value) {
            addCriterion("firlds1 =", value, "firlds1");
            return (Criteria) this;
        }

        public Criteria andFirlds1NotEqualTo(String value) {
            addCriterion("firlds1 <>", value, "firlds1");
            return (Criteria) this;
        }

        public Criteria andFirlds1GreaterThan(String value) {
            addCriterion("firlds1 >", value, "firlds1");
            return (Criteria) this;
        }

        public Criteria andFirlds1GreaterThanOrEqualTo(String value) {
            addCriterion("firlds1 >=", value, "firlds1");
            return (Criteria) this;
        }

        public Criteria andFirlds1LessThan(String value) {
            addCriterion("firlds1 <", value, "firlds1");
            return (Criteria) this;
        }

        public Criteria andFirlds1LessThanOrEqualTo(String value) {
            addCriterion("firlds1 <=", value, "firlds1");
            return (Criteria) this;
        }

        public Criteria andFirlds1Like(String value) {
            addCriterion("firlds1 like", value, "firlds1");
            return (Criteria) this;
        }

        public Criteria andFirlds1NotLike(String value) {
            addCriterion("firlds1 not like", value, "firlds1");
            return (Criteria) this;
        }

        public Criteria andFirlds1In(List<String> values) {
            addCriterion("firlds1 in", values, "firlds1");
            return (Criteria) this;
        }

        public Criteria andFirlds1NotIn(List<String> values) {
            addCriterion("firlds1 not in", values, "firlds1");
            return (Criteria) this;
        }

        public Criteria andFirlds1Between(String value1, String value2) {
            addCriterion("firlds1 between", value1, value2, "firlds1");
            return (Criteria) this;
        }

        public Criteria andFirlds1NotBetween(String value1, String value2) {
            addCriterion("firlds1 not between", value1, value2, "firlds1");
            return (Criteria) this;
        }

        public Criteria andFirlds2IsNull() {
            addCriterion("firlds2 is null");
            return (Criteria) this;
        }

        public Criteria andFirlds2IsNotNull() {
            addCriterion("firlds2 is not null");
            return (Criteria) this;
        }

        public Criteria andFirlds2EqualTo(String value) {
            addCriterion("firlds2 =", value, "firlds2");
            return (Criteria) this;
        }

        public Criteria andFirlds2NotEqualTo(String value) {
            addCriterion("firlds2 <>", value, "firlds2");
            return (Criteria) this;
        }

        public Criteria andFirlds2GreaterThan(String value) {
            addCriterion("firlds2 >", value, "firlds2");
            return (Criteria) this;
        }

        public Criteria andFirlds2GreaterThanOrEqualTo(String value) {
            addCriterion("firlds2 >=", value, "firlds2");
            return (Criteria) this;
        }

        public Criteria andFirlds2LessThan(String value) {
            addCriterion("firlds2 <", value, "firlds2");
            return (Criteria) this;
        }

        public Criteria andFirlds2LessThanOrEqualTo(String value) {
            addCriterion("firlds2 <=", value, "firlds2");
            return (Criteria) this;
        }

        public Criteria andFirlds2Like(String value) {
            addCriterion("firlds2 like", value, "firlds2");
            return (Criteria) this;
        }

        public Criteria andFirlds2NotLike(String value) {
            addCriterion("firlds2 not like", value, "firlds2");
            return (Criteria) this;
        }

        public Criteria andFirlds2In(List<String> values) {
            addCriterion("firlds2 in", values, "firlds2");
            return (Criteria) this;
        }

        public Criteria andFirlds2NotIn(List<String> values) {
            addCriterion("firlds2 not in", values, "firlds2");
            return (Criteria) this;
        }

        public Criteria andFirlds2Between(String value1, String value2) {
            addCriterion("firlds2 between", value1, value2, "firlds2");
            return (Criteria) this;
        }

        public Criteria andFirlds2NotBetween(String value1, String value2) {
            addCriterion("firlds2 not between", value1, value2, "firlds2");
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