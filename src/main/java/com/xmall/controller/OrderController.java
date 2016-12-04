package com.xmall.controller;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.xmall.model.Order;
import com.xmall.services.OrderService;
import com.xmall.util.JsonMapper;

@RequestMapping(value = "/orders")
public class OrderController extends ApplicationController {
	
	@Resource
	private OrderService orderService;
	
	@ResponseBody
	@RequestMapping(value = "/index/{user_id}", method = RequestMethod.GET)
	public String index(@PathVariable("user_id") long userId){
		return JsonMapper.nonEmptyMapper().toJson(orderService.listAll(userId));
	}
	
	@ResponseBody
	@RequestMapping(value = "/edit/{id}", method = RequestMethod.GET)
	public String edit(@PathVariable("id") long id){
		return JsonMapper.nonEmptyMapper().toJson(orderService.get(id));
	}
	
	@ResponseBody
	@RequestMapping(value = "/update/{id}", method = RequestMethod.POST)
	public String update(@PathVariable("id") long id,Order order){
		orderService.update(order);
		return "";
	}
	
	@ResponseBody
	@RequestMapping(value = "/create", method = RequestMethod.POST)
	public String crate(Order order){
		orderService.create(order);
		return "";
	}
}
