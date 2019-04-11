package com.zb.util;

import java.util.List;


public class PageUtil<T> {
private Integer index=1;
private Integer size=2;
private Integer total;
private Integer count;
private List<T> page;   

public Integer getIndex() {
	return index;
}
public void setIndex(Integer index) {
	this.index = index;
}
public Integer getSize() {
	return size;
}
public void setSize(Integer size) {
	this.size = size;
}
public Integer getTotal() {
	return total=count%size==0?count/size:count/size+1;
	
}
public void setTotal(Integer total) {
	this.total = total;
}
public Integer getCount() {
	return count;
}
public void setCount(Integer count) {
	this.count = count;
}
public List<T> getPage() {
	return page;
}
public void setPage(List<T> page) {
	this.page = page;
}
}

