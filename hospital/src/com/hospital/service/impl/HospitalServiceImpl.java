/**
 * 
 */
package com.hospital.service.impl;

import java.util.List;

import com.hospital.dao.IHospitalDao;
import com.hospital.dao.impl.HospitalDaoImpl;
import com.hospital.model.HospitalDomain;
import com.hospital.service.IHospitalService;

/**
 * 
 * @Author Ron
 *
 * www.hliedu.com  恒骊学堂
 * QQ：3020685261
 */
public class HospitalServiceImpl implements IHospitalService{
	//获取医馆列表
	@Override
	public List<HospitalDomain> queryHospitaList(String hosName, String hosAddr) {
		IHospitalDao hospitalDao = new HospitalDaoImpl();
		List<HospitalDomain> hospitalList = hospitalDao.queryHospitaList(hosName, hosAddr);
		return hospitalList;
	}
	
}
