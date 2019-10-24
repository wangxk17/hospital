/**
 * 
 */
package com.hospital.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.hospital.model.HospitalDomain;
import com.hospital.service.IHospitalService;
import com.hospital.service.impl.HospitalServiceImpl;

/**
 * 
 * @Author Ron
 *
 * www.hliedu.com  恒骊学堂
 * QQ：3020685261
 */
@WebServlet("/hospitalServlet.do")
public class HospitalServlet extends HttpServlet{

	private static final long serialVersionUID = -7778725834971291283L;
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//获取最新的医馆列表
		IHospitalService iHospitalService = new HospitalServiceImpl();
		String hosName = "";
		String hosAddr = "";
		List<HospitalDomain> hospitaList = iHospitalService.queryHospitaList(hosName, hosAddr);
		req.setAttribute("hospitalList", hospitaList);
		//样式控制
		req.setAttribute("title","医馆列表");
		req.setAttribute("activeCss", "hospital");
		req.getRequestDispatcher("/view/hospital_management.jsp").forward(req, resp);
		return ;
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		super.doPost(req, resp);
	}


	
}
