package com.entity.view;

import com.entity.YiqingwenjuanEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 疫情问卷
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-04-04 11:13:07
 */
@TableName("yiqingwenjuan")
public class YiqingwenjuanView  extends YiqingwenjuanEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public YiqingwenjuanView(){
	}
 
 	public YiqingwenjuanView(YiqingwenjuanEntity yiqingwenjuanEntity){
 	try {
			BeanUtils.copyProperties(this, yiqingwenjuanEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
