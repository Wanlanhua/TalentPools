package com.talentpool.po;

import java.util.ArrayList;
import java.util.List;

public class EducationbackgroundExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public EducationbackgroundExample() {
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

        public Criteria andEusernameIsNull() {
            addCriterion("eusername is null");
            return (Criteria) this;
        }

        public Criteria andEusernameIsNotNull() {
            addCriterion("eusername is not null");
            return (Criteria) this;
        }

        public Criteria andEusernameEqualTo(String value) {
            addCriterion("eusername =", value, "eusername");
            return (Criteria) this;
        }

        public Criteria andEusernameNotEqualTo(String value) {
            addCriterion("eusername <>", value, "eusername");
            return (Criteria) this;
        }

        public Criteria andEusernameGreaterThan(String value) {
            addCriterion("eusername >", value, "eusername");
            return (Criteria) this;
        }

        public Criteria andEusernameGreaterThanOrEqualTo(String value) {
            addCriterion("eusername >=", value, "eusername");
            return (Criteria) this;
        }

        public Criteria andEusernameLessThan(String value) {
            addCriterion("eusername <", value, "eusername");
            return (Criteria) this;
        }

        public Criteria andEusernameLessThanOrEqualTo(String value) {
            addCriterion("eusername <=", value, "eusername");
            return (Criteria) this;
        }

        public Criteria andEusernameLike(String value) {
            addCriterion("eusername like", value, "eusername");
            return (Criteria) this;
        }

        public Criteria andEusernameNotLike(String value) {
            addCriterion("eusername not like", value, "eusername");
            return (Criteria) this;
        }

        public Criteria andEusernameIn(List<String> values) {
            addCriterion("eusername in", values, "eusername");
            return (Criteria) this;
        }

        public Criteria andEusernameNotIn(List<String> values) {
            addCriterion("eusername not in", values, "eusername");
            return (Criteria) this;
        }

        public Criteria andEusernameBetween(String value1, String value2) {
            addCriterion("eusername between", value1, value2, "eusername");
            return (Criteria) this;
        }

        public Criteria andEusernameNotBetween(String value1, String value2) {
            addCriterion("eusername not between", value1, value2, "eusername");
            return (Criteria) this;
        }

        public Criteria andEstartdateIsNull() {
            addCriterion("estartdate is null");
            return (Criteria) this;
        }

        public Criteria andEstartdateIsNotNull() {
            addCriterion("estartdate is not null");
            return (Criteria) this;
        }

        public Criteria andEstartdateEqualTo(String value) {
            addCriterion("estartdate =", value, "estartdate");
            return (Criteria) this;
        }

        public Criteria andEstartdateNotEqualTo(String value) {
            addCriterion("estartdate <>", value, "estartdate");
            return (Criteria) this;
        }

        public Criteria andEstartdateGreaterThan(String value) {
            addCriterion("estartdate >", value, "estartdate");
            return (Criteria) this;
        }

        public Criteria andEstartdateGreaterThanOrEqualTo(String value) {
            addCriterion("estartdate >=", value, "estartdate");
            return (Criteria) this;
        }

        public Criteria andEstartdateLessThan(String value) {
            addCriterion("estartdate <", value, "estartdate");
            return (Criteria) this;
        }

        public Criteria andEstartdateLessThanOrEqualTo(String value) {
            addCriterion("estartdate <=", value, "estartdate");
            return (Criteria) this;
        }

        public Criteria andEstartdateLike(String value) {
            addCriterion("estartdate like", value, "estartdate");
            return (Criteria) this;
        }

        public Criteria andEstartdateNotLike(String value) {
            addCriterion("estartdate not like", value, "estartdate");
            return (Criteria) this;
        }

        public Criteria andEstartdateIn(List<String> values) {
            addCriterion("estartdate in", values, "estartdate");
            return (Criteria) this;
        }

        public Criteria andEstartdateNotIn(List<String> values) {
            addCriterion("estartdate not in", values, "estartdate");
            return (Criteria) this;
        }

        public Criteria andEstartdateBetween(String value1, String value2) {
            addCriterion("estartdate between", value1, value2, "estartdate");
            return (Criteria) this;
        }

        public Criteria andEstartdateNotBetween(String value1, String value2) {
            addCriterion("estartdate not between", value1, value2, "estartdate");
            return (Criteria) this;
        }

        public Criteria andEenddateIsNull() {
            addCriterion("eenddate is null");
            return (Criteria) this;
        }

        public Criteria andEenddateIsNotNull() {
            addCriterion("eenddate is not null");
            return (Criteria) this;
        }

        public Criteria andEenddateEqualTo(String value) {
            addCriterion("eenddate =", value, "eenddate");
            return (Criteria) this;
        }

        public Criteria andEenddateNotEqualTo(String value) {
            addCriterion("eenddate <>", value, "eenddate");
            return (Criteria) this;
        }

        public Criteria andEenddateGreaterThan(String value) {
            addCriterion("eenddate >", value, "eenddate");
            return (Criteria) this;
        }

        public Criteria andEenddateGreaterThanOrEqualTo(String value) {
            addCriterion("eenddate >=", value, "eenddate");
            return (Criteria) this;
        }

        public Criteria andEenddateLessThan(String value) {
            addCriterion("eenddate <", value, "eenddate");
            return (Criteria) this;
        }

        public Criteria andEenddateLessThanOrEqualTo(String value) {
            addCriterion("eenddate <=", value, "eenddate");
            return (Criteria) this;
        }

        public Criteria andEenddateLike(String value) {
            addCriterion("eenddate like", value, "eenddate");
            return (Criteria) this;
        }

        public Criteria andEenddateNotLike(String value) {
            addCriterion("eenddate not like", value, "eenddate");
            return (Criteria) this;
        }

        public Criteria andEenddateIn(List<String> values) {
            addCriterion("eenddate in", values, "eenddate");
            return (Criteria) this;
        }

        public Criteria andEenddateNotIn(List<String> values) {
            addCriterion("eenddate not in", values, "eenddate");
            return (Criteria) this;
        }

        public Criteria andEenddateBetween(String value1, String value2) {
            addCriterion("eenddate between", value1, value2, "eenddate");
            return (Criteria) this;
        }

        public Criteria andEenddateNotBetween(String value1, String value2) {
            addCriterion("eenddate not between", value1, value2, "eenddate");
            return (Criteria) this;
        }

        public Criteria andSchoolnameIsNull() {
            addCriterion("schoolname is null");
            return (Criteria) this;
        }

        public Criteria andSchoolnameIsNotNull() {
            addCriterion("schoolname is not null");
            return (Criteria) this;
        }

        public Criteria andSchoolnameEqualTo(String value) {
            addCriterion("schoolname =", value, "schoolname");
            return (Criteria) this;
        }

        public Criteria andSchoolnameNotEqualTo(String value) {
            addCriterion("schoolname <>", value, "schoolname");
            return (Criteria) this;
        }

        public Criteria andSchoolnameGreaterThan(String value) {
            addCriterion("schoolname >", value, "schoolname");
            return (Criteria) this;
        }

        public Criteria andSchoolnameGreaterThanOrEqualTo(String value) {
            addCriterion("schoolname >=", value, "schoolname");
            return (Criteria) this;
        }

        public Criteria andSchoolnameLessThan(String value) {
            addCriterion("schoolname <", value, "schoolname");
            return (Criteria) this;
        }

        public Criteria andSchoolnameLessThanOrEqualTo(String value) {
            addCriterion("schoolname <=", value, "schoolname");
            return (Criteria) this;
        }

        public Criteria andSchoolnameLike(String value) {
            addCriterion("schoolname like", value, "schoolname");
            return (Criteria) this;
        }

        public Criteria andSchoolnameNotLike(String value) {
            addCriterion("schoolname not like", value, "schoolname");
            return (Criteria) this;
        }

        public Criteria andSchoolnameIn(List<String> values) {
            addCriterion("schoolname in", values, "schoolname");
            return (Criteria) this;
        }

        public Criteria andSchoolnameNotIn(List<String> values) {
            addCriterion("schoolname not in", values, "schoolname");
            return (Criteria) this;
        }

        public Criteria andSchoolnameBetween(String value1, String value2) {
            addCriterion("schoolname between", value1, value2, "schoolname");
            return (Criteria) this;
        }

        public Criteria andSchoolnameNotBetween(String value1, String value2) {
            addCriterion("schoolname not between", value1, value2, "schoolname");
            return (Criteria) this;
        }

        public Criteria andDegreeIsNull() {
            addCriterion("degree is null");
            return (Criteria) this;
        }

        public Criteria andDegreeIsNotNull() {
            addCriterion("degree is not null");
            return (Criteria) this;
        }

        public Criteria andDegreeEqualTo(String value) {
            addCriterion("degree =", value, "degree");
            return (Criteria) this;
        }

        public Criteria andDegreeNotEqualTo(String value) {
            addCriterion("degree <>", value, "degree");
            return (Criteria) this;
        }

        public Criteria andDegreeGreaterThan(String value) {
            addCriterion("degree >", value, "degree");
            return (Criteria) this;
        }

        public Criteria andDegreeGreaterThanOrEqualTo(String value) {
            addCriterion("degree >=", value, "degree");
            return (Criteria) this;
        }

        public Criteria andDegreeLessThan(String value) {
            addCriterion("degree <", value, "degree");
            return (Criteria) this;
        }

        public Criteria andDegreeLessThanOrEqualTo(String value) {
            addCriterion("degree <=", value, "degree");
            return (Criteria) this;
        }

        public Criteria andDegreeLike(String value) {
            addCriterion("degree like", value, "degree");
            return (Criteria) this;
        }

        public Criteria andDegreeNotLike(String value) {
            addCriterion("degree not like", value, "degree");
            return (Criteria) this;
        }

        public Criteria andDegreeIn(List<String> values) {
            addCriterion("degree in", values, "degree");
            return (Criteria) this;
        }

        public Criteria andDegreeNotIn(List<String> values) {
            addCriterion("degree not in", values, "degree");
            return (Criteria) this;
        }

        public Criteria andDegreeBetween(String value1, String value2) {
            addCriterion("degree between", value1, value2, "degree");
            return (Criteria) this;
        }

        public Criteria andDegreeNotBetween(String value1, String value2) {
            addCriterion("degree not between", value1, value2, "degree");
            return (Criteria) this;
        }

        public Criteria andSchoollocationIsNull() {
            addCriterion("schoollocation is null");
            return (Criteria) this;
        }

        public Criteria andSchoollocationIsNotNull() {
            addCriterion("schoollocation is not null");
            return (Criteria) this;
        }

        public Criteria andSchoollocationEqualTo(String value) {
            addCriterion("schoollocation =", value, "schoollocation");
            return (Criteria) this;
        }

        public Criteria andSchoollocationNotEqualTo(String value) {
            addCriterion("schoollocation <>", value, "schoollocation");
            return (Criteria) this;
        }

        public Criteria andSchoollocationGreaterThan(String value) {
            addCriterion("schoollocation >", value, "schoollocation");
            return (Criteria) this;
        }

        public Criteria andSchoollocationGreaterThanOrEqualTo(String value) {
            addCriterion("schoollocation >=", value, "schoollocation");
            return (Criteria) this;
        }

        public Criteria andSchoollocationLessThan(String value) {
            addCriterion("schoollocation <", value, "schoollocation");
            return (Criteria) this;
        }

        public Criteria andSchoollocationLessThanOrEqualTo(String value) {
            addCriterion("schoollocation <=", value, "schoollocation");
            return (Criteria) this;
        }

        public Criteria andSchoollocationLike(String value) {
            addCriterion("schoollocation like", value, "schoollocation");
            return (Criteria) this;
        }

        public Criteria andSchoollocationNotLike(String value) {
            addCriterion("schoollocation not like", value, "schoollocation");
            return (Criteria) this;
        }

        public Criteria andSchoollocationIn(List<String> values) {
            addCriterion("schoollocation in", values, "schoollocation");
            return (Criteria) this;
        }

        public Criteria andSchoollocationNotIn(List<String> values) {
            addCriterion("schoollocation not in", values, "schoollocation");
            return (Criteria) this;
        }

        public Criteria andSchoollocationBetween(String value1, String value2) {
            addCriterion("schoollocation between", value1, value2, "schoollocation");
            return (Criteria) this;
        }

        public Criteria andSchoollocationNotBetween(String value1, String value2) {
            addCriterion("schoollocation not between", value1, value2, "schoollocation");
            return (Criteria) this;
        }

        public Criteria andTakedegreeIsNull() {
            addCriterion("takedegree is null");
            return (Criteria) this;
        }

        public Criteria andTakedegreeIsNotNull() {
            addCriterion("takedegree is not null");
            return (Criteria) this;
        }

        public Criteria andTakedegreeEqualTo(String value) {
            addCriterion("takedegree =", value, "takedegree");
            return (Criteria) this;
        }

        public Criteria andTakedegreeNotEqualTo(String value) {
            addCriterion("takedegree <>", value, "takedegree");
            return (Criteria) this;
        }

        public Criteria andTakedegreeGreaterThan(String value) {
            addCriterion("takedegree >", value, "takedegree");
            return (Criteria) this;
        }

        public Criteria andTakedegreeGreaterThanOrEqualTo(String value) {
            addCriterion("takedegree >=", value, "takedegree");
            return (Criteria) this;
        }

        public Criteria andTakedegreeLessThan(String value) {
            addCriterion("takedegree <", value, "takedegree");
            return (Criteria) this;
        }

        public Criteria andTakedegreeLessThanOrEqualTo(String value) {
            addCriterion("takedegree <=", value, "takedegree");
            return (Criteria) this;
        }

        public Criteria andTakedegreeLike(String value) {
            addCriterion("takedegree like", value, "takedegree");
            return (Criteria) this;
        }

        public Criteria andTakedegreeNotLike(String value) {
            addCriterion("takedegree not like", value, "takedegree");
            return (Criteria) this;
        }

        public Criteria andTakedegreeIn(List<String> values) {
            addCriterion("takedegree in", values, "takedegree");
            return (Criteria) this;
        }

        public Criteria andTakedegreeNotIn(List<String> values) {
            addCriterion("takedegree not in", values, "takedegree");
            return (Criteria) this;
        }

        public Criteria andTakedegreeBetween(String value1, String value2) {
            addCriterion("takedegree between", value1, value2, "takedegree");
            return (Criteria) this;
        }

        public Criteria andTakedegreeNotBetween(String value1, String value2) {
            addCriterion("takedegree not between", value1, value2, "takedegree");
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