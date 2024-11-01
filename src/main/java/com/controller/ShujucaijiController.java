package com.controller;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Date;
import java.util.List;
import javax.servlet.http.HttpServletRequest;

import com.utils.ValidatorUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.annotation.IgnoreAuth;

import com.entity.ShujucaijiEntity;
import com.entity.view.ShujucaijiView;

import com.service.ShujucaijiService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MD5Util;
import com.utils.MPUtil;
import com.utils.CommonUtil;


/**
 * 数据采集
 * 后端接口
 * @author 
 * @email 
 * @date 2021-04-04 11:13:07
 */
@RestController
@RequestMapping("/shujucaiji")
public class ShujucaijiController {
    @Autowired
    private ShujucaijiService shujucaijiService;
    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,ShujucaijiEntity shujucaiji,
		HttpServletRequest request){
		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("jiaoshi")) {
			shujucaiji.setGonghao((String)request.getSession().getAttribute("username"));
		}
        EntityWrapper<ShujucaijiEntity> ew = new EntityWrapper<ShujucaijiEntity>();
		PageUtils page = shujucaijiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, shujucaiji), params), params));

        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,ShujucaijiEntity shujucaiji, HttpServletRequest request){
        EntityWrapper<ShujucaijiEntity> ew = new EntityWrapper<ShujucaijiEntity>();
		PageUtils page = shujucaijiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, shujucaiji), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( ShujucaijiEntity shujucaiji){
       	EntityWrapper<ShujucaijiEntity> ew = new EntityWrapper<ShujucaijiEntity>();
      	ew.allEq(MPUtil.allEQMapPre( shujucaiji, "shujucaiji")); 
        return R.ok().put("data", shujucaijiService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(ShujucaijiEntity shujucaiji){
        EntityWrapper< ShujucaijiEntity> ew = new EntityWrapper< ShujucaijiEntity>();
 		ew.allEq(MPUtil.allEQMapPre( shujucaiji, "shujucaiji")); 
		ShujucaijiView shujucaijiView =  shujucaijiService.selectView(ew);
		return R.ok("查询数据采集成功").put("data", shujucaijiView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        ShujucaijiEntity shujucaiji = shujucaijiService.selectById(id);
        return R.ok().put("data", shujucaiji);
    }

    /**
     * 前端详情
     */
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        ShujucaijiEntity shujucaiji = shujucaijiService.selectById(id);
        return R.ok().put("data", shujucaiji);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody ShujucaijiEntity shujucaiji, HttpServletRequest request){
    	shujucaiji.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(shujucaiji);
        shujucaijiService.insert(shujucaiji);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
	@IgnoreAuth
    @RequestMapping("/add")
    public R add(@RequestBody ShujucaijiEntity shujucaiji, HttpServletRequest request){
    	shujucaiji.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(shujucaiji);
        shujucaijiService.insert(shujucaiji);
        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody ShujucaijiEntity shujucaiji, HttpServletRequest request){
        //ValidatorUtils.validateEntity(shujucaiji);
        shujucaijiService.updateById(shujucaiji);//全部更新
        return R.ok();
    }
    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        shujucaijiService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
    /**
     * 提醒接口
     */
	@RequestMapping("/remind/{columnName}/{type}")
	public R remindCount(@PathVariable("columnName") String columnName, HttpServletRequest request, 
						 @PathVariable("type") String type,@RequestParam Map<String, Object> map) {
		map.put("column", columnName);
		map.put("type", type);
		
		if(type.equals("2")) {
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			Calendar c = Calendar.getInstance();
			Date remindStartDate = null;
			Date remindEndDate = null;
			if(map.get("remindstart")!=null) {
				Integer remindStart = Integer.parseInt(map.get("remindstart").toString());
				c.setTime(new Date()); 
				c.add(Calendar.DAY_OF_MONTH,remindStart);
				remindStartDate = c.getTime();
				map.put("remindstart", sdf.format(remindStartDate));
			}
			if(map.get("remindend")!=null) {
				Integer remindEnd = Integer.parseInt(map.get("remindend").toString());
				c.setTime(new Date());
				c.add(Calendar.DAY_OF_MONTH,remindEnd);
				remindEndDate = c.getTime();
				map.put("remindend", sdf.format(remindEndDate));
			}
		}
		
		Wrapper<ShujucaijiEntity> wrapper = new EntityWrapper<ShujucaijiEntity>();
		if(map.get("remindstart")!=null) {
			wrapper.ge(columnName, map.get("remindstart"));
		}
		if(map.get("remindend")!=null) {
			wrapper.le(columnName, map.get("remindend"));
		}

		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("jiaoshi")) {
			wrapper.eq("gonghao", (String)request.getSession().getAttribute("username"));
		}

		int count = shujucaijiService.selectCount(wrapper);
		return R.ok().put("count", count);
	}
	


}
