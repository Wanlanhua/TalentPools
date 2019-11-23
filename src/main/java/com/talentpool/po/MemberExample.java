package com.talentpool.po;

import java.util.ArrayList;
import java.util.List;

public class MemberExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MemberExample() {
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

        public Criteria andMusernameIsNull() {
            addCriterion("musername is null");
            return (Criteria) this;
        }

        public Criteria andMusernameIsNotNull() {
            addCriterion("musername is not null");
            return (Criteria) this;
        }

        public Criteria andMusernameEqualTo(String value) {
            addCriterion("musername =", value, "musername");
            return (Criteria) this;
        }

        public Criteria andMusernameNotEqualTo(String value) {
            addCriterion("musername <>", value, "musername");
            return (Criteria) this;
        }

        public Criteria andMusernameGreaterThan(String value) {
            addCriterion("musername >", value, "musername");
            return (Criteria) this;
        }

        public Criteria andMusernameGreaterThanOrEqualTo(String value) {
            addCriterion("musername >=", value, "musername");
            return (Criteria) this;
        }

        public Criteria andMusernameLessThan(String value) {
            addCriterion("musername <", value, "musername");
            return (Criteria) this;
        }

        public Criteria andMusernameLessThanOrEqualTo(String value) {
            addCriterion("musername <=", value, "musername");
            return (Criteria) this;
        }

        public Criteria andMusernameLike(String value) {
            addCriterion("musername like", value, "musername");
            return (Criteria) this;
        }

        public Criteria andMusernameNotLike(String value) {
            addCriterion("musername not like", value, "musername");
            return (Criteria) this;
        }

        public Criteria andMusernameIn(List<String> values) {
            addCriterion("musername in", values, "musername");
            return (Criteria) this;
        }

        public Criteria andMusernameNotIn(List<String> values) {
            addCriterion("musername not in", values, "musername");
            return (Criteria) this;
        }

        public Criteria andMusernameBetween(String value1, String value2) {
            addCriterion("musername between", value1, value2, "musername");
            return (Criteria) this;
        }

        public Criteria andMusernameNotBetween(String value1, String value2) {
            addCriterion("musername not between", value1, value2, "musername");
            return (Criteria) this;
        }

        public Criteria andMlinkIsNull() {
            addCriterion("mlink is null");
            return (Criteria) this;
        }

        public Criteria andMlinkIsNotNull() {
            addCriterion("mlink is not null");
            return (Criteria) this;
        }

        public Criteria andMlinkEqualTo(String value) {
            addCriterion("mlink =", value, "mlink");
            return (Criteria) this;
        }

        public Criteria andMlinkNotEqualTo(String value) {
            addCriterion("mlink <>", value, "mlink");
            return (Criteria) this;
        }

        public Criteria andMlinkGreaterThan(String value) {
            addCriterion("mlink >", value, "mlink");
            return (Criteria) this;
        }

        public Criteria andMlinkGreaterThanOrEqualTo(String value) {
            addCriterion("mlink >=", value, "mlink");
            return (Criteria) this;
        }

        public Criteria andMlinkLessThan(String value) {
            addCriterion("mlink <", value, "mlink");
            return (Criteria) this;
        }

        public Criteria andMlinkLessThanOrEqualTo(String value) {
            addCriterion("mlink <=", value, "mlink");
            return (Criteria) this;
        }

        public Criteria andMlinkLike(String value) {
            addCriterion("mlink like", value, "mlink");
            return (Criteria) this;
        }

        public Criteria andMlinkNotLike(String value) {
            addCriterion("mlink not like", value, "mlink");
            return (Criteria) this;
        }

        public Criteria andMlinkIn(List<String> values) {
            addCriterion("mlink in", values, "mlink");
            return (Criteria) this;
        }

        public Criteria andMlinkNotIn(List<String> values) {
            addCriterion("mlink not in", values, "mlink");
            return (Criteria) this;
        }

        public Criteria andMlinkBetween(String value1, String value2) {
            addCriterion("mlink between", value1, value2, "mlink");
            return (Criteria) this;
        }

        public Criteria andMlinkNotBetween(String value1, String value2) {
            addCriterion("mlink not between", value1, value2, "mlink");
            return (Criteria) this;
        }

        public Criteria andMnameIsNull() {
            addCriterion("mname is null");
            return (Criteria) this;
        }

        public Criteria andMnameIsNotNull() {
            addCriterion("mname is not null");
            return (Criteria) this;
        }

        public Criteria andMnameEqualTo(String value) {
            addCriterion("mname =", value, "mname");
            return (Criteria) this;
        }

        public Criteria andMnameNotEqualTo(String value) {
            addCriterion("mname <>", value, "mname");
            return (Criteria) this;
        }

        public Criteria andMnameGreaterThan(String value) {
            addCriterion("mname >", value, "mname");
            return (Criteria) this;
        }

        public Criteria andMnameGreaterThanOrEqualTo(String value) {
            addCriterion("mname >=", value, "mname");
            return (Criteria) this;
        }

        public Criteria andMnameLessThan(String value) {
            addCriterion("mname <", value, "mname");
            return (Criteria) this;
        }

