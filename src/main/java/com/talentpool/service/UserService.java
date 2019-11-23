package com.talentpool.service;

import java.util.Date;
import java.util.List;
import java.util.Map;
import javax.servlet.http.HttpServletRequest;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.commons.CommonsMultipartResolver;

import com.talentpool.po.Educationbackground;
import com.talentpool.po.Member;
import com.talentpool.po.Pexperience;
import com.talentpool.po.Qualification;
import com.talentpool.po.Userinfo;
import com.talentpool.po.Workex;

public interface UserService {
	// 注册用户对自己的信息维护
	public Map<String, String> zcmaintenance(Userinfo userinfo,  
			Educationbackground edu,Member member,Pexperience experience,Qualification qua,Workex workex);

	//更新照片
	public Map<String, String>updatePhoto(MultipartFile[] photo, HttpServletRequest request,String image_name,String usernames);
	// 单个删除批量
	public String userDelete(String[] ids);

	// 批量审核
	public String userShen(String id[], String status);

	// 查询所有的用户
	public Map<String, Object> userQuery();

	// 根据用户名查找用户
	public Map<String, Object> userQueryByname(String username);

	// 更改密码
	public String userUpdatePass(String oldpass, String newpass, String username);
	
	//根据日期范围进行查找用户 以及模糊查询
	public Map<String, Object> userQueryBydate(Date startdate,Date enddate,String name);
}
