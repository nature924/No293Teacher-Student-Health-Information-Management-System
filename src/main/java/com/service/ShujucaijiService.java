package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ShujucaijiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ShujucaijiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ShujucaijiView;


/**
 * 数据采集
 *
 * @author 
 * @email 
 * @date 2021-04-04 11:13:07
 */
public interface ShujucaijiService extends IService<ShujucaijiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ShujucaijiVO> selectListVO(Wrapper<ShujucaijiEntity> wrapper);
   	
   	ShujucaijiVO selectVO(@Param("ew") Wrapper<ShujucaijiEntity> wrapper);
   	
   	List<ShujucaijiView> selectListView(Wrapper<ShujucaijiEntity> wrapper);
   	
   	ShujucaijiView selectView(@Param("ew") Wrapper<ShujucaijiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ShujucaijiEntity> wrapper);
   	
}

