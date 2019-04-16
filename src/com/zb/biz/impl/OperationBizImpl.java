package com.zb.biz.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.zb.biz.OperationBiz;
import com.zb.entity.Operation;
import com.zb.entity.OperationComb;
import com.zb.mapper.OperationMapper;
import com.zb.util.PageUtil;
@Service("db_operation")
public class OperationBizImpl implements OperationBiz {
	@Autowired
	private OperationMapper operationMapper;
	
	/**
	 * 添加操作数据
	 * @param operation
	 * @return
	 */
	@Transactional
	public boolean add(Operation operation){
		boolean f = operationMapper.add(operation);
		return f;
	}
	/**
	 * 根据操作编号查询操作数据
	 * @param oid
	 * @return
	 */
	public OperationComb getOperationCombById(Integer oid){
		OperationComb  operationComb = operationMapper.getOperationCombById(oid);
		return operationComb;
	}
	/**
	 * 获取所有的操作数据
	 * @param gsCode
	 * @param operationName
	 * @param operationTime
	 * @return
	 */
	public List<OperationComb> getAllOperationComb(String gsCode,String operationName,String operationTime){
		List<OperationComb> operationCombs = operationMapper.getAllOperationComb(gsCode, operationName, operationTime);
		return operationCombs;
	}
	/**
	 * 根据gsCode、操作名称、操作时间分页查询操作数据
	 * @param gsCode
	 * @param operationName
	 * @param operationTime
	 * @param page
	 * @return
	 */
	public PageUtil<OperationComb> getAllPage(String gsCode,String operationName,String operationTime,PageUtil<OperationComb> page){
		List<OperationComb> operationCombs = operationMapper.getAllPage(gsCode, operationName, operationTime, (page.getIndex()-1)*page.getSize(), page.getSize());
		page.setPage(operationCombs);
		int count = operationMapper.getAllPageCount(gsCode, operationName, operationTime);
		page.setCount(count);
		return page;
	}
}
