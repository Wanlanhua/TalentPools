package com.talentpool.serviceipm;

import java.io.File;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.commons.CommonsMultipartResolver;

import com.sun.javafx.scene.control.skin.EmbeddedTextContextMenuContent;
import com.talentpool.dao.EducationbackgroundMapper;
import com.talentpool.dao.LogininfoMapper;
import com.talentpool.dao.MemberMapper;
import com.talentpool.dao.PexperienceMapper;
import com.talentpool.dao.QualificationMapper;
import com.talentpool.dao.UserinfoMapper;
import com.talentpool.dao.WorkexMapper;
import com.talentpool.po.Educationbackground;
import com.talentpool.po.EducationbackgroundExample;
import com.talentpool.po.Logininfo;
import com.talentpool.po.LogininfoExample;
import com.talentpool.po.LogininfoExample.Criterion;
import com.talentpool.po.Member;
import com.talentpool.po.MemberExample;
import com.talentpool.po.Pexperience;
import com.talentpool.po.PexperienceExample;
import com.talentpool.po.Qualification;
import com.talentpool.po.QualificationExample;
import com.talentpool.po.Userinfo;
import com.talentpool.po.UserinfoExample;
import com.talentpool.po.UserinfoExample.Criteria;
import com.talentpool.po.Workex;
import com.talentpool.po.WorkexExample;
import com.talentpool.service.UserService;

public class UserServiceIpm implements UserService {
	@Autowired
	private UserinfoMapper mapper;
	@Autowired
	private LogininfoMapper loginmapper;
	@Autowired
	private EducationbackgroundMapper EducationbackgroundMapper;
	@Autowired
	private MemberMapper MemberMapper;
	@Autowired
	private QualificationMapper QualificationMapper;
	@Autowired
	private WorkexMapper WorkexMapper;
	@Autowired
	private PexperienceMapper PexperienceMapper;

	@Transactional
	// 注册用户对自己的信息维护
	public Map<String, String> zcmaintenance( Userinfo userinfo,   Educationbackground edu,   Member member,
			 Pexperience experience,  Qualification qua,  Workex workex) {
		Map<String, String> map = new HashMap<String, String>();
		String[] gzds = userinfo.getGzd().split("-");
		userinfo.setProvince(gzds[0]);
		userinfo.setCity(gzds[1]);
		userinfo.setArea(gzds[2]);
		UserinfoExample example = new UserinfoExample();
		Criteria criteria = example.createCriteria();
		criteria.andUsernameEqualTo(userinfo.getUsername());
		int j = mapper.updateByExampleSelective(userinfo, example);
		if (j <= 0) {
			map.put("result", "2");
			return map;
		}
		try {
			// 循环更新教育背景************************************************************************************************************
			if(!edu.getIds().equals(""))
			{
				
				String[] eduids = edu.getIds().split(";");
				//删除
				if(eduids.length>edu.getEstartdate().split(";").length)
				{
					for(int i=edu.getEstartdate().split(";").length;i<eduids.length;i++)
					{
						EducationbackgroundMapper.deleteByPrimaryKey(Integer.parseInt(eduids[i]));
					}
					
				}
				//在有教育背景的时候  修改已有的教育背景
				if(eduids.length==edu.getEstartdate().split(";").length)
				{
					for (int i = 0; i < eduids.length; i++) {
						Integer realid = Integer.parseInt(eduids[i]);
						Educationbackground newedu=new Educationbackground();
						newedu.setEstartdate(edu.getEstartdate().split(";")[i]);
						newedu.setEenddate(edu.getEenddate().split(";")[i]);
						newedu.setSchoolname(edu.getSchoolname().split(";")[i]);
						newedu.setSchoollocation(edu.getSchoollocation().split(";")[i]);
						newedu.setDegree(edu.getDegree().split(";")[i]);
						newedu.setTakedegree(edu.getTakedegree().split(";")[i]);
						EducationbackgroundExample eduexample = new EducationbackgroundExample();
						com.talentpool.po.EducationbackgroundExample.Criteria eduCriteria = eduexample.createCriteria();
						eduCriteria.andIdEqualTo(realid);
						j = EducationbackgroundMapper.updateByExampleSelective(newedu, eduexample);
						if (j <= 0) {
							map.put("result", "2");
							return map;
						}
					}
				}
		
				//在有教育背景的时候  用户增加教育背景
				if(edu.getEstartdate().split(";").length>eduids.length)
				{
					for (int i = eduids.length; i <	 edu.getEstartdate().split(";").length; i++) {
						Educationbackground newedu = new Educationbackground();
						newedu.setEusername(userinfo.getUsername());
						newedu.setEstartdate(edu.getEstartdate().split(";")[i]);
						newedu.setEenddate(edu.getEenddate().split(";")[i]);
						newedu.setDegree(edu.getDegree().split(";")[i]);
						newedu.setSchoolname(edu.getSchoolname().split(";")[i]);
						newedu.setSchoollocation(edu.getSchoollocation().split(";")[i]);
						newedu.setTakedegree(edu.getTakedegree().split(";")[i]);
						j = EducationbackgroundMapper.insertSelective(newedu);
						if (j < 0) {
							map.put("result", "2");
							return map;
						}
					}
				}
			}else
			{
				
				
				//在没有任何的教育背景下用户进行修改
				if(edu.getEstartdate().contains("-"))
				{
					String sn = edu.getEstartdate();
					String[] schoolstartdate = sn.split(";");
					int edulength = schoolstartdate.length;
					for (int i = 0; i <	 edulength; i++) {
						Educationbackground newedu = new Educationbackground();
						newedu.setEusername(userinfo.getUsername());
						newedu.setEstartdate(edu.getEstartdate().split(";")[i]);
						newedu.setEenddate(edu.getEenddate().split(";")[i]);
						newedu.setDegree(edu.getDegree().split(";")[i]);
						newedu.setSchoolname(edu.getSchoolname().split(";")[i]);
						newedu.setSchoollocation(edu.getSchoollocation().split(";")[i]);
						newedu.setTakedegree(edu.getTakedegree().split(";")[i]);
						j = EducationbackgroundMapper.insertSelective(newedu);
						if (j < 0) {
							map.put("result", "2");
							return map;
						}
					}
				}
			}
		
			// 循环更新工作经历************************************************************************************************************
			//在有工作经历的时候进行修改
			if(!workex.getIds().equals(""))
			{
				String[] worksid = workex.getIds().split(";");
				//删除
				if(worksid.length>workex.getWstartdate().split(";").length)
				{
					for(int i=workex.getWstartdate().split(";").length;i<worksid.length;i++)
					{
						WorkexMapper.deleteByPrimaryKey(Integer.parseInt(worksid[i]));
					}
				}
				
				//更新已有的工作经历
				if(worksid.length==workex.getWstartdate().split(";").length)
				{
					for (int i = 0; i < worksid.length; i++) {
						Integer realid = Integer.parseInt(worksid[i]);
						Workex newWorkex=new Workex();
						newWorkex.setWstartdate(workex.getWstartdate().split(";")[i]);
						newWorkex.setWenddate(workex.getWenddate().split(";")[i]);
						newWorkex.setJob(workex.getJob().split(";")[i]);
						newWorkex.setPost(workex.getPost().split(";")[i]);
						newWorkex.setResignreason(workex.getResignreason().split(";")[i]);
						newWorkex.setZtel(workex.getZtel().split(";")[i]);
						WorkexExample workexEmple = new WorkexExample();
						com.talentpool.po.WorkexExample.Criteria workexCriteria = workexEmple.createCriteria();
						workexCriteria.andIdEqualTo(realid);
						j = WorkexMapper.updateByExampleSelective(newWorkex, workexEmple);
						if (j <= 0) {
							map.put("result", "2");
							return map;
						}
					}
				}

				//在有了工作经历但要增加几条工作经历的时候  进行插入
				if(workex.getWstartdate().split(";").length>worksid.length)
				{
					for (int j2 = worksid.length; j2 <workex.getWstartdate().split(";").length; j2++) {
						Workex newworkex = new Workex();
						newworkex.setWuesrname(userinfo.getUsername());
						newworkex.setJob(workex.getJob().split(";")[j2]);
						newworkex.setPost(workex.getPost().split(";")[j2]);
						newworkex.setWstartdate(workex.getWstartdate().split(";")[j2]);
						newworkex.setWenddate(workex.getWenddate().split(";")[j2]);
						newworkex.setResignreason(workex.getResignreason().split(";")[j2]);
						newworkex.setZtel(workex.getZtel().split(";")[j2]);
						j = WorkexMapper.insertSelective(newworkex);
						if (j < 0) {
							map.put("result", "2");
							return map;
						}
					}
				}
			}else
			{
				//没有任何的工作经历的情况下 用户要进行修改
				if(workex.getWstartdate().contains("-"))
				{
					String wex = workex.getWstartdate();
					String[] jobstartdate = wex.split(";");
					int workexlength = jobstartdate.length;
					for (int i = 0; i < workexlength; i++) {
						Workex newworkex = new Workex();
						newworkex.setWuesrname(userinfo.getUsername());
						newworkex.setJob(workex.getJob().split(";")[i]);//
						newworkex.setPost(workex.getPost().split(";")[i]);
						newworkex.setWstartdate(workex.getWstartdate().split(";")[i]);
						newworkex.setWenddate(workex.getWenddate().split(";")[i]);
						newworkex.setResignreason(workex.getResignreason().split(";")[i]);
						newworkex.setZtel(workex.getZtel().split(";")[i]);
						j = WorkexMapper.insertSelective(newworkex);
						if (j < 0) {
							map.put("result", "2");
							return map;
						}
					}
				}
			}
		
			// 循环更新培训经历************************************************************************************************************
			//在有培训经历的时候 进行修改
			if(!experience.getIds().equals(""))
			{
				
				String[] Pexid = experience.getIds().split(";");
				//删除
				if(Pexid.length>experience.getPtime().split(";").length)
				{
					for(int i=experience.getPtime().split(";").length;i<Pexid.length;i++)
					{
						PexperienceMapper.deleteByPrimaryKey(Integer.parseInt(Pexid[i]));
					}
				}
				//修改已有的培训经历
				if(Pexid.length==experience.getPtime().split(";").length)
				{
					for (int i = 0; i < Pexid.length; i++) {
						Integer realid = Integer.parseInt(Pexid[i]);
						Pexperience newpex=new Pexperience();
						newpex.setPtime(experience.getPtime().split(";")[i]);
						newpex.setPplace(experience.getPplace().split(";")[i]);
						newpex.setPcontent(experience.getPcontent().split(";")[i]);
						PexperienceExample Pexemple = new PexperienceExample();
						com.talentpool.po.PexperienceExample.Criteria PexCriteria = Pexemple.createCriteria();
						PexCriteria.andIdEqualTo(realid);
						j = PexperienceMapper.updateByExampleSelective(newpex, Pexemple);
						if (j <= 0) {
							map.put("result", "2");
							return map;
						}
					}
				}
		
				//在有了培训经历的但要增加培训经历的时候 进行插入
				if(experience.getPtime().split(";").length>Pexid.length)
				{
					for (int i = Pexid.length; i < experience.getPtime().split(";").length; i++) {
						Pexperience record = new Pexperience();
						record.setPusername(userinfo.getUsername());
						record.setPplace(experience.getPplace().split(";")[i]);
						record.setPtime(experience.getPtime().split(";")[i]);
						record.setPcontent(experience.getPcontent().split(";")[i]);
						j = PexperienceMapper.insertSelective(record);
						if (j < 0) {
							map.put("result", "2");
							return map;
						}
					}
				}
			}else
			{
				//在没有任何的培训经历的时候 用户要增加培训经历
				if(experience.getPtime().length()>3)
				{
					String ex = experience.getPtime();
					String[] ptime = ex.split(";");
					int experiencelength = ptime.length;
					for (int i = 0; i < experiencelength; i++) {
						Pexperience record = new Pexperience();
						record.setPusername(userinfo.getUsername());
						record.setPplace(experience.getPplace().split(";")[i]);
						record.setPtime(experience.getPtime().split(";")[i]);
						record.setPcontent(experience.getPcontent().split(";")[i]);
						j = PexperienceMapper.insertSelective(record);
						if (j < 0) {
							map.put("result", "2");
							return map;
						}
					}
				}
			}
		
			// 循环更新资格证书************************************************************************************************************
			//在有资格证书的时候 进行修改
			if(!qua.getIds().equals(""))
			{
				
				String[] Quaid = qua.getIds().split(";");
				//删除
				if(Quaid.length>qua.getQtime().split(";").length)
				{

					for(int i=qua.getQtime().split(";").length;i<Quaid.length;i++)
					{
						QualificationMapper.deleteByPrimaryKey(Integer.parseInt(Quaid[i]));
					}
				}
				
				//修改已有的资格证书
				if(Quaid.length==qua.getQtime().split(";").length)
				{
					for (int i = 0; i < Quaid.length; i++) {
						Integer realid = Integer.parseInt(Quaid[i]);
						Qualification newqua=new Qualification();
						newqua.setQname(qua.getQname().split(";")[i]);
						newqua.setQplace(qua.getQplace().split(";")[i]);
						newqua.setQtime(qua.getQtime().split(";")[i]);
						QualificationExample quaExample = new QualificationExample();
						com.talentpool.po.QualificationExample.Criteria quaCriteria = quaExample.createCriteria();
						quaCriteria.andIdEqualTo(realid);
						j = QualificationMapper.updateByExampleSelective(newqua, quaExample);
						if (j <= 0) {
							map.put("result", "2");
							return map;
						}
					}
				}
		
				//在有资格证书的时候  用户进行增加
				if(qua.getQtime().split(";").length>Quaid.length)
				{
					for (int i = Quaid.length; i < qua.getQtime().split(";").length; i++) {
						Qualification newqua = new Qualification();
						newqua.setQusername(userinfo.getUsername());
						newqua.setQtime(qua.getQtime().split(";")[i]);
						newqua.setQname(qua.getQname().split(";")[i]);
						newqua.setQplace(qua.getQplace().split(";")[i]);
						j = QualificationMapper.insertSelective(newqua);
						if (j < 0) {
							map.put("result", "2");
							return map;
						}
					}
				}
			}else
			{
				//在没有任何的资格证书的时候 用户要增加资格证书
				if(qua.getQtime().contains("-"))
				{
					String quation = qua.getQtime();
					String[] qtime = quation.split(";");
					int qualength = qtime.length;
					for (int i = 0; i < qualength; i++) {
						Qualification newqua = new Qualification();
						newqua.setQusername(userinfo.getUsername());
						newqua.setQtime(qua.getQtime().split(";")[i]);
						newqua.setQname(qua.getQname().split(";")[i]);
						newqua.setQplace(qua.getQplace().split(";")[i]);
						j = QualificationMapper.insertSelective(newqua);
						if (j < 0) {
							map.put("result", "2");
							return map;
						}
					}
				}
			}
		
			// 循环更新家庭成员************************************************************************************************************
			//在有家庭成员的时候 进行修改
			if(!member.getIds().equals(""))
			{
				String[] memberid = member.getIds().split(";");
				System.out.println(memberid.length);
				System.out.println(member.getMlink().split(";").length);
				
				//删除
				if(memberid.length>member.getMlink().split(";").length) {
					for(int i=member.getMlink().split(";").length;i<memberid.length;i++)
					{
						MemberMapper.deleteByPrimaryKey(Integer.parseInt(memberid[i]));
					}
				}
				//在有家庭成员的时候 修改已有的家庭成员
				if(memberid.length==member.getMlink().split(";").length) {
					for (int i = 0; i < memberid.length; i++) {
						Integer realid = Integer.parseInt(memberid[i]);
						Member newmem=new Member();
						newmem.setMlink(member.getMlink().split(";")[i]);
						newmem.setMname(member.getMname().split(";")[i]);
						newmem.setMworkplace(member.getMworkplace().split(";")[i]);
						newmem.setMtel(member.getMtel().split(";")[i]);
						MemberExample memexample = new MemberExample();
						com.talentpool.po.MemberExample.Criteria memcriteria = memexample.createCriteria();
						memcriteria.andIdEqualTo(realid);
						j = MemberMapper.updateByExampleSelective(newmem, memexample);
						if (j <= 0) {
							map.put("result", "2");
							return map;
						}
					}
				}
		
				//在有家庭成员的时候 用户要增加家庭
				if(member.getMlink().split(";").length>memberid.length)
				{
					for (int i = memberid.length; i < member.getMlink().split(";").length; i++) {
						Member newmember = new Member();
						newmember.setMusername(userinfo.getUsername());
						newmember.setMlink(member.getMlink().split(";")[i]);//
						newmember.setMname(member.getMname().split(";")[i]);
						newmember.setMtel(member.getMtel().split(";")[i]);
						newmember.setMworkplace(member.getMworkplace().split(";")[i]);
						j = MemberMapper.insertSelective(newmember);
						if (j < 0) {
							map.put("result", "2");
							return map;
						}
					}
				}
			}else
			{
				//在没有任何家庭成员的时候  用户进行修改
				if(member.getMlink().length()>1)
				{
					String mem = member.getMlink();
					String[] link = mem.split(";");
					int memberlength = link.length;
					for (int i = 0; i < memberlength; i++) {
						Member newmember = new Member();
						newmember.setMusername(userinfo.getUsername());
						newmember.setMlink(link[i]);//
						newmember.setMname(member.getMname().split(";")[i]);
						newmember.setMtel(member.getMtel().split(";")[i]);
						newmember.setMworkplace(member.getMworkplace().split(";")[i]);
						j = MemberMapper.insertSelective(newmember);
						if (j < 0) {
							map.put("result", "2");
							return map;
						}
					}
				}
			}
		} catch (Exception e) {
			 throw new RuntimeException();
		}



		map.put("result", "1");
		return map;
	}

