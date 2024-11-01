package com.dao;

import com.entity.FanxiaoxinxiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.FanxiaoxinxiVO;
import com.entity.view.FanxiaoxinxiView;


/**
 * 返校信息
 * 
 * @author 
 * @email 
 * @date 2021-04-04 11:13:07
 */
public interface FanxiaoxinxiDao extends BaseMapper<FanxiaoxinxiEntity> {
	
	List<FanxiaoxinxiVO> selectListVO(@Param("ew") Wrapper<FanxiaoxinxiEntity> wrapper);
	
	FanxiaoxinxiVO selectVO(@Param("ew") Wrapper<FanxiaoxinxiEntity> wrapper);
	
	List<FanxiaoxinxiView> selectListView(@Param("ew") Wrapper<FanxiaoxinxiEntity> wrapper);

	List<FanxiaoxinxiView> selectListView(Pagination page,@Param("ew") Wrapper<FanxiaoxinxiEntity> wrapper);
	
	FanxiaoxinxiView selectView(@Param("ew") Wrapper<FanxiaoxinxiEntity> wrapper);
	
}
