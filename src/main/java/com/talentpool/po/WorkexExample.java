package com.talentpool.po;

import java.util.ArrayList;
import java.util.List;

public class WorkexExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public WorkexExample() {
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

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andWuesrnameIsNull() {
            addCriterion("wuesrname is null");
            return (Criteria) this;
        }

        public Criteria andWuesrnameIsNotNull() {
            addCriterion("wuesrname is not null");
            return (Criteria) this;
        }

        public Criteria andWuesrnameEqualTo(String value) {
            addCriterion("wuesrname =", value, "wuesrname");
            return (Criteria) this;
        }

        public Criteria andWuesrnameNotEqualTo(String value) {
            addCriterion("wuesrname <>", value, "wuesrname");
            return (Criteria) this;
        }

        public Criteria andWuesrnameGreaterThan(String value) {
            addCriterion("wuesrname >", value, "wuesrname");
            return (Criteria) this;
        }

        public Criteria andWuesrnameGreaterThanOrEqualTo(String value) {
            addCriterion("wuesrname >=", value, "wuesrname");
            return (Criteria) this;
        }

        public Criteria andWuesrnameLessThan(String value) {
            addCriterion("wuesrname <", value, "wuesrname");
            return (Criteria) this;
        }

        public Criteria andWuesrnameLessThanOrEqualTo(String value) {
            addCriterion("wuesrname <=", value, "wuesrname");
            return (Criteria) this;
        }

        public Criteria andWuesrnameLike(String value) {
            addCriterion("wuesrname like", value, "wuesrname");
            return (Criteria) this;
        }

        public Criteria andWuesrnameNotLike(String value) {
            addCriterion("wuesrname not like", value, "wuesrname");
            return (Criteria) this;
        }

        public Criteria andWuesrnameIn(List<String> values) {
            addCriterion("wuesrname in", values, "wuesrname");
            return (Criteria) this;
        }

        public Criteria andWuesrnameNotIn(List<String> values) {
            addCriterion("wuesrname not in", values, "wuesrname");
            return (Criteria) this;
        }

        public Criteria andWuesrnameBetween(String value1, String value2) {
            addCriterion("wuesrname between", value1, value2, "wuesrname");
            return (Criteria) this;
        }

        public Criteria andWuesrnameNotBetween(String value1, String value2) {
            addCriterion("wuesrname not between", value1, value2, "wuesrname");
            return (Criteria) this;
        }

        public Criteria andWstartdateIsNull() {
            addCriterion("wstartdate is null");
            return (Criteria) this;
        }

        public Criteria andWstartdateIsNotNull() {
            addCriterion("wstartdate is not null");
            return (Criteria) this;
        }

        public Criteria andWstartdateEqualTo(String value) {
            addCriterion("wstartdate =", value, "wstartdate");
            return (Criteria) this;
        }

        public Criteria andWstartdateNotEqualTo(String value) {
            addCriterion("wstartdate <>", value, "wstartdate");
            return (Criteria) this;
        }

        public Criteria andWstartdateGreaterThan(String value) {
            addCriterion("wstartdate >", value, "wstartdate");
            return (Criteria) this;
        }

        public Criteria andWstartdateGreaterThanOrEqualTo(String value) {
            addCriterion("wstartdate >=", value, "wstartdate");
            return (Criteria) this;
        }

        public Criteria andWstartdateLessThan(String value) {
            addCriterion("wstartdate <", value, "wstartdate");
            return (Criteria) this;
        }

        public Criteria andWstartdateLessThanOrEqualTo(String value) {
            addCriterion("wstartdate <=", value, "wstartdate");
            return (Criteria) this;
        }

        public Criteria andWstartdateLike(String value) {
            addCriterion("wstartdate like", value, "wstartdate");
            return (Criteria) this;
        }

        public Criteria andWstartdateNotLike(String value) {
            addCriterion("wstartdate not like", value, "wstartdate");
            return (Criteria) this;
        }

        public Criteria andWstartdateIn(List<String> values) {
            addCriterion("wstartdate in", values, "wstartdate");
            return (Criteria) this;
        }

        public Criteria andWstartdateNotIn(List<String> values) {
            addCriterion("wstartdate not in", values, "wstartdate");
            return (Criteria) this;
        }

        public Criteria andWstartdateBetween(String value1, String value2) {
            addCriterion("wstartdate between", value1, value2, "wstartdate");
            return (Criteria) this;
        }

        public Criteria andWstartdateNotBetween(String value1, String value2) {
            addCriterion("wstartdate not between", value1, value2, "wstartdate");
            return (Criteria) this;
        }

        public Criteria andWenddateIsNull() {
            addCriterion("wenddate is null");
            return (Criteria) this;
        }

        public Criteria andWenddateIsNotNull() {
            addCriterion("wenddate is not null");
            return (Criteria) this;
        }

