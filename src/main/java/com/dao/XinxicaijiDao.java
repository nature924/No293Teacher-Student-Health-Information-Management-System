package com.dao;

import com.entity.XinxicaijiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.XinxicaijiVO;
import com.entity.view.XinxicaijiView;


/**
 * 信息采集
 * 
 * @author 
 * @email 
 * @date 2021-04-04 11:13:07
 */
public interface XinxicaijiDao extends BaseMapper<XinxicaijiEntity> {
	
	List<XinxicaijiVO> selectListVO(@Param("ew") Wrapper<XinxicaijiEntity> wrapper);
	
	XinxicaijiVO selectVO(@Param("ew") Wrapper<XinxicaijiEntity> wrapper);
	
	List<XinxicaijiView> selectListView(@Param("ew") Wrapper<XinxicaijiEntity> wrapper);

	List<XinxicaijiView> selectListView(Pagination page,@Param("ew") Wrapper<XinxicaijiEntity> wrapper);
	
	XinxicaijiView selectView(@Param("ew") Wrapper<XinxicaijiEntity> wrapper);
	
}
