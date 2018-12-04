package com.chixing.entity;

import java.util.ArrayList;
import java.util.List;

public class RenderingExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Long offset;

    public RenderingExample() {
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

        public Criteria andRenderingDesignIdIsNull() {
            addCriterion("rendering_design_id is null");
            return (Criteria) this;
        }

        public Criteria andRenderingDesignIdIsNotNull() {
            addCriterion("rendering_design_id is not null");
            return (Criteria) this;
        }

        public Criteria andRenderingDesignIdEqualTo(Integer value) {
            addCriterion("rendering_design_id =", value, "renderingDesignId");
            return (Criteria) this;
        }

        public Criteria andRenderingDesignIdNotEqualTo(Integer value) {
            addCriterion("rendering_design_id <>", value, "renderingDesignId");
            return (Criteria) this;
        }

        public Criteria andRenderingDesignIdGreaterThan(Integer value) {
            addCriterion("rendering_design_id >", value, "renderingDesignId");
            return (Criteria) this;
        }

        public Criteria andRenderingDesignIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("rendering_design_id >=", value, "renderingDesignId");
            return (Criteria) this;
        }

        public Criteria andRenderingDesignIdLessThan(Integer value) {
            addCriterion("rendering_design_id <", value, "renderingDesignId");
            return (Criteria) this;
        }

        public Criteria andRenderingDesignIdLessThanOrEqualTo(Integer value) {
            addCriterion("rendering_design_id <=", value, "renderingDesignId");
            return (Criteria) this;
        }

        public Criteria andRenderingDesignIdIn(List<Integer> values) {
            addCriterion("rendering_design_id in", values, "renderingDesignId");
            return (Criteria) this;
        }

        public Criteria andRenderingDesignIdNotIn(List<Integer> values) {
            addCriterion("rendering_design_id not in", values, "renderingDesignId");
            return (Criteria) this;
        }

        public Criteria andRenderingDesignIdBetween(Integer value1, Integer value2) {
            addCriterion("rendering_design_id between", value1, value2, "renderingDesignId");
            return (Criteria) this;
        }

        public Criteria andRenderingDesignIdNotBetween(Integer value1, Integer value2) {
            addCriterion("rendering_design_id not between", value1, value2, "renderingDesignId");
            return (Criteria) this;
        }

        public Criteria andRenderingDescriptionIsNull() {
            addCriterion("rendering_description is null");
            return (Criteria) this;
        }

        public Criteria andRenderingDescriptionIsNotNull() {
            addCriterion("rendering_description is not null");
            return (Criteria) this;
        }

        public Criteria andRenderingDescriptionEqualTo(String value) {
            addCriterion("rendering_description =", value, "renderingDescription");
            return (Criteria) this;
        }

        public Criteria andRenderingDescriptionNotEqualTo(String value) {
            addCriterion("rendering_description <>", value, "renderingDescription");
            return (Criteria) this;
        }

        public Criteria andRenderingDescriptionGreaterThan(String value) {
            addCriterion("rendering_description >", value, "renderingDescription");
            return (Criteria) this;
        }

        public Criteria andRenderingDescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("rendering_description >=", value, "renderingDescription");
            return (Criteria) this;
        }

        public Criteria andRenderingDescriptionLessThan(String value) {
            addCriterion("rendering_description <", value, "renderingDescription");
            return (Criteria) this;
        }

        public Criteria andRenderingDescriptionLessThanOrEqualTo(String value) {
            addCriterion("rendering_description <=", value, "renderingDescription");
            return (Criteria) this;
        }

        public Criteria andRenderingDescriptionLike(String value) {
            addCriterion("rendering_description like", value, "renderingDescription");
            return (Criteria) this;
        }

        public Criteria andRenderingDescriptionNotLike(String value) {
            addCriterion("rendering_description not like", value, "renderingDescription");
            return (Criteria) this;
        }

        public Criteria andRenderingDescriptionIn(List<String> values) {
            addCriterion("rendering_description in", values, "renderingDescription");
            return (Criteria) this;
        }

        public Criteria andRenderingDescriptionNotIn(List<String> values) {
            addCriterion("rendering_description not in", values, "renderingDescription");
            return (Criteria) this;
        }

        public Criteria andRenderingDescriptionBetween(String value1, String value2) {
            addCriterion("rendering_description between", value1, value2, "renderingDescription");
            return (Criteria) this;
        }

        public Criteria andRenderingDescriptionNotBetween(String value1, String value2) {
            addCriterion("rendering_description not between", value1, value2, "renderingDescription");
            return (Criteria) this;
        }

        public Criteria andRenderingHouseTypeIsNull() {
            addCriterion("rendering_house_type is null");
            return (Criteria) this;
        }

        public Criteria andRenderingHouseTypeIsNotNull() {
            addCriterion("rendering_house_type is not null");
            return (Criteria) this;
        }

        public Criteria andRenderingHouseTypeEqualTo(String value) {
            addCriterion("rendering_house_type =", value, "renderingHouseType");
            return (Criteria) this;
        }

        public Criteria andRenderingHouseTypeNotEqualTo(String value) {
            addCriterion("rendering_house_type <>", value, "renderingHouseType");
            return (Criteria) this;
        }

        public Criteria andRenderingHouseTypeGreaterThan(String value) {
            addCriterion("rendering_house_type >", value, "renderingHouseType");
            return (Criteria) this;
        }

        public Criteria andRenderingHouseTypeGreaterThanOrEqualTo(String value) {
            addCriterion("rendering_house_type >=", value, "renderingHouseType");
            return (Criteria) this;
        }

        public Criteria andRenderingHouseTypeLessThan(String value) {
            addCriterion("rendering_house_type <", value, "renderingHouseType");
            return (Criteria) this;
        }

        public Criteria andRenderingHouseTypeLessThanOrEqualTo(String value) {
            addCriterion("rendering_house_type <=", value, "renderingHouseType");
            return (Criteria) this;
        }

        public Criteria andRenderingHouseTypeLike(String value) {
            addCriterion("rendering_house_type like", value, "renderingHouseType");
            return (Criteria) this;
        }

        public Criteria andRenderingHouseTypeNotLike(String value) {
            addCriterion("rendering_house_type not like", value, "renderingHouseType");
            return (Criteria) this;
        }

        public Criteria andRenderingHouseTypeIn(List<String> values) {
            addCriterion("rendering_house_type in", values, "renderingHouseType");
            return (Criteria) this;
        }

        public Criteria andRenderingHouseTypeNotIn(List<String> values) {
            addCriterion("rendering_house_type not in", values, "renderingHouseType");
            return (Criteria) this;
        }

        public Criteria andRenderingHouseTypeBetween(String value1, String value2) {
            addCriterion("rendering_house_type between", value1, value2, "renderingHouseType");
            return (Criteria) this;
        }

        public Criteria andRenderingHouseTypeNotBetween(String value1, String value2) {
            addCriterion("rendering_house_type not between", value1, value2, "renderingHouseType");
            return (Criteria) this;
        }

        public Criteria andRenderingStyleIsNull() {
            addCriterion("rendering_style is null");
            return (Criteria) this;
        }

        public Criteria andRenderingStyleIsNotNull() {
            addCriterion("rendering_style is not null");
            return (Criteria) this;
        }

        public Criteria andRenderingStyleEqualTo(String value) {
            addCriterion("rendering_style =", value, "renderingStyle");
            return (Criteria) this;
        }

        public Criteria andRenderingStyleNotEqualTo(String value) {
            addCriterion("rendering_style <>", value, "renderingStyle");
            return (Criteria) this;
        }

        public Criteria andRenderingStyleGreaterThan(String value) {
            addCriterion("rendering_style >", value, "renderingStyle");
            return (Criteria) this;
        }

        public Criteria andRenderingStyleGreaterThanOrEqualTo(String value) {
            addCriterion("rendering_style >=", value, "renderingStyle");
            return (Criteria) this;
        }

        public Criteria andRenderingStyleLessThan(String value) {
            addCriterion("rendering_style <", value, "renderingStyle");
            return (Criteria) this;
        }

        public Criteria andRenderingStyleLessThanOrEqualTo(String value) {
            addCriterion("rendering_style <=", value, "renderingStyle");
            return (Criteria) this;
        }

        public Criteria andRenderingStyleLike(String value) {
            addCriterion("rendering_style like", value, "renderingStyle");
            return (Criteria) this;
        }

        public Criteria andRenderingStyleNotLike(String value) {
            addCriterion("rendering_style not like", value, "renderingStyle");
            return (Criteria) this;
        }

        public Criteria andRenderingStyleIn(List<String> values) {
            addCriterion("rendering_style in", values, "renderingStyle");
            return (Criteria) this;
        }

        public Criteria andRenderingStyleNotIn(List<String> values) {
            addCriterion("rendering_style not in", values, "renderingStyle");
            return (Criteria) this;
        }

        public Criteria andRenderingStyleBetween(String value1, String value2) {
            addCriterion("rendering_style between", value1, value2, "renderingStyle");
            return (Criteria) this;
        }

        public Criteria andRenderingStyleNotBetween(String value1, String value2) {
            addCriterion("rendering_style not between", value1, value2, "renderingStyle");
            return (Criteria) this;
        }

        public Criteria andRenderingAreaIsNull() {
            addCriterion("rendering_area is null");
            return (Criteria) this;
        }

        public Criteria andRenderingAreaIsNotNull() {
            addCriterion("rendering_area is not null");
            return (Criteria) this;
        }

        public Criteria andRenderingAreaEqualTo(Float value) {
            addCriterion("rendering_area =", value, "renderingArea");
            return (Criteria) this;
        }

        public Criteria andRenderingAreaNotEqualTo(Float value) {
            addCriterion("rendering_area <>", value, "renderingArea");
            return (Criteria) this;
        }

        public Criteria andRenderingAreaGreaterThan(Float value) {
            addCriterion("rendering_area >", value, "renderingArea");
            return (Criteria) this;
        }

        public Criteria andRenderingAreaGreaterThanOrEqualTo(Float value) {
            addCriterion("rendering_area >=", value, "renderingArea");
            return (Criteria) this;
        }

        public Criteria andRenderingAreaLessThan(Float value) {
            addCriterion("rendering_area <", value, "renderingArea");
            return (Criteria) this;
        }

        public Criteria andRenderingAreaLessThanOrEqualTo(Float value) {
            addCriterion("rendering_area <=", value, "renderingArea");
            return (Criteria) this;
        }

        public Criteria andRenderingAreaIn(List<Float> values) {
            addCriterion("rendering_area in", values, "renderingArea");
            return (Criteria) this;
        }

        public Criteria andRenderingAreaNotIn(List<Float> values) {
            addCriterion("rendering_area not in", values, "renderingArea");
            return (Criteria) this;
        }

        public Criteria andRenderingAreaBetween(Float value1, Float value2) {
            addCriterion("rendering_area between", value1, value2, "renderingArea");
            return (Criteria) this;
        }

        public Criteria andRenderingAreaNotBetween(Float value1, Float value2) {
            addCriterion("rendering_area not between", value1, value2, "renderingArea");
            return (Criteria) this;
        }

        public Criteria andRenderingPraiseIsNull() {
            addCriterion("rendering_praise is null");
            return (Criteria) this;
        }

        public Criteria andRenderingPraiseIsNotNull() {
            addCriterion("rendering_praise is not null");
            return (Criteria) this;
        }

        public Criteria andRenderingPraiseEqualTo(Integer value) {
            addCriterion("rendering_praise =", value, "renderingPraise");
            return (Criteria) this;
        }

        public Criteria andRenderingPraiseNotEqualTo(Integer value) {
            addCriterion("rendering_praise <>", value, "renderingPraise");
            return (Criteria) this;
        }

        public Criteria andRenderingPraiseGreaterThan(Integer value) {
            addCriterion("rendering_praise >", value, "renderingPraise");
            return (Criteria) this;
        }

        public Criteria andRenderingPraiseGreaterThanOrEqualTo(Integer value) {
            addCriterion("rendering_praise >=", value, "renderingPraise");
            return (Criteria) this;
        }

        public Criteria andRenderingPraiseLessThan(Integer value) {
            addCriterion("rendering_praise <", value, "renderingPraise");
            return (Criteria) this;
        }

        public Criteria andRenderingPraiseLessThanOrEqualTo(Integer value) {
            addCriterion("rendering_praise <=", value, "renderingPraise");
            return (Criteria) this;
        }

        public Criteria andRenderingPraiseIn(List<Integer> values) {
            addCriterion("rendering_praise in", values, "renderingPraise");
            return (Criteria) this;
        }

        public Criteria andRenderingPraiseNotIn(List<Integer> values) {
            addCriterion("rendering_praise not in", values, "renderingPraise");
            return (Criteria) this;
        }

        public Criteria andRenderingPraiseBetween(Integer value1, Integer value2) {
            addCriterion("rendering_praise between", value1, value2, "renderingPraise");
            return (Criteria) this;
        }

        public Criteria andRenderingPraiseNotBetween(Integer value1, Integer value2) {
            addCriterion("rendering_praise not between", value1, value2, "renderingPraise");
            return (Criteria) this;
        }

        public Criteria andRenderingStatusIsNull() {
            addCriterion("rendering_status is null");
            return (Criteria) this;
        }

        public Criteria andRenderingStatusIsNotNull() {
            addCriterion("rendering_status is not null");
            return (Criteria) this;
        }

        public Criteria andRenderingStatusEqualTo(Integer value) {
            addCriterion("rendering_status =", value, "renderingStatus");
            return (Criteria) this;
        }

        public Criteria andRenderingStatusNotEqualTo(Integer value) {
            addCriterion("rendering_status <>", value, "renderingStatus");
            return (Criteria) this;
        }

        public Criteria andRenderingStatusGreaterThan(Integer value) {
            addCriterion("rendering_status >", value, "renderingStatus");
            return (Criteria) this;
        }

        public Criteria andRenderingStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("rendering_status >=", value, "renderingStatus");
            return (Criteria) this;
        }

        public Criteria andRenderingStatusLessThan(Integer value) {
            addCriterion("rendering_status <", value, "renderingStatus");
            return (Criteria) this;
        }

        public Criteria andRenderingStatusLessThanOrEqualTo(Integer value) {
            addCriterion("rendering_status <=", value, "renderingStatus");
            return (Criteria) this;
        }

        public Criteria andRenderingStatusIn(List<Integer> values) {
            addCriterion("rendering_status in", values, "renderingStatus");
            return (Criteria) this;
        }

        public Criteria andRenderingStatusNotIn(List<Integer> values) {
            addCriterion("rendering_status not in", values, "renderingStatus");
            return (Criteria) this;
        }

        public Criteria andRenderingStatusBetween(Integer value1, Integer value2) {
            addCriterion("rendering_status between", value1, value2, "renderingStatus");
            return (Criteria) this;
        }

        public Criteria andRenderingStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("rendering_status not between", value1, value2, "renderingStatus");
            return (Criteria) this;
        }

        public Criteria andFiled1IsNull() {
            addCriterion("filed1 is null");
            return (Criteria) this;
        }

        public Criteria andFiled1IsNotNull() {
            addCriterion("filed1 is not null");
            return (Criteria) this;
        }

        public Criteria andFiled1EqualTo(String value) {
            addCriterion("filed1 =", value, "filed1");
            return (Criteria) this;
        }

        public Criteria andFiled1NotEqualTo(String value) {
            addCriterion("filed1 <>", value, "filed1");
            return (Criteria) this;
        }

        public Criteria andFiled1GreaterThan(String value) {
            addCriterion("filed1 >", value, "filed1");
            return (Criteria) this;
        }

        public Criteria andFiled1GreaterThanOrEqualTo(String value) {
            addCriterion("filed1 >=", value, "filed1");
            return (Criteria) this;
        }

        public Criteria andFiled1LessThan(String value) {
            addCriterion("filed1 <", value, "filed1");
            return (Criteria) this;
        }

        public Criteria andFiled1LessThanOrEqualTo(String value) {
            addCriterion("filed1 <=", value, "filed1");
            return (Criteria) this;
        }

        public Criteria andFiled1Like(String value) {
            addCriterion("filed1 like", value, "filed1");
            return (Criteria) this;
        }

        public Criteria andFiled1NotLike(String value) {
            addCriterion("filed1 not like", value, "filed1");
            return (Criteria) this;
        }

        public Criteria andFiled1In(List<String> values) {
            addCriterion("filed1 in", values, "filed1");
            return (Criteria) this;
        }

        public Criteria andFiled1NotIn(List<String> values) {
            addCriterion("filed1 not in", values, "filed1");
            return (Criteria) this;
        }

        public Criteria andFiled1Between(String value1, String value2) {
            addCriterion("filed1 between", value1, value2, "filed1");
            return (Criteria) this;
        }

        public Criteria andFiled1NotBetween(String value1, String value2) {
            addCriterion("filed1 not between", value1, value2, "filed1");
            return (Criteria) this;
        }

        public Criteria andFiledsIsNull() {
            addCriterion("fileds is null");
            return (Criteria) this;
        }

        public Criteria andFiledsIsNotNull() {
            addCriterion("fileds is not null");
            return (Criteria) this;
        }

        public Criteria andFiledsEqualTo(Integer value) {
            addCriterion("fileds =", value, "fileds");
            return (Criteria) this;
        }

        public Criteria andFiledsNotEqualTo(Integer value) {
            addCriterion("fileds <>", value, "fileds");
            return (Criteria) this;
        }

        public Criteria andFiledsGreaterThan(Integer value) {
            addCriterion("fileds >", value, "fileds");
            return (Criteria) this;
        }

        public Criteria andFiledsGreaterThanOrEqualTo(Integer value) {
            addCriterion("fileds >=", value, "fileds");
            return (Criteria) this;
        }

        public Criteria andFiledsLessThan(Integer value) {
            addCriterion("fileds <", value, "fileds");
            return (Criteria) this;
        }

        public Criteria andFiledsLessThanOrEqualTo(Integer value) {
            addCriterion("fileds <=", value, "fileds");
            return (Criteria) this;
        }

        public Criteria andFiledsIn(List<Integer> values) {
            addCriterion("fileds in", values, "fileds");
            return (Criteria) this;
        }

        public Criteria andFiledsNotIn(List<Integer> values) {
            addCriterion("fileds not in", values, "fileds");
            return (Criteria) this;
        }

        public Criteria andFiledsBetween(Integer value1, Integer value2) {
            addCriterion("fileds between", value1, value2, "fileds");
            return (Criteria) this;
        }

        public Criteria andFiledsNotBetween(Integer value1, Integer value2) {
            addCriterion("fileds not between", value1, value2, "fileds");
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