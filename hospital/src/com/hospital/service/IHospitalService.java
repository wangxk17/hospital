/**
 * 
 */
package com.hospital.service;

import java.util.List;

import com.hospital.model.HospitalDomain;

/**
 * 
 * @Author Ron
 *
 * www.hliedu.com  恒骊学堂
 * QQ：3020685261
 */
public interface IHospitalService {
	List<HospitalDomain> queryHospitaList(String hosName,String hosAddr);
}
