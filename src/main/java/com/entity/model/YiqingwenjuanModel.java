package com.entity.model;

import com.entity.YiqingwenjuanEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 疫情问卷
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2021-04-04 11:13:07
 */
public class YiqingwenjuanModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 标题
	 */
	
	private String biaoti;
		
	/**
	 * 问卷分类
	 */
	
	private String wenjuanfenlei;
		
	/**
	 * 问题一
	 */
	
	private String wentiyi;
		
	/**
	 * 问题二
	 */
	
	private String wentier;
		
	/**
	 * 问题三
	 */
	
	private String wentisan;
		
	/**
	 * 问题四
	 */
	
	private String wentisi;
		
	/**
	 * 问题五
	 */
	
	private String wentiwu;
				
	
	/**
	 * 设置：标题
	 */
	 
	public void setBiaoti(String biaoti) {
		this.biaoti = biaoti;
	}
	
	/**
	 * 获取：标题
	 */
	public String getBiaoti() {
		return biaoti;
	}
				
	
	/**
	 * 设置：问卷分类
	 */
	 
	public void setWenjuanfenlei(String wenjuanfenlei) {
		this.wenjuanfenlei = wenjuanfenlei;
	}
	
	/**
	 * 获取：问卷分类
	 */
	public String getWenjuanfenlei() {
		return wenjuanfenlei;
	}
				
	
	/**
	 * 设置：问题一
	 */
	 
	public void setWentiyi(String wentiyi) {
		this.wentiyi = wentiyi;
	}
	
	/**
	 * 获取：问题一
	 */
	public String getWentiyi() {
		return wentiyi;
	}
				
	
	/**
	 * 设置：问题二
	 */
	 
	public void setWentier(String wentier) {
		this.wentier = wentier;
	}
	
	/**
	 * 获取：问题二
	 */
	public String getWentier() {
		return wentier;
	}
				
	
	/**
	 * 设置：问题三
	 */
	 
	public void setWentisan(String wentisan) {
		this.wentisan = wentisan;
	}
	
	/**
	 * 获取：问题三
	 */
	public String getWentisan() {
		return wentisan;
	}
				
	
	/**
	 * 设置：问题四
	 */
	 
	public void setWentisi(String wentisi) {
		this.wentisi = wentisi;
	}
	
	/**
	 * 获取：问题四
	 */
	public String getWentisi() {
		return wentisi;
	}
				
	
	/**
	 * 设置：问题五
	 */
	 
	public void setWentiwu(String wentiwu) {
		this.wentiwu = wentiwu;
	}
	
	/**
	 * 获取：问题五
	 */
	public String getWentiwu() {
		return wentiwu;
	}
			
}
