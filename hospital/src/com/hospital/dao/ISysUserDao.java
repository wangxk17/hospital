/**
 * 
 */
package com.hospital.dao;

import java.util.List;

import com.hospital.model.SysUserDomain;

/**
 * 
 * @Author Ron
 *
 * www.hliedu.com  恒骊学堂
 * QQ：3020685261
 */
public interface ISysUserDao {

	List<SysUserDomain> querySysUser(String userName , String password);
}
