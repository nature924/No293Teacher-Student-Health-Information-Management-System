package com.entity.vo;

import com.entity.WenjuandiaochaEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 问卷调查
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2021-04-04 11:13:07
 */
public class WenjuandiaochaVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 性别
	 */
	
	private String xingbie;
		
	/**
	 * 身份
	 */
	
	private String shenfen;
		
	/**
	 * 标题
	 */
	
	private String biaoti;
		
	/**
	 * 填报状态
	 */
	
	private String tianbaozhuangtai;
		
	/**
	 * 填报时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date tianbaoshijian;
		
	/**
	 * 问题一
	 */
	
	private String wentiyi;
		
	/**
	 * 回答一
	 */
	
	private String huidayi;
		
	/**
	 * 问题二
	 */
	
	private String wentier;
		
	/**
	 * 回答二
	 */
	
	private String huidaer;
		
	/**
	 * 问题三
	 */
	
	private String wentisan;
		
	/**
	 * 回答三
	 */
	
	private String huidasan;
		
	/**
	 * 问题四
	 */
	
	private String wentisi;
		
	/**
	 * 回答四
	 */
	
	private String huidasi;
		
	/**
	 * 问题五
	 */
	
	private String wentiwu;
		
	/**
	 * 回答五
	 */
	
	private String huidawu;
				
	
	/**
	 * 设置：性别
	 */
	 
	public void setXingbie(String xingbie) {
		this.xingbie = xingbie;
	}
	
	/**
	 * 获取：性别
	 */
	public String getXingbie() {
		return xingbie;
	}
				
	
	/**
	 * 设置：身份
	 */
	 
	public void setShenfen(String shenfen) {
		this.shenfen = shenfen;
	}
	
	/**
	 * 获取：身份
	 */
	public String getShenfen() {
		return shenfen;
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
	 * 设置：填报状态
	 */
	 
	public void setTianbaozhuangtai(String tianbaozhuangtai) {
		this.tianbaozhuangtai = tianbaozhuangtai;
	}
	
	/**
	 * 获取：填报状态
	 */
	public String getTianbaozhuangtai() {
		return tianbaozhuangtai;
	}
				
	
	/**
	 * 设置：填报时间
	 */
	 
	public void setTianbaoshijian(Date tianbaoshijian) {
		this.tianbaoshijian = tianbaoshijian;
	}
	
	/**
	 * 获取：填报时间
	 */
	public Date getTianbaoshijian() {
		return tianbaoshijian;
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
	 * 设置：回答一
	 */
	 
	public void setHuidayi(String huidayi) {
		this.huidayi = huidayi;
	}
	
	/**
	 * 获取：回答一
	 */
	public String getHuidayi() {
		return huidayi;
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
	 * 设置：回答二
	 */
	 
	public void setHuidaer(String huidaer) {
		this.huidaer = huidaer;
	}
	
	/**
	 * 获取：回答二
	 */
	public String getHuidaer() {
		return huidaer;
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
	 * 设置：回答三
	 */
	 
	public void setHuidasan(String huidasan) {
		this.huidasan = huidasan;
	}
	
	/**
	 * 获取：回答三
	 */
	public String getHuidasan() {
		return huidasan;
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
	 * 设置：回答四
	 */
	 
	public void setHuidasi(String huidasi) {
		this.huidasi = huidasi;
	}
	
	/**
	 * 获取：回答四
	 */
	public String getHuidasi() {
		return huidasi;
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
				
	
	/**
	 * 设置：回答五
	 */
	 
	public void setHuidawu(String huidawu) {
		this.huidawu = huidawu;
	}
	
	/**
	 * 获取：回答五
	 */
	public String getHuidawu() {
		return huidawu;
	}
			
}
