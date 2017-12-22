package cn.taobao.projectmanager.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.taobao.projectmanager.mapper.AccountMapper;
import cn.taobao.projectmanager.pojo.Account;
import cn.taobao.projectmanager.service.AccountService;

@Service
public class AccountServiceImpl implements AccountService{

	@Autowired
	AccountMapper accountMapper;
	
	@Override
	public void addAccount(Account account) {
		accountMapper.addAccount(account);
		
	}

	/**
	 * 查询账单
	 */
	public List<Account> queryAccount(){
		return accountMapper.queryAccount();
	}
}
