package com.sms.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.sms.pojo.Wares;

public interface WareMapper extends BaseMapper<Wares>{
	/**
	 * 查询数据库时，要求最近的记录(时间)显示在最前方
	 * @param start 查询起始位置
	 * @param rows	一次查询多少条记录
	 * @return
	 */
	@Select("select *from sms_wares order by updated desc limit #{start},#{rows}")
	List<Wares> findWaresByPage(@Param("start")Integer start,@Param("rows")Integer rows);
}
