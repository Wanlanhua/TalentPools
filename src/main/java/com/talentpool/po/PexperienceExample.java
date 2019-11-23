package com.talentpool.po;

import java.util.ArrayList;
import java.util.List;

public class PexperienceExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PexperienceExample() {
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

        public Criteria andPusernameIsNull() {
            addCriterion("pusername is null");
            return (Criteria) this;
        }

        public Criteria andPusernameIsNotNull() {
            addCriterion("pusername is not null");
            return (Criteria) this;
        }

        public Criteria andPusernameEqualTo(String value) {
            addCriterion("pusername =", value, "pusername");
            return (Criteria) this;
        }

        public Criteria andPusernameNotEqualTo(String value) {
            addCriterion("pusername <>", value, "pusername");
            return (Criteria) this;
        }

        public Criteria andPusernameGreaterThan(String value) {
            addCriterion("pusername >", value, "pusername");
            return (Criteria) this;
        }

        public Criteria andPusernameGreaterThanOrEqualTo(String value) {
            addCriterion("pusername >=", value, "pusername");
            return (Criteria) this;
        }

        public Criteria andPusernameLessThan(String value) {
            addCriterion("pusername <", value, "pusername");
            return (Criteria) this;
        }

        public Criteria andPusernameLessThanOrEqualTo(String value) {
            addCriterion("pusername <=", value, "pusername");
            return (Criteria) this;
        }

        public Criteria andPusernameLike(String value) {
            addCriterion("pusername like", value, "pusername");
            return (Criteria) this;
        }

        public Criteria andPusernameNotLike(String value) {
            addCriterion("pusername not like", value, "pusername");
            return (Criteria) this;
        }

        public Criteria andPusernameIn(List<String> values) {
            addCriterion("pusername in", values, "pusername");
            return (Criteria) this;
        }

        public Criteria andPusernameNotIn(List<String> values) {
            addCriterion("pusername not in", values, "pusername");
            return (Criteria) this;
        }

        public Criteria andPusernameBetween(String value1, String value2) {
            addCriterion("pusername between", value1, value2, "pusername");
            return (Criteria) this;
        }

        public Criteria andPusernameNotBetween(String value1, String value2) {
            addCriterion("pusername not between", value1, value2, "pusername");
            return (Criteria) this;
        }

        public Criteria andPtimeIsNull() {
            addCriterion("ptime is null");
            return (Criteria) this;
        }

        public Criteria andPtimeIsNotNull() {
            addCriterion("ptime is not null");
            return (Criteria) this;
        }

        public Criteria andPtimeEqualTo(String value) {
            addCriterion("ptime =", value, "ptime");
            return (Criteria) this;
        }

        public Criteria andPtimeNotEqualTo(String value) {
            addCriterion("ptime <>", value, "ptime");
            return (Criteria) this;
        }

        public Criteria andPtimeGreaterThan(String value) {
            addCriterion("ptime >", value, "ptime");
            return (Criteria) this;
        }

        public Criteria andPtimeGreaterThanOrEqualTo(String value) {
            addCriterion("ptime >=", value, "ptime");
            return (Criteria) this;
        }

        public Criteria andPtimeLessThan(String value) {
            addCriterion("ptime <", value, "ptime");
            return (Criteria) this;
        }

        public Criteria andPtimeLessThanOrEqualTo(String value) {
            addCriterion("ptime <=", value, "ptime");
            return (Criteria) this;
        }

        public Criteria andPtimeLike(String value) {
            addCriterion("ptime like", value, "ptime");
            return (Criteria) this;
        }

        public Criteria andPtimeNotLike(String value) {
            addCriterion("ptime not like", value, "ptime");
            return (Criteria) this;
        }

        public Criteria andPtimeIn(List<String> values) {
            addCriterion("ptime in", values, "ptime");
            return (Criteria) this;
        }

        public Criteria andPtimeNotIn(List<String> values) {
            addCriterion("ptime not in", values, "ptime");
            return (Criteria) this;
        }

        public Criteria andPtimeBetween(String value1, String value2) {
            addCriterion("ptime between", value1, value2, "ptime");
            return (Criteria) this;
        }

