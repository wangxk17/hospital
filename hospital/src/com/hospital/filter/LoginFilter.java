package com.hospital.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.hospital.constants.HospitalConstants;

//import com.sun.net.httpserver.Filter.Chain;
@WebFilter(filterName = "loginFilter",
urlPatterns = {"*.jsp","*.do",},
initParams = {@WebInitParam(name = "encoding",value = "UTF-8"),
			  @WebInitParam(name = "loginJsp",value = "/view/login_admin.jsp"),  //登录的前台访问路径
			  @WebInitParam(name = "loginDo",value = "/userServlet.do")})   //登录的后台界面访问路径

public class LoginFilter implements Filter {
	
	private FilterConfig filterConfig ; 

	@Override
	public void destroy() {
	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		String encoding = filterConfig.getInitParameter("encoding");
		String loginJsp = filterConfig.getInitParameter("loginJsp");
		String loginDo = filterConfig.getInitParameter("loginDo");
		
		HttpServletRequest req = (HttpServletRequest)request;
		HttpServletResponse resp = (HttpServletResponse)response;
		//统一编码
		req.setCharacterEncoding(encoding);
		resp.setCharacterEncoding(encoding);
		resp.setContentType("text/html;charset=utf-8");
		
		HttpSession session = req.getSession();
		
		String url = req.getRequestURI();
		Object userInfo = session.getAttribute(HospitalConstants.USER_SESSION_KEY);
		if(userInfo != null) {	
			System.out.println("用户信息为空");
		}
		//如果用户访问登录界面则放行
		if(url.contains(loginJsp)||url.contains(loginDo)) {
			chain.doFilter(request,response);
			return;
		}
		//如果用户已经登录，放行，否则拦截
		if(userInfo != null) {	
			chain.doFilter(request,response);
			return;
		}else {
			//未登录用户
			resp.sendRedirect(req.getContextPath()+"/view/login_admin.jsp");
		}
	}

	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
		this.filterConfig = filterConfig;	
	}
}
