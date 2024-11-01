package com.dao;

import com.entity.ShujucaijiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ShujucaijiVO;
import com.entity.view.ShujucaijiView;


/**
 * 数据采集
 * 
 * @author 
 * @email 
 * @date 2021-04-04 11:13:07
 */
public interface ShujucaijiDao extends BaseMapper<ShujucaijiEntity> {
	
	List<ShujucaijiVO> selectListVO(@Param("ew") Wrapper<ShujucaijiEntity> wrapper);
	
	ShujucaijiVO selectVO(@Param("ew") Wrapper<ShujucaijiEntity> wrapper);
	
	List<ShujucaijiView> selectListView(@Param("ew") Wrapper<ShujucaijiEntity> wrapper);

	List<ShujucaijiView> selectListView(Pagination page,@Param("ew") Wrapper<ShujucaijiEntity> wrapper);
	
	ShujucaijiView selectView(@Param("ew") Wrapper<ShujucaijiEntity> wrapper);
	
}
