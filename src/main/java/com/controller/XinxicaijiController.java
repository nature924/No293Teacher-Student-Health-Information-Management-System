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

import com.entity.XinxicaijiEntity;
import com.entity.view.XinxicaijiView;

import com.service.XinxicaijiService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MD5Util;
import com.utils.MPUtil;
import com.utils.CommonUtil;


/**
 * 信息采集
 * 后端接口
 * @author 
 * @email 
 * @date 2021-04-04 11:13:07
 */
@RestController
@RequestMapping("/xinxicaiji")
public class XinxicaijiController {
    @Autowired
    private XinxicaijiService xinxicaijiService;
    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,XinxicaijiEntity xinxicaiji,
		HttpServletRequest request){
		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("xuesheng")) {
			xinxicaiji.setXuehao((String)request.getSession().getAttribute("username"));
		}
        EntityWrapper<XinxicaijiEntity> ew = new EntityWrapper<XinxicaijiEntity>();
		PageUtils page = xinxicaijiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, xinxicaiji), params), params));

        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,XinxicaijiEntity xinxicaiji, HttpServletRequest request){
        EntityWrapper<XinxicaijiEntity> ew = new EntityWrapper<XinxicaijiEntity>();
		PageUtils page = xinxicaijiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, xinxicaiji), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( XinxicaijiEntity xinxicaiji){
       	EntityWrapper<XinxicaijiEntity> ew = new EntityWrapper<XinxicaijiEntity>();
      	ew.allEq(MPUtil.allEQMapPre( xinxicaiji, "xinxicaiji")); 
        return R.ok().put("data", xinxicaijiService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(XinxicaijiEntity xinxicaiji){
        EntityWrapper< XinxicaijiEntity> ew = new EntityWrapper< XinxicaijiEntity>();
 		ew.allEq(MPUtil.allEQMapPre( xinxicaiji, "xinxicaiji")); 
		XinxicaijiView xinxicaijiView =  xinxicaijiService.selectView(ew);
		return R.ok("查询信息采集成功").put("data", xinxicaijiView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        XinxicaijiEntity xinxicaiji = xinxicaijiService.selectById(id);
        return R.ok().put("data", xinxicaiji);
    }

    /**
     * 前端详情
     */
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        XinxicaijiEntity xinxicaiji = xinxicaijiService.selectById(id);
        return R.ok().put("data", xinxicaiji);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody XinxicaijiEntity xinxicaiji, HttpServletRequest request){
    	xinxicaiji.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(xinxicaiji);
        xinxicaijiService.insert(xinxicaiji);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody XinxicaijiEntity xinxicaiji, HttpServletRequest request){
    	xinxicaiji.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(xinxicaiji);
        xinxicaijiService.insert(xinxicaiji);
        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody XinxicaijiEntity xinxicaiji, HttpServletRequest request){
        //ValidatorUtils.validateEntity(xinxicaiji);
        xinxicaijiService.updateById(xinxicaiji);//全部更新
        return R.ok();
    }
    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        xinxicaijiService.deleteBatchIds(Arrays.asList(ids));
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
		
		Wrapper<XinxicaijiEntity> wrapper = new EntityWrapper<XinxicaijiEntity>();
		if(map.get("remindstart")!=null) {
			wrapper.ge(columnName, map.get("remindstart"));
		}
		if(map.get("remindend")!=null) {
			wrapper.le(columnName, map.get("remindend"));
		}

		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("xuesheng")) {
			wrapper.eq("xuehao", (String)request.getSession().getAttribute("username"));
		}

		int count = xinxicaijiService.selectCount(wrapper);
		return R.ok().put("count", count);
	}
	


}