        public Criteria andPtimeNotBetween(String value1, String value2) {
            addCriterion("ptime not between", value1, value2, "ptime");
            return (Criteria) this;
        }

        public Criteria andPplaceIsNull() {
            addCriterion("pplace is null");
            return (Criteria) this;
        }

        public Criteria andPplaceIsNotNull() {
            addCriterion("pplace is not null");
            return (Criteria) this;
        }

        public Criteria andPplaceEqualTo(String value) {
            addCriterion("pplace =", value, "pplace");
            return (Criteria) this;
        }

        public Criteria andPplaceNotEqualTo(String value) {
            addCriterion("pplace <>", value, "pplace");
            return (Criteria) this;
        }

        public Criteria andPplaceGreaterThan(String value) {
            addCriterion("pplace >", value, "pplace");
            return (Criteria) this;
        }

        public Criteria andPplaceGreaterThanOrEqualTo(String value) {
            addCriterion("pplace >=", value, "pplace");
            return (Criteria) this;
        }

        public Criteria andPplaceLessThan(String value) {
            addCriterion("pplace <", value, "pplace");
            return (Criteria) this;
        }

        public Criteria andPplaceLessThanOrEqualTo(String value) {
            addCriterion("pplace <=", value, "pplace");
            return (Criteria) this;
        }

        public Criteria andPplaceLike(String value) {
            addCriterion("pplace like", value, "pplace");
            return (Criteria) this;
        }

        public Criteria andPplaceNotLike(String value) {
            addCriterion("pplace not like", value, "pplace");
            return (Criteria) this;
        }

        public Criteria andPplaceIn(List<String> values) {
            addCriterion("pplace in", values, "pplace");
            return (Criteria) this;
        }

        public Criteria andPplaceNotIn(List<String> values) {
            addCriterion("pplace not in", values, "pplace");
            return (Criteria) this;
        }

        public Criteria andPplaceBetween(String value1, String value2) {
            addCriterion("pplace between", value1, value2, "pplace");
            return (Criteria) this;
        }

        public Criteria andPplaceNotBetween(String value1, String value2) {
            addCriterion("pplace not between", value1, value2, "pplace");
            return (Criteria) this;
        }

        public Criteria andPcontentIsNull() {
            addCriterion("pcontent is null");
            return (Criteria) this;
        }

        public Criteria andPcontentIsNotNull() {
            addCriterion("pcontent is not null");
            return (Criteria) this;
        }

        public Criteria andPcontentEqualTo(String value) {
            addCriterion("pcontent =", value, "pcontent");
            return (Criteria) this;
        }

        public Criteria andPcontentNotEqualTo(String value) {
            addCriterion("pcontent <>", value, "pcontent");
            return (Criteria) this;
        }

        public Criteria andPcontentGreaterThan(String value) {
            addCriterion("pcontent >", value, "pcontent");
            return (Criteria) this;
        }

        public Criteria andPcontentGreaterThanOrEqualTo(String value) {
            addCriterion("pcontent >=", value, "pcontent");
            return (Criteria) this;
        }

        public Criteria andPcontentLessThan(String value) {
            addCriterion("pcontent <", value, "pcontent");
            return (Criteria) this;
        }

        public Criteria andPcontentLessThanOrEqualTo(String value) {
            addCriterion("pcontent <=", value, "pcontent");
            return (Criteria) this;
        }

        public Criteria andPcontentLike(String value) {
            addCriterion("pcontent like", value, "pcontent");
            return (Criteria) this;
        }

        public Criteria andPcontentNotLike(String value) {
            addCriterion("pcontent not like", value, "pcontent");
            return (Criteria) this;
        }

        public Criteria andPcontentIn(List<String> values) {
            addCriterion("pcontent in", values, "pcontent");
            return (Criteria) this;
        }

        public Criteria andPcontentNotIn(List<String> values) {
            addCriterion("pcontent not in", values, "pcontent");
            return (Criteria) this;
        }

        public Criteria andPcontentBetween(String value1, String value2) {
            addCriterion("pcontent between", value1, value2, "pcontent");
            return (Criteria) this;
        }

        public Criteria andPcontentNotBetween(String value1, String value2) {
            addCriterion("pcontent not between", value1, value2, "pcontent");
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