package cn.taobao.projectmanager.service;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.taobao.projectmanager.vo.EasyUIPage;

public class ProjectServiceTest {

	public ProjectService projectService;

	@Before
	public void setUp() throws Exception {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				new String[] { "spring/applicationContext.xml", "spring/applicationContext-mybatis.xml", "spring/applicationContext-tx.xml" });
		this.projectService = context.getBean(ProjectService.class);
	}

	@Test
	public void testQueryUserById() {
		System.out.println(this.projectService.findAllConsumptions());
	}
	
	@Test
	public void queryConsumption(){
		EasyUIPage easyUIPage =this.projectService.queryConsumption(2, 3);
		System.out.println(easyUIPage.getRows());
		System.out.println(easyUIPage.getTotal());
		List<?> list = easyUIPage.getRows();
		for (Object object : list) {
			System.out.println(object);
		}
	}

}
