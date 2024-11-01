package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;


/**
 * 疫情问卷
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2021-04-04 11:13:07
 */
@TableName("yiqingwenjuan")
public class YiqingwenjuanEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public YiqingwenjuanEntity() {
		
	}
	
	public YiqingwenjuanEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * 主键id
	 */
	@TableId
	private Long id;
	/**
	 * 编号
	 */
					
	private String bianhao;
	
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
	
	
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
	private Date addtime;

	public Date getAddtime() {
		return addtime;
	}
	public void setAddtime(Date addtime) {
		this.addtime = addtime;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * 设置：编号
	 */
	public void setBianhao(String bianhao) {
		this.bianhao = bianhao;
	}
	/**
	 * 获取：编号
	 */
	public String getBianhao() {
		return bianhao;
	}
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
