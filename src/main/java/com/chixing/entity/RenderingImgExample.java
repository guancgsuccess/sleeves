package com.chixing.entity;

import java.util.ArrayList;
import java.util.List;

public class RenderingImgExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Long offset;

    public RenderingImgExample() {
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

        public Criteria andRenderingImgIdIsNull() {
            addCriterion("rendering_img_id is null");
            return (Criteria) this;
        }

        public Criteria andRenderingImgIdIsNotNull() {
            addCriterion("rendering_img_id is not null");
            return (Criteria) this;
        }

        public Criteria andRenderingImgIdEqualTo(Integer value) {
            addCriterion("rendering_img_id =", value, "renderingImgId");
            return (Criteria) this;
        }

        public Criteria andRenderingImgIdNotEqualTo(Integer value) {
            addCriterion("rendering_img_id <>", value, "renderingImgId");
            return (Criteria) this;
        }

        public Criteria andRenderingImgIdGreaterThan(Integer value) {
            addCriterion("rendering_img_id >", value, "renderingImgId");
            return (Criteria) this;
        }

        public Criteria andRenderingImgIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("rendering_img_id >=", value, "renderingImgId");
            return (Criteria) this;
        }

        public Criteria andRenderingImgIdLessThan(Integer value) {
            addCriterion("rendering_img_id <", value, "renderingImgId");
            return (Criteria) this;
        }

        public Criteria andRenderingImgIdLessThanOrEqualTo(Integer value) {
            addCriterion("rendering_img_id <=", value, "renderingImgId");
            return (Criteria) this;
        }

        public Criteria andRenderingImgIdIn(List<Integer> values) {
            addCriterion("rendering_img_id in", values, "renderingImgId");
            return (Criteria) this;
        }

        public Criteria andRenderingImgIdNotIn(List<Integer> values) {
            addCriterion("rendering_img_id not in", values, "renderingImgId");
            return (Criteria) this;
        }

        public Criteria andRenderingImgIdBetween(Integer value1, Integer value2) {
            addCriterion("rendering_img_id between", value1, value2, "renderingImgId");
            return (Criteria) this;
        }

        public Criteria andRenderingImgIdNotBetween(Integer value1, Integer value2) {
            addCriterion("rendering_img_id not between", value1, value2, "renderingImgId");
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

        public Criteria andRenderingImagesPathIsNull() {
            addCriterion("rendering_images_path is null");
            return (Criteria) this;
        }

        public Criteria andRenderingImagesPathIsNotNull() {
            addCriterion("rendering_images_path is not null");
            return (Criteria) this;
        }

        public Criteria andRenderingImagesPathEqualTo(String value) {
            addCriterion("rendering_images_path =", value, "renderingImagesPath");
            return (Criteria) this;
        }

        public Criteria andRenderingImagesPathNotEqualTo(String value) {
            addCriterion("rendering_images_path <>", value, "renderingImagesPath");
            return (Criteria) this;
        }

        public Criteria andRenderingImagesPathGreaterThan(String value) {
            addCriterion("rendering_images_path >", value, "renderingImagesPath");
            return (Criteria) this;
        }

        public Criteria andRenderingImagesPathGreaterThanOrEqualTo(String value) {
            addCriterion("rendering_images_path >=", value, "renderingImagesPath");
            return (Criteria) this;
        }

        public Criteria andRenderingImagesPathLessThan(String value) {
            addCriterion("rendering_images_path <", value, "renderingImagesPath");
            return (Criteria) this;
        }

        public Criteria andRenderingImagesPathLessThanOrEqualTo(String value) {
            addCriterion("rendering_images_path <=", value, "renderingImagesPath");
            return (Criteria) this;
        }

        public Criteria andRenderingImagesPathLike(String value) {
            addCriterion("rendering_images_path like", value, "renderingImagesPath");
            return (Criteria) this;
        }

        public Criteria andRenderingImagesPathNotLike(String value) {
            addCriterion("rendering_images_path not like", value, "renderingImagesPath");
            return (Criteria) this;
        }

        public Criteria andRenderingImagesPathIn(List<String> values) {
            addCriterion("rendering_images_path in", values, "renderingImagesPath");
            return (Criteria) this;
        }

        public Criteria andRenderingImagesPathNotIn(List<String> values) {
            addCriterion("rendering_images_path not in", values, "renderingImagesPath");
            return (Criteria) this;
        }

        public Criteria andRenderingImagesPathBetween(String value1, String value2) {
            addCriterion("rendering_images_path between", value1, value2, "renderingImagesPath");
            return (Criteria) this;
        }

        public Criteria andRenderingImagesPathNotBetween(String value1, String value2) {
            addCriterion("rendering_images_path not between", value1, value2, "renderingImagesPath");
            return (Criteria) this;
        }

        public Criteria andRenderingSortnoIsNull() {
            addCriterion("rendering_sortno is null");
            return (Criteria) this;
        }

        public Criteria andRenderingSortnoIsNotNull() {
            addCriterion("rendering_sortno is not null");
            return (Criteria) this;
        }

        public Criteria andRenderingSortnoEqualTo(Integer value) {
            addCriterion("rendering_sortno =", value, "renderingSortno");
            return (Criteria) this;
        }

        public Criteria andRenderingSortnoNotEqualTo(Integer value) {
            addCriterion("rendering_sortno <>", value, "renderingSortno");
            return (Criteria) this;
        }

        public Criteria andRenderingSortnoGreaterThan(Integer value) {
            addCriterion("rendering_sortno >", value, "renderingSortno");
            return (Criteria) this;
        }

        public Criteria andRenderingSortnoGreaterThanOrEqualTo(Integer value) {
            addCriterion("rendering_sortno >=", value, "renderingSortno");
            return (Criteria) this;
        }

        public Criteria andRenderingSortnoLessThan(Integer value) {
            addCriterion("rendering_sortno <", value, "renderingSortno");
            return (Criteria) this;
        }

        public Criteria andRenderingSortnoLessThanOrEqualTo(Integer value) {
            addCriterion("rendering_sortno <=", value, "renderingSortno");
            return (Criteria) this;
        }

        public Criteria andRenderingSortnoIn(List<Integer> values) {
            addCriterion("rendering_sortno in", values, "renderingSortno");
            return (Criteria) this;
        }

        public Criteria andRenderingSortnoNotIn(List<Integer> values) {
            addCriterion("rendering_sortno not in", values, "renderingSortno");
            return (Criteria) this;
        }

        public Criteria andRenderingSortnoBetween(Integer value1, Integer value2) {
            addCriterion("rendering_sortno between", value1, value2, "renderingSortno");
            return (Criteria) this;
        }

        public Criteria andRenderingSortnoNotBetween(Integer value1, Integer value2) {
            addCriterion("rendering_sortno not between", value1, value2, "renderingSortno");
            return (Criteria) this;
        }

        public Criteria andFileds1IsNull() {
            addCriterion("fileds1 is null");
            return (Criteria) this;
        }

        public Criteria andFileds1IsNotNull() {
            addCriterion("fileds1 is not null");
            return (Criteria) this;
        }

        public Criteria andFileds1EqualTo(String value) {
            addCriterion("fileds1 =", value, "fileds1");
            return (Criteria) this;
        }

        public Criteria andFileds1NotEqualTo(String value) {
            addCriterion("fileds1 <>", value, "fileds1");
            return (Criteria) this;
        }

        public Criteria andFileds1GreaterThan(String value) {
            addCriterion("fileds1 >", value, "fileds1");
            return (Criteria) this;
        }

        public Criteria andFileds1GreaterThanOrEqualTo(String value) {
            addCriterion("fileds1 >=", value, "fileds1");
            return (Criteria) this;
        }

        public Criteria andFileds1LessThan(String value) {
            addCriterion("fileds1 <", value, "fileds1");
            return (Criteria) this;
        }

        public Criteria andFileds1LessThanOrEqualTo(String value) {
            addCriterion("fileds1 <=", value, "fileds1");
            return (Criteria) this;
        }

        public Criteria andFileds1Like(String value) {
            addCriterion("fileds1 like", value, "fileds1");
            return (Criteria) this;
        }

        public Criteria andFileds1NotLike(String value) {
            addCriterion("fileds1 not like", value, "fileds1");
            return (Criteria) this;
        }

        public Criteria andFileds1In(List<String> values) {
            addCriterion("fileds1 in", values, "fileds1");
            return (Criteria) this;
        }

        public Criteria andFileds1NotIn(List<String> values) {
            addCriterion("fileds1 not in", values, "fileds1");
            return (Criteria) this;
        }

        public Criteria andFileds1Between(String value1, String value2) {
            addCriterion("fileds1 between", value1, value2, "fileds1");
            return (Criteria) this;
        }

        public Criteria andFileds1NotBetween(String value1, String value2) {
            addCriterion("fileds1 not between", value1, value2, "fileds1");
            return (Criteria) this;
        }

        public Criteria andFileds2IsNull() {
            addCriterion("fileds2 is null");
            return (Criteria) this;
        }

        public Criteria andFileds2IsNotNull() {
            addCriterion("fileds2 is not null");
            return (Criteria) this;
        }

        public Criteria andFileds2EqualTo(Integer value) {
            addCriterion("fileds2 =", value, "fileds2");
            return (Criteria) this;
        }

        public Criteria andFileds2NotEqualTo(Integer value) {
            addCriterion("fileds2 <>", value, "fileds2");
            return (Criteria) this;
        }

        public Criteria andFileds2GreaterThan(Integer value) {
            addCriterion("fileds2 >", value, "fileds2");
            return (Criteria) this;
        }

        public Criteria andFileds2GreaterThanOrEqualTo(Integer value) {
            addCriterion("fileds2 >=", value, "fileds2");
            return (Criteria) this;
        }

        public Criteria andFileds2LessThan(Integer value) {
            addCriterion("fileds2 <", value, "fileds2");
            return (Criteria) this;
        }

        public Criteria andFileds2LessThanOrEqualTo(Integer value) {
            addCriterion("fileds2 <=", value, "fileds2");
            return (Criteria) this;
        }

        public Criteria andFileds2In(List<Integer> values) {
            addCriterion("fileds2 in", values, "fileds2");
            return (Criteria) this;
        }

        public Criteria andFileds2NotIn(List<Integer> values) {
            addCriterion("fileds2 not in", values, "fileds2");
            return (Criteria) this;
        }

        public Criteria andFileds2Between(Integer value1, Integer value2) {
            addCriterion("fileds2 between", value1, value2, "fileds2");
            return (Criteria) this;
        }

        public Criteria andFileds2NotBetween(Integer value1, Integer value2) {
            addCriterion("fileds2 not between", value1, value2, "fileds2");
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