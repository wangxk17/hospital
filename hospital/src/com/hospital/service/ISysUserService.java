/**
 * 
 */
package com.hospital.service;


/**
 * 
 * @Author Ron
 *
 * www.hliedu.com  恒骊学堂
 * QQ：3020685261
 */
public interface ISysUserService {

	/**
	 * 登录校验
	 * @param userName
	 * @param password
	 * @return
	 */
	Boolean loginCheck(String userName , String password);
	
}
