package cn.taobao.projectmanager.service;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.taobao.projectmanager.pojo.Consumption;
import cn.taobao.projectmanager.pojo.Contype;

public class ConsumptionServiceTest {

	public ConsumptionService ConsumptionService;
	
	@Before
	public void setUp() throws Exception {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				new String[] { "spring/applicationContext.xml", "spring/applicationContext-mybatis.xml", "spring/applicationContext-tx.xml" });
		this.ConsumptionService = context.getBean(ConsumptionService.class);
	}

	@Test
	public void addConsumptionTest(){
		Consumption consumption = new Consumption();
		consumption.setcName("名称5");
		consumption.settId(1);
		consumption.setcNote("备注5");
		ConsumptionService.addConsumption(consumption);;
	}
	/*
	@Test
	public void deleteConsumptionTest(){
		ConsumptionService.deleteConsumption(2);
	}*/
	/*
	@Test
	public void updateConsumptionTest(){
		ConsumptionService.updateConsumption(3,13,"mingc3", "beizhu3");
	}
	*/

	/*@Test
	public void queryContypeTest(){
		List<Consumption> list=ConsumptionService.queryConsumption(13);
		for (Consumption consumption : list) {
			System.out.println(consumption);
		}
	}*/
}
