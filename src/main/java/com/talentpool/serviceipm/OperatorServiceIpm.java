package com.talentpool.serviceipm;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.talentpool.dao.LogininfoMapper;
import com.talentpool.dao.OperatorinfoMapper;
import com.talentpool.dao.UserinfoMapper;
import com.talentpool.po.Logininfo;
import com.talentpool.po.LogininfoExample;
import com.talentpool.po.LogininfoExample.Criteria;
import com.talentpool.po.Operatorinfo;
import com.talentpool.po.OperatorinfoExample;
import com.talentpool.po.Userinfo;
import com.talentpool.po.UserinfoExample;
import com.talentpool.service.OperatorService;

public class OperatorServiceIpm implements OperatorService {

	@Autowired
	private OperatorinfoMapper mapper2;
	@Autowired
	private LogininfoMapper loginmapper;
	@Autowired
	private UserinfoMapper usermapper;
	// 查询所有的操作员
	@Transactional(readOnly = true, propagation = Propagation.NOT_SUPPORTED)
	public Map<String, Object> Opquery() {
		OperatorinfoExample example = new OperatorinfoExample();
		com.talentpool.po.OperatorinfoExample.Criteria c = example.createCriteria();
		c.andIdIsNotNull();
		List<Operatorinfo> list = mapper2.selectByExample(example);
		Map<String, Object> map = new HashMap<String, Object>();
		if (list.size() <= 0) {
			map.put("result", "2");
			return map;
		} else {
			String status = "";
			for (Operatorinfo operatorinfo : list) {
				status = operatorinfo.getStatus();
				if (status.equals("1")) {
					operatorinfo.setStatus("已启用");
				} else {
					operatorinfo.setStatus("已停用");
				}
			}

			map.put("opertors", list);
			map.put("result", "1");
			return map;
		}

	}

	// 删除一个op
	@Transactional
	public String Opdelete(String[] ids) {
		int i = 0;
		int j = 0;
		for (String id : ids) {
			 LogininfoExample example2=new LogininfoExample();
			 com.talentpool.po.LogininfoExample.Criteria criteria2= example2.createCriteria();
			 criteria2.andUsernameEqualTo(id);
			j=loginmapper.deleteByExample(example2);
			
			OperatorinfoExample example=new OperatorinfoExample();
			com.talentpool.po.OperatorinfoExample.Criteria criteria =example.createCriteria();
			criteria.andUsernameEqualTo(id);
			i=mapper2.deleteByExample(example);
			if(i<=0 && j<=0)
			{
				return "2";
			}
		}
		return "1";
	}

	// 添加一个员工
	@Transactional
	public String Opadd(Operatorinfo operatorinfo) {
		//查重
		LogininfoExample example=new LogininfoExample();
		Criteria criteria= example.createCriteria();
		criteria.andUsernameEqualTo(operatorinfo.getUsername());
		List<Logininfo> list=loginmapper.selectByExample(example);
		if (list.size() > 0) {
			return "0";
		} else {
			operatorinfo.setStatus("2");
			int i = mapper2.insertSelective(operatorinfo);
			Logininfo record=new Logininfo();
			record.setUsername(operatorinfo.getUsername());
			record.setPassword(operatorinfo.getPassword());
			record.setRole("2");
			int j=loginmapper.insertSelective(record);
			if (i > 0 && j>0) {
				return "1";
			} else {
				return "2";
			}
		}

	}

	// 修改员工
	@Transactional
	public String Opupdate(Operatorinfo operatorinfo) {
		int i = mapper2.updateByPrimaryKeySelective(operatorinfo);
		if (i > 0) {
			return "1";
		} else {
			return "2";
		}

	}

	// 修改状态
	@Transactional
	public String Opstatus(Integer id, String status) {
		Operatorinfo op = new Operatorinfo();
		op.setId(id);
		op.setStatus(status);
		int i = mapper2.updateByPrimaryKeySelective(op);
		if (i > 0) {
			return "1";
		} else {
			return "2";
		}
	}
	
