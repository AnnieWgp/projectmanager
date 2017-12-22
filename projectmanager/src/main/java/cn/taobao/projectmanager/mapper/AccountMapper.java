package cn.taobao.projectmanager.mapper;

import java.util.List;

import cn.taobao.projectmanager.pojo.Account;

public interface AccountMapper {

	/**
	 * 添加账单
	 * @param 
	 */
	public void addAccount(Account account);

	/**
	 * 查询账单
	 * @param 
	 */
	public List<Account> queryAccount();
}
