package com.sms.service;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sms.mapper.WareMapper;
import com.sms.pojo.Page;
import com.sms.pojo.Wares;

@Service
public class WaresServiceImpl implements WaresService{
	
	@Autowired
	private WareMapper wareMapper;
	
	@Override
	public void addBatch(Wares wares) {//添加
		wares.setWareName(wares.getWareName())
			.setWareHome(wares.getWareHome())
			.setWarePrice(wares.getWarePrice());
		wareMapper.insert(wares);
	}
	@Override
	public Page findWaresByPage(Integer page,Integer rows){//分页查询商品的信息。
		//1.查询总的记录数
		int total=wareMapper.selectCount(null);
		//2.分页查询List集合
		int start=(page-1)*rows;
		List<Wares> listWares=wareMapper.findWaresByPage(start, rows);
		System.out.println(total);
		return new Page(total,listWares);
	}
	@Override
	public Wares findWareById(Long wareId) {//查找一条
		
		return wareMapper.selectById(wareId);
	}
	
	@Override
	public int deleteWareById(Long wareId) {//删除一条
		return wareMapper.deleteById(wareId);
	}
	
}