	// 更新照片
	public Map<String, String> updatePhoto(MultipartFile[] itemspics, HttpServletRequest request, String image_name,
			String usernames) {
		// 上传图片长度
		String icon = "";
		Map<String, String> map = new HashMap<String, String>();
		if (itemspics != null) {
			int leng = itemspics.length;
			// 存取路径的文件夹
			// String picpath="F:\\testpic\\";
			String picpath = request.getSession().getServletContext().getRealPath("") + "pic\\";
			// 设置允许上传文件类型
			String suffixList = ".jpg,.png,.ico,.bmp,.jpeg";
			for (int j = 0; j < leng; j++) {
				MultipartFile file =  itemspics[j];
				if (!file.isEmpty()) {
					// 原名
					String yuanshiName = file.getOriginalFilename();
					// 后缀名
					String hzm = yuanshiName.substring(yuanshiName.lastIndexOf("."));
					if (suffixList.contains(hzm.trim().toLowerCase())) {
						// 新名
						String newName = "";
						if (image_name.equals("user_icon")) {
							newName = usernames + 0 + ".png";
							icon = "1";
						} else if (image_name.equals("idcard_z")) {
							newName = usernames + 1 + ".png";
							icon = "1";
						} else if (image_name.equals("idcard_f")) {
							newName = usernames + 2 + ".png";
							icon = "1";
						} else if (image_name.equals("work")) {
							newName = usernames + 3 + ".png";
							icon = "1";
						} else if(image_name.equals("otherphoto1")){
							newName = usernames + 5 + ".png";
							icon = "1";
						}else if(image_name.equals("otherphoto2")){
							newName = usernames + 6 + ".png";
							icon = "1";
						}else {
							newName = usernames + 4 + ".png";
							icon = "1";
						}
						map.put("newname", "pic/" + newName);
						if (!new File(picpath + newName).exists()) {
							new File(picpath + newName).mkdirs();
						}
						File newfile = new File(picpath + newName);
						try {
							file.transferTo(newfile);
						} catch (IllegalStateException e) {
							e.printStackTrace();
						} catch (IOException e) {
							e.printStackTrace();
						}
					} else {
						return null;
					}
				}

			}
		}
		map.put("result", icon);
		return map;
	}

