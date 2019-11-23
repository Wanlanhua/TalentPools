package com.talentpool.serviceipm;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.commons.CommonsMultipartResolver;

import com.sun.javafx.scene.control.skin.EmbeddedTextContextMenuContent;
import com.talentpool.dao.EducationbackgroundMapper;
import com.talentpool.dao.LogininfoMapper;
import com.talentpool.dao.MemberMapper;
import com.talentpool.dao.OperatorinfoMapper;
import com.talentpool.dao.PexperienceMapper;
import com.talentpool.dao.QualificationMapper;
import com.talentpool.dao.UserinfoMapper;
import com.talentpool.dao.WorkexMapper;
import com.talentpool.po.Educationbackground;
import com.talentpool.po.EducationbackgroundExample;
import com.talentpool.po.Logininfo;
import com.talentpool.po.LogininfoExample;
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
import com.talentpool.service.OtherService;

import jxl.Workbook;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
import jxl.write.WriteException;
import jxl.write.biff.JxlWriteException;
import jxl.write.biff.RowsExceededException;

public class OtherServiceIpm implements OtherService {
	@Autowired
	private UserinfoMapper UserinfoMapper;
	@Autowired
	private LogininfoMapper logininfoMapper;
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
	@Autowired
	private OperatorinfoMapper OperatorinfoMapper;

