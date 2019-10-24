/**
 * 
 */
package com.hospital.dao.impl;

import java.util.List;

import com.hospital.dao.ISysUserDao;
import com.hospital.model.SysUserDomain;
import com.hospital.util.DBUtil;

/**
 * 
 * @Author Ron
 *
 * www.hliedu.com  恒骊学堂
 * QQ：3020685261
 */
public class SysUserDaoImpl implements ISysUserDao{

	/**
	 * 根据用户名和密码获取用户列表
	 */
	@Override
	public List<SysUserDomain> querySysUser(String userName , String password) {
		String sql = "select * from sys_user where user_name = ? and password = ? and data_state = 1 ";
		List<SysUserDomain> result = DBUtil.exeQuery(sql, SysUserDomain.class, userName , password);
		return result;            //（形如：姓名，年龄，姓名，年龄....）
	}
	
	public static void main(String[] args) {
		SysUserDaoImpl sud = new SysUserDaoImpl();
		sud.querySysUser("admin", "123456");
	}

}
