package com.entity.view;

import com.entity.FanxiaoxinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 返校信息
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-04-04 11:13:07
 */
@TableName("fanxiaoxinxi")
public class FanxiaoxinxiView  extends FanxiaoxinxiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public FanxiaoxinxiView(){
	}
 
 	public FanxiaoxinxiView(FanxiaoxinxiEntity fanxiaoxinxiEntity){
 	try {
			BeanUtils.copyProperties(this, fanxiaoxinxiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