	// 注册2 照片
	@Transactional
	public String registeredPhoto(HttpServletRequest request, MultipartFile user_icon, MultipartFile idcard_z,
			MultipartFile career, MultipartFile idcard_f, Userinfo userinfo, MultipartFile otherphoto1,
			MultipartFile otherphoto2) {
		String username = userinfo.getUsername();
		String picpath = request.getSession().getServletContext().getRealPath("") + "pic\\";
		// 新名
		String newuser_icon = username + 0 + ".png";
		String newidcard_z = username + 1 + ".png";
		String newidcard_f = username + 2 + ".png";
		String newcareer = username + 4 + ".png";
		String newotherphoto1 = username + 5 + ".png";
		String newotherphoto2 = username + 6 + ".png";
		if (!new File(picpath).exists()) {
			new File(picpath).mkdirs();
		}
		File newfile1 = new File(picpath + newuser_icon);
		File newfile2 = new File(picpath + newidcard_z);
		File newfile3 = new File(picpath + newidcard_f);
		File newfile5 = new File(picpath + newcareer);
		File newfile6 = new File(picpath + newotherphoto1);
		File newfile7 = new File(picpath + newotherphoto2);
		try {
			user_icon.transferTo(newfile1);
			idcard_z.transferTo(newfile2);
			idcard_f.transferTo(newfile3);
			career.transferTo(newfile5);
			otherphoto1.transferTo(newfile6);
			otherphoto2.transferTo(newfile7);
		} catch (IllegalStateException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		// 插入照片
		Userinfo newuserinfo = new Userinfo();
		newuserinfo.setHead(newuser_icon);
		newuserinfo.setIdcardphotoz(newidcard_z);
		newuserinfo.setIdcardphotof(newidcard_f);
		newuserinfo.setJobphoto(newcareer);
		newuserinfo.setResume(userinfo.getResume());
		newuserinfo.setOtherphoto1(newotherphoto1);
		newuserinfo.setOtherphoto2(newotherphoto2);
		UserinfoExample example = new UserinfoExample();
		Criteria userinfocriteria = example.createCriteria();
		userinfocriteria.andUsernameEqualTo(username);
		int i = UserinfoMapper.updateByExampleSelective(newuserinfo, example);
		if (i > 0) {
			return "1";
		} else {
			return "2";
		}
	}

	// 校验
	@Transactional(readOnly = true, propagation = Propagation.NOT_SUPPORTED)
	public String jiaoyan(String username) {
		// 查重用户名(登陆表)
		LogininfoExample example = new LogininfoExample();
		com.talentpool.po.LogininfoExample.Criteria criteria = example.createCriteria();
		criteria.andUsernameEqualTo(username);
		List<Logininfo> list = logininfoMapper.selectByExample(example);
		if (list.size() > 0) {
			return "1";
		} else {
			return "0";
		}
	}

	// 登陆
	@Transactional(readOnly = true, propagation = Propagation.NOT_SUPPORTED)
	public Map<String, String> Login(String username, String password, HttpServletRequest request) {
		LogininfoExample example = new LogininfoExample();
		com.talentpool.po.LogininfoExample.Criteria criteria = example.createCriteria();
		criteria.andUsernameEqualTo(username);
		criteria.andPasswordEqualTo(password);
		List<Logininfo> list = logininfoMapper.selectByExample(example);
		// 判断
		Map<String, String> map = new HashMap<String, String>();
		if (list.size() > 0) {
			map.put("result", "1");
			map.put("role", list.get(0).getRole());
			HttpSession session = request.getSession();
			session.setAttribute("username", username);
			return map;
		} else {
			map.put("result", "2");
			return map;
		}
	}

	// 注册1
	@Transactional
	public String registered1(Userinfo userinfo, HttpServletRequest request, Educationbackground edu, Member member,
			Pexperience experience, Qualification qua, Workex workex) {
		String username = userinfo.getUsername();
		String password = userinfo.getPassword();
		// 看登陆表中是否已经存在了用户名 ，存在即用户注册时返回来进行修改
		LogininfoExample example = new LogininfoExample();
		com.talentpool.po.LogininfoExample.Criteria criteria = example.createCriteria();
		criteria.andUsernameEqualTo(username);
		List<Logininfo> list = logininfoMapper.selectByExample(example);
		// 获取教育背景中的长度
		String sn = edu.getEstartdate();
		int edulength = 0;
		if (sn.contains(";")) {
			String[] schoolstartdate = sn.split(";");
			edulength = schoolstartdate.length;
		}

		// 获取工作经历的长度
		String wex = workex.getWstartdate();
		int workexlength = 0;
		if (wex.contains(";")) {
			String[] jobstartdate = wex.split(";");
			workexlength = jobstartdate.length;
		}

		// 获取家庭成员的长度
		String mem = member.getMlink();
		int memberlength = 0;
		if (mem.contains(";")) {
			String[] link = mem.split(";");
			memberlength = link.length;
		}
		// 获取资格证书的长度
		String quation = qua.getQtime();
		int qualength = 0;
		if (quation.contains(";")) {
			String[] qtime = quation.split(";");
			qualength = qtime.length;
		}
		// 获取培训经历的长度
		String ex = experience.getPtime();
		int experiencelength = 0;
		if (ex.contains(";")) {
			String[] ptime = ex.split(";");
			experiencelength = ptime.length;
		}

		int j = 0;

		if (list.size() > 0) {
		} else {
			try {
				// 插入登陆表中
				Logininfo logininfo = new Logininfo();
				logininfo.setUsername(username);
				logininfo.setPassword(password);
				logininfo.setRole("3");
				j = logininfoMapper.insertSelective(logininfo);
				if (j < 0) {
					return "2";
				}
				// 插入用户信息
				// 工作地的划分
				String gzd = userinfo.getGzd();
				String[] gzds = gzd.split("-");
				userinfo.setProvince(gzds[0]);
				userinfo.setCity(gzds[1]);
				userinfo.setArea(gzds[2]);
				userinfo.setStatus("3");
				userinfo.setJoindate(new Date());

				j = UserinfoMapper.insertSelective(userinfo);
				if (j <= 0) {
					return "2";
				}

				// 插入教育背景
				for (int i = 0; i < edulength; i++) {
					Educationbackground newedu = new Educationbackground();
					newedu.setEusername(username);
					newedu.setEstartdate(edu.getEstartdate().split(";")[i]);
					newedu.setEenddate(edu.getEenddate().split(";")[i]);
					newedu.setDegree(edu.getDegree().split(";")[i]);
					newedu.setSchoolname(edu.getSchoolname().split(";")[i]);
					newedu.setSchoollocation(edu.getSchoollocation().split(";")[i]);
					newedu.setTakedegree(edu.getTakedegree().split(";")[i]);
					j = EducationbackgroundMapper.insertSelective(newedu);
					if (j <= 0) {
						return "2";
					}
				}

				// 插入家庭成员
				for (int i = 0; i < memberlength; i++) {
					Member newmember = new Member();
					newmember.setMusername(username);
					newmember.setMlink(member.getMlink().split(";")[i]);//
					newmember.setMname(member.getMname().split(";")[i]);
					newmember.setMtel(member.getMtel().split(";")[i]);
					newmember.setMworkplace(member.getMworkplace().split(";")[i]);
					j = MemberMapper.insertSelective(newmember);
					if (j <= 0) {
						return "2";
					}
				}
				// 插入资格证书
				for (int i = 0; i < qualength; i++) {
					Qualification newqua = new Qualification();
					newqua.setQusername(username);
					newqua.setQtime(qua.getQtime().split(";")[i]);
					newqua.setQname(qua.getQname().split(";")[i]);
					newqua.setQplace(qua.getQplace().split(";")[i]);
					j = QualificationMapper.insertSelective(newqua);
					if (j <= 0) {
						return "2";
					}
				}
				// 插入工作经历
				for (int i = 0; i < workexlength; i++) {
					Workex newworkex = new Workex();
					newworkex.setWuesrname(username);
					newworkex.setJob(workex.getJob().split(";")[i]);//
					newworkex.setPost(workex.getPost().split(";")[i]);
					newworkex.setWstartdate(workex.getWstartdate().split(";")[i]);
					newworkex.setWenddate(workex.getWenddate().split(";")[i]);
					newworkex.setResignreason(workex.getResignreason().split(";")[i]);
					newworkex.setZtel(workex.getZtel().split(";")[i]);
					j = WorkexMapper.insertSelective(newworkex);
					if (j <= 0) {
						return "2";
					}
				}
				// 插入培训经历
				for (int i = 0; i < experiencelength; i++) {
					Pexperience record = new Pexperience();
					record.setPusername(username);
					record.setPplace(experience.getPplace().split(";")[i]);
					record.setPtime(experience.getPtime().split(";")[i]);
					record.setPcontent(experience.getPcontent().split(";")[i]);
					j = PexperienceMapper.insertSelective(record);
					if (j <= 0) {
						return "2";
					}
				}
			} catch (Exception e) {
				throw new RuntimeException();
			}

		}

		return "1";
	}

	// 导出用户
	public String Daochu1(HttpServletRequest request) {
		int index = 1;
		List<Map<String, Object>> queryByDaochu = UserinfoMapper.QueryByDaochu();
		WritableWorkbook workbook = null;
		long subffix = new Date().getTime();
		String path = request.getSession().getServletContext().getRealPath("") + "xsl\\用户表\\";
		String realpath=path + subffix + ".xls";
		if (queryByDaochu.size() > 0) {

			
			if (!new File(path).exists()) {
				new File(path).mkdirs();
			}
			
			File xlsFile = new File(realpath);
			String[] arrs = { "ID", "姓名", "工种", "年龄", "身份证号", "注册日期", "工作地", "状态" };
			Label label = null;

			try {
				xlsFile.createNewFile();
				workbook = Workbook.createWorkbook(xlsFile);
				WritableSheet sheet = workbook.createSheet("sheet1", 0);
				for (int i = 0; i < arrs.length; i++) {
					label = new Label(i, 0, arrs[i]);
					sheet.addCell(label);
				}
				for (Integer j = 0; j < queryByDaochu.size(); j++) {
					try {
						label = new Label(0, index, j.toString());
					} catch (Exception e) {
						label = new Label(0, index, "");
					}
					sheet.addCell(label);

					try {
						label = new Label(1, index, (String) (queryByDaochu.get(j).get("name") == null ? "无"
								: (queryByDaochu.get(j).get("name"))));
					} catch (Exception e) {
						label = new Label(1, index, "");
					}
					sheet.addCell(label);
					try {
						label = new Label(2, index, (String) (queryByDaochu.get(j).get("workplant") == null ? "无"
								: (queryByDaochu.get(j).get("workplant"))));
					} catch (Exception e) {
						label = new Label(2, index, "");
					}
					sheet.addCell(label);
					//
					String date = new SimpleDateFormat("yyyy-MM-dd").format(new Date());
					String rdate = date.substring(0, date.indexOf("-"));
					String idcard = (String) queryByDaochu.get(j).get("birthdate");
					String year = idcard.substring(0, 4);
					Integer age = Integer.parseInt(rdate) - Integer.parseInt(year);
					//
					try {
						label = new Label(3, index, age.toString() == null ? "无" : age.toString());
					} catch (Exception e) {
						label = new Label(3, index, "");
					}
					sheet.addCell(label);
					try {
						label = new Label(4, index, (String) (queryByDaochu.get(j).get("idcard") == null ? "无"
								: (queryByDaochu.get(j).get("idcard"))));
					} catch (Exception e) {
						label = new Label(4, index, "");
					}
					sheet.addCell(label);
					try {
						String joindate = new SimpleDateFormat("yyyy-MM-dd")
								.format(queryByDaochu.get(j).get("joindate"));
						label = new Label(5, index, joindate == null ? "无" : joindate);
					} catch (Exception e) {
						label = new Label(5, index, "");
					}
					sheet.addCell(label);

					try {
						label = new Label(6, index, (String) (queryByDaochu.get(j).get("gzd") == null ? "无"
								: (queryByDaochu.get(j).get("gzd"))));
					} catch (Exception e) {
						label = new Label(6, index, "");
					}
					sheet.addCell(label);
					//
					String status = (String) queryByDaochu.get(j).get("status");
					String statusR = null;
					if (status.equals("1")) {
						statusR = "已通过";
					} else if (status.equals("2")) {
						statusR = "未通过";
					} else {
						statusR = "待审核";
					}
					//
					try {
						label = new Label(7, index, statusR == null ? "无" : statusR);
					} catch (Exception e) {
						label = new Label(7, index, "");
					}
					sheet.addCell(label);
					index++;
				}
			} catch (IOException e) {
				e.printStackTrace();
			} catch (JxlWriteException e) {
				e.printStackTrace();
			} catch (WriteException e) {
				e.printStackTrace();
			} finally {
				try {
					workbook.write();
					workbook.close();
				} catch (IOException e) {
					e.printStackTrace();
				} catch (WriteException e) {
					e.printStackTrace();
				}

			}
		}

		return realpath;
	}

	// 导出操作员
	public String Daochu2(HttpServletRequest request) {
		int index = 1;
		List<Map<String, Object>> queryByDaochu = null;
		WritableWorkbook workbook = null;
		long subffix = new Date().getTime();
		queryByDaochu = OperatorinfoMapper.QueryByDaochu();
		String path = request.getSession().getServletContext().getRealPath("") + "xsl\\操作员表\\";
		String realpath=path + subffix + ".xls";
		if (queryByDaochu.size() > 0) {

			if (!new File(path).exists()) {
				new File(path).mkdirs();
			}
			File xlsFile = new File(realpath);
			String[] arrs = { "ID", "用户名", "姓名", "密码", "联系方式", "管理区域", "状态" };
			Label label = null;

			try {
				xlsFile.createNewFile();
				workbook = Workbook.createWorkbook(xlsFile);
				WritableSheet sheet = workbook.createSheet("sheet1", 0);
				for (int i = 0; i < arrs.length; i++) {
					label = new Label(i, 0, arrs[i]);
					sheet.addCell(label);
				}
				for (Integer j = 0; j < queryByDaochu.size(); j++) {
					try {
						label = new Label(0, index, j.toString());
					} catch (Exception e) {
						label = new Label(0, index, "");
					}
					sheet.addCell(label);

					try {
						label = new Label(1, index, (String) (queryByDaochu.get(j).get("username") == null ? "无"
								: (queryByDaochu.get(j).get("username"))));
					} catch (Exception e) {
						label = new Label(1, index, "");
					}
					sheet.addCell(label);
					try {
						label = new Label(2, index, (String) (queryByDaochu.get(j).get("name") == null ? "无"
								: (queryByDaochu.get(j).get("name"))));
					} catch (Exception e) {
						label = new Label(2, index, "");
					}
					sheet.addCell(label);
					try {
						label = new Label(3, index, (String) (queryByDaochu.get(j).get("password") == null ? "无"
								: (queryByDaochu.get(j).get("password"))));
					} catch (Exception e) {
						label = new Label(3, index, "");
					}
					sheet.addCell(label);
					try {
						label = new Label(4, index, (String) (queryByDaochu.get(j).get("contact") == null ? "无"
								: (queryByDaochu.get(j).get("contact"))));
					} catch (Exception e) {
						label = new Label(4, index, "");
					}
					sheet.addCell(label);
					try {
						label = new Label(5, index, (String) (queryByDaochu.get(j).get("area") == null ? "无"
								: (queryByDaochu.get(j).get("area"))));
					} catch (Exception e) {
						label = new Label(5, index, "");
					}
					sheet.addCell(label);
					//
					String status = (String) queryByDaochu.get(j).get("status");
					String statusR = null;
					if (status.equals("1")) {
						statusR = "已启用";
					} else if (status.equals("2")) {
						statusR = "已停用";
					}
					//
					try {
						label = new Label(6, index, statusR == null ? "无" : statusR);
					} catch (Exception e) {
						label = new Label(6, index, "");
					}
					sheet.addCell(label);
					index++;
				}
			} catch (IOException e) {
				e.printStackTrace();
			} catch (JxlWriteException e) {
				e.printStackTrace();
			} catch (WriteException e) {
				e.printStackTrace();
			} finally {
				try {
					workbook.write();
					workbook.close();
				} catch (IOException e) {
					e.printStackTrace();
				} catch (WriteException e) {
					e.printStackTrace();
				}

			}
		}
		return realpath;
	}

}
