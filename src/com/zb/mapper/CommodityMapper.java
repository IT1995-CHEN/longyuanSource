package com.zb.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import com.zb.entity.Commodity;

@Repository
public interface CommodityMapper {

/*	获取db_commodity表中所有信息*/
	public  List<Commodity> getAll(); 
	
/*	唯一查询*/
	public  List<Commodity> getInfoByGs(@Param("gsCode")Integer gsCode);
	
/*分页查询db_commodity表中数据信息，传参为gsCode*/
	public List<Commodity> getAllPage(@Param("gsCode")Integer gsCode,@Param("index")Integer index,@Param("size")Integer size);
	
/*分页查询db_commodity表中数据信息条数，传参为gsCode*/

	public int getAllPageCount(@Param("gsCode")Integer gsCode);
	

}




