package com.zl.mapper;

import org.apache.ibatis.annotations.Mapper;

import org.apache.ibatis.annotations.Param;

import com.zl.pojo.Consumer;

@Mapper
public interface ConsumerMapper {

	Consumer personalLogin(@Param("consumerName")String consumerName,@Param("password")String password);

}
/*
*/