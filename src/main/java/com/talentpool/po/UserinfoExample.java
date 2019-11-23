package com.talentpool.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class UserinfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UserinfoExample() {
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

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
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

        public Criteria andUsernameIsNull() {
            addCriterion("username is null");
            return (Criteria) this;
        }

        public Criteria andUsernameIsNotNull() {
            addCriterion("username is not null");
            return (Criteria) this;
        }

        public Criteria andUsernameEqualTo(String value) {
            addCriterion("username =", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotEqualTo(String value) {
            addCriterion("username <>", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameGreaterThan(String value) {
            addCriterion("username >", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameGreaterThanOrEqualTo(String value) {
            addCriterion("username >=", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLessThan(String value) {
            addCriterion("username <", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLessThanOrEqualTo(String value) {
            addCriterion("username <=", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLike(String value) {
            addCriterion("username like", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotLike(String value) {
            addCriterion("username not like", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameIn(List<String> values) {
            addCriterion("username in", values, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotIn(List<String> values) {
            addCriterion("username not in", values, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameBetween(String value1, String value2) {
            addCriterion("username between", value1, value2, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotBetween(String value1, String value2) {
            addCriterion("username not between", value1, value2, "username");
            return (Criteria) this;
        }

        public Criteria andPasswordIsNull() {
            addCriterion("password is null");
            return (Criteria) this;
        }

        public Criteria andPasswordIsNotNull() {
            addCriterion("password is not null");
            return (Criteria) this;
        }

        public Criteria andPasswordEqualTo(String value) {
            addCriterion("password =", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotEqualTo(String value) {
            addCriterion("password <>", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordGreaterThan(String value) {
            addCriterion("password >", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("password >=", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLessThan(String value) {
            addCriterion("password <", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLessThanOrEqualTo(String value) {
            addCriterion("password <=", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLike(String value) {
            addCriterion("password like", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotLike(String value) {
            addCriterion("password not like", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordIn(List<String> values) {
            addCriterion("password in", values, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotIn(List<String> values) {
            addCriterion("password not in", values, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordBetween(String value1, String value2) {
            addCriterion("password between", value1, value2, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotBetween(String value1, String value2) {
            addCriterion("password not between", value1, value2, "password");
            return (Criteria) this;
        }

        public Criteria andNameIsNull() {
            addCriterion("name is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("name is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("name =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("name <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("name >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("name >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("name <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("name <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("name like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("name not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("name in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("name not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("name between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("name not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andSexIsNull() {
            addCriterion("sex is null");
            return (Criteria) this;
        }

        public Criteria andSexIsNotNull() {
            addCriterion("sex is not null");
            return (Criteria) this;
        }

        public Criteria andSexEqualTo(String value) {
            addCriterion("sex =", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotEqualTo(String value) {
            addCriterion("sex <>", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexGreaterThan(String value) {
            addCriterion("sex >", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexGreaterThanOrEqualTo(String value) {
            addCriterion("sex >=", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLessThan(String value) {
            addCriterion("sex <", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLessThanOrEqualTo(String value) {
            addCriterion("sex <=", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLike(String value) {
            addCriterion("sex like", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotLike(String value) {
            addCriterion("sex not like", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexIn(List<String> values) {
            addCriterion("sex in", values, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotIn(List<String> values) {
            addCriterion("sex not in", values, "sex");
            return (Criteria) this;
        }

        public Criteria andSexBetween(String value1, String value2) {
            addCriterion("sex between", value1, value2, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotBetween(String value1, String value2) {
            addCriterion("sex not between", value1, value2, "sex");
            return (Criteria) this;
        }

        public Criteria andContactIsNull() {
            addCriterion("contact is null");
            return (Criteria) this;
        }

        public Criteria andContactIsNotNull() {
            addCriterion("contact is not null");
            return (Criteria) this;
        }

        public Criteria andContactEqualTo(String value) {
            addCriterion("contact =", value, "contact");
            return (Criteria) this;
        }

        public Criteria andContactNotEqualTo(String value) {
            addCriterion("contact <>", value, "contact");
            return (Criteria) this;
        }

        public Criteria andContactGreaterThan(String value) {
            addCriterion("contact >", value, "contact");
            return (Criteria) this;
        }

        public Criteria andContactGreaterThanOrEqualTo(String value) {
            addCriterion("contact >=", value, "contact");
            return (Criteria) this;
        }

        public Criteria andContactLessThan(String value) {
            addCriterion("contact <", value, "contact");
            return (Criteria) this;
        }

        public Criteria andContactLessThanOrEqualTo(String value) {
            addCriterion("contact <=", value, "contact");
            return (Criteria) this;
        }

        public Criteria andContactLike(String value) {
            addCriterion("contact like", value, "contact");
            return (Criteria) this;
        }

        public Criteria andContactNotLike(String value) {
            addCriterion("contact not like", value, "contact");
            return (Criteria) this;
        }

        public Criteria andContactIn(List<String> values) {
            addCriterion("contact in", values, "contact");
            return (Criteria) this;
        }

        public Criteria andContactNotIn(List<String> values) {
            addCriterion("contact not in", values, "contact");
            return (Criteria) this;
        }

        public Criteria andContactBetween(String value1, String value2) {
            addCriterion("contact between", value1, value2, "contact");
            return (Criteria) this;
        }

        public Criteria andContactNotBetween(String value1, String value2) {
            addCriterion("contact not between", value1, value2, "contact");
            return (Criteria) this;
        }

        public Criteria andIdcardphotozIsNull() {
            addCriterion("idcardphotoz is null");
            return (Criteria) this;
        }

        public Criteria andIdcardphotozIsNotNull() {
            addCriterion("idcardphotoz is not null");
            return (Criteria) this;
        }

        public Criteria andIdcardphotozEqualTo(String value) {
            addCriterion("idcardphotoz =", value, "idcardphotoz");
            return (Criteria) this;
        }

        public Criteria andIdcardphotozNotEqualTo(String value) {
            addCriterion("idcardphotoz <>", value, "idcardphotoz");
            return (Criteria) this;
        }

        public Criteria andIdcardphotozGreaterThan(String value) {
            addCriterion("idcardphotoz >", value, "idcardphotoz");
            return (Criteria) this;
        }

        public Criteria andIdcardphotozGreaterThanOrEqualTo(String value) {
            addCriterion("idcardphotoz >=", value, "idcardphotoz");
            return (Criteria) this;
        }

        public Criteria andIdcardphotozLessThan(String value) {
            addCriterion("idcardphotoz <", value, "idcardphotoz");
            return (Criteria) this;
        }

        public Criteria andIdcardphotozLessThanOrEqualTo(String value) {
            addCriterion("idcardphotoz <=", value, "idcardphotoz");
            return (Criteria) this;
        }

        public Criteria andIdcardphotozLike(String value) {
            addCriterion("idcardphotoz like", value, "idcardphotoz");
            return (Criteria) this;
        }

        public Criteria andIdcardphotozNotLike(String value) {
            addCriterion("idcardphotoz not like", value, "idcardphotoz");
            return (Criteria) this;
        }

        public Criteria andIdcardphotozIn(List<String> values) {
            addCriterion("idcardphotoz in", values, "idcardphotoz");
            return (Criteria) this;
        }

        public Criteria andIdcardphotozNotIn(List<String> values) {
            addCriterion("idcardphotoz not in", values, "idcardphotoz");
            return (Criteria) this;
        }

        public Criteria andIdcardphotozBetween(String value1, String value2) {
            addCriterion("idcardphotoz between", value1, value2, "idcardphotoz");
            return (Criteria) this;
        }

        public Criteria andIdcardphotozNotBetween(String value1, String value2) {
            addCriterion("idcardphotoz not between", value1, value2, "idcardphotoz");
            return (Criteria) this;
        }

        public Criteria andIdcardphotofIsNull() {
            addCriterion("idcardphotof is null");
            return (Criteria) this;
        }

        public Criteria andIdcardphotofIsNotNull() {
            addCriterion("idcardphotof is not null");
            return (Criteria) this;
        }

        public Criteria andIdcardphotofEqualTo(String value) {
            addCriterion("idcardphotof =", value, "idcardphotof");
            return (Criteria) this;
        }

        public Criteria andIdcardphotofNotEqualTo(String value) {
            addCriterion("idcardphotof <>", value, "idcardphotof");
            return (Criteria) this;
        }

        public Criteria andIdcardphotofGreaterThan(String value) {
            addCriterion("idcardphotof >", value, "idcardphotof");
            return (Criteria) this;
        }

        public Criteria andIdcardphotofGreaterThanOrEqualTo(String value) {
            addCriterion("idcardphotof >=", value, "idcardphotof");
            return (Criteria) this;
        }

        public Criteria andIdcardphotofLessThan(String value) {
            addCriterion("idcardphotof <", value, "idcardphotof");
            return (Criteria) this;
        }

        public Criteria andIdcardphotofLessThanOrEqualTo(String value) {
            addCriterion("idcardphotof <=", value, "idcardphotof");
            return (Criteria) this;
        }

        public Criteria andIdcardphotofLike(String value) {
            addCriterion("idcardphotof like", value, "idcardphotof");
            return (Criteria) this;
        }

        public Criteria andIdcardphotofNotLike(String value) {
            addCriterion("idcardphotof not like", value, "idcardphotof");
            return (Criteria) this;
        }

        public Criteria andIdcardphotofIn(List<String> values) {
            addCriterion("idcardphotof in", values, "idcardphotof");
            return (Criteria) this;
        }

        public Criteria andIdcardphotofNotIn(List<String> values) {
            addCriterion("idcardphotof not in", values, "idcardphotof");
            return (Criteria) this;
        }

        public Criteria andIdcardphotofBetween(String value1, String value2) {
            addCriterion("idcardphotof between", value1, value2, "idcardphotof");
            return (Criteria) this;
        }

        public Criteria andIdcardphotofNotBetween(String value1, String value2) {
            addCriterion("idcardphotof not between", value1, value2, "idcardphotof");
            return (Criteria) this;
        }

        public Criteria andJobphotoIsNull() {
            addCriterion("jobphoto is null");
            return (Criteria) this;
        }

        public Criteria andJobphotoIsNotNull() {
            addCriterion("jobphoto is not null");
            return (Criteria) this;
        }

        public Criteria andJobphotoEqualTo(String value) {
            addCriterion("jobphoto =", value, "jobphoto");
            return (Criteria) this;
        }

        public Criteria andJobphotoNotEqualTo(String value) {
            addCriterion("jobphoto <>", value, "jobphoto");
            return (Criteria) this;
        }

        public Criteria andJobphotoGreaterThan(String value) {
            addCriterion("jobphoto >", value, "jobphoto");
            return (Criteria) this;
        }

        public Criteria andJobphotoGreaterThanOrEqualTo(String value) {
            addCriterion("jobphoto >=", value, "jobphoto");
            return (Criteria) this;
        }

        public Criteria andJobphotoLessThan(String value) {
            addCriterion("jobphoto <", value, "jobphoto");
            return (Criteria) this;
        }

        public Criteria andJobphotoLessThanOrEqualTo(String value) {
            addCriterion("jobphoto <=", value, "jobphoto");
            return (Criteria) this;
        }

        public Criteria andJobphotoLike(String value) {
            addCriterion("jobphoto like", value, "jobphoto");
            return (Criteria) this;
        }

        public Criteria andJobphotoNotLike(String value) {
            addCriterion("jobphoto not like", value, "jobphoto");
            return (Criteria) this;
        }

        public Criteria andJobphotoIn(List<String> values) {
            addCriterion("jobphoto in", values, "jobphoto");
            return (Criteria) this;
        }

        public Criteria andJobphotoNotIn(List<String> values) {
            addCriterion("jobphoto not in", values, "jobphoto");
            return (Criteria) this;
        }

        public Criteria andJobphotoBetween(String value1, String value2) {
            addCriterion("jobphoto between", value1, value2, "jobphoto");
            return (Criteria) this;
        }

        public Criteria andJobphotoNotBetween(String value1, String value2) {
            addCriterion("jobphoto not between", value1, value2, "jobphoto");
            return (Criteria) this;
        }

        public Criteria andOtherphoto1IsNull() {
            addCriterion("otherphoto1 is null");
            return (Criteria) this;
        }

        public Criteria andOtherphoto1IsNotNull() {
            addCriterion("otherphoto1 is not null");
            return (Criteria) this;
        }

        public Criteria andOtherphoto1EqualTo(String value) {
            addCriterion("otherphoto1 =", value, "otherphoto1");
            return (Criteria) this;
        }

        public Criteria andOtherphoto1NotEqualTo(String value) {
            addCriterion("otherphoto1 <>", value, "otherphoto1");
            return (Criteria) this;
        }

        public Criteria andOtherphoto1GreaterThan(String value) {
            addCriterion("otherphoto1 >", value, "otherphoto1");
            return (Criteria) this;
        }

        public Criteria andOtherphoto1GreaterThanOrEqualTo(String value) {
            addCriterion("otherphoto1 >=", value, "otherphoto1");
            return (Criteria) this;
        }

        public Criteria andOtherphoto1LessThan(String value) {
            addCriterion("otherphoto1 <", value, "otherphoto1");
            return (Criteria) this;
        }

        public Criteria andOtherphoto1LessThanOrEqualTo(String value) {
            addCriterion("otherphoto1 <=", value, "otherphoto1");
            return (Criteria) this;
        }

        public Criteria andOtherphoto1Like(String value) {
            addCriterion("otherphoto1 like", value, "otherphoto1");
            return (Criteria) this;
        }

        public Criteria andOtherphoto1NotLike(String value) {
            addCriterion("otherphoto1 not like", value, "otherphoto1");
            return (Criteria) this;
        }

        public Criteria andOtherphoto1In(List<String> values) {
            addCriterion("otherphoto1 in", values, "otherphoto1");
            return (Criteria) this;
        }

        public Criteria andOtherphoto1NotIn(List<String> values) {
            addCriterion("otherphoto1 not in", values, "otherphoto1");
            return (Criteria) this;
        }

        public Criteria andOtherphoto1Between(String value1, String value2) {
            addCriterion("otherphoto1 between", value1, value2, "otherphoto1");
            return (Criteria) this;
        }

        public Criteria andOtherphoto1NotBetween(String value1, String value2) {
            addCriterion("otherphoto1 not between", value1, value2, "otherphoto1");
            return (Criteria) this;
        }

        public Criteria andOtherphoto2IsNull() {
            addCriterion("otherphoto2 is null");
            return (Criteria) this;
        }

        public Criteria andOtherphoto2IsNotNull() {
            addCriterion("otherphoto2 is not null");
            return (Criteria) this;
        }

        public Criteria andOtherphoto2EqualTo(String value) {
            addCriterion("otherphoto2 =", value, "otherphoto2");
            return (Criteria) this;
        }

        public Criteria andOtherphoto2NotEqualTo(String value) {
            addCriterion("otherphoto2 <>", value, "otherphoto2");
            return (Criteria) this;
        }

        public Criteria andOtherphoto2GreaterThan(String value) {
            addCriterion("otherphoto2 >", value, "otherphoto2");
            return (Criteria) this;
        }

        public Criteria andOtherphoto2GreaterThanOrEqualTo(String value) {
            addCriterion("otherphoto2 >=", value, "otherphoto2");
            return (Criteria) this;
        }

        public Criteria andOtherphoto2LessThan(String value) {
            addCriterion("otherphoto2 <", value, "otherphoto2");
            return (Criteria) this;
        }

        public Criteria andOtherphoto2LessThanOrEqualTo(String value) {
            addCriterion("otherphoto2 <=", value, "otherphoto2");
            return (Criteria) this;
        }

        public Criteria andOtherphoto2Like(String value) {
            addCriterion("otherphoto2 like", value, "otherphoto2");
            return (Criteria) this;
        }

        public Criteria andOtherphoto2NotLike(String value) {
            addCriterion("otherphoto2 not like", value, "otherphoto2");
            return (Criteria) this;
        }

        public Criteria andOtherphoto2In(List<String> values) {
            addCriterion("otherphoto2 in", values, "otherphoto2");
            return (Criteria) this;
        }

        public Criteria andOtherphoto2NotIn(List<String> values) {
            addCriterion("otherphoto2 not in", values, "otherphoto2");
            return (Criteria) this;
        }

        public Criteria andOtherphoto2Between(String value1, String value2) {
            addCriterion("otherphoto2 between", value1, value2, "otherphoto2");
            return (Criteria) this;
        }

        public Criteria andOtherphoto2NotBetween(String value1, String value2) {
            addCriterion("otherphoto2 not between", value1, value2, "otherphoto2");
            return (Criteria) this;
        }

        public Criteria andResumeIsNull() {
            addCriterion("resume is null");
            return (Criteria) this;
        }

        public Criteria andResumeIsNotNull() {
            addCriterion("resume is not null");
            return (Criteria) this;
        }

        public Criteria andResumeEqualTo(String value) {
            addCriterion("resume =", value, "resume");
            return (Criteria) this;
        }

        public Criteria andResumeNotEqualTo(String value) {
            addCriterion("resume <>", value, "resume");
            return (Criteria) this;
        }

        public Criteria andResumeGreaterThan(String value) {
            addCriterion("resume >", value, "resume");
            return (Criteria) this;
        }

        public Criteria andResumeGreaterThanOrEqualTo(String value) {
            addCriterion("resume >=", value, "resume");
            return (Criteria) this;
        }

        public Criteria andResumeLessThan(String value) {
            addCriterion("resume <", value, "resume");
            return (Criteria) this;
        }

        public Criteria andResumeLessThanOrEqualTo(String value) {
            addCriterion("resume <=", value, "resume");
            return (Criteria) this;
        }

        public Criteria andResumeLike(String value) {
            addCriterion("resume like", value, "resume");
            return (Criteria) this;
        }

        public Criteria andResumeNotLike(String value) {
            addCriterion("resume not like", value, "resume");
            return (Criteria) this;
        }

        public Criteria andResumeIn(List<String> values) {
            addCriterion("resume in", values, "resume");
            return (Criteria) this;
        }

        public Criteria andResumeNotIn(List<String> values) {
            addCriterion("resume not in", values, "resume");
            return (Criteria) this;
        }

        public Criteria andResumeBetween(String value1, String value2) {
            addCriterion("resume between", value1, value2, "resume");
            return (Criteria) this;
        }

        public Criteria andResumeNotBetween(String value1, String value2) {
            addCriterion("resume not between", value1, value2, "resume");
            return (Criteria) this;
        }

        public Criteria andSpecialityIsNull() {
            addCriterion("speciality is null");
            return (Criteria) this;
        }

        public Criteria andSpecialityIsNotNull() {
            addCriterion("speciality is not null");
            return (Criteria) this;
        }

        public Criteria andSpecialityEqualTo(String value) {
            addCriterion("speciality =", value, "speciality");
            return (Criteria) this;
        }

        public Criteria andSpecialityNotEqualTo(String value) {
            addCriterion("speciality <>", value, "speciality");
            return (Criteria) this;
        }

        public Criteria andSpecialityGreaterThan(String value) {
            addCriterion("speciality >", value, "speciality");
            return (Criteria) this;
        }

        public Criteria andSpecialityGreaterThanOrEqualTo(String value) {
            addCriterion("speciality >=", value, "speciality");
            return (Criteria) this;
        }

        public Criteria andSpecialityLessThan(String value) {
            addCriterion("speciality <", value, "speciality");
            return (Criteria) this;
        }

        public Criteria andSpecialityLessThanOrEqualTo(String value) {
            addCriterion("speciality <=", value, "speciality");
            return (Criteria) this;
        }

        public Criteria andSpecialityLike(String value) {
            addCriterion("speciality like", value, "speciality");
            return (Criteria) this;
        }

        public Criteria andSpecialityNotLike(String value) {
            addCriterion("speciality not like", value, "speciality");
            return (Criteria) this;
        }

        public Criteria andSpecialityIn(List<String> values) {
            addCriterion("speciality in", values, "speciality");
            return (Criteria) this;
        }

        public Criteria andSpecialityNotIn(List<String> values) {
            addCriterion("speciality not in", values, "speciality");
            return (Criteria) this;
        }

        public Criteria andSpecialityBetween(String value1, String value2) {
            addCriterion("speciality between", value1, value2, "speciality");
            return (Criteria) this;
        }

        public Criteria andSpecialityNotBetween(String value1, String value2) {
            addCriterion("speciality not between", value1, value2, "speciality");
            return (Criteria) this;
        }

        public Criteria andWorkplantIsNull() {
            addCriterion("workplant is null");
            return (Criteria) this;
        }

        public Criteria andWorkplantIsNotNull() {
            addCriterion("workplant is not null");
            return (Criteria) this;
        }

        public Criteria andWorkplantEqualTo(String value) {
            addCriterion("workplant =", value, "workplant");
            return (Criteria) this;
        }

        public Criteria andWorkplantNotEqualTo(String value) {
            addCriterion("workplant <>", value, "workplant");
            return (Criteria) this;
        }

        public Criteria andWorkplantGreaterThan(String value) {
            addCriterion("workplant >", value, "workplant");
            return (Criteria) this;
        }

        public Criteria andWorkplantGreaterThanOrEqualTo(String value) {
            addCriterion("workplant >=", value, "workplant");
            return (Criteria) this;
        }

        public Criteria andWorkplantLessThan(String value) {
            addCriterion("workplant <", value, "workplant");
            return (Criteria) this;
        }

        public Criteria andWorkplantLessThanOrEqualTo(String value) {
            addCriterion("workplant <=", value, "workplant");
            return (Criteria) this;
        }

        public Criteria andWorkplantLike(String value) {
            addCriterion("workplant like", value, "workplant");
            return (Criteria) this;
        }

        public Criteria andWorkplantNotLike(String value) {
            addCriterion("workplant not like", value, "workplant");
            return (Criteria) this;
        }

        public Criteria andWorkplantIn(List<String> values) {
            addCriterion("workplant in", values, "workplant");
            return (Criteria) this;
        }

        public Criteria andWorkplantNotIn(List<String> values) {
            addCriterion("workplant not in", values, "workplant");
            return (Criteria) this;
        }

        public Criteria andWorkplantBetween(String value1, String value2) {
            addCriterion("workplant between", value1, value2, "workplant");
            return (Criteria) this;
        }

        public Criteria andWorkplantNotBetween(String value1, String value2) {
            addCriterion("workplant not between", value1, value2, "workplant");
            return (Criteria) this;
        }

        public Criteria andProvinceIsNull() {
            addCriterion("province is null");
            return (Criteria) this;
        }

        public Criteria andProvinceIsNotNull() {
            addCriterion("province is not null");
            return (Criteria) this;
        }

        public Criteria andProvinceEqualTo(String value) {
            addCriterion("province =", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceNotEqualTo(String value) {
            addCriterion("province <>", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceGreaterThan(String value) {
            addCriterion("province >", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceGreaterThanOrEqualTo(String value) {
            addCriterion("province >=", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceLessThan(String value) {
            addCriterion("province <", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceLessThanOrEqualTo(String value) {
            addCriterion("province <=", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceLike(String value) {
            addCriterion("province like", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceNotLike(String value) {
            addCriterion("province not like", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceIn(List<String> values) {
            addCriterion("province in", values, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceNotIn(List<String> values) {
            addCriterion("province not in", values, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceBetween(String value1, String value2) {
            addCriterion("province between", value1, value2, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceNotBetween(String value1, String value2) {
            addCriterion("province not between", value1, value2, "province");
            return (Criteria) this;
        }

        public Criteria andCityIsNull() {
            addCriterion("city is null");
            return (Criteria) this;
        }

        public Criteria andCityIsNotNull() {
            addCriterion("city is not null");
            return (Criteria) this;
        }

        public Criteria andCityEqualTo(String value) {
            addCriterion("city =", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotEqualTo(String value) {
            addCriterion("city <>", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityGreaterThan(String value) {
            addCriterion("city >", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityGreaterThanOrEqualTo(String value) {
            addCriterion("city >=", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityLessThan(String value) {
            addCriterion("city <", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityLessThanOrEqualTo(String value) {
            addCriterion("city <=", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityLike(String value) {
            addCriterion("city like", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotLike(String value) {
            addCriterion("city not like", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityIn(List<String> values) {
            addCriterion("city in", values, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotIn(List<String> values) {
            addCriterion("city not in", values, "city");
            return (Criteria) this;
        }

        public Criteria andCityBetween(String value1, String value2) {
            addCriterion("city between", value1, value2, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotBetween(String value1, String value2) {
            addCriterion("city not between", value1, value2, "city");
            return (Criteria) this;
        }

        public Criteria andAreaIsNull() {
            addCriterion("area is null");
            return (Criteria) this;
        }

        public Criteria andAreaIsNotNull() {
            addCriterion("area is not null");
            return (Criteria) this;
        }

        public Criteria andAreaEqualTo(String value) {
            addCriterion("area =", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaNotEqualTo(String value) {
            addCriterion("area <>", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaGreaterThan(String value) {
            addCriterion("area >", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaGreaterThanOrEqualTo(String value) {
            addCriterion("area >=", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaLessThan(String value) {
            addCriterion("area <", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaLessThanOrEqualTo(String value) {
            addCriterion("area <=", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaLike(String value) {
            addCriterion("area like", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaNotLike(String value) {
            addCriterion("area not like", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaIn(List<String> values) {
            addCriterion("area in", values, "area");
            return (Criteria) this;
        }

        public Criteria andAreaNotIn(List<String> values) {
            addCriterion("area not in", values, "area");
            return (Criteria) this;
        }

        public Criteria andAreaBetween(String value1, String value2) {
            addCriterion("area between", value1, value2, "area");
            return (Criteria) this;
        }

        public Criteria andAreaNotBetween(String value1, String value2) {
            addCriterion("area not between", value1, value2, "area");
            return (Criteria) this;
        }

        public Criteria andHeadIsNull() {
            addCriterion("Head is null");
            return (Criteria) this;
        }

        public Criteria andHeadIsNotNull() {
            addCriterion("Head is not null");
            return (Criteria) this;
        }

        public Criteria andHeadEqualTo(String value) {
            addCriterion("Head =", value, "head");
            return (Criteria) this;
        }

        public Criteria andHeadNotEqualTo(String value) {
            addCriterion("Head <>", value, "head");
            return (Criteria) this;
        }

        public Criteria andHeadGreaterThan(String value) {
            addCriterion("Head >", value, "head");
            return (Criteria) this;
        }

        public Criteria andHeadGreaterThanOrEqualTo(String value) {
            addCriterion("Head >=", value, "head");
            return (Criteria) this;
        }

        public Criteria andHeadLessThan(String value) {
            addCriterion("Head <", value, "head");
            return (Criteria) this;
        }

        public Criteria andHeadLessThanOrEqualTo(String value) {
            addCriterion("Head <=", value, "head");
            return (Criteria) this;
        }

        public Criteria andHeadLike(String value) {
            addCriterion("Head like", value, "head");
            return (Criteria) this;
        }

        public Criteria andHeadNotLike(String value) {
            addCriterion("Head not like", value, "head");
            return (Criteria) this;
        }

        public Criteria andHeadIn(List<String> values) {
            addCriterion("Head in", values, "head");
            return (Criteria) this;
        }

        public Criteria andHeadNotIn(List<String> values) {
            addCriterion("Head not in", values, "head");
            return (Criteria) this;
        }

        public Criteria andHeadBetween(String value1, String value2) {
            addCriterion("Head between", value1, value2, "head");
            return (Criteria) this;
        }

        public Criteria andHeadNotBetween(String value1, String value2) {
            addCriterion("Head not between", value1, value2, "head");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("status is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("status is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(String value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(String value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(String value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(String value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(String value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(String value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLike(String value) {
            addCriterion("status like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotLike(String value) {
            addCriterion("status not like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<String> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<String> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(String value1, String value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(String value1, String value2) {
            addCriterion("status not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andGzdIsNull() {
            addCriterion("gzd is null");
            return (Criteria) this;
        }

        public Criteria andGzdIsNotNull() {
            addCriterion("gzd is not null");
            return (Criteria) this;
        }

        public Criteria andGzdEqualTo(String value) {
            addCriterion("gzd =", value, "gzd");
            return (Criteria) this;
        }

        public Criteria andGzdNotEqualTo(String value) {
            addCriterion("gzd <>", value, "gzd");
            return (Criteria) this;
        }

        public Criteria andGzdGreaterThan(String value) {
            addCriterion("gzd >", value, "gzd");
            return (Criteria) this;
        }

        public Criteria andGzdGreaterThanOrEqualTo(String value) {
            addCriterion("gzd >=", value, "gzd");
            return (Criteria) this;
        }

        public Criteria andGzdLessThan(String value) {
            addCriterion("gzd <", value, "gzd");
            return (Criteria) this;
        }

        public Criteria andGzdLessThanOrEqualTo(String value) {
            addCriterion("gzd <=", value, "gzd");
            return (Criteria) this;
        }

        public Criteria andGzdLike(String value) {
            addCriterion("gzd like", value, "gzd");
            return (Criteria) this;
        }

        public Criteria andGzdNotLike(String value) {
            addCriterion("gzd not like", value, "gzd");
            return (Criteria) this;
        }

        public Criteria andGzdIn(List<String> values) {
            addCriterion("gzd in", values, "gzd");
            return (Criteria) this;
        }

        public Criteria andGzdNotIn(List<String> values) {
            addCriterion("gzd not in", values, "gzd");
            return (Criteria) this;
        }

        public Criteria andGzdBetween(String value1, String value2) {
            addCriterion("gzd between", value1, value2, "gzd");
            return (Criteria) this;
        }

        public Criteria andGzdNotBetween(String value1, String value2) {
            addCriterion("gzd not between", value1, value2, "gzd");
            return (Criteria) this;
        }

        public Criteria andJoindateIsNull() {
            addCriterion("joindate is null");
            return (Criteria) this;
        }

        public Criteria andJoindateIsNotNull() {
            addCriterion("joindate is not null");
            return (Criteria) this;
        }

        public Criteria andJoindateEqualTo(Date value) {
            addCriterionForJDBCDate("joindate =", value, "joindate");
            return (Criteria) this;
        }

        public Criteria andJoindateNotEqualTo(Date value) {
            addCriterionForJDBCDate("joindate <>", value, "joindate");
            return (Criteria) this;
        }

        public Criteria andJoindateGreaterThan(Date value) {
            addCriterionForJDBCDate("joindate >", value, "joindate");
            return (Criteria) this;
        }

        public Criteria andJoindateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("joindate >=", value, "joindate");
            return (Criteria) this;
        }

        public Criteria andJoindateLessThan(Date value) {
            addCriterionForJDBCDate("joindate <", value, "joindate");
            return (Criteria) this;
        }

        public Criteria andJoindateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("joindate <=", value, "joindate");
            return (Criteria) this;
        }

        public Criteria andJoindateIn(List<Date> values) {
            addCriterionForJDBCDate("joindate in", values, "joindate");
            return (Criteria) this;
        }

        public Criteria andJoindateNotIn(List<Date> values) {
            addCriterionForJDBCDate("joindate not in", values, "joindate");
            return (Criteria) this;
        }

        public Criteria andJoindateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("joindate between", value1, value2, "joindate");
            return (Criteria) this;
        }

        public Criteria andJoindateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("joindate not between", value1, value2, "joindate");
            return (Criteria) this;
        }

        public Criteria andIdcardIsNull() {
            addCriterion("idcard is null");
            return (Criteria) this;
        }

        public Criteria andIdcardIsNotNull() {
            addCriterion("idcard is not null");
            return (Criteria) this;
        }

        public Criteria andIdcardEqualTo(String value) {
            addCriterion("idcard =", value, "idcard");
            return (Criteria) this;
        }

        public Criteria andIdcardNotEqualTo(String value) {
            addCriterion("idcard <>", value, "idcard");
            return (Criteria) this;
        }

        public Criteria andIdcardGreaterThan(String value) {
            addCriterion("idcard >", value, "idcard");
            return (Criteria) this;
        }

        public Criteria andIdcardGreaterThanOrEqualTo(String value) {
            addCriterion("idcard >=", value, "idcard");
            return (Criteria) this;
        }

        public Criteria andIdcardLessThan(String value) {
            addCriterion("idcard <", value, "idcard");
            return (Criteria) this;
        }

        public Criteria andIdcardLessThanOrEqualTo(String value) {
            addCriterion("idcard <=", value, "idcard");
            return (Criteria) this;
        }

        public Criteria andIdcardLike(String value) {
            addCriterion("idcard like", value, "idcard");
            return (Criteria) this;
        }

        public Criteria andIdcardNotLike(String value) {
            addCriterion("idcard not like", value, "idcard");
            return (Criteria) this;
        }

        public Criteria andIdcardIn(List<String> values) {
            addCriterion("idcard in", values, "idcard");
            return (Criteria) this;
        }

        public Criteria andIdcardNotIn(List<String> values) {
            addCriterion("idcard not in", values, "idcard");
            return (Criteria) this;
        }

        public Criteria andIdcardBetween(String value1, String value2) {
            addCriterion("idcard between", value1, value2, "idcard");
            return (Criteria) this;
        }

        public Criteria andIdcardNotBetween(String value1, String value2) {
            addCriterion("idcard not between", value1, value2, "idcard");
            return (Criteria) this;
        }

        public Criteria andNationIsNull() {
            addCriterion("nation is null");
            return (Criteria) this;
        }

        public Criteria andNationIsNotNull() {
            addCriterion("nation is not null");
            return (Criteria) this;
        }

        public Criteria andNationEqualTo(String value) {
            addCriterion("nation =", value, "nation");
            return (Criteria) this;
        }

        public Criteria andNationNotEqualTo(String value) {
            addCriterion("nation <>", value, "nation");
            return (Criteria) this;
        }

        public Criteria andNationGreaterThan(String value) {
            addCriterion("nation >", value, "nation");
            return (Criteria) this;
        }

        public Criteria andNationGreaterThanOrEqualTo(String value) {
            addCriterion("nation >=", value, "nation");
            return (Criteria) this;
        }

        public Criteria andNationLessThan(String value) {
            addCriterion("nation <", value, "nation");
            return (Criteria) this;
        }

        public Criteria andNationLessThanOrEqualTo(String value) {
            addCriterion("nation <=", value, "nation");
            return (Criteria) this;
        }

        public Criteria andNationLike(String value) {
            addCriterion("nation like", value, "nation");
            return (Criteria) this;
        }

        public Criteria andNationNotLike(String value) {
            addCriterion("nation not like", value, "nation");
            return (Criteria) this;
        }

        public Criteria andNationIn(List<String> values) {
            addCriterion("nation in", values, "nation");
            return (Criteria) this;
        }

        public Criteria andNationNotIn(List<String> values) {
            addCriterion("nation not in", values, "nation");
            return (Criteria) this;
        }

        public Criteria andNationBetween(String value1, String value2) {
            addCriterion("nation between", value1, value2, "nation");
            return (Criteria) this;
        }

        public Criteria andNationNotBetween(String value1, String value2) {
            addCriterion("nation not between", value1, value2, "nation");
            return (Criteria) this;
        }

        public Criteria andBirthdateIsNull() {
            addCriterion("birthdate is null");
            return (Criteria) this;
        }

        public Criteria andBirthdateIsNotNull() {
            addCriterion("birthdate is not null");
            return (Criteria) this;
        }

        public Criteria andBirthdateEqualTo(String value) {
            addCriterion("birthdate =", value, "birthdate");
            return (Criteria) this;
        }

        public Criteria andBirthdateNotEqualTo(String value) {
            addCriterion("birthdate <>", value, "birthdate");
            return (Criteria) this;
        }

        public Criteria andBirthdateGreaterThan(String value) {
            addCriterion("birthdate >", value, "birthdate");
            return (Criteria) this;
        }

        public Criteria andBirthdateGreaterThanOrEqualTo(String value) {
            addCriterion("birthdate >=", value, "birthdate");
            return (Criteria) this;
        }

        public Criteria andBirthdateLessThan(String value) {
            addCriterion("birthdate <", value, "birthdate");
            return (Criteria) this;
        }

        public Criteria andBirthdateLessThanOrEqualTo(String value) {
            addCriterion("birthdate <=", value, "birthdate");
            return (Criteria) this;
        }

        public Criteria andBirthdateLike(String value) {
            addCriterion("birthdate like", value, "birthdate");
            return (Criteria) this;
        }

        public Criteria andBirthdateNotLike(String value) {
            addCriterion("birthdate not like", value, "birthdate");
            return (Criteria) this;
        }

        public Criteria andBirthdateIn(List<String> values) {
            addCriterion("birthdate in", values, "birthdate");
            return (Criteria) this;
        }

        public Criteria andBirthdateNotIn(List<String> values) {
            addCriterion("birthdate not in", values, "birthdate");
            return (Criteria) this;
        }

        public Criteria andBirthdateBetween(String value1, String value2) {
            addCriterion("birthdate between", value1, value2, "birthdate");
            return (Criteria) this;
        }

        public Criteria andBirthdateNotBetween(String value1, String value2) {
            addCriterion("birthdate not between", value1, value2, "birthdate");
            return (Criteria) this;
        }

        public Criteria andHeightIsNull() {
            addCriterion("height is null");
            return (Criteria) this;
        }

        public Criteria andHeightIsNotNull() {
            addCriterion("height is not null");
            return (Criteria) this;
        }

        public Criteria andHeightEqualTo(String value) {
            addCriterion("height =", value, "height");
            return (Criteria) this;
        }

        public Criteria andHeightNotEqualTo(String value) {
            addCriterion("height <>", value, "height");
            return (Criteria) this;
        }

        public Criteria andHeightGreaterThan(String value) {
            addCriterion("height >", value, "height");
            return (Criteria) this;
        }

        public Criteria andHeightGreaterThanOrEqualTo(String value) {
            addCriterion("height >=", value, "height");
            return (Criteria) this;
        }

        public Criteria andHeightLessThan(String value) {
            addCriterion("height <", value, "height");
            return (Criteria) this;
        }

        public Criteria andHeightLessThanOrEqualTo(String value) {
            addCriterion("height <=", value, "height");
            return (Criteria) this;
        }

        public Criteria andHeightLike(String value) {
            addCriterion("height like", value, "height");
            return (Criteria) this;
        }

        public Criteria andHeightNotLike(String value) {
            addCriterion("height not like", value, "height");
            return (Criteria) this;
        }

        public Criteria andHeightIn(List<String> values) {
            addCriterion("height in", values, "height");
            return (Criteria) this;
        }

        public Criteria andHeightNotIn(List<String> values) {
            addCriterion("height not in", values, "height");
            return (Criteria) this;
        }

        public Criteria andHeightBetween(String value1, String value2) {
            addCriterion("height between", value1, value2, "height");
            return (Criteria) this;
        }

        public Criteria andHeightNotBetween(String value1, String value2) {
            addCriterion("height not between", value1, value2, "height");
            return (Criteria) this;
        }

        public Criteria andWeightIsNull() {
            addCriterion("weight is null");
            return (Criteria) this;
        }

        public Criteria andWeightIsNotNull() {
            addCriterion("weight is not null");
            return (Criteria) this;
        }

        public Criteria andWeightEqualTo(String value) {
            addCriterion("weight =", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightNotEqualTo(String value) {
            addCriterion("weight <>", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightGreaterThan(String value) {
            addCriterion("weight >", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightGreaterThanOrEqualTo(String value) {
            addCriterion("weight >=", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightLessThan(String value) {
            addCriterion("weight <", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightLessThanOrEqualTo(String value) {
            addCriterion("weight <=", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightLike(String value) {
            addCriterion("weight like", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightNotLike(String value) {
            addCriterion("weight not like", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightIn(List<String> values) {
            addCriterion("weight in", values, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightNotIn(List<String> values) {
            addCriterion("weight not in", values, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightBetween(String value1, String value2) {
            addCriterion("weight between", value1, value2, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightNotBetween(String value1, String value2) {
            addCriterion("weight not between", value1, value2, "weight");
            return (Criteria) this;
        }

        public Criteria andAddressIsNull() {
            addCriterion("address is null");
            return (Criteria) this;
        }

        public Criteria andAddressIsNotNull() {
            addCriterion("address is not null");
            return (Criteria) this;
        }

        public Criteria andAddressEqualTo(String value) {
            addCriterion("address =", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotEqualTo(String value) {
            addCriterion("address <>", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThan(String value) {
            addCriterion("address >", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThanOrEqualTo(String value) {
            addCriterion("address >=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThan(String value) {
            addCriterion("address <", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThanOrEqualTo(String value) {
            addCriterion("address <=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLike(String value) {
            addCriterion("address like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotLike(String value) {
            addCriterion("address not like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressIn(List<String> values) {
            addCriterion("address in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotIn(List<String> values) {
            addCriterion("address not in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressBetween(String value1, String value2) {
            addCriterion("address between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotBetween(String value1, String value2) {
            addCriterion("address not between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andHealthIsNull() {
            addCriterion("health is null");
            return (Criteria) this;
        }

        public Criteria andHealthIsNotNull() {
            addCriterion("health is not null");
            return (Criteria) this;
        }

        public Criteria andHealthEqualTo(String value) {
            addCriterion("health =", value, "health");
            return (Criteria) this;
        }

        public Criteria andHealthNotEqualTo(String value) {
            addCriterion("health <>", value, "health");
            return (Criteria) this;
        }

        public Criteria andHealthGreaterThan(String value) {
            addCriterion("health >", value, "health");
            return (Criteria) this;
        }

        public Criteria andHealthGreaterThanOrEqualTo(String value) {
            addCriterion("health >=", value, "health");
            return (Criteria) this;
        }

        public Criteria andHealthLessThan(String value) {
            addCriterion("health <", value, "health");
            return (Criteria) this;
        }

        public Criteria andHealthLessThanOrEqualTo(String value) {
            addCriterion("health <=", value, "health");
            return (Criteria) this;
        }

        public Criteria andHealthLike(String value) {
            addCriterion("health like", value, "health");
            return (Criteria) this;
        }

        public Criteria andHealthNotLike(String value) {
            addCriterion("health not like", value, "health");
            return (Criteria) this;
        }

        public Criteria andHealthIn(List<String> values) {
            addCriterion("health in", values, "health");
            return (Criteria) this;
        }

        public Criteria andHealthNotIn(List<String> values) {
            addCriterion("health not in", values, "health");
            return (Criteria) this;
        }

        public Criteria andHealthBetween(String value1, String value2) {
            addCriterion("health between", value1, value2, "health");
            return (Criteria) this;
        }

        public Criteria andHealthNotBetween(String value1, String value2) {
            addCriterion("health not between", value1, value2, "health");
            return (Criteria) this;
        }

        public Criteria andMarryIsNull() {
            addCriterion("marry is null");
            return (Criteria) this;
        }

        public Criteria andMarryIsNotNull() {
            addCriterion("marry is not null");
            return (Criteria) this;
        }

        public Criteria andMarryEqualTo(String value) {
            addCriterion("marry =", value, "marry");
            return (Criteria) this;
        }

        public Criteria andMarryNotEqualTo(String value) {
            addCriterion("marry <>", value, "marry");
            return (Criteria) this;
        }

        public Criteria andMarryGreaterThan(String value) {
            addCriterion("marry >", value, "marry");
            return (Criteria) this;
        }

        public Criteria andMarryGreaterThanOrEqualTo(String value) {
            addCriterion("marry >=", value, "marry");
            return (Criteria) this;
        }

        public Criteria andMarryLessThan(String value) {
            addCriterion("marry <", value, "marry");
            return (Criteria) this;
        }

        public Criteria andMarryLessThanOrEqualTo(String value) {
            addCriterion("marry <=", value, "marry");
            return (Criteria) this;
        }

        public Criteria andMarryLike(String value) {
            addCriterion("marry like", value, "marry");
            return (Criteria) this;
        }

        public Criteria andMarryNotLike(String value) {
            addCriterion("marry not like", value, "marry");
            return (Criteria) this;
        }

        public Criteria andMarryIn(List<String> values) {
            addCriterion("marry in", values, "marry");
            return (Criteria) this;
        }

        public Criteria andMarryNotIn(List<String> values) {
            addCriterion("marry not in", values, "marry");
            return (Criteria) this;
        }

        public Criteria andMarryBetween(String value1, String value2) {
            addCriterion("marry between", value1, value2, "marry");
            return (Criteria) this;
        }

        public Criteria andMarryNotBetween(String value1, String value2) {
            addCriterion("marry not between", value1, value2, "marry");
            return (Criteria) this;
        }

        public Criteria andSelfcheckIsNull() {
            addCriterion("selfcheck is null");
            return (Criteria) this;
        }

        public Criteria andSelfcheckIsNotNull() {
            addCriterion("selfcheck is not null");
            return (Criteria) this;
        }

        public Criteria andSelfcheckEqualTo(String value) {
            addCriterion("selfcheck =", value, "selfcheck");
            return (Criteria) this;
        }

        public Criteria andSelfcheckNotEqualTo(String value) {
            addCriterion("selfcheck <>", value, "selfcheck");
            return (Criteria) this;
        }

        public Criteria andSelfcheckGreaterThan(String value) {
            addCriterion("selfcheck >", value, "selfcheck");
            return (Criteria) this;
        }

        public Criteria andSelfcheckGreaterThanOrEqualTo(String value) {
            addCriterion("selfcheck >=", value, "selfcheck");
            return (Criteria) this;
        }

        public Criteria andSelfcheckLessThan(String value) {
            addCriterion("selfcheck <", value, "selfcheck");
            return (Criteria) this;
        }

        public Criteria andSelfcheckLessThanOrEqualTo(String value) {
            addCriterion("selfcheck <=", value, "selfcheck");
            return (Criteria) this;
        }

        public Criteria andSelfcheckLike(String value) {
            addCriterion("selfcheck like", value, "selfcheck");
            return (Criteria) this;
        }

        public Criteria andSelfcheckNotLike(String value) {
            addCriterion("selfcheck not like", value, "selfcheck");
            return (Criteria) this;
        }

        public Criteria andSelfcheckIn(List<String> values) {
            addCriterion("selfcheck in", values, "selfcheck");
            return (Criteria) this;
        }

        public Criteria andSelfcheckNotIn(List<String> values) {
            addCriterion("selfcheck not in", values, "selfcheck");
            return (Criteria) this;
        }

        public Criteria andSelfcheckBetween(String value1, String value2) {
            addCriterion("selfcheck between", value1, value2, "selfcheck");
            return (Criteria) this;
        }

        public Criteria andSelfcheckNotBetween(String value1, String value2) {
            addCriterion("selfcheck not between", value1, value2, "selfcheck");
            return (Criteria) this;
        }

        public Criteria andCompanycheckIsNull() {
            addCriterion("companycheck is null");
            return (Criteria) this;
        }

        public Criteria andCompanycheckIsNotNull() {
            addCriterion("companycheck is not null");
            return (Criteria) this;
        }

        public Criteria andCompanycheckEqualTo(String value) {
            addCriterion("companycheck =", value, "companycheck");
            return (Criteria) this;
        }

        public Criteria andCompanycheckNotEqualTo(String value) {
            addCriterion("companycheck <>", value, "companycheck");
            return (Criteria) this;
        }

        public Criteria andCompanycheckGreaterThan(String value) {
            addCriterion("companycheck >", value, "companycheck");
            return (Criteria) this;
        }

        public Criteria andCompanycheckGreaterThanOrEqualTo(String value) {
            addCriterion("companycheck >=", value, "companycheck");
            return (Criteria) this;
        }

        public Criteria andCompanycheckLessThan(String value) {
            addCriterion("companycheck <", value, "companycheck");
            return (Criteria) this;
        }

        public Criteria andCompanycheckLessThanOrEqualTo(String value) {
            addCriterion("companycheck <=", value, "companycheck");
            return (Criteria) this;
        }

        public Criteria andCompanycheckLike(String value) {
            addCriterion("companycheck like", value, "companycheck");
            return (Criteria) this;
        }

        public Criteria andCompanycheckNotLike(String value) {
            addCriterion("companycheck not like", value, "companycheck");
            return (Criteria) this;
        }

        public Criteria andCompanycheckIn(List<String> values) {
            addCriterion("companycheck in", values, "companycheck");
            return (Criteria) this;
        }

        public Criteria andCompanycheckNotIn(List<String> values) {
            addCriterion("companycheck not in", values, "companycheck");
            return (Criteria) this;
        }

        public Criteria andCompanycheckBetween(String value1, String value2) {
            addCriterion("companycheck between", value1, value2, "companycheck");
            return (Criteria) this;
        }

        public Criteria andCompanycheckNotBetween(String value1, String value2) {
            addCriterion("companycheck not between", value1, value2, "companycheck");
            return (Criteria) this;
        }

        public Criteria andUdegreeIsNull() {
            addCriterion("udegree is null");
            return (Criteria) this;
        }

        public Criteria andUdegreeIsNotNull() {
            addCriterion("udegree is not null");
            return (Criteria) this;
        }

        public Criteria andUdegreeEqualTo(String value) {
            addCriterion("udegree =", value, "udegree");
            return (Criteria) this;
        }

        public Criteria andUdegreeNotEqualTo(String value) {
            addCriterion("udegree <>", value, "udegree");
            return (Criteria) this;
        }

        public Criteria andUdegreeGreaterThan(String value) {
            addCriterion("udegree >", value, "udegree");
            return (Criteria) this;
        }

        public Criteria andUdegreeGreaterThanOrEqualTo(String value) {
            addCriterion("udegree >=", value, "udegree");
            return (Criteria) this;
        }

        public Criteria andUdegreeLessThan(String value) {
            addCriterion("udegree <", value, "udegree");
            return (Criteria) this;
        }

        public Criteria andUdegreeLessThanOrEqualTo(String value) {
            addCriterion("udegree <=", value, "udegree");
            return (Criteria) this;
        }

        public Criteria andUdegreeLike(String value) {
            addCriterion("udegree like", value, "udegree");
            return (Criteria) this;
        }

        public Criteria andUdegreeNotLike(String value) {
            addCriterion("udegree not like", value, "udegree");
            return (Criteria) this;
        }

        public Criteria andUdegreeIn(List<String> values) {
            addCriterion("udegree in", values, "udegree");
            return (Criteria) this;
        }

        public Criteria andUdegreeNotIn(List<String> values) {
            addCriterion("udegree not in", values, "udegree");
            return (Criteria) this;
        }

        public Criteria andUdegreeBetween(String value1, String value2) {
            addCriterion("udegree between", value1, value2, "udegree");
            return (Criteria) this;
        }

        public Criteria andUdegreeNotBetween(String value1, String value2) {
            addCriterion("udegree not between", value1, value2, "udegree");
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