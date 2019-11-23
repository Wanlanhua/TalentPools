package com.talentpool.po;

import java.util.ArrayList;
import java.util.List;

public class QualificationExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public QualificationExample() {
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

        public Criteria andQusernameIsNull() {
            addCriterion("qusername is null");
            return (Criteria) this;
        }

        public Criteria andQusernameIsNotNull() {
            addCriterion("qusername is not null");
            return (Criteria) this;
        }

        public Criteria andQusernameEqualTo(String value) {
            addCriterion("qusername =", value, "qusername");
            return (Criteria) this;
        }

        public Criteria andQusernameNotEqualTo(String value) {
            addCriterion("qusername <>", value, "qusername");
            return (Criteria) this;
        }

        public Criteria andQusernameGreaterThan(String value) {
            addCriterion("qusername >", value, "qusername");
            return (Criteria) this;
        }

        public Criteria andQusernameGreaterThanOrEqualTo(String value) {
            addCriterion("qusername >=", value, "qusername");
            return (Criteria) this;
        }

        public Criteria andQusernameLessThan(String value) {
            addCriterion("qusername <", value, "qusername");
            return (Criteria) this;
        }

        public Criteria andQusernameLessThanOrEqualTo(String value) {
            addCriterion("qusername <=", value, "qusername");
            return (Criteria) this;
        }

        public Criteria andQusernameLike(String value) {
            addCriterion("qusername like", value, "qusername");
            return (Criteria) this;
        }

        public Criteria andQusernameNotLike(String value) {
            addCriterion("qusername not like", value, "qusername");
            return (Criteria) this;
        }

        public Criteria andQusernameIn(List<String> values) {
            addCriterion("qusername in", values, "qusername");
            return (Criteria) this;
        }

        public Criteria andQusernameNotIn(List<String> values) {
            addCriterion("qusername not in", values, "qusername");
            return (Criteria) this;
        }

        public Criteria andQusernameBetween(String value1, String value2) {
            addCriterion("qusername between", value1, value2, "qusername");
            return (Criteria) this;
        }

        public Criteria andQusernameNotBetween(String value1, String value2) {
            addCriterion("qusername not between", value1, value2, "qusername");
            return (Criteria) this;
        }

        public Criteria andQnameIsNull() {
            addCriterion("qname is null");
            return (Criteria) this;
        }

        public Criteria andQnameIsNotNull() {
            addCriterion("qname is not null");
            return (Criteria) this;
        }

        public Criteria andQnameEqualTo(String value) {
            addCriterion("qname =", value, "qname");
            return (Criteria) this;
        }

        public Criteria andQnameNotEqualTo(String value) {
            addCriterion("qname <>", value, "qname");
            return (Criteria) this;
        }

        public Criteria andQnameGreaterThan(String value) {
            addCriterion("qname >", value, "qname");
            return (Criteria) this;
        }

        public Criteria andQnameGreaterThanOrEqualTo(String value) {
            addCriterion("qname >=", value, "qname");
            return (Criteria) this;
        }

        public Criteria andQnameLessThan(String value) {
            addCriterion("qname <", value, "qname");
            return (Criteria) this;
        }

        public Criteria andQnameLessThanOrEqualTo(String value) {
            addCriterion("qname <=", value, "qname");
            return (Criteria) this;
        }

        public Criteria andQnameLike(String value) {
            addCriterion("qname like", value, "qname");
            return (Criteria) this;
        }

        public Criteria andQnameNotLike(String value) {
            addCriterion("qname not like", value, "qname");
            return (Criteria) this;
        }

        public Criteria andQnameIn(List<String> values) {
            addCriterion("qname in", values, "qname");
            return (Criteria) this;
        }

        public Criteria andQnameNotIn(List<String> values) {
            addCriterion("qname not in", values, "qname");
            return (Criteria) this;
        }

        public Criteria andQnameBetween(String value1, String value2) {
            addCriterion("qname between", value1, value2, "qname");
            return (Criteria) this;
        }

        public Criteria andQnameNotBetween(String value1, String value2) {
            addCriterion("qname not between", value1, value2, "qname");
            return (Criteria) this;
        }

        public Criteria andQplaceIsNull() {
            addCriterion("qplace is null");
            return (Criteria) this;
        }

        public Criteria andQplaceIsNotNull() {
            addCriterion("qplace is not null");
            return (Criteria) this;
        }

        public Criteria andQplaceEqualTo(String value) {
            addCriterion("qplace =", value, "qplace");
            return (Criteria) this;
        }

        public Criteria andQplaceNotEqualTo(String value) {
            addCriterion("qplace <>", value, "qplace");
            return (Criteria) this;
        }

        public Criteria andQplaceGreaterThan(String value) {
            addCriterion("qplace >", value, "qplace");
            return (Criteria) this;
        }

        public Criteria andQplaceGreaterThanOrEqualTo(String value) {
            addCriterion("qplace >=", value, "qplace");
            return (Criteria) this;
        }

        public Criteria andQplaceLessThan(String value) {
            addCriterion("qplace <", value, "qplace");
            return (Criteria) this;
        }

        public Criteria andQplaceLessThanOrEqualTo(String value) {
            addCriterion("qplace <=", value, "qplace");
            return (Criteria) this;
        }

        public Criteria andQplaceLike(String value) {
            addCriterion("qplace like", value, "qplace");
            return (Criteria) this;
        }

        public Criteria andQplaceNotLike(String value) {
            addCriterion("qplace not like", value, "qplace");
            return (Criteria) this;
        }

        public Criteria andQplaceIn(List<String> values) {
            addCriterion("qplace in", values, "qplace");
            return (Criteria) this;
        }

        public Criteria andQplaceNotIn(List<String> values) {
            addCriterion("qplace not in", values, "qplace");
            return (Criteria) this;
        }

        public Criteria andQplaceBetween(String value1, String value2) {
            addCriterion("qplace between", value1, value2, "qplace");
            return (Criteria) this;
        }

        public Criteria andQplaceNotBetween(String value1, String value2) {
            addCriterion("qplace not between", value1, value2, "qplace");
            return (Criteria) this;
        }

        public Criteria andQtimeIsNull() {
            addCriterion("qtime is null");
            return (Criteria) this;
        }

        public Criteria andQtimeIsNotNull() {
            addCriterion("qtime is not null");
            return (Criteria) this;
        }

        public Criteria andQtimeEqualTo(String value) {
            addCriterion("qtime =", value, "qtime");
            return (Criteria) this;
        }

        public Criteria andQtimeNotEqualTo(String value) {
            addCriterion("qtime <>", value, "qtime");
            return (Criteria) this;
        }

        public Criteria andQtimeGreaterThan(String value) {
            addCriterion("qtime >", value, "qtime");
            return (Criteria) this;
        }

        public Criteria andQtimeGreaterThanOrEqualTo(String value) {
            addCriterion("qtime >=", value, "qtime");
            return (Criteria) this;
        }

        public Criteria andQtimeLessThan(String value) {
            addCriterion("qtime <", value, "qtime");
            return (Criteria) this;
        }

        public Criteria andQtimeLessThanOrEqualTo(String value) {
            addCriterion("qtime <=", value, "qtime");
            return (Criteria) this;
        }

        public Criteria andQtimeLike(String value) {
            addCriterion("qtime like", value, "qtime");
            return (Criteria) this;
        }

        public Criteria andQtimeNotLike(String value) {
            addCriterion("qtime not like", value, "qtime");
            return (Criteria) this;
        }

        public Criteria andQtimeIn(List<String> values) {
            addCriterion("qtime in", values, "qtime");
            return (Criteria) this;
        }

        public Criteria andQtimeNotIn(List<String> values) {
            addCriterion("qtime not in", values, "qtime");
            return (Criteria) this;
        }

        public Criteria andQtimeBetween(String value1, String value2) {
            addCriterion("qtime between", value1, value2, "qtime");
            return (Criteria) this;
        }

        public Criteria andQtimeNotBetween(String value1, String value2) {
            addCriterion("qtime not between", value1, value2, "qtime");
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