package com.zf.easyboot.modules.test.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.fastjson.JSON;
import com.zf.easyboot.common.base.CurdController;
import com.zf.easyboot.modules.test.entity.PeRule;
import com.zf.easyboot.modules.test.mapper.PeRuleMapper;

/**
 * <p>
 * 促销规则表 控制器
 * </p>
 *
 * @author Cenyol
 * @since 2019-11-18
*/
@RestController
@RequestMapping("/test/pe-rule")
public class PeRuleController extends CurdController<PeRule> {
	
	    @Autowired
	    public PeRuleMapper mapper;
	
	    @PostMapping( value = { "/list2"})
	    @ResponseBody
	    public String listByPage2(@RequestBody Map<String, Object> map) {
	        return JSON.toJSONString(
	                mapper.selectMyPageMap2(
	                        extractPageFromRequestMap(map),
	                        extractWrapperFromRequestMap(map)
	                )
	        );
	    }
	
	    
	    @PostMapping( value = { "/list3"})
	    @ResponseBody
	    public String listByPage3(@RequestBody Map<String, Object> map) {
	        return JSON.toJSONString(
	                mapper.selectMyPageMap3(
	                        extractPageFromRequestMap(map),
	                        extractWrapperFromRequestMap(map)
	                )
	        );
	    }

}
