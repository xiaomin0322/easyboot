package com.zf.easyboot.modules.test.mapper;

import com.zf.easyboot.modules.test.entity.PeRule;

import java.util.Map;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.core.toolkit.Constants;

/**
 * <p>
 * 促销规则表 Mapper 接口
 * </p>
 *
 * @author Cenyol
 * @since 2019-11-18
 */
public interface PeRuleMapper extends BaseMapper<PeRule> {

	 @Select("复杂的sql  " +
				"			  ${ew.customSqlSegment}  ")
	 
	 IPage<Map<String,Object>> selectMyPageMap2(IPage<?> page, @Param(Constants.WRAPPER) Wrapper<?> queryWrapper);
	 
	 /**
	  * {
          "size": 5,          
          "current": 1,
          "id":5,
          "orders": ["id desc","old_id asc"] 
}
	  * @param page
	  * @param queryWrapper
	  * @return
	  */
	 @Select("select * from pe_rule  ${ew.customSqlSegment} ")
	 IPage<Map<String,Object>> selectMyPageMap3(IPage<?> page, @Param(Constants.WRAPPER) Wrapper<?> queryWrapper);
}
