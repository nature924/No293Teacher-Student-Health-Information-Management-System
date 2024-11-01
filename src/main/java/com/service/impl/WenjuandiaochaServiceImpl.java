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


import com.dao.WenjuandiaochaDao;
import com.entity.WenjuandiaochaEntity;
import com.service.WenjuandiaochaService;
import com.entity.vo.WenjuandiaochaVO;
import com.entity.view.WenjuandiaochaView;

@Service("wenjuandiaochaService")
public class WenjuandiaochaServiceImpl extends ServiceImpl<WenjuandiaochaDao, WenjuandiaochaEntity> implements WenjuandiaochaService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<WenjuandiaochaEntity> page = this.selectPage(
                new Query<WenjuandiaochaEntity>(params).getPage(),
                new EntityWrapper<WenjuandiaochaEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<WenjuandiaochaEntity> wrapper) {
		  Page<WenjuandiaochaView> page =new Query<WenjuandiaochaView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<WenjuandiaochaVO> selectListVO(Wrapper<WenjuandiaochaEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public WenjuandiaochaVO selectVO(Wrapper<WenjuandiaochaEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<WenjuandiaochaView> selectListView(Wrapper<WenjuandiaochaEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public WenjuandiaochaView selectView(Wrapper<WenjuandiaochaEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
