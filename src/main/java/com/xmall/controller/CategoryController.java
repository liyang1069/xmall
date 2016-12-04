package com.xmall.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.xmall.model.Category;

@RequestMapping(value = "/classifies")
public class CategoryController extends ApplicationController {
	@ResponseBody
	@RequestMapping(value = "/index", method = RequestMethod.GET)
	public String index(){
		//List<Commodity> list = null;//new ArrayList<Commodity>();
		return "";
	}
	
	@ResponseBody
	@RequestMapping(value = "/edit/{id}", method = RequestMethod.GET)
	public String edit(@PathVariable("id") int id){
		return "";
	}
	
	@ResponseBody
	@RequestMapping(value = "/update/{id}", method = RequestMethod.POST)
	public String update(@PathVariable("id") int id,Category commodity){
		return "";
	}
	
	@ResponseBody
	@RequestMapping(value = "/create", method = RequestMethod.POST)
	public String crate(Category commodity){
		return "";
	}
}
