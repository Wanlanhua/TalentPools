package com.talentpool.service;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.commons.CommonsMultipartResolver;

import com.talentpool.po.Educationbackground;
import com.talentpool.po.Member;
import com.talentpool.po.Pexperience;
import com.talentpool.po.Qualification;
import com.talentpool.po.Userinfo;
import com.talentpool.po.Workex;

public interface OtherService {
	// 登陆
	public  Map<String, String> Login(String username, String password, HttpServletRequest request);
	// 注册1
	public String registered1(Userinfo userinfo, HttpServletRequest request,Educationbackground edu,Member member,Pexperience experience,Qualification qua,Workex workex);
	// 校验
	public String jiaoyan(String username);
	// 注册2照片
	public String registeredPhoto(HttpServletRequest request,
			MultipartFile user_icon,MultipartFile idcard_z,MultipartFile career,MultipartFile idcard_f,Userinfo userinfo,MultipartFile otherphoto1,MultipartFile otherphoto2);
	//导出
	public String Daochu1(HttpServletRequest request);
	public String Daochu2(HttpServletRequest request);
}
