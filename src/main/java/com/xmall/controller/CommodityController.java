package com.xmall.controller;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.xmall.model.Commodity;
import com.xmall.services.CommdityService;
import com.xmall.util.JsonMapper;

@RequestMapping(value = "/commdities")
public class CommodityController extends ApplicationController {
	
	@Resource
	private CommdityService commdityService;

	@ResponseBody
	@RequestMapping(value = "/index", method = RequestMethod.GET)
	public String index(){
		return JsonMapper.nonEmptyMapper().toJson(commdityService.listAll());
	}
	
	@ResponseBody
	@RequestMapping(value = "/edit/{id}", method = RequestMethod.GET)
	public String edit(@PathVariable("id") long id){
		return JsonMapper.nonEmptyMapper().toJson(commdityService.get(id));
	}
	
	@ResponseBody
	@RequestMapping(value = "/delete/{id}", method = RequestMethod.GET)
	public String delete(@PathVariable("id") long id){
		commdityService.delete(id);
		return "";
	}
	
	@ResponseBody
	@RequestMapping(value = "/update/{id}", method = RequestMethod.POST)
	public String update(@PathVariable("id") long id,Commodity commodity){
		commdityService.update(commodity);
		return "";
	}
	
	@ResponseBody
	@RequestMapping(value = "/create", method = RequestMethod.POST)
	public String crate(Commodity commodity){
		commdityService.create(commodity);
		return "";
	}
}
