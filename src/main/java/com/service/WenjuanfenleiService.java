package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.WenjuanfenleiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.WenjuanfenleiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.WenjuanfenleiView;


/**
 * 问卷分类
 *
 * @author 
 * @email 
 * @date 2021-04-04 11:13:07
 */
public interface WenjuanfenleiService extends IService<WenjuanfenleiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<WenjuanfenleiVO> selectListVO(Wrapper<WenjuanfenleiEntity> wrapper);
   	
   	WenjuanfenleiVO selectVO(@Param("ew") Wrapper<WenjuanfenleiEntity> wrapper);
   	
   	List<WenjuanfenleiView> selectListView(Wrapper<WenjuanfenleiEntity> wrapper);
   	
   	WenjuanfenleiView selectView(@Param("ew") Wrapper<WenjuanfenleiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<WenjuanfenleiEntity> wrapper);
   	
}

