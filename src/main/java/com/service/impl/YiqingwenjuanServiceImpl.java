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


import com.dao.YiqingwenjuanDao;
import com.entity.YiqingwenjuanEntity;
import com.service.YiqingwenjuanService;
import com.entity.vo.YiqingwenjuanVO;
import com.entity.view.YiqingwenjuanView;

@Service("yiqingwenjuanService")
public class YiqingwenjuanServiceImpl extends ServiceImpl<YiqingwenjuanDao, YiqingwenjuanEntity> implements YiqingwenjuanService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<YiqingwenjuanEntity> page = this.selectPage(
                new Query<YiqingwenjuanEntity>(params).getPage(),
                new EntityWrapper<YiqingwenjuanEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<YiqingwenjuanEntity> wrapper) {
		  Page<YiqingwenjuanView> page =new Query<YiqingwenjuanView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<YiqingwenjuanVO> selectListVO(Wrapper<YiqingwenjuanEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public YiqingwenjuanVO selectVO(Wrapper<YiqingwenjuanEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<YiqingwenjuanView> selectListView(Wrapper<YiqingwenjuanEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public YiqingwenjuanView selectView(Wrapper<YiqingwenjuanEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
