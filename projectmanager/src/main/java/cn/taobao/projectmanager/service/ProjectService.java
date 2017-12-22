package cn.taobao.projectmanager.service;

import java.util.List;

import cn.taobao.projectmanager.pojo.Consumption;
import cn.taobao.projectmanager.vo.EasyUIPage;

public interface ProjectService {

	/**
	 * 查询到所有消费项目的集合
	 * @return
	 */
	public List<Consumption> findAllConsumptions();
	
	/**
	 * 使用分页插件进行查询
	 * @param pageNum
	 * @param pageSzie
	 * @return
	 */
	public EasyUIPage queryConsumption(Integer pageNum,Integer pageSize);
}
