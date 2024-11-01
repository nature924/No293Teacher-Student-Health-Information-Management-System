package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.XinxicaijiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.XinxicaijiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.XinxicaijiView;


/**
 * 信息采集
 *
 * @author 
 * @email 
 * @date 2021-04-04 11:13:07
 */
public interface XinxicaijiService extends IService<XinxicaijiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<XinxicaijiVO> selectListVO(Wrapper<XinxicaijiEntity> wrapper);
   	
   	XinxicaijiVO selectVO(@Param("ew") Wrapper<XinxicaijiEntity> wrapper);
   	
   	List<XinxicaijiView> selectListView(Wrapper<XinxicaijiEntity> wrapper);
   	
   	XinxicaijiView selectView(@Param("ew") Wrapper<XinxicaijiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<XinxicaijiEntity> wrapper);
   	
}

