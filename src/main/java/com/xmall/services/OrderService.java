package com.xmall.services;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.xmall.mapper.OrderMapper;
import com.xmall.model.Order;

@Component
@Transactional
public class OrderService extends BaseService {
	
	@Resource
	private OrderMapper orderMapper;
	
	public List<Order> listAll(long userId){
		List<Order> list = orderMapper.listAll(userId);
		return list;
	}
	
	public Order get(Long id){
		Order commodity = orderMapper.get(id);
		return commodity;
	}
	
	public boolean delete(Long id){
		orderMapper.delete(id);
		return true;
	}
	
	public boolean update(Order order){
		orderMapper.update(order);
		return true;
	}
	
	public boolean create(Order order){
		orderMapper.insert(order);
		return true;
	}
}
