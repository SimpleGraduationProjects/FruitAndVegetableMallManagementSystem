package com.service;

import java.util.List;

import com.entity.RecAddress;


public interface RecAddressService {
	int deleteByPrimaryKey(String id);

	int insert(RecAddress record);

	int insertSelective(RecAddress record);

	RecAddress selectByPrimaryKey(String id);

	int updateByPrimaryKeySelective(RecAddress record);

	int updateByPrimaryKey(RecAddress record);
	
	List<RecAddress> getList(RecAddress record);

	int getTotal(RecAddress record);
}