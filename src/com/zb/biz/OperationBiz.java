package com.zb.biz;

import java.util.List;

import com.zb.entity.Operation;
import com.zb.entity.OperationComb;
import com.zb.util.PageUtil;

public interface OperationBiz {
	/**
	 * 添加操作数据
	 * @param operation
	 * @return
	 */
	public boolean add(Operation operation);
	/**
	 * 根据操作编号查询操作数据
	 * @param oid
	 * @return
	 */
	public OperationComb getOperationCombById(Integer oid);
	/**
	 * 获取所有的操作数据
	 * @param gsCode
	 * @param operationName
	 * @param operationTime
	 * @return
	 */
	public List<OperationComb> getAllOperationComb(String gsCode,String operationName,String operationTime);
	/**
	 * 根据gsCode、操作名称、操作时间分页查询操作数据
	 * @param gsCode
	 * @param operationName
	 * @param operationTime
	 * @param page
	 * @return
	 */
	public PageUtil<OperationComb> getAllPage(String gsCode,String operationName,String operationTime,PageUtil<OperationComb> page);
}
