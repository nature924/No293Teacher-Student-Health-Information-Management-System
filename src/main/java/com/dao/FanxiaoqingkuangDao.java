package com.dao;

import com.entity.FanxiaoqingkuangEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.FanxiaoqingkuangVO;
import com.entity.view.FanxiaoqingkuangView;


/**
 * 返校情况
 * 
 * @author 
 * @email 
 * @date 2021-04-04 11:13:07
 */
public interface FanxiaoqingkuangDao extends BaseMapper<FanxiaoqingkuangEntity> {
	
	List<FanxiaoqingkuangVO> selectListVO(@Param("ew") Wrapper<FanxiaoqingkuangEntity> wrapper);
	
	FanxiaoqingkuangVO selectVO(@Param("ew") Wrapper<FanxiaoqingkuangEntity> wrapper);
	
	List<FanxiaoqingkuangView> selectListView(@Param("ew") Wrapper<FanxiaoqingkuangEntity> wrapper);

	List<FanxiaoqingkuangView> selectListView(Pagination page,@Param("ew") Wrapper<FanxiaoqingkuangEntity> wrapper);
	
	FanxiaoqingkuangView selectView(@Param("ew") Wrapper<FanxiaoqingkuangEntity> wrapper);
	
}
