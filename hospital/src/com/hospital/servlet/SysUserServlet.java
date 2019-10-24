/**
 * 
 */
package com.hospital.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.hospital.constants.HospitalConstants;
import com.hospital.service.ISysUserService;
import com.hospital.service.impl.SysUserServiceImpl;
import com.hospital.util.MD5Util;

//import jdk.nashorn.internal.ir.Flags;

/**
 * 
 * @Author Ron
 *
 * www.hliedu.com  恒骊学堂
 * QQ：3020685261
 */
@WebServlet("/userServlet.do")
public class SysUserServlet extends HttpServlet{

	private static final long serialVersionUID = -965385398527072236L;

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String userName = req.getParameter("userName");
		String password = req.getParameter("password");
		if(userName != null && !"".equals(userName) && password != null && !"".equals(password)) {
			ISysUserService userService = new SysUserServiceImpl();
			Boolean flag = userService.loginCheck(userName, MD5Util.MD5("123456"));
			if(flag) {
				//登录成功后将信息存储在session域中
				HttpSession session = req.getSession();
				session.setAttribute(HospitalConstants.USER_SESSION_KEY, userName);
				System.out.println("用户信息已经保存到session："+userName);
				
				//样式控制
				req.setAttribute("title", "预约单");
				req.setAttribute("activeCss", "reservation");
				req.getRequestDispatcher("/view/reservation_form.jsp").forward(req, resp);
				System.out.println("登录成功");
			}else {
				resp.sendRedirect(req.getContextPath()+"/view/login_admin.jsp");
				System.out.println("登录失败");
			}
		}else {
			resp.sendRedirect(req.getContextPath()+"/view/login_admin.jsp");
			//resp.getWriter().write("用户名和密码不能为空！");
		}
	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.sendRedirect(req.getContextPath()+"/view/login_admin.jsp");
		return;
	}
//	public static void main(String[] args) {
//		ISysUserService ss = new SysUserServiceImpl();
//		Boolean flag = ss.loginCheck("admin",MD5Util.MD5("123456"));  //E10ADC3949BA59ABBE56E057F20F883E
//		System.out.println(flag);
//	}
	
}

