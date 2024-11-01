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


import com.dao.FanxiaoxinxiDao;
import com.entity.FanxiaoxinxiEntity;
import com.service.FanxiaoxinxiService;
import com.entity.vo.FanxiaoxinxiVO;
import com.entity.view.FanxiaoxinxiView;

@Service("fanxiaoxinxiService")
public class FanxiaoxinxiServiceImpl extends ServiceImpl<FanxiaoxinxiDao, FanxiaoxinxiEntity> implements FanxiaoxinxiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<FanxiaoxinxiEntity> page = this.selectPage(
                new Query<FanxiaoxinxiEntity>(params).getPage(),
                new EntityWrapper<FanxiaoxinxiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<FanxiaoxinxiEntity> wrapper) {
		  Page<FanxiaoxinxiView> page =new Query<FanxiaoxinxiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<FanxiaoxinxiVO> selectListVO(Wrapper<FanxiaoxinxiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public FanxiaoxinxiVO selectVO(Wrapper<FanxiaoxinxiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<FanxiaoxinxiView> selectListView(Wrapper<FanxiaoxinxiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public FanxiaoxinxiView selectView(Wrapper<FanxiaoxinxiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
