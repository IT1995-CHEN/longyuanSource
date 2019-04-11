package com.zb.mapper;

import org.springframework.stereotype.Repository;

import com.zb.entity.HisData;

@Repository
public interface HisDataMapper {
/*在表db_hisdata中增加数据*/
	public boolean add(HisData h);
}
