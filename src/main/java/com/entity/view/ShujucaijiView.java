package com.entity.view;

import com.entity.ShujucaijiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 数据采集
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-04-04 11:13:07
 */
@TableName("shujucaiji")
public class ShujucaijiView  extends ShujucaijiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public ShujucaijiView(){
	}
 
 	public ShujucaijiView(ShujucaijiEntity shujucaijiEntity){
 	try {
			BeanUtils.copyProperties(this, shujucaijiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