	// 管理区域内的用户
	@Transactional(readOnly = true, propagation = Propagation.NOT_SUPPORTED)
	public Map<String, Object> OpUser(String username)
	{
				String date = new SimpleDateFormat("yyyy-MM-dd").format(new Date());
				String rdate=date.substring(0, date.indexOf("-"));
		
		OperatorinfoExample example=new OperatorinfoExample();
		com.talentpool.po.OperatorinfoExample.Criteria criteria= example.createCriteria();
		criteria.andUsernameEqualTo(username);
		List<Operatorinfo> list= mapper2.selectByExample(example);
		String area=list.get(0).getArea();
		
		UserinfoExample example2=new UserinfoExample();
		com.talentpool.po.UserinfoExample.Criteria criteria2 =example2.createCriteria();
		criteria2.andIdIsNotNull();
		List<Userinfo> list2=usermapper.selectByExample(example2);
		List<Userinfo> newlist=new ArrayList<Userinfo>();
		for (Userinfo userinfo : list2) {
			if(area.contains(userinfo.getProvince()))
			{
				String idcard=userinfo.getIdcard();
				String year=idcard.substring(6, 10);
				Integer age=Integer.parseInt(rdate)-Integer.parseInt(year);
				userinfo.setAge(age);
				String status = userinfo.getStatus();
				if (status.equals("1")) {
					userinfo.setStatus("已通过");
				} else if (status.equals("2")) {
					userinfo.setStatus("未通过");
				} else {
					userinfo.setStatus("待审核");
				}
				newlist.add(userinfo);
			}
		}
		Map<String, Object> map=new HashMap<String, Object>();
		if(newlist.size()>0)
		{
			map.put("result", "1");
			map.put("users", newlist);
		}else
		{
			map.put("result", "2");
		}
		return map;
	}
	
	@Transactional(readOnly = true, propagation = Propagation.NOT_SUPPORTED)
	public Map<String, Object> opuserDate(Date startdate, Date enddate, String name, String username) {
		Map<String, Object> map=OpUser(username);
		List<Userinfo> list=(List<Userinfo>) map.get("users");
		Map<String, Object> map2=new HashMap<String, Object>();
		if(startdate==null && enddate==null)
		{
			map2.put("result", "1");
			map2.put("users", list);
			return map2;
		}
		if(name!=null) 
		{
			List<Userinfo> newlist=new ArrayList<Userinfo>();
			for (Userinfo userinfo : list) {
				if(userinfo.getJoindate().after(startdate) && userinfo.getJoindate().before(enddate))
				{
					if(userinfo.getName().contains(name))
					{
						newlist.add(userinfo);
					}
					
				}else if(userinfo.getJoindate().compareTo(startdate)==0 || userinfo.getJoindate().compareTo(enddate)==0)
				{
					if(userinfo.getName().contains(name))
					{
						newlist.add(userinfo);
					}
				}
			}
			if(newlist.size()>0)
			{
				map2.put("result", "1");
				map2.put("users", newlist);
				return map2;
			}else
			{
				map2.put("result", "2");
				return map2;
			}
		}else
		{
			List<Userinfo> newlist=new ArrayList<Userinfo>();
			for (Userinfo userinfo : list) {
				if(userinfo.getJoindate().after(startdate) && userinfo.getJoindate().before(enddate))
				{
					newlist.add(userinfo);
				}else if(userinfo.getJoindate().compareTo(startdate)==0 || userinfo.getJoindate().compareTo(enddate)==0)
				{
					newlist.add(userinfo);
				}
			}
			if(newlist.size()>0)
			{
				map2.put("result", "1");
				map2.put("users", newlist);
				return map2;
			}else
			{
				map2.put("result", "2");
				return map2;
			}
		}
	}

}
