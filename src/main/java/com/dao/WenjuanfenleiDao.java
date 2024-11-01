package com.dao;

import com.entity.WenjuanfenleiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.WenjuanfenleiVO;
import com.entity.view.WenjuanfenleiView;


/**
 * 问卷分类
 * 
 * @author 
 * @email 
 * @date 2021-04-04 11:13:07
 */
public interface WenjuanfenleiDao extends BaseMapper<WenjuanfenleiEntity> {
	
	List<WenjuanfenleiVO> selectListVO(@Param("ew") Wrapper<WenjuanfenleiEntity> wrapper);
	
	WenjuanfenleiVO selectVO(@Param("ew") Wrapper<WenjuanfenleiEntity> wrapper);
	
	List<WenjuanfenleiView> selectListView(@Param("ew") Wrapper<WenjuanfenleiEntity> wrapper);

	List<WenjuanfenleiView> selectListView(Pagination page,@Param("ew") Wrapper<WenjuanfenleiEntity> wrapper);
	
	WenjuanfenleiView selectView(@Param("ew") Wrapper<WenjuanfenleiEntity> wrapper);
	
}
