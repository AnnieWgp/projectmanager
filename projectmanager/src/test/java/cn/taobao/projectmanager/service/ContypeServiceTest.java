package cn.taobao.projectmanager.service;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.taobao.projectmanager.pojo.Contype;

public class ContypeServiceTest {

	public ContypeService contypeService;
	
	@Before
	public void setUp() throws Exception {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				new String[] { "spring/applicationContext.xml", "spring/applicationContext-mybatis.xml", "spring/applicationContext-tx.xml" });
		this.contypeService = context.getBean(ContypeService.class);
	}

	@Test
	public void addContypeTest(){
		Contype contype = new Contype();
		contype.settName("类别4");
		contype.settNote("备注4");
		contypeService.addContype(contype);
		
	}
/*
	@Test
	public void deleteContypeTest(){
		contypeService.deleteContype(2);
	}
	*/
	/*@Test
	public void updateContypeTest(){
		contypeService.updateContype(1,"leibie1", "beizhu1");
	}*/
	
	/*@Test
	public void queryContypeTest(){
		List<Contype> list=contypeService.queryContype();
		for (Contype contype : list) {
			System.out.println(contype);
		}
	}*/
}
