package com.xmall.mapper;

import java.util.List;

import com.xmall.mapper.mybatis.XmallMapper;
import com.xmall.model.Commodity;

@XmallMapper
public interface CommodityMapper {
	List<Commodity> listAll();
	Commodity get(long id);
	void delete(long id);
	void update(Commodity commodity);
	void insert(Commodity commodity);
}
