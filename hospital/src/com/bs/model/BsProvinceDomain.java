/**
 * 
 */
package com.bs.model;

import java.util.Date;

import lombok.Getter;
import lombok.Setter;

/**
 * 
 * 省份Model类
 * 
 * @Author Ron
 *
 * www.hliedu.com  恒骊学堂
 * QQ：3020685261
 */

@Getter
@Setter
public class BsProvinceDomain{
	/**ID,自增*/
	private Integer provinceId;
	/**省代码*/
	private String provinceCode;
	/**省名称*/
	private String provinceName;
	/**短名称*/
	private String shortName;
	/**经度*/
	private String lng;
	/**纬度*/
	private String lat;
	/**排序*/
	private String sort;
	/**备注*/
	private String memo;
	/**创建时间*/
	private Date createdDate;
	/**最后修改时间*/
	private Date modifyDate;
	/**系统状态*/
	private Integer dataState;
}
