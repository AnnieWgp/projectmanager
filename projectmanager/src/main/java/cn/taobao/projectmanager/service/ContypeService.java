package cn.taobao.projectmanager.service;

import java.util.List;

import cn.taobao.projectmanager.pojo.Contype;

public interface ContypeService {

	/**
	 * 添加消费种类
	 * @param contype
	 */
	public void addContype(Contype contype);

	/**
	 * 根据t_id删除消费类
	 * @param t_id
	 * @return
	 */
	public Boolean deleteContype(int t_id);
	
	/**
	 * 修改消费类
	 * @param t_id
	 * @param t_name
	 * @param t_note
	 * @return
	 */
	public Boolean updateContype(String t_name,String t_note);
	
	/**
	 * 查询出所有消费类别
	 * @return
	 */
	public List<Contype> queryContype();
}
