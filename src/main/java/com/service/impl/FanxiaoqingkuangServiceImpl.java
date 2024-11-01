package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.FanxiaoqingkuangDao;
import com.entity.FanxiaoqingkuangEntity;
import com.service.FanxiaoqingkuangService;
import com.entity.vo.FanxiaoqingkuangVO;
import com.entity.view.FanxiaoqingkuangView;

@Service("fanxiaoqingkuangService")
public class FanxiaoqingkuangServiceImpl extends ServiceImpl<FanxiaoqingkuangDao, FanxiaoqingkuangEntity> implements FanxiaoqingkuangService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<FanxiaoqingkuangEntity> page = this.selectPage(
                new Query<FanxiaoqingkuangEntity>(params).getPage(),
                new EntityWrapper<FanxiaoqingkuangEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<FanxiaoqingkuangEntity> wrapper) {
		  Page<FanxiaoqingkuangView> page =new Query<FanxiaoqingkuangView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<FanxiaoqingkuangVO> selectListVO(Wrapper<FanxiaoqingkuangEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public FanxiaoqingkuangVO selectVO(Wrapper<FanxiaoqingkuangEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<FanxiaoqingkuangView> selectListView(Wrapper<FanxiaoqingkuangEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public FanxiaoqingkuangView selectView(Wrapper<FanxiaoqingkuangEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
