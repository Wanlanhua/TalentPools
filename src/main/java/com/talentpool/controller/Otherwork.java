package com.talentpool.controller;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.commons.CommonsMultipartResolver;

import com.talentpool.po.Educationbackground;
import com.talentpool.po.Member;
import com.talentpool.po.Pexperience;
import com.talentpool.po.Qualification;
import com.talentpool.po.Userinfo;
import com.talentpool.po.Workex;
import com.talentpool.service.OtherService;

@Controller

public class Otherwork {
	@Autowired
	private OtherService otherService;
	
	//注册1
	@RequestMapping(value = "/registered", method = RequestMethod.POST)
	@ResponseBody
	public String registered(HttpServletResponse response,HttpServletRequest request,
			Educationbackground edu,Member member,Pexperience experience,Qualification qua,Workex workex, Userinfo userinfo) {
		response.addHeader("Access-Control-Allow-Origin", "*");
		String i=otherService.registered1(userinfo, request,edu,member, experience, qua, workex);
		return i;
	}
	//注册2照片
	
	@CrossOrigin
	@RequestMapping(value = "/registeredphotos", method = RequestMethod.POST)
	@ResponseBody
	public String registeredPhoto(HttpServletRequest request,
			HttpServletResponse response, MultipartFile user_icon,MultipartFile idcard_z,MultipartFile career,MultipartFile idcard_f,Userinfo userinfo,MultipartFile other1,MultipartFile other2) {
		String i=otherService.registeredPhoto(request, user_icon, idcard_z, career, idcard_f, userinfo,other1,other2);
		return i;
	}
	
	// 校验
	@RequestMapping(value = "/jiaoyan", method = RequestMethod.POST)
	@ResponseBody
	public String jiaoyan(@RequestParam(value = "username", required = true) String username,
			HttpServletResponse response) {
		String result = otherService.jiaoyan(username);	
		response.addHeader("Access-Control-Allow-Origin", "*");
		return result;
	}
	// 登陆
	@RequestMapping(value = "/Login", method = RequestMethod.POST)
	@ResponseBody
	public Map<String, String> Login(String username, String password, HttpServletRequest request,
			HttpServletResponse response) {
		response.addHeader("Access-Control-Allow-Origin", "*");
		 Map<String, String> map = otherService.Login(username, password,request);
		 return map;
	}
	
	//导出用户
	@RequestMapping(value = "/Daochu1", method = RequestMethod.GET)
	@ResponseBody
	public ResponseEntity<byte[]> Daochu1(HttpServletRequest request,
			HttpServletResponse response) throws IOException {
		response.addHeader("Access-Control-Allow-Origin", "*");
		String path = otherService.Daochu1(request);
		File file = new File(path);
	    byte[] body = null;
	    InputStream is = new FileInputStream(file);
	    body = new byte[is.available()];
	    is.read(body);
	    HttpHeaders headers = new HttpHeaders();
	    headers.add("Content-Disposition", "attchement;filename=" + file.getName());
	    HttpStatus statusCode = HttpStatus.OK;
	    ResponseEntity<byte[]> entity = new ResponseEntity<byte[]>(body, headers, statusCode);
	    return entity;
	}
	//导出操作员
	@RequestMapping(value = "/Daochu2", method = RequestMethod.GET)
	@ResponseBody
	public ResponseEntity<byte[]> Daochu2(HttpServletRequest request,
			HttpServletResponse response) throws IOException {
		response.addHeader("Access-Control-Allow-Origin", "*");
		String path = otherService.Daochu2(request);
		File file = new File(path);
	    byte[] body = null;
	    InputStream is = new FileInputStream(file);
	    body = new byte[is.available()];
	    is.read(body);
	    HttpHeaders headers = new HttpHeaders();
	    headers.add("Content-Disposition", "attchement;filename=" + file.getName());
	    HttpStatus statusCode = HttpStatus.OK;
	    ResponseEntity<byte[]> entity = new ResponseEntity<byte[]>(body, headers, statusCode);
	    return entity;
	    
	}

}
