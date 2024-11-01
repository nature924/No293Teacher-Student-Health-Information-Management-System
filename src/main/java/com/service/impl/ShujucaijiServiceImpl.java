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


import com.dao.ShujucaijiDao;
import com.entity.ShujucaijiEntity;
import com.service.ShujucaijiService;
import com.entity.vo.ShujucaijiVO;
import com.entity.view.ShujucaijiView;

@Service("shujucaijiService")
public class ShujucaijiServiceImpl extends ServiceImpl<ShujucaijiDao, ShujucaijiEntity> implements ShujucaijiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ShujucaijiEntity> page = this.selectPage(
                new Query<ShujucaijiEntity>(params).getPage(),
                new EntityWrapper<ShujucaijiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ShujucaijiEntity> wrapper) {
		  Page<ShujucaijiView> page =new Query<ShujucaijiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<ShujucaijiVO> selectListVO(Wrapper<ShujucaijiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ShujucaijiVO selectVO(Wrapper<ShujucaijiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ShujucaijiView> selectListView(Wrapper<ShujucaijiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ShujucaijiView selectView(Wrapper<ShujucaijiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
