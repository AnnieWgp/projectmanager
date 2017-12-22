package cn.taobao.projectmanager.controller;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import cn.taobao.projectmanager.pojo.Account;
import cn.taobao.projectmanager.service.AccountService;

@Controller
public class AccountAction {

	@Autowired
	AccountService accountService;
	
	@RequestMapping(value="/getAccount")
	public List<Account> getAccount(Model model){
		List<Account> list =  accountService.queryAccount();
		model.addAttribute("AccountList",list);
		return  list;
	}

	@RequestMapping(value="/addAccount")
	public String addCons(Model model,@RequestParam(value="cNumber",required=true)String cNumber,
									  @RequestParam(value="tname",required=true)Integer tname ,
									  @RequestParam(value="cname",required=false)Integer cname,
									  @RequestParam(value="cCost",required=false)Double cCost,
									  @RequestParam(value="cWay",required=false)String cWay,
									  @RequestParam(value="cTime",required=false)String cTime,
									  @RequestParam(value="cNote",required=false)String cNote,
									  @RequestParam(value="cUser",required=false)String cUser) throws ParseException{
		Account account = new Account();
		account.setcId(cname);
		account.settId(tname);
		account.setConsumeCost(cCost);
		account.setConsumeFlag("0");
		account.setConsumeNote(cNote);
		account.setConsumeNumber(cNumber);
		account.setConsumeUser(cUser);
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		Date newDate = sdf.parse(cTime);
		account.setConsumeTime(newDate);
		account.setConsumeWay(cWay);
		
		accountService.addAccount(account);
		return  "success3";
	}
}
