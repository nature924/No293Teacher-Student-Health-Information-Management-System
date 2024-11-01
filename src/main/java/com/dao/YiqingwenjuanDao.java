package com.dao;

import com.entity.YiqingwenjuanEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.YiqingwenjuanVO;
import com.entity.view.YiqingwenjuanView;


/**
 * 疫情问卷
 * 
 * @author 
 * @email 
 * @date 2021-04-04 11:13:07
 */
public interface YiqingwenjuanDao extends BaseMapper<YiqingwenjuanEntity> {
	
	List<YiqingwenjuanVO> selectListVO(@Param("ew") Wrapper<YiqingwenjuanEntity> wrapper);
	
	YiqingwenjuanVO selectVO(@Param("ew") Wrapper<YiqingwenjuanEntity> wrapper);
	
	List<YiqingwenjuanView> selectListView(@Param("ew") Wrapper<YiqingwenjuanEntity> wrapper);

	List<YiqingwenjuanView> selectListView(Pagination page,@Param("ew") Wrapper<YiqingwenjuanEntity> wrapper);
	
	YiqingwenjuanView selectView(@Param("ew") Wrapper<YiqingwenjuanEntity> wrapper);
	
}
