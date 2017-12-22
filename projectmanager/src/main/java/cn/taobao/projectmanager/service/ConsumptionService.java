package cn.taobao.projectmanager.service;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import cn.taobao.projectmanager.pojo.Consumption;

public interface ConsumptionService {

	/**
	 * 添加消费种类
	 * @param contype
	 */
	public void addConsumption(Consumption consumption);
	
	/**
	 * 根据c_id删除消费类
	 * @param c_id
	 * @return
	 */
	public Boolean deleteConsumption(int c_id);

	/**
	 * 根据修改消费项
	 * @param c_id
	 * @param t_id
	 * @param c_name
	 * @param c_note
	 * @return
	 */
	public Boolean updateConsumption(int t_id,String c_name,String c_note);

	/**
	 * 根据消费种类id查询消费类列表
	 * @return 
	 */
	public List<Consumption> queryConsumption(int t_id);
}
