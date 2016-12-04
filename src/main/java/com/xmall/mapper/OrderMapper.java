package com.xmall.mapper;

import java.util.List;

import com.xmall.mapper.mybatis.XmallMapper;
import com.xmall.model.Order;

@XmallMapper
public interface OrderMapper {
	List<Order> listAll(long userId);
	Order get(long id);
	void delete(long id);
	void update(Order order);
	void insert(Order order);
}