        public Criteria andWenddateEqualTo(String value) {
            addCriterion("wenddate =", value, "wenddate");
            return (Criteria) this;
        }

        public Criteria andWenddateNotEqualTo(String value) {
            addCriterion("wenddate <>", value, "wenddate");
            return (Criteria) this;
        }

        public Criteria andWenddateGreaterThan(String value) {
            addCriterion("wenddate >", value, "wenddate");
            return (Criteria) this;
        }

        public Criteria andWenddateGreaterThanOrEqualTo(String value) {
            addCriterion("wenddate >=", value, "wenddate");
            return (Criteria) this;
        }

        public Criteria andWenddateLessThan(String value) {
            addCriterion("wenddate <", value, "wenddate");
            return (Criteria) this;
        }

        public Criteria andWenddateLessThanOrEqualTo(String value) {
            addCriterion("wenddate <=", value, "wenddate");
            return (Criteria) this;
        }

        public Criteria andWenddateLike(String value) {
            addCriterion("wenddate like", value, "wenddate");
            return (Criteria) this;
        }

        public Criteria andWenddateNotLike(String value) {
            addCriterion("wenddate not like", value, "wenddate");
            return (Criteria) this;
        }

        public Criteria andWenddateIn(List<String> values) {
            addCriterion("wenddate in", values, "wenddate");
            return (Criteria) this;
        }

        public Criteria andWenddateNotIn(List<String> values) {
            addCriterion("wenddate not in", values, "wenddate");
            return (Criteria) this;
        }

        public Criteria andWenddateBetween(String value1, String value2) {
            addCriterion("wenddate between", value1, value2, "wenddate");
            return (Criteria) this;
        }

        public Criteria andWenddateNotBetween(String value1, String value2) {
            addCriterion("wenddate not between", value1, value2, "wenddate");
            return (Criteria) this;
        }

        public Criteria andJobIsNull() {
            addCriterion("job is null");
            return (Criteria) this;
        }

        public Criteria andJobIsNotNull() {
            addCriterion("job is not null");
            return (Criteria) this;
        }

        public Criteria andJobEqualTo(String value) {
            addCriterion("job =", value, "job");
            return (Criteria) this;
        }

        public Criteria andJobNotEqualTo(String value) {
            addCriterion("job <>", value, "job");
            return (Criteria) this;
        }

        public Criteria andJobGreaterThan(String value) {
            addCriterion("job >", value, "job");
            return (Criteria) this;
        }

        public Criteria andJobGreaterThanOrEqualTo(String value) {
            addCriterion("job >=", value, "job");
            return (Criteria) this;
        }

        public Criteria andJobLessThan(String value) {
            addCriterion("job <", value, "job");
            return (Criteria) this;
        }

        public Criteria andJobLessThanOrEqualTo(String value) {
            addCriterion("job <=", value, "job");
            return (Criteria) this;
        }

        public Criteria andJobLike(String value) {
            addCriterion("job like", value, "job");
            return (Criteria) this;
        }

        public Criteria andJobNotLike(String value) {
            addCriterion("job not like", value, "job");
            return (Criteria) this;
        }

        public Criteria andJobIn(List<String> values) {
            addCriterion("job in", values, "job");
            return (Criteria) this;
        }

        public Criteria andJobNotIn(List<String> values) {
            addCriterion("job not in", values, "job");
            return (Criteria) this;
        }

        public Criteria andJobBetween(String value1, String value2) {
            addCriterion("job between", value1, value2, "job");
            return (Criteria) this;
        }

        public Criteria andJobNotBetween(String value1, String value2) {
            addCriterion("job not between", value1, value2, "job");
            return (Criteria) this;
        }

        public Criteria andPostIsNull() {
            addCriterion("post is null");
            return (Criteria) this;
        }

        public Criteria andPostIsNotNull() {
            addCriterion("post is not null");
            return (Criteria) this;
        }

        public Criteria andPostEqualTo(String value) {
            addCriterion("post =", value, "post");
            return (Criteria) this;
        }

        public Criteria andPostNotEqualTo(String value) {
            addCriterion("post <>", value, "post");
            return (Criteria) this;
        }

        public Criteria andPostGreaterThan(String value) {
            addCriterion("post >", value, "post");
            return (Criteria) this;
        }

        public Criteria andPostGreaterThanOrEqualTo(String value) {
            addCriterion("post >=", value, "post");
            return (Criteria) this;
        }

        public Criteria andPostLessThan(String value) {
            addCriterion("post <", value, "post");
            return (Criteria) this;
        }

        public Criteria andPostLessThanOrEqualTo(String value) {
            addCriterion("post <=", value, "post");
            return (Criteria) this;
        }

        public Criteria andPostLike(String value) {
            addCriterion("post like", value, "post");
            return (Criteria) this;
        }

