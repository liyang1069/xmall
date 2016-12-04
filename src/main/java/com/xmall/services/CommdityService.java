package com.xmall.services;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.xmall.mapper.CommodityMapper;
import com.xmall.model.Commodity;

@Component
@Transactional
public class CommdityService extends BaseService {
	
	@Resource
	private CommodityMapper commodityMapper;
	
	public List<Commodity> listAll(){
		List<Commodity> list = commodityMapper.listAll();
		return list;
	}
	
	public Commodity get(Long id){
		Commodity commodity = commodityMapper.get(id);
		return commodity;
	}
	
	public boolean delete(Long id){
		commodityMapper.delete(id);
		return true;
	}
	
	public boolean update(Commodity commodity){
		commodityMapper.update(commodity);
		return true;
	}
	
	public boolean create(Commodity commodity){
		commodityMapper.insert(commodity);
		return true;
	}
}
