package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.FanxiaoqingkuangEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.FanxiaoqingkuangVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.FanxiaoqingkuangView;


/**
 * 返校情况
 *
 * @author 
 * @email 
 * @date 2021-04-04 11:13:07
 */
public interface FanxiaoqingkuangService extends IService<FanxiaoqingkuangEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<FanxiaoqingkuangVO> selectListVO(Wrapper<FanxiaoqingkuangEntity> wrapper);
   	
   	FanxiaoqingkuangVO selectVO(@Param("ew") Wrapper<FanxiaoqingkuangEntity> wrapper);
   	
   	List<FanxiaoqingkuangView> selectListView(Wrapper<FanxiaoqingkuangEntity> wrapper);
   	
   	FanxiaoqingkuangView selectView(@Param("ew") Wrapper<FanxiaoqingkuangEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<FanxiaoqingkuangEntity> wrapper);
   	
}