        public Criteria andPostNotLike(String value) {
            addCriterion("post not like", value, "post");
            return (Criteria) this;
        }

        public Criteria andPostIn(List<String> values) {
            addCriterion("post in", values, "post");
            return (Criteria) this;
        }

        public Criteria andPostNotIn(List<String> values) {
            addCriterion("post not in", values, "post");
            return (Criteria) this;
        }

        public Criteria andPostBetween(String value1, String value2) {
            addCriterion("post between", value1, value2, "post");
            return (Criteria) this;
        }

        public Criteria andPostNotBetween(String value1, String value2) {
            addCriterion("post not between", value1, value2, "post");
            return (Criteria) this;
        }

        public Criteria andResignreasonIsNull() {
            addCriterion("resignreason is null");
            return (Criteria) this;
        }

        public Criteria andResignreasonIsNotNull() {
            addCriterion("resignreason is not null");
            return (Criteria) this;
        }

        public Criteria andResignreasonEqualTo(String value) {
            addCriterion("resignreason =", value, "resignreason");
            return (Criteria) this;
        }

        public Criteria andResignreasonNotEqualTo(String value) {
            addCriterion("resignreason <>", value, "resignreason");
            return (Criteria) this;
        }

        public Criteria andResignreasonGreaterThan(String value) {
            addCriterion("resignreason >", value, "resignreason");
            return (Criteria) this;
        }

        public Criteria andResignreasonGreaterThanOrEqualTo(String value) {
            addCriterion("resignreason >=", value, "resignreason");
            return (Criteria) this;
        }

        public Criteria andResignreasonLessThan(String value) {
            addCriterion("resignreason <", value, "resignreason");
            return (Criteria) this;
        }

        public Criteria andResignreasonLessThanOrEqualTo(String value) {
            addCriterion("resignreason <=", value, "resignreason");
            return (Criteria) this;
        }

        public Criteria andResignreasonLike(String value) {
            addCriterion("resignreason like", value, "resignreason");
            return (Criteria) this;
        }

        public Criteria andResignreasonNotLike(String value) {
            addCriterion("resignreason not like", value, "resignreason");
            return (Criteria) this;
        }

        public Criteria andResignreasonIn(List<String> values) {
            addCriterion("resignreason in", values, "resignreason");
            return (Criteria) this;
        }

        public Criteria andResignreasonNotIn(List<String> values) {
            addCriterion("resignreason not in", values, "resignreason");
            return (Criteria) this;
        }

        public Criteria andResignreasonBetween(String value1, String value2) {
            addCriterion("resignreason between", value1, value2, "resignreason");
            return (Criteria) this;
        }

        public Criteria andResignreasonNotBetween(String value1, String value2) {
            addCriterion("resignreason not between", value1, value2, "resignreason");
            return (Criteria) this;
        }

        public Criteria andZtelIsNull() {
            addCriterion("ztel is null");
            return (Criteria) this;
        }

        public Criteria andZtelIsNotNull() {
            addCriterion("ztel is not null");
            return (Criteria) this;
        }

        public Criteria andZtelEqualTo(String value) {
            addCriterion("ztel =", value, "ztel");
            return (Criteria) this;
        }

        public Criteria andZtelNotEqualTo(String value) {
            addCriterion("ztel <>", value, "ztel");
            return (Criteria) this;
        }

        public Criteria andZtelGreaterThan(String value) {
            addCriterion("ztel >", value, "ztel");
            return (Criteria) this;
        }

        public Criteria andZtelGreaterThanOrEqualTo(String value) {
            addCriterion("ztel >=", value, "ztel");
            return (Criteria) this;
        }

        public Criteria andZtelLessThan(String value) {
            addCriterion("ztel <", value, "ztel");
            return (Criteria) this;
        }

        public Criteria andZtelLessThanOrEqualTo(String value) {
            addCriterion("ztel <=", value, "ztel");
            return (Criteria) this;
        }

        public Criteria andZtelLike(String value) {
            addCriterion("ztel like", value, "ztel");
            return (Criteria) this;
        }

        public Criteria andZtelNotLike(String value) {
            addCriterion("ztel not like", value, "ztel");
            return (Criteria) this;
        }

        public Criteria andZtelIn(List<String> values) {
            addCriterion("ztel in", values, "ztel");
            return (Criteria) this;
        }

        public Criteria andZtelNotIn(List<String> values) {
            addCriterion("ztel not in", values, "ztel");
            return (Criteria) this;
        }

        public Criteria andZtelBetween(String value1, String value2) {
            addCriterion("ztel between", value1, value2, "ztel");
            return (Criteria) this;
        }

        public Criteria andZtelNotBetween(String value1, String value2) {
            addCriterion("ztel not between", value1, value2, "ztel");
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