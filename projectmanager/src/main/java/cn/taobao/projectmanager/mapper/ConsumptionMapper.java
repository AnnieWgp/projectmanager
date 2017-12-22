package cn.taobao.projectmanager.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import cn.taobao.projectmanager.pojo.Consumption;

public interface ConsumptionMapper {

	/**
	 * 添加消费名称
	 * @param consumption
	 */
	public void addConsumption(Consumption consumption);
	
	/**
	 * 根据消费的c_id删除消费项
	 * @param c_id
	 * @return
	 */
	public int deleteConsumption(@Param("c_id")int c_id);
	
	/**
	 * 根据修改消费项
	 * @param c_id
	 * @param t_id
	 * @param c_name
	 * @param c_note
	 * @return
	 */
	public int updateConsumption(@Param("t_id")int t_id,@Param("c_name")String c_name,@Param("c_note")String c_note);

	/**
	 * 根据消费种类id查询消费类列表
	 * @return 
	 */
	public List<Consumption> queryConsumption(@Param("t_id")int t_id);
}
