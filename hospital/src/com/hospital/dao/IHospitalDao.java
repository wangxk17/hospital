/**
 * 
 */
package com.hospital.dao;

import java.util.List;

import com.bs.model.BsAreaDomain;
import com.bs.model.BsCityDomain;
import com.bs.model.BsProvinceDomain;
import com.hospital.model.HospitalDomain;

/**
 * 
 * @Author Ron
 *
 * www.hliedu.com  恒骊学堂
 * QQ：3020685261
 */
public interface IHospitalDao {
	
	List<HospitalDomain> queryHospitaList(String hosName, String hosAddr);
	
	//获取所有的省
	List<BsProvinceDomain> queryProvince();
	
	//根据省代码获取省
	BsProvinceDomain getProvince(String provinceCode);
	//根据省代码获取所有的市
	List<BsCityDomain> queryCity(String provinceCode);
	//根据市代码获取市
	BsCityDomain getCity(String cityCode);
	//根据市代码获取所有的区
	List<BsAreaDomain> queryArea(String cityCode);
	//根据区代码获取区
	BsAreaDomain getArea(String areaCode);


}