        public Criteria andMnameLessThanOrEqualTo(String value) {
            addCriterion("mname <=", value, "mname");
            return (Criteria) this;
        }

        public Criteria andMnameLike(String value) {
            addCriterion("mname like", value, "mname");
            return (Criteria) this;
        }

        public Criteria andMnameNotLike(String value) {
            addCriterion("mname not like", value, "mname");
            return (Criteria) this;
        }

        public Criteria andMnameIn(List<String> values) {
            addCriterion("mname in", values, "mname");
            return (Criteria) this;
        }

        public Criteria andMnameNotIn(List<String> values) {
            addCriterion("mname not in", values, "mname");
            return (Criteria) this;
        }

        public Criteria andMnameBetween(String value1, String value2) {
            addCriterion("mname between", value1, value2, "mname");
            return (Criteria) this;
        }

        public Criteria andMnameNotBetween(String value1, String value2) {
            addCriterion("mname not between", value1, value2, "mname");
            return (Criteria) this;
        }

        public Criteria andMworkplaceIsNull() {
            addCriterion("mworkplace is null");
            return (Criteria) this;
        }

        public Criteria andMworkplaceIsNotNull() {
            addCriterion("mworkplace is not null");
            return (Criteria) this;
        }

        public Criteria andMworkplaceEqualTo(String value) {
            addCriterion("mworkplace =", value, "mworkplace");
            return (Criteria) this;
        }

        public Criteria andMworkplaceNotEqualTo(String value) {
            addCriterion("mworkplace <>", value, "mworkplace");
            return (Criteria) this;
        }

        public Criteria andMworkplaceGreaterThan(String value) {
            addCriterion("mworkplace >", value, "mworkplace");
            return (Criteria) this;
        }

        public Criteria andMworkplaceGreaterThanOrEqualTo(String value) {
            addCriterion("mworkplace >=", value, "mworkplace");
            return (Criteria) this;
        }

        public Criteria andMworkplaceLessThan(String value) {
            addCriterion("mworkplace <", value, "mworkplace");
            return (Criteria) this;
        }

        public Criteria andMworkplaceLessThanOrEqualTo(String value) {
            addCriterion("mworkplace <=", value, "mworkplace");
            return (Criteria) this;
        }

        public Criteria andMworkplaceLike(String value) {
            addCriterion("mworkplace like", value, "mworkplace");
            return (Criteria) this;
        }

        public Criteria andMworkplaceNotLike(String value) {
            addCriterion("mworkplace not like", value, "mworkplace");
            return (Criteria) this;
        }

        public Criteria andMworkplaceIn(List<String> values) {
            addCriterion("mworkplace in", values, "mworkplace");
            return (Criteria) this;
        }

        public Criteria andMworkplaceNotIn(List<String> values) {
            addCriterion("mworkplace not in", values, "mworkplace");
            return (Criteria) this;
        }

        public Criteria andMworkplaceBetween(String value1, String value2) {
            addCriterion("mworkplace between", value1, value2, "mworkplace");
            return (Criteria) this;
        }

        public Criteria andMworkplaceNotBetween(String value1, String value2) {
            addCriterion("mworkplace not between", value1, value2, "mworkplace");
            return (Criteria) this;
        }

        public Criteria andMtelIsNull() {
            addCriterion("mtel is null");
            return (Criteria) this;
        }

        public Criteria andMtelIsNotNull() {
            addCriterion("mtel is not null");
            return (Criteria) this;
        }

        public Criteria andMtelEqualTo(String value) {
            addCriterion("mtel =", value, "mtel");
            return (Criteria) this;
        }

        public Criteria andMtelNotEqualTo(String value) {
            addCriterion("mtel <>", value, "mtel");
            return (Criteria) this;
        }

        public Criteria andMtelGreaterThan(String value) {
            addCriterion("mtel >", value, "mtel");
            return (Criteria) this;
        }

        public Criteria andMtelGreaterThanOrEqualTo(String value) {
            addCriterion("mtel >=", value, "mtel");
            return (Criteria) this;
        }

        public Criteria andMtelLessThan(String value) {
            addCriterion("mtel <", value, "mtel");
            return (Criteria) this;
        }

        public Criteria andMtelLessThanOrEqualTo(String value) {
            addCriterion("mtel <=", value, "mtel");
            return (Criteria) this;
        }

        public Criteria andMtelLike(String value) {
            addCriterion("mtel like", value, "mtel");
            return (Criteria) this;
        }

        public Criteria andMtelNotLike(String value) {
            addCriterion("mtel not like", value, "mtel");
            return (Criteria) this;
        }

        public Criteria andMtelIn(List<String> values) {
            addCriterion("mtel in", values, "mtel");
            return (Criteria) this;
        }

        public Criteria andMtelNotIn(List<String> values) {
            addCriterion("mtel not in", values, "mtel");
            return (Criteria) this;
        }

        public Criteria andMtelBetween(String value1, String value2) {
            addCriterion("mtel between", value1, value2, "mtel");
            return (Criteria) this;
        }

        public Criteria andMtelNotBetween(String value1, String value2) {
            addCriterion("mtel not between", value1, value2, "mtel");
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