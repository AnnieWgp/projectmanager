package cn.taobao.projectmanager.service;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.taobao.projectmanager.pojo.Account;

public class AccountServiceTest {

	public AccountService accountService;
	
	@Before
	public void setUp() throws Exception {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				new String[] { "spring/applicationContext.xml", "spring/applicationContext-mybatis.xml", "spring/applicationContext-tx.xml" });
		this.accountService = context.getBean(AccountService.class);
	}

	/*@Test
	public void addAccountTest() throws ParseException{
		Account account = new Account();
		String date = "2010-1-2";
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		Date newDate = sdf.parse(date);
		account.setConsumeNumber("第一条");;
		account.setcId(1);
		account.setConsumeCost(36.32);;
		account.setConsumeWay("1");;
		account.setConsumeTime(newDate);
		account.setcId(2);
		account.setConsumeUser("huang");
		account.setConsumeNote("备注");
		account.setConsumeFlag("1");
			
		accountService.addAccount(account);;
	}*/
	@Test
	public void queryAccountTest() throws ParseException{
		
			
		List<Account> queryAccount = accountService.queryAccount();
		System.out.println(queryAccount.get(0).getConsumeUser());
	}
}
