package com.chixing.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class RaidersExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Long offset;

    public RaidersExample() {
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

        public Criteria andRaidersIdIsNull() {
            addCriterion("raiders_id is null");
            return (Criteria) this;
        }

        public Criteria andRaidersIdIsNotNull() {
            addCriterion("raiders_id is not null");
            return (Criteria) this;
        }

        public Criteria andRaidersIdEqualTo(Integer value) {
            addCriterion("raiders_id =", value, "raidersId");
            return (Criteria) this;
        }

        public Criteria andRaidersIdNotEqualTo(Integer value) {
            addCriterion("raiders_id <>", value, "raidersId");
            return (Criteria) this;
        }

        public Criteria andRaidersIdGreaterThan(Integer value) {
            addCriterion("raiders_id >", value, "raidersId");
            return (Criteria) this;
        }

        public Criteria andRaidersIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("raiders_id >=", value, "raidersId");
            return (Criteria) this;
        }

        public Criteria andRaidersIdLessThan(Integer value) {
            addCriterion("raiders_id <", value, "raidersId");
            return (Criteria) this;
        }

        public Criteria andRaidersIdLessThanOrEqualTo(Integer value) {
            addCriterion("raiders_id <=", value, "raidersId");
            return (Criteria) this;
        }

        public Criteria andRaidersIdIn(List<Integer> values) {
            addCriterion("raiders_id in", values, "raidersId");
            return (Criteria) this;
        }

        public Criteria andRaidersIdNotIn(List<Integer> values) {
            addCriterion("raiders_id not in", values, "raidersId");
            return (Criteria) this;
        }

        public Criteria andRaidersIdBetween(Integer value1, Integer value2) {
            addCriterion("raiders_id between", value1, value2, "raidersId");
            return (Criteria) this;
        }

        public Criteria andRaidersIdNotBetween(Integer value1, Integer value2) {
            addCriterion("raiders_id not between", value1, value2, "raidersId");
            return (Criteria) this;
        }

        public Criteria andRaidersTitleIsNull() {
            addCriterion("raiders_title is null");
            return (Criteria) this;
        }

        public Criteria andRaidersTitleIsNotNull() {
            addCriterion("raiders_title is not null");
            return (Criteria) this;
        }

        public Criteria andRaidersTitleEqualTo(String value) {
            addCriterion("raiders_title =", value, "raidersTitle");
            return (Criteria) this;
        }

        public Criteria andRaidersTitleNotEqualTo(String value) {
            addCriterion("raiders_title <>", value, "raidersTitle");
            return (Criteria) this;
        }

        public Criteria andRaidersTitleGreaterThan(String value) {
            addCriterion("raiders_title >", value, "raidersTitle");
            return (Criteria) this;
        }

        public Criteria andRaidersTitleGreaterThanOrEqualTo(String value) {
            addCriterion("raiders_title >=", value, "raidersTitle");
            return (Criteria) this;
        }

        public Criteria andRaidersTitleLessThan(String value) {
            addCriterion("raiders_title <", value, "raidersTitle");
            return (Criteria) this;
        }

        public Criteria andRaidersTitleLessThanOrEqualTo(String value) {
            addCriterion("raiders_title <=", value, "raidersTitle");
            return (Criteria) this;
        }

        public Criteria andRaidersTitleLike(String value) {
            addCriterion("raiders_title like", value, "raidersTitle");
            return (Criteria) this;
        }

        public Criteria andRaidersTitleNotLike(String value) {
            addCriterion("raiders_title not like", value, "raidersTitle");
            return (Criteria) this;
        }

        public Criteria andRaidersTitleIn(List<String> values) {
            addCriterion("raiders_title in", values, "raidersTitle");
            return (Criteria) this;
        }

        public Criteria andRaidersTitleNotIn(List<String> values) {
            addCriterion("raiders_title not in", values, "raidersTitle");
            return (Criteria) this;
        }

        public Criteria andRaidersTitleBetween(String value1, String value2) {
            addCriterion("raiders_title between", value1, value2, "raidersTitle");
            return (Criteria) this;
        }

        public Criteria andRaidersTitleNotBetween(String value1, String value2) {
            addCriterion("raiders_title not between", value1, value2, "raidersTitle");
            return (Criteria) this;
        }

        public Criteria andRaidersImgPathIsNull() {
            addCriterion("raiders_img_path is null");
            return (Criteria) this;
        }

        public Criteria andRaidersImgPathIsNotNull() {
            addCriterion("raiders_img_path is not null");
            return (Criteria) this;
        }

        public Criteria andRaidersImgPathEqualTo(String value) {
            addCriterion("raiders_img_path =", value, "raidersImgPath");
            return (Criteria) this;
        }

        public Criteria andRaidersImgPathNotEqualTo(String value) {
            addCriterion("raiders_img_path <>", value, "raidersImgPath");
            return (Criteria) this;
        }

        public Criteria andRaidersImgPathGreaterThan(String value) {
            addCriterion("raiders_img_path >", value, "raidersImgPath");
            return (Criteria) this;
        }

        public Criteria andRaidersImgPathGreaterThanOrEqualTo(String value) {
            addCriterion("raiders_img_path >=", value, "raidersImgPath");
            return (Criteria) this;
        }

        public Criteria andRaidersImgPathLessThan(String value) {
            addCriterion("raiders_img_path <", value, "raidersImgPath");
            return (Criteria) this;
        }

        public Criteria andRaidersImgPathLessThanOrEqualTo(String value) {
            addCriterion("raiders_img_path <=", value, "raidersImgPath");
            return (Criteria) this;
        }

        public Criteria andRaidersImgPathLike(String value) {
            addCriterion("raiders_img_path like", value, "raidersImgPath");
            return (Criteria) this;
        }

        public Criteria andRaidersImgPathNotLike(String value) {
            addCriterion("raiders_img_path not like", value, "raidersImgPath");
            return (Criteria) this;
        }

        public Criteria andRaidersImgPathIn(List<String> values) {
            addCriterion("raiders_img_path in", values, "raidersImgPath");
            return (Criteria) this;
        }

        public Criteria andRaidersImgPathNotIn(List<String> values) {
            addCriterion("raiders_img_path not in", values, "raidersImgPath");
            return (Criteria) this;
        }

        public Criteria andRaidersImgPathBetween(String value1, String value2) {
            addCriterion("raiders_img_path between", value1, value2, "raidersImgPath");
            return (Criteria) this;
        }

        public Criteria andRaidersImgPathNotBetween(String value1, String value2) {
            addCriterion("raiders_img_path not between", value1, value2, "raidersImgPath");
            return (Criteria) this;
        }

        public Criteria andRaidersIntroduceIsNull() {
            addCriterion("raiders_introduce is null");
            return (Criteria) this;
        }

        public Criteria andRaidersIntroduceIsNotNull() {
            addCriterion("raiders_introduce is not null");
            return (Criteria) this;
        }

        public Criteria andRaidersIntroduceEqualTo(String value) {
            addCriterion("raiders_introduce =", value, "raidersIntroduce");
            return (Criteria) this;
        }

        public Criteria andRaidersIntroduceNotEqualTo(String value) {
            addCriterion("raiders_introduce <>", value, "raidersIntroduce");
            return (Criteria) this;
        }

        public Criteria andRaidersIntroduceGreaterThan(String value) {
            addCriterion("raiders_introduce >", value, "raidersIntroduce");
            return (Criteria) this;
        }

        public Criteria andRaidersIntroduceGreaterThanOrEqualTo(String value) {
            addCriterion("raiders_introduce >=", value, "raidersIntroduce");
            return (Criteria) this;
        }

        public Criteria andRaidersIntroduceLessThan(String value) {
            addCriterion("raiders_introduce <", value, "raidersIntroduce");
            return (Criteria) this;
        }

        public Criteria andRaidersIntroduceLessThanOrEqualTo(String value) {
            addCriterion("raiders_introduce <=", value, "raidersIntroduce");
            return (Criteria) this;
        }

        public Criteria andRaidersIntroduceLike(String value) {
            addCriterion("raiders_introduce like", value, "raidersIntroduce");
            return (Criteria) this;
        }

        public Criteria andRaidersIntroduceNotLike(String value) {
            addCriterion("raiders_introduce not like", value, "raidersIntroduce");
            return (Criteria) this;
        }

        public Criteria andRaidersIntroduceIn(List<String> values) {
            addCriterion("raiders_introduce in", values, "raidersIntroduce");
            return (Criteria) this;
        }

        public Criteria andRaidersIntroduceNotIn(List<String> values) {
            addCriterion("raiders_introduce not in", values, "raidersIntroduce");
            return (Criteria) this;
        }

        public Criteria andRaidersIntroduceBetween(String value1, String value2) {
            addCriterion("raiders_introduce between", value1, value2, "raidersIntroduce");
            return (Criteria) this;
        }

        public Criteria andRaidersIntroduceNotBetween(String value1, String value2) {
            addCriterion("raiders_introduce not between", value1, value2, "raidersIntroduce");
            return (Criteria) this;
        }

        public Criteria andRaidersContent1IsNull() {
            addCriterion("raiders_content1 is null");
            return (Criteria) this;
        }

        public Criteria andRaidersContent1IsNotNull() {
            addCriterion("raiders_content1 is not null");
            return (Criteria) this;
        }

        public Criteria andRaidersContent1EqualTo(String value) {
            addCriterion("raiders_content1 =", value, "raidersContent1");
            return (Criteria) this;
        }

        public Criteria andRaidersContent1NotEqualTo(String value) {
            addCriterion("raiders_content1 <>", value, "raidersContent1");
            return (Criteria) this;
        }

        public Criteria andRaidersContent1GreaterThan(String value) {
            addCriterion("raiders_content1 >", value, "raidersContent1");
            return (Criteria) this;
        }

        public Criteria andRaidersContent1GreaterThanOrEqualTo(String value) {
            addCriterion("raiders_content1 >=", value, "raidersContent1");
            return (Criteria) this;
        }

        public Criteria andRaidersContent1LessThan(String value) {
            addCriterion("raiders_content1 <", value, "raidersContent1");
            return (Criteria) this;
        }

        public Criteria andRaidersContent1LessThanOrEqualTo(String value) {
            addCriterion("raiders_content1 <=", value, "raidersContent1");
            return (Criteria) this;
        }

        public Criteria andRaidersContent1Like(String value) {
            addCriterion("raiders_content1 like", value, "raidersContent1");
            return (Criteria) this;
        }

        public Criteria andRaidersContent1NotLike(String value) {
            addCriterion("raiders_content1 not like", value, "raidersContent1");
            return (Criteria) this;
        }

        public Criteria andRaidersContent1In(List<String> values) {
            addCriterion("raiders_content1 in", values, "raidersContent1");
            return (Criteria) this;
        }

        public Criteria andRaidersContent1NotIn(List<String> values) {
            addCriterion("raiders_content1 not in", values, "raidersContent1");
            return (Criteria) this;
        }

        public Criteria andRaidersContent1Between(String value1, String value2) {
            addCriterion("raiders_content1 between", value1, value2, "raidersContent1");
            return (Criteria) this;
        }

        public Criteria andRaidersContent1NotBetween(String value1, String value2) {
            addCriterion("raiders_content1 not between", value1, value2, "raidersContent1");
            return (Criteria) this;
        }

        public Criteria andRaidersContent2IsNull() {
            addCriterion("raiders_content2 is null");
            return (Criteria) this;
        }

        public Criteria andRaidersContent2IsNotNull() {
            addCriterion("raiders_content2 is not null");
            return (Criteria) this;
        }

        public Criteria andRaidersContent2EqualTo(String value) {
            addCriterion("raiders_content2 =", value, "raidersContent2");
            return (Criteria) this;
        }

        public Criteria andRaidersContent2NotEqualTo(String value) {
            addCriterion("raiders_content2 <>", value, "raidersContent2");
            return (Criteria) this;
        }

        public Criteria andRaidersContent2GreaterThan(String value) {
            addCriterion("raiders_content2 >", value, "raidersContent2");
            return (Criteria) this;
        }

        public Criteria andRaidersContent2GreaterThanOrEqualTo(String value) {
            addCriterion("raiders_content2 >=", value, "raidersContent2");
            return (Criteria) this;
        }

        public Criteria andRaidersContent2LessThan(String value) {
            addCriterion("raiders_content2 <", value, "raidersContent2");
            return (Criteria) this;
        }

        public Criteria andRaidersContent2LessThanOrEqualTo(String value) {
            addCriterion("raiders_content2 <=", value, "raidersContent2");
            return (Criteria) this;
        }

        public Criteria andRaidersContent2Like(String value) {
            addCriterion("raiders_content2 like", value, "raidersContent2");
            return (Criteria) this;
        }

        public Criteria andRaidersContent2NotLike(String value) {
            addCriterion("raiders_content2 not like", value, "raidersContent2");
            return (Criteria) this;
        }

        public Criteria andRaidersContent2In(List<String> values) {
            addCriterion("raiders_content2 in", values, "raidersContent2");
            return (Criteria) this;
        }

        public Criteria andRaidersContent2NotIn(List<String> values) {
            addCriterion("raiders_content2 not in", values, "raidersContent2");
            return (Criteria) this;
        }

        public Criteria andRaidersContent2Between(String value1, String value2) {
            addCriterion("raiders_content2 between", value1, value2, "raidersContent2");
            return (Criteria) this;
        }

        public Criteria andRaidersContent2NotBetween(String value1, String value2) {
            addCriterion("raiders_content2 not between", value1, value2, "raidersContent2");
            return (Criteria) this;
        }

        public Criteria andRaidersContent3IsNull() {
            addCriterion("raiders_content3 is null");
            return (Criteria) this;
        }

        public Criteria andRaidersContent3IsNotNull() {
            addCriterion("raiders_content3 is not null");
            return (Criteria) this;
        }

        public Criteria andRaidersContent3EqualTo(String value) {
            addCriterion("raiders_content3 =", value, "raidersContent3");
            return (Criteria) this;
        }

        public Criteria andRaidersContent3NotEqualTo(String value) {
            addCriterion("raiders_content3 <>", value, "raidersContent3");
            return (Criteria) this;
        }

        public Criteria andRaidersContent3GreaterThan(String value) {
            addCriterion("raiders_content3 >", value, "raidersContent3");
            return (Criteria) this;
        }

        public Criteria andRaidersContent3GreaterThanOrEqualTo(String value) {
            addCriterion("raiders_content3 >=", value, "raidersContent3");
            return (Criteria) this;
        }

        public Criteria andRaidersContent3LessThan(String value) {
            addCriterion("raiders_content3 <", value, "raidersContent3");
            return (Criteria) this;
        }

        public Criteria andRaidersContent3LessThanOrEqualTo(String value) {
            addCriterion("raiders_content3 <=", value, "raidersContent3");
            return (Criteria) this;
        }

        public Criteria andRaidersContent3Like(String value) {
            addCriterion("raiders_content3 like", value, "raidersContent3");
            return (Criteria) this;
        }

        public Criteria andRaidersContent3NotLike(String value) {
            addCriterion("raiders_content3 not like", value, "raidersContent3");
            return (Criteria) this;
        }

        public Criteria andRaidersContent3In(List<String> values) {
            addCriterion("raiders_content3 in", values, "raidersContent3");
            return (Criteria) this;
        }

        public Criteria andRaidersContent3NotIn(List<String> values) {
            addCriterion("raiders_content3 not in", values, "raidersContent3");
            return (Criteria) this;
        }

        public Criteria andRaidersContent3Between(String value1, String value2) {
            addCriterion("raiders_content3 between", value1, value2, "raidersContent3");
            return (Criteria) this;
        }

        public Criteria andRaidersContent3NotBetween(String value1, String value2) {
            addCriterion("raiders_content3 not between", value1, value2, "raidersContent3");
            return (Criteria) this;
        }

        public Criteria andRaidersContent4IsNull() {
            addCriterion("raiders_content4 is null");
            return (Criteria) this;
        }

        public Criteria andRaidersContent4IsNotNull() {
            addCriterion("raiders_content4 is not null");
            return (Criteria) this;
        }

        public Criteria andRaidersContent4EqualTo(String value) {
            addCriterion("raiders_content4 =", value, "raidersContent4");
            return (Criteria) this;
        }

        public Criteria andRaidersContent4NotEqualTo(String value) {
            addCriterion("raiders_content4 <>", value, "raidersContent4");
            return (Criteria) this;
        }

        public Criteria andRaidersContent4GreaterThan(String value) {
            addCriterion("raiders_content4 >", value, "raidersContent4");
            return (Criteria) this;
        }

        public Criteria andRaidersContent4GreaterThanOrEqualTo(String value) {
            addCriterion("raiders_content4 >=", value, "raidersContent4");
            return (Criteria) this;
        }

        public Criteria andRaidersContent4LessThan(String value) {
            addCriterion("raiders_content4 <", value, "raidersContent4");
            return (Criteria) this;
        }

        public Criteria andRaidersContent4LessThanOrEqualTo(String value) {
            addCriterion("raiders_content4 <=", value, "raidersContent4");
            return (Criteria) this;
        }

        public Criteria andRaidersContent4Like(String value) {
            addCriterion("raiders_content4 like", value, "raidersContent4");
            return (Criteria) this;
        }

        public Criteria andRaidersContent4NotLike(String value) {
            addCriterion("raiders_content4 not like", value, "raidersContent4");
            return (Criteria) this;
        }

        public Criteria andRaidersContent4In(List<String> values) {
            addCriterion("raiders_content4 in", values, "raidersContent4");
            return (Criteria) this;
        }

        public Criteria andRaidersContent4NotIn(List<String> values) {
            addCriterion("raiders_content4 not in", values, "raidersContent4");
            return (Criteria) this;
        }

        public Criteria andRaidersContent4Between(String value1, String value2) {
            addCriterion("raiders_content4 between", value1, value2, "raidersContent4");
            return (Criteria) this;
        }

        public Criteria andRaidersContent4NotBetween(String value1, String value2) {
            addCriterion("raiders_content4 not between", value1, value2, "raidersContent4");
            return (Criteria) this;
        }

        public Criteria andRaidersDateIsNull() {
            addCriterion("raiders_date is null");
            return (Criteria) this;
        }

        public Criteria andRaidersDateIsNotNull() {
            addCriterion("raiders_date is not null");
            return (Criteria) this;
        }

        public Criteria andRaidersDateEqualTo(Date value) {
            addCriterion("raiders_date =", value, "raidersDate");
            return (Criteria) this;
        }

        public Criteria andRaidersDateNotEqualTo(Date value) {
            addCriterion("raiders_date <>", value, "raidersDate");
            return (Criteria) this;
        }

        public Criteria andRaidersDateGreaterThan(Date value) {
            addCriterion("raiders_date >", value, "raidersDate");
            return (Criteria) this;
        }

        public Criteria andRaidersDateGreaterThanOrEqualTo(Date value) {
            addCriterion("raiders_date >=", value, "raidersDate");
            return (Criteria) this;
        }

        public Criteria andRaidersDateLessThan(Date value) {
            addCriterion("raiders_date <", value, "raidersDate");
            return (Criteria) this;
        }

        public Criteria andRaidersDateLessThanOrEqualTo(Date value) {
            addCriterion("raiders_date <=", value, "raidersDate");
            return (Criteria) this;
        }

        public Criteria andRaidersDateIn(List<Date> values) {
            addCriterion("raiders_date in", values, "raidersDate");
            return (Criteria) this;
        }

        public Criteria andRaidersDateNotIn(List<Date> values) {
            addCriterion("raiders_date not in", values, "raidersDate");
            return (Criteria) this;
        }

        public Criteria andRaidersDateBetween(Date value1, Date value2) {
            addCriterion("raiders_date between", value1, value2, "raidersDate");
            return (Criteria) this;
        }

        public Criteria andRaidersDateNotBetween(Date value1, Date value2) {
            addCriterion("raiders_date not between", value1, value2, "raidersDate");
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