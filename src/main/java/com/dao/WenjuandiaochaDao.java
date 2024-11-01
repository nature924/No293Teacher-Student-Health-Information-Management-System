package com.dao;

import com.entity.WenjuandiaochaEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.WenjuandiaochaVO;
import com.entity.view.WenjuandiaochaView;


/**
 * 问卷调查
 * 
 * @author 
 * @email 
 * @date 2021-04-04 11:13:07
 */
public interface WenjuandiaochaDao extends BaseMapper<WenjuandiaochaEntity> {
	
	List<WenjuandiaochaVO> selectListVO(@Param("ew") Wrapper<WenjuandiaochaEntity> wrapper);
	
	WenjuandiaochaVO selectVO(@Param("ew") Wrapper<WenjuandiaochaEntity> wrapper);
	
	List<WenjuandiaochaView> selectListView(@Param("ew") Wrapper<WenjuandiaochaEntity> wrapper);

	List<WenjuandiaochaView> selectListView(Pagination page,@Param("ew") Wrapper<WenjuandiaochaEntity> wrapper);
	
	WenjuandiaochaView selectView(@Param("ew") Wrapper<WenjuandiaochaEntity> wrapper);
	
}
