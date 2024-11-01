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


import com.dao.WenjuanfenleiDao;
import com.entity.WenjuanfenleiEntity;
import com.service.WenjuanfenleiService;
import com.entity.vo.WenjuanfenleiVO;
import com.entity.view.WenjuanfenleiView;

@Service("wenjuanfenleiService")
public class WenjuanfenleiServiceImpl extends ServiceImpl<WenjuanfenleiDao, WenjuanfenleiEntity> implements WenjuanfenleiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<WenjuanfenleiEntity> page = this.selectPage(
                new Query<WenjuanfenleiEntity>(params).getPage(),
                new EntityWrapper<WenjuanfenleiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<WenjuanfenleiEntity> wrapper) {
		  Page<WenjuanfenleiView> page =new Query<WenjuanfenleiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<WenjuanfenleiVO> selectListVO(Wrapper<WenjuanfenleiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public WenjuanfenleiVO selectVO(Wrapper<WenjuanfenleiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<WenjuanfenleiView> selectListView(Wrapper<WenjuanfenleiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public WenjuanfenleiView selectView(Wrapper<WenjuanfenleiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
