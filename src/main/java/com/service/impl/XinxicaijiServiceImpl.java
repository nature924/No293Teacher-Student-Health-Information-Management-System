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


import com.dao.XinxicaijiDao;
import com.entity.XinxicaijiEntity;
import com.service.XinxicaijiService;
import com.entity.vo.XinxicaijiVO;
import com.entity.view.XinxicaijiView;

@Service("xinxicaijiService")
public class XinxicaijiServiceImpl extends ServiceImpl<XinxicaijiDao, XinxicaijiEntity> implements XinxicaijiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<XinxicaijiEntity> page = this.selectPage(
                new Query<XinxicaijiEntity>(params).getPage(),
                new EntityWrapper<XinxicaijiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<XinxicaijiEntity> wrapper) {
		  Page<XinxicaijiView> page =new Query<XinxicaijiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<XinxicaijiVO> selectListVO(Wrapper<XinxicaijiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public XinxicaijiVO selectVO(Wrapper<XinxicaijiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<XinxicaijiView> selectListView(Wrapper<XinxicaijiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public XinxicaijiView selectView(Wrapper<XinxicaijiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
