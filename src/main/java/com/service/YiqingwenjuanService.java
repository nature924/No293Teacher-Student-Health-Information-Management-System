package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.YiqingwenjuanEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.YiqingwenjuanVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.YiqingwenjuanView;


/**
 * 疫情问卷
 *
 * @author 
 * @email 
 * @date 2021-04-04 11:13:07
 */
public interface YiqingwenjuanService extends IService<YiqingwenjuanEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<YiqingwenjuanVO> selectListVO(Wrapper<YiqingwenjuanEntity> wrapper);
   	
   	YiqingwenjuanVO selectVO(@Param("ew") Wrapper<YiqingwenjuanEntity> wrapper);
   	
   	List<YiqingwenjuanView> selectListView(Wrapper<YiqingwenjuanEntity> wrapper);
   	
   	YiqingwenjuanView selectView(@Param("ew") Wrapper<YiqingwenjuanEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<YiqingwenjuanEntity> wrapper);
   	
}

