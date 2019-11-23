package com.talentpool.controller;

import java.io.BufferedReader;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.commons.CommonsMultipartResolver;

import com.talentpool.po.Educationbackground;
import com.talentpool.po.Member;
import com.talentpool.po.Pexperience;
import com.talentpool.po.Qualification;
import com.talentpool.po.Userinfo;
import com.talentpool.po.Workex;
import com.talentpool.po.requsetParam;
import com.talentpool.service.UserService;

import net.sf.json.JSONObject;

@Controller
@ResponseBody
public class UserWork {
	@Autowired
	private UserService userservice;

	// 用户更新
	@RequestMapping(value = "/userupdate", method = RequestMethod.POST)
	public Map<String, String> updateUser(
			HttpServletResponse response, @RequestBody requsetParam param) {
		response.addHeader("Access-Control-Allow-Origin", "*");
		Userinfo userinfo=param.getUserinfo();
		Educationbackground edu=param.getEdu();
		Member mem=param.getMem();
		Pexperience pex=param.getPex();
		Qualification qua=param.getQua();
		Workex work=param.getWork();
		Map<String, String> map= userservice.zcmaintenance(userinfo,edu,mem,pex,qua,work);
		return map;
	}
	//更新照片
	@RequestMapping(value = "/userupdatePhoto", method = RequestMethod.POST)
	public Map<String, String> updateUserPhoto(MultipartFile[] photo, HttpServletRequest request,String image_name,String usernames,
			HttpServletResponse response) {
		response.addHeader("Access-Control-Allow-Origin", "*");
		Map<String, String> map= userservice.updatePhoto(photo, request, image_name, usernames);
		return map;
	}

	// 单个删除批量
	@RequestMapping(value = "/userdelete", method = RequestMethod.POST)
	public Map<String, Object> userdelete(String[] id, HttpServletResponse response) {
		response.addHeader("Access-Control-Allow-Origin", "*");
		String s = userservice.userDelete(id);
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("result", s);
		return map;
	}

	// 批量审核
	@RequestMapping(value = "/userstatus", method = RequestMethod.POST)
	public Map<String, Object> opstatus(String[] id, HttpServletResponse response, String status) {
		response.addHeader("Access-Control-Allow-Origin", "*");
		String s = userservice.userShen(id, status);
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("result", s);
		return map;
	}

	// 查询所有的用户
	@RequestMapping(value = "/userquery", method = RequestMethod.GET)
	public Map<String, Object> userquery(HttpServletResponse response) {
		response.addHeader("Access-Control-Allow-Origin", "*");
		Map<String, Object> map = new HashMap<String, Object>();
		map = userservice.userQuery();
		return map;
	}

	// 根据账号查询用户
	@RequestMapping(value = "/userquery/{username}", method = RequestMethod.GET)
	public Map<String, Object> userqueryByusername(HttpServletResponse response, @PathVariable("username") String username) {
		response.addHeader("Access-Control-Allow-Origin", "*");
		Map<String, Object> map= userservice.userQueryByname(username);
		System.out.println(map+"map");
		JSONObject j=JSONObject.fromObject(map);
		System.out.println(j);
		return map;
	}

	// 更改密码
	@RequestMapping(value = "/userUpass", method = RequestMethod.POST)
	public String userUpdatePass(HttpServletResponse response, String old_password, String new_password,
			String username) {
		response.addHeader("Access-Control-Allow-Origin", "*");
		String s = userservice.userUpdatePass(old_password, new_password, username);
		return s;
	}
	
	@RequestMapping(value = "/userBydate", method = RequestMethod.POST)
	public Map<String, Object> userQueryBydate(@DateTimeFormat(pattern = "yyyy-MM-dd")Date minDate,@DateTimeFormat(pattern = "yyyy-MM-dd")Date maxDate,HttpServletResponse response,String name)
	{
		response.addHeader("Access-Control-Allow-Origin", "*");
		Map<String, Object> map=new HashMap<String, Object>();
		map=userservice.userQueryBydate(minDate,maxDate,name);
		return map;
	}
	
	
	

}
