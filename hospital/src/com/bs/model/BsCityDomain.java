/**
 * 
 */
package com.bs.model;

import java.util.Date;

import lombok.Getter;
import lombok.Setter;

/**
 * 
 * 城市Model类
 * 
 * @Author Ron
 *
 * www.hliedu.com  恒骊学堂
 * QQ：3020685261
 */

@Getter
@Setter
public class BsCityDomain {
	/**ID,自增*/
	private Integer cityId;
	/**市代码*/
	private String cityCode;
	/**市名称*/
	private String cityName;
	/**短名称*/
	private String shortName;
	/**省代码*/
	private String provinceCode;
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
