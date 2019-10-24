/**
 * 
 */
package com.hospital.dao.impl;

import java.util.ArrayList;
import java.util.List;

import com.bs.model.BsAreaDomain;
import com.bs.model.BsCityDomain;
import com.bs.model.BsProvinceDomain;
import com.hospital.dao.IHospitalDao;
import com.hospital.model.HospitalDomain;
import com.hospital.util.DBUtil;

/**
 * 
 * @Author Ron
 *
 */

public class HospitalDaoImpl implements IHospitalDao{

	@Override
	public List<HospitalDomain> queryHospitaList(String hosName, String hosAddr) {
		String sql = "select * from hospital where 1=1";
		List<Object> params = new ArrayList<Object>(); 
		//sql拼接
		if(hosName != null && !"".equals(hosName)) {
			sql += " AND HOS_NAME like ?";
			params.add("%"+hosName+"%");
		}
		if(hosAddr != null && !"".equals(hosAddr)) {
			sql += " AND HOS_ADDR like ?";    //?不需带引号
			params.add("%"+hosAddr+"%");
		}
		
		Object[] paramaArr = params.toArray(new Object[params.size()]);//数组存参数
		//执行查询
		List<HospitalDomain> hosResult = DBUtil.exeQuery(sql, HospitalDomain.class,paramaArr);
		return hosResult;
	}	
	
	/*
	public static void main(String[] args) {
		HospitalDaoImpl hospitalDaoImpl = new HospitalDaoImpl();
		List<HospitalDomain> querList = hospitalDaoImpl.queryHospitaList("长沙医馆","二桥");
		System.out.println(querList.size());
	}
	*/

	//获取所有的省
	@Override
	public List<BsProvinceDomain> queryProvince() {
		String sql = "SELECT * from bs_province where 1=1";
		List<BsProvinceDomain> allProvince = DBUtil.exeQuery(sql, BsProvinceDomain.class);
		return allProvince;
	}

	//根据省代码获取省
	@Override
	public BsProvinceDomain getProvince(String provinceCode) {
		String sql = "SELECT * from bs_province where 1=1";
		List<Object> params = new ArrayList<Object>();
		if(provinceCode != null && !"".equals(provinceCode)) {
			sql += " and PROVINCE_ID = ?";
			params.add(provinceCode);
		}
		Object[] paramsArr = params.toArray(new Object[params.size()]);//数组存参数
		BsProvinceDomain theProvince = DBUtil.exeQuery(sql, BsProvinceDomain.class, paramsArr).get(0);
		return theProvince;
	}

	//根据省代码获取所有的市
	@Override
	public List<BsCityDomain> queryCity(String provinceCode) {
		String sql = "SELECT * from bs_city where 1=1";
		List<Object> params = new ArrayList<Object>();
		if(provinceCode != null && !"".equals(provinceCode)) {
			sql += " and PROVINCE_CODE = ?";
			params.add(provinceCode);
		}
		Object[] paramsArr = params.toArray(new Object[params.size()]);//数组存参数
		List<BsCityDomain> allCity = DBUtil.exeQuery(sql, BsCityDomain.class, paramsArr);
		return allCity;
	}

	//根据市代码获取市
	@Override
	public BsCityDomain getCity(String cityCode) {
		String sql = "SELECT * from bs_city where 1=1";
		List<Object> params = new ArrayList<Object>();
		if(cityCode != null && "".equals(cityCode)) {
			sql += " and CITY_CODE = ?";
			params.add(cityCode);
		}
		Object[] paramsArr =  params.toArray(new Object[params.size()]);
		BsCityDomain theCity = DBUtil.exeQuery(sql, BsCityDomain.class, paramsArr);
		return theCity;
	}

	//根据市代码获取所有的区
	@Override
	public List<BsAreaDomain> queryArea(String cityCode) {
		String sql = "SELECT * from bs_area where 1=1";
		List<Object> params = new ArrayList<Object>();
		if(cityCode != null && !"".equals(cityCode)) {
			sql += " and CITY_CODE = ?";
			params.add(cityCode);
		}
		Object[] paramsArr =  params.toArray(new Object[params.size()]);
		List<BsAreaDomain> allArea = DBUtil.exeQuery(sql, BsAreaDomain.class, paramsArr);
		return allArea;
	}

	//根据区代码获取区
	@Override
	public List<BsAreaDomain> getArea(String areaCode) {
		String sql = "SELECT * from bs_area where 1=1";
		List<Object> params = new ArrayList<Object>();
		if(areaCode != null && !"".equals(areaCode)) {
			sql += " and AREA_CODE = ?";
			params.add(areaCode);
		}
		Object[] paramsArr =  params.toArray(new Object[params.size()]);
		List<BsAreaDomain> theArea = DBUtil.exeQuery(sql, BsAreaDomain.class, paramsArr);
		return theArea;
	}
	
}