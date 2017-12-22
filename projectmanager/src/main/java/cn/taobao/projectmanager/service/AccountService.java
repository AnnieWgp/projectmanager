package cn.taobao.projectmanager.service;

import java.util.List;

import cn.taobao.projectmanager.pojo.Account;

public interface AccountService {

	/**
	 * 添加账单
	 * @param contype
	 */
	public void addAccount(Account account);

	/**
	 * 查询账单
	 * @param contype
	 */
	public List<Account> queryAccount();
}
