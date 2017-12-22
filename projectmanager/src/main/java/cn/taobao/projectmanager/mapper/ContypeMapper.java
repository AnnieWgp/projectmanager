package cn.taobao.projectmanager.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import cn.taobao.projectmanager.pojo.Contype;

public interface ContypeMapper {

	/**
	 * 添加消费种类
	 * @param contype
	 */
	public void addContype(Contype contype);

	/**
	 * 根据消费种类的t_id删除消费种类
	 * @param t_id
	 * @return
	 */
	public int deleteContype(@Param("t_id")int t_id);
	
	/**
	 * 根据修改消费种类
	 * @param t_id
	 * @param t_name
	 * @param t_note
	 * @return
	 */
	public int updateContype(@Param("t_name")String t_name,@Param("t_note")String t_note);

	/**
	 * 查询所有消费种类
	 * @return 
	 */
	public List<Contype> queryContype();
}