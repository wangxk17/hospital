/**
 * 
 */
package com.hospital.model;

import java.util.Date;

import lombok.Getter;
import lombok.Setter;

/**
 * 
 * 预约客户Model类
 * 
 * @Author Ron
 *
 * www.hliedu.com  恒骊学堂
 * QQ：3020685261
 */

@Getter
@Setter
public class CustomerDomain {
	/**预约客户ID,自增*/
	private Integer custId;
	/**客户姓名*/
	private String custName;
	/**客户手机号*/
	private String phone;
	/**描述*/
	private String custDesc;
	/**年龄*/
	private String age;
	/**'*/
	private String sex;
	/**备注*/
	private String memo;
	/**创建时间*/
	private Date createdDate;
	/**最后修改时间*/
	private Date modifyDate;
	/**系统状态*/
	private Integer dataState;	
}