	// 单个删除批量 ids:为username
	@Transactional
	public String userDelete(String[] ids) {
		int i = 0;
		int j = 0;
		for (String id : ids) {
			// 删除用户信息表中的
			UserinfoExample example = new UserinfoExample();
			Criteria criteria = example.createCriteria();
			criteria.andUsernameEqualTo(id);
			i = mapper.deleteByExample(example);
			// 删除登陆表中的
			LogininfoExample example2 = new LogininfoExample();
			com.talentpool.po.LogininfoExample.Criteria criteria2 = example2.createCriteria();
			criteria2.andUsernameEqualTo(id);
			j = loginmapper.deleteByExample(example2);
			// 删除教育背景中的
			EducationbackgroundExample eduexample = new EducationbackgroundExample();
			com.talentpool.po.EducationbackgroundExample.Criteria Educriteria = eduexample.createCriteria();
			Educriteria.andEusernameEqualTo(id);
			EducationbackgroundMapper.deleteByExample(eduexample);
			// 删除工作经历中的
			WorkexExample Workexample = new WorkexExample();
			com.talentpool.po.WorkexExample.Criteria WorkexCriteria = Workexample.createCriteria();
			WorkexCriteria.andWuesrnameEqualTo(id);
			WorkexMapper.deleteByExample(Workexample);
			// 删除培训经历中的
			PexperienceExample Pexperexample = new PexperienceExample();
			com.talentpool.po.PexperienceExample.Criteria PexreCriteria = Pexperexample.createCriteria();
			PexreCriteria.andPusernameEqualTo(id);
			PexperienceMapper.deleteByExample(Pexperexample);
			// 删除资格证书中的
			QualificationExample Quaexample = new QualificationExample();
			com.talentpool.po.QualificationExample.Criteria quaCriteria = Quaexample.createCriteria();
			quaCriteria.andQusernameEqualTo(id);
			QualificationMapper.deleteByExample(Quaexample);
			// 删除家庭成员中的
			MemberExample Memexample = new MemberExample();
			com.talentpool.po.MemberExample.Criteria MemCriteria = Memexample.createCriteria();
			MemCriteria.andMusernameEqualTo(id);
			MemberMapper.deleteByExample(Memexample);
			if (i <= 0 && j <= 0) {
				return "2";
			}
		}
		return "1";
	}

	// 批量审核
	@Transactional
	public String userShen(String[] ids, String status) {
		int i = 0;
		for (String id : ids) {
			Userinfo record = new Userinfo();
			record.setStatus(status);
			UserinfoExample example = new UserinfoExample();
			Criteria criteria = example.createCriteria();
			criteria.andUsernameEqualTo(id);
			mapper.updateByExampleSelective(record, example);
			if (i < 0) {
				return "2";
			}
		}
		return "1";

	}

	// 查询所有的用户
	@Transactional(readOnly = true, propagation = Propagation.NOT_SUPPORTED)
	public Map<String, Object> userQuery() {
		UserinfoExample example = new UserinfoExample();
		Criteria criteria = example.createCriteria();
		criteria.andIdIsNotNull();
		List<Userinfo> list = mapper.selectByExample(example);
		// 当前日期
		String date = new SimpleDateFormat("yyyy-MM-dd").format(new Date());
		String rdate = date.substring(0, date.indexOf("-"));
		for (Userinfo userinfo : list) {
			String status = userinfo.getStatus();
			if (status.equals("1")) {
				userinfo.setStatus("已通过");
			} else if (status.equals("2")) {
				userinfo.setStatus("未通过");
			} else {
				userinfo.setStatus("待审核");
			}
			String idcard = userinfo.getIdcard();
			String year = idcard.substring(6, 10);
			Integer age = Integer.parseInt(rdate) - Integer.parseInt(year);
			userinfo.setAge(age);
		}
		Map<String, Object> map = new HashMap<String, Object>();
		if (list.size() <= 0) {
			map.put("result", "2");
		} else {
			map.put("result", "1");
			map.put("users", list);
		}
		return map;
	}

	// 根据用户名查找用户
	@Transactional(readOnly = true, propagation = Propagation.NOT_SUPPORTED)
	public Map<String, Object> userQueryByname(String username) {
		// 当前日期
		String date = new SimpleDateFormat("yyyy-MM-dd").format(new Date());
		String rdate = date.substring(0, date.indexOf("-"));
		// 取出userinfo
		UserinfoExample example = new UserinfoExample();
		Criteria criteria = example.createCriteria();
		criteria.andUsernameEqualTo(username);
		List<Userinfo> list = mapper.selectByExample(example);
		Userinfo u = list.get(0);
		if(u.getSex().equals("man") || u.getSex().equals("男"))
		{
			u.setSex("男");
		}else
		{
			u.setSex("女");
		}
		// 计算年龄
		String idcard = u.getIdcard();
		String year = idcard.substring(6, 10);
		Integer age = Integer.parseInt(rdate) - Integer.parseInt(year);
		u.setAge(age);
		// 取出教育背景
		EducationbackgroundExample eduexample = new EducationbackgroundExample();
		com.talentpool.po.EducationbackgroundExample.Criteria Educriteria = eduexample.createCriteria();
		Educriteria.andEusernameEqualTo(username);
		List<Educationbackground> eduList = EducationbackgroundMapper.selectByExample(eduexample);
		for (Educationbackground educationbackground : eduList) {
			educationbackground
					.setEstartdate(educationbackground.getEstartdate() + ";" + educationbackground.getEenddate());
		}
		System.out.println(eduList);
		// 取出工作经历
		WorkexExample Workexample = new WorkexExample();
		com.talentpool.po.WorkexExample.Criteria WorkexCriteria = Workexample.createCriteria();
		WorkexCriteria.andWuesrnameEqualTo(username);
		List<Workex> WorkexList = WorkexMapper.selectByExample(Workexample);
		for (Workex workex : WorkexList) {
			workex.setWstartdate(workex.getWstartdate() + ";" + workex.getWenddate());
		}
		System.out.println(WorkexList);
		// 取出培训经历
		PexperienceExample Pexperexample = new PexperienceExample();
		com.talentpool.po.PexperienceExample.Criteria PexreCriteria = Pexperexample.createCriteria();
		PexreCriteria.andPusernameEqualTo(username);
		List<Pexperience> PexerList = PexperienceMapper.selectByExample(Pexperexample);

		// 取出资格证书
		QualificationExample Quaexample = new QualificationExample();
		com.talentpool.po.QualificationExample.Criteria quaCriteria = Quaexample.createCriteria();
		quaCriteria.andQusernameEqualTo(username);
		List<Qualification> QuaList = QualificationMapper.selectByExample(Quaexample);

		// 取出家庭成员
		MemberExample Memexample = new MemberExample();
		com.talentpool.po.MemberExample.Criteria MemCriteria = Memexample.createCriteria();
		MemCriteria.andMusernameEqualTo(username);
		List<Member> memList = MemberMapper.selectByExample(Memexample);
		// 放到map中
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("userinfo", u);
		map.put("edu", eduList);
		map.put("work", WorkexList);
		map.put("pex", PexerList);
		map.put("qua", QuaList);
		map.put("mem", memList);
		return map;
	}

	// 根据日期范围进行查找用户
	@Transactional(readOnly = true, propagation = Propagation.NOT_SUPPORTED)
	public Map<String, Object> userQueryBydate(Date startdate, Date enddate, String name) {
		Map<String, Object> map = userQuery();
		List<Userinfo> list = (List<Userinfo>) map.get("users");
		Map<String, Object> map2 = new HashMap<String, Object>();

		if (startdate == null && enddate == null) {
			map2.put("result", "1");
			map2.put("users", list);
			return map2;
		}
		if (name != null) {
			List<Userinfo> newlist = new ArrayList<Userinfo>();
			for (Userinfo userinfo : list) {
				if (userinfo.getJoindate().after(startdate) && userinfo.getJoindate().before(enddate)) {
					if (userinfo.getName().contains(name)) {
						newlist.add(userinfo);
					}

				} else if (userinfo.getJoindate().compareTo(startdate) == 0
						|| userinfo.getJoindate().compareTo(enddate) == 0) {
					if (userinfo.getName().contains(name)) {
						newlist.add(userinfo);
					}
				}
			}
			if (newlist.size() > 0) {
				map2.put("result", "1");
				map2.put("users", newlist);
				return map2;
			} else {
				map2.put("result", "2");
				return map2;
			}
		} else {
			List<Userinfo> newlist = new ArrayList<Userinfo>();
			for (Userinfo userinfo : list) {
				if (userinfo.getJoindate().after(startdate) && userinfo.getJoindate().before(enddate)) {
					newlist.add(userinfo);
				} else if (userinfo.getJoindate().compareTo(startdate) == 0
						|| userinfo.getJoindate().compareTo(enddate) == 0) {
					newlist.add(userinfo);
				}
			}
			if (newlist.size() > 0) {
				map2.put("result", "1");
				map2.put("users", newlist);
				return map2;
			} else {
				map2.put("result", "2");
				return map2;
			}
		}

	}

	// 更改密码
	@Transactional
	public String userUpdatePass(String oldpass, String newpass, String username) {
		LogininfoExample example = new LogininfoExample();
		com.talentpool.po.LogininfoExample.Criteria criteria = example.createCriteria();
		criteria.andUsernameEqualTo(username);
		criteria.andPasswordEqualTo(oldpass);
		List<Logininfo> list = loginmapper.selectByExample(example);
		if (list.size() <= 0) {
			return "3";
		} else {
			Logininfo login = new Logininfo();
			login.setPassword(newpass);
			Userinfo userinfo = new Userinfo();
			userinfo.setPassword(newpass);
			UserinfoExample example2 = new UserinfoExample();
			Criteria criteria2 = example2.createCriteria();
			criteria2.andUsernameEqualTo(username);
			int i = mapper.updateByExampleSelective(userinfo, example2);
			LogininfoExample loginex = new LogininfoExample();
			com.talentpool.po.LogininfoExample.Criteria criteria3 = loginex.createCriteria();
			criteria3.andUsernameEqualTo(username);
			int j = loginmapper.updateByExampleSelective(login, loginex);
			if (i > 0 && j > 0) {
				return "1";
			} else {
				return "2";
			}
		}
	}

}
