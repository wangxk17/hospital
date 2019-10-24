/**
 * 
 */
package com.hospital.service.impl;

import java.util.List;

import com.hospital.dao.ISysUserDao;
import com.hospital.dao.impl.SysUserDaoImpl;
import com.hospital.model.SysUserDomain;
import com.hospital.service.ISysUserService;

/**
 * 
 * @Author Ron
 *
 * www.hliedu.com  恒骊学堂
 * QQ：3020685261
 */
public class SysUserServiceImpl implements ISysUserService{

	/**
	 * 登录校验
	 */
	@Override
	public Boolean loginCheck(String userName, String password) {
		ISysUserDao userDao = new SysUserDaoImpl();
		List<SysUserDomain> result = userDao.querySysUser(userName, password);
		if(result != null && result.size() > 0) {
			System.out.println("查询到用户信息");
			return true;
		}
		return false;
	}

}
