package com.chixing.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CompanyCollectionExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Long offset;

    public CompanyCollectionExample() {
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

        public Criteria andCompanyCollectionIdIsNull() {
            addCriterion("company_collection_id is null");
            return (Criteria) this;
        }

        public Criteria andCompanyCollectionIdIsNotNull() {
            addCriterion("company_collection_id is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyCollectionIdEqualTo(Integer value) {
            addCriterion("company_collection_id =", value, "companyCollectionId");
            return (Criteria) this;
        }

        public Criteria andCompanyCollectionIdNotEqualTo(Integer value) {
            addCriterion("company_collection_id <>", value, "companyCollectionId");
            return (Criteria) this;
        }

        public Criteria andCompanyCollectionIdGreaterThan(Integer value) {
            addCriterion("company_collection_id >", value, "companyCollectionId");
            return (Criteria) this;
        }

        public Criteria andCompanyCollectionIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("company_collection_id >=", value, "companyCollectionId");
            return (Criteria) this;
        }

        public Criteria andCompanyCollectionIdLessThan(Integer value) {
            addCriterion("company_collection_id <", value, "companyCollectionId");
            return (Criteria) this;
        }

        public Criteria andCompanyCollectionIdLessThanOrEqualTo(Integer value) {
            addCriterion("company_collection_id <=", value, "companyCollectionId");
            return (Criteria) this;
        }

        public Criteria andCompanyCollectionIdIn(List<Integer> values) {
            addCriterion("company_collection_id in", values, "companyCollectionId");
            return (Criteria) this;
        }

        public Criteria andCompanyCollectionIdNotIn(List<Integer> values) {
            addCriterion("company_collection_id not in", values, "companyCollectionId");
            return (Criteria) this;
        }

        public Criteria andCompanyCollectionIdBetween(Integer value1, Integer value2) {
            addCriterion("company_collection_id between", value1, value2, "companyCollectionId");
            return (Criteria) this;
        }

        public Criteria andCompanyCollectionIdNotBetween(Integer value1, Integer value2) {
            addCriterion("company_collection_id not between", value1, value2, "companyCollectionId");
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

        public Criteria andCompanyIdIsNull() {
            addCriterion("company_id is null");
            return (Criteria) this;
        }

        public Criteria andCompanyIdIsNotNull() {
            addCriterion("company_id is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyIdEqualTo(Integer value) {
            addCriterion("company_id =", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdNotEqualTo(Integer value) {
            addCriterion("company_id <>", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdGreaterThan(Integer value) {
            addCriterion("company_id >", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("company_id >=", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdLessThan(Integer value) {
            addCriterion("company_id <", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdLessThanOrEqualTo(Integer value) {
            addCriterion("company_id <=", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdIn(List<Integer> values) {
            addCriterion("company_id in", values, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdNotIn(List<Integer> values) {
            addCriterion("company_id not in", values, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdBetween(Integer value1, Integer value2) {
            addCriterion("company_id between", value1, value2, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdNotBetween(Integer value1, Integer value2) {
            addCriterion("company_id not between", value1, value2, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyCollectinTimeIsNull() {
            addCriterion("company_collectin_time is null");
            return (Criteria) this;
        }

        public Criteria andCompanyCollectinTimeIsNotNull() {
            addCriterion("company_collectin_time is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyCollectinTimeEqualTo(Date value) {
            addCriterion("company_collectin_time =", value, "companyCollectinTime");
            return (Criteria) this;
        }

        public Criteria andCompanyCollectinTimeNotEqualTo(Date value) {
            addCriterion("company_collectin_time <>", value, "companyCollectinTime");
            return (Criteria) this;
        }

        public Criteria andCompanyCollectinTimeGreaterThan(Date value) {
            addCriterion("company_collectin_time >", value, "companyCollectinTime");
            return (Criteria) this;
        }

        public Criteria andCompanyCollectinTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("company_collectin_time >=", value, "companyCollectinTime");
            return (Criteria) this;
        }

        public Criteria andCompanyCollectinTimeLessThan(Date value) {
            addCriterion("company_collectin_time <", value, "companyCollectinTime");
            return (Criteria) this;
        }

        public Criteria andCompanyCollectinTimeLessThanOrEqualTo(Date value) {
            addCriterion("company_collectin_time <=", value, "companyCollectinTime");
            return (Criteria) this;
        }

        public Criteria andCompanyCollectinTimeIn(List<Date> values) {
            addCriterion("company_collectin_time in", values, "companyCollectinTime");
            return (Criteria) this;
        }

        public Criteria andCompanyCollectinTimeNotIn(List<Date> values) {
            addCriterion("company_collectin_time not in", values, "companyCollectinTime");
            return (Criteria) this;
        }

        public Criteria andCompanyCollectinTimeBetween(Date value1, Date value2) {
            addCriterion("company_collectin_time between", value1, value2, "companyCollectinTime");
            return (Criteria) this;
        }

        public Criteria andCompanyCollectinTimeNotBetween(Date value1, Date value2) {
            addCriterion("company_collectin_time not between", value1, value2, "companyCollectinTime");
            return (Criteria) this;
        }

        public Criteria andCompanyField1IsNull() {
            addCriterion("company_field1 is null");
            return (Criteria) this;
        }

        public Criteria andCompanyField1IsNotNull() {
            addCriterion("company_field1 is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyField1EqualTo(String value) {
            addCriterion("company_field1 =", value, "companyField1");
            return (Criteria) this;
        }

        public Criteria andCompanyField1NotEqualTo(String value) {
            addCriterion("company_field1 <>", value, "companyField1");
            return (Criteria) this;
        }

        public Criteria andCompanyField1GreaterThan(String value) {
            addCriterion("company_field1 >", value, "companyField1");
            return (Criteria) this;
        }

        public Criteria andCompanyField1GreaterThanOrEqualTo(String value) {
            addCriterion("company_field1 >=", value, "companyField1");
            return (Criteria) this;
        }

        public Criteria andCompanyField1LessThan(String value) {
            addCriterion("company_field1 <", value, "companyField1");
            return (Criteria) this;
        }

        public Criteria andCompanyField1LessThanOrEqualTo(String value) {
            addCriterion("company_field1 <=", value, "companyField1");
            return (Criteria) this;
        }

        public Criteria andCompanyField1Like(String value) {
            addCriterion("company_field1 like", value, "companyField1");
            return (Criteria) this;
        }

        public Criteria andCompanyField1NotLike(String value) {
            addCriterion("company_field1 not like", value, "companyField1");
            return (Criteria) this;
        }

        public Criteria andCompanyField1In(List<String> values) {
            addCriterion("company_field1 in", values, "companyField1");
            return (Criteria) this;
        }

        public Criteria andCompanyField1NotIn(List<String> values) {
            addCriterion("company_field1 not in", values, "companyField1");
            return (Criteria) this;
        }

        public Criteria andCompanyField1Between(String value1, String value2) {
            addCriterion("company_field1 between", value1, value2, "companyField1");
            return (Criteria) this;
        }

        public Criteria andCompanyField1NotBetween(String value1, String value2) {
            addCriterion("company_field1 not between", value1, value2, "companyField1");
            return (Criteria) this;
        }

        public Criteria andCompanyField2IsNull() {
            addCriterion("company_field2 is null");
            return (Criteria) this;
        }

        public Criteria andCompanyField2IsNotNull() {
            addCriterion("company_field2 is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyField2EqualTo(String value) {
            addCriterion("company_field2 =", value, "companyField2");
            return (Criteria) this;
        }

        public Criteria andCompanyField2NotEqualTo(String value) {
            addCriterion("company_field2 <>", value, "companyField2");
            return (Criteria) this;
        }

        public Criteria andCompanyField2GreaterThan(String value) {
            addCriterion("company_field2 >", value, "companyField2");
            return (Criteria) this;
        }

        public Criteria andCompanyField2GreaterThanOrEqualTo(String value) {
            addCriterion("company_field2 >=", value, "companyField2");
            return (Criteria) this;
        }

        public Criteria andCompanyField2LessThan(String value) {
            addCriterion("company_field2 <", value, "companyField2");
            return (Criteria) this;
        }

        public Criteria andCompanyField2LessThanOrEqualTo(String value) {
            addCriterion("company_field2 <=", value, "companyField2");
            return (Criteria) this;
        }

        public Criteria andCompanyField2Like(String value) {
            addCriterion("company_field2 like", value, "companyField2");
            return (Criteria) this;
        }

        public Criteria andCompanyField2NotLike(String value) {
            addCriterion("company_field2 not like", value, "companyField2");
            return (Criteria) this;
        }

        public Criteria andCompanyField2In(List<String> values) {
            addCriterion("company_field2 in", values, "companyField2");
            return (Criteria) this;
        }

        public Criteria andCompanyField2NotIn(List<String> values) {
            addCriterion("company_field2 not in", values, "companyField2");
            return (Criteria) this;
        }

        public Criteria andCompanyField2Between(String value1, String value2) {
            addCriterion("company_field2 between", value1, value2, "companyField2");
            return (Criteria) this;
        }

        public Criteria andCompanyField2NotBetween(String value1, String value2) {
            addCriterion("company_field2 not between", value1, value2, "companyField2");
            return (Criteria) this;
        }

        public Criteria andCompanyCollectionStatusIsNull() {
            addCriterion("company_collection_status is null");
            return (Criteria) this;
        }

        public Criteria andCompanyCollectionStatusIsNotNull() {
            addCriterion("company_collection_status is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyCollectionStatusEqualTo(Integer value) {
            addCriterion("company_collection_status =", value, "companyCollectionStatus");
            return (Criteria) this;
        }

        public Criteria andCompanyCollectionStatusNotEqualTo(Integer value) {
            addCriterion("company_collection_status <>", value, "companyCollectionStatus");
            return (Criteria) this;
        }

        public Criteria andCompanyCollectionStatusGreaterThan(Integer value) {
            addCriterion("company_collection_status >", value, "companyCollectionStatus");
            return (Criteria) this;
        }

        public Criteria andCompanyCollectionStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("company_collection_status >=", value, "companyCollectionStatus");
            return (Criteria) this;
        }

        public Criteria andCompanyCollectionStatusLessThan(Integer value) {
            addCriterion("company_collection_status <", value, "companyCollectionStatus");
            return (Criteria) this;
        }

        public Criteria andCompanyCollectionStatusLessThanOrEqualTo(Integer value) {
            addCriterion("company_collection_status <=", value, "companyCollectionStatus");
            return (Criteria) this;
        }

        public Criteria andCompanyCollectionStatusIn(List<Integer> values) {
            addCriterion("company_collection_status in", values, "companyCollectionStatus");
            return (Criteria) this;
        }

        public Criteria andCompanyCollectionStatusNotIn(List<Integer> values) {
            addCriterion("company_collection_status not in", values, "companyCollectionStatus");
            return (Criteria) this;
        }

        public Criteria andCompanyCollectionStatusBetween(Integer value1, Integer value2) {
            addCriterion("company_collection_status between", value1, value2, "companyCollectionStatus");
            return (Criteria) this;
        }

        public Criteria andCompanyCollectionStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("company_collection_status not between", value1, value2, "companyCollectionStatus");
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