package com.sms.service;


import com.sms.pojo.Page;
import com.sms.pojo.Wares;

public interface WaresService {
	/**
	 * 添加商品信息
	 * @param wares
	 */
	void addBatch(Wares wares);
	/**
	 * 分页查询商品的信息，
	 * @param page	当前的页数
	 * @param rows	要显示的记录数
	 * @return
	 */
	Page findWaresByPage(Integer page,Integer rows);
	/**
	 * 根据商品id查询信息
	 * @return
	 */
	Wares findWareById(Long wareId);
	/**
	 * 根据商品id删除信息
	 * @return
	 */
	int deleteWareById(Long wareId);
	
	

}
