package com.liu.pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.io.Serializable;
import lombok.Data;

/**
 * @Description  
 * @Author  LiuGang
 * @Date 2021-06-29 
 */

@Data
@Entity
@Table ( name ="tb_address" )
public class Address  implements Serializable {

	private static final long serialVersionUID =  2774771323889837279L;

   	@Column(name = "id" )
	private Integer id;

	/**
	 * 用户ID
	 */
   	@Column(name = "user_id" )
	private Integer userId;

	/**
	 * 收货人姓名
	 */
   	@Column(name = "shr_name" )
	private String shrName;

	/**
	 * 收货人手机
	 */
   	@Column(name = "shr_mobile" )
	private String shrMobile;

	/**
	 * 收货人省份
	 */
   	@Column(name = "shr_province" )
	private String shrProvince;

	/**
	 * 收货人城市
	 */
   	@Column(name = "shr_city" )
	private String shrCity;

	/**
	 * 收货人地区
	 */
   	@Column(name = "shr_area" )
	private String shrArea;

	/**
	 * 收货人详情地址
	 */
   	@Column(name = "shr_address" )
	private String shrAddress;

	/**
	 * 1:默认;0:不是
	 */
   	@Column(name = "isdefault" )
	private Integer isdefault;

}
