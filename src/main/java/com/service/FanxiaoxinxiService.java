package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.FanxiaoxinxiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.FanxiaoxinxiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.FanxiaoxinxiView;


/**
 * 返校信息
 *
 * @author 
 * @email 
 * @date 2021-04-04 11:13:07
 */
public interface FanxiaoxinxiService extends IService<FanxiaoxinxiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<FanxiaoxinxiVO> selectListVO(Wrapper<FanxiaoxinxiEntity> wrapper);
   	
   	FanxiaoxinxiVO selectVO(@Param("ew") Wrapper<FanxiaoxinxiEntity> wrapper);
   	
   	List<FanxiaoxinxiView> selectListView(Wrapper<FanxiaoxinxiEntity> wrapper);
   	
   	FanxiaoxinxiView selectView(@Param("ew") Wrapper<FanxiaoxinxiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<FanxiaoxinxiEntity> wrapper);
   	
}

