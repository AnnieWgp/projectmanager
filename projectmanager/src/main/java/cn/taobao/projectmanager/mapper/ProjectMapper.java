package cn.taobao.projectmanager.mapper;

import java.util.List;

import cn.taobao.projectmanager.pojo.Consumption;
import cn.taobao.projectmanager.pojo.Contype;

public interface ProjectMapper {

	/**
	 * 查询到所有消费项目的集合
	 * @return
	 */
	public List<Consumption> findAllConsumptions();
	
	/**
	 * 添加消费种类
	 * @param contype
	 */
	public void addContype(Contype contype);
	
	/**
	 * 添加消费名称
	 * @param consumption
	 */
	public void addConsumption(Consumption consumption);
}
