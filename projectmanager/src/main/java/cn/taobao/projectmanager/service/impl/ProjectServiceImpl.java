package cn.taobao.projectmanager.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

import cn.taobao.projectmanager.mapper.ProjectMapper;
import cn.taobao.projectmanager.pojo.Consumption;
import cn.taobao.projectmanager.service.ProjectService;
import cn.taobao.projectmanager.vo.EasyUIPage;

@Service
public class ProjectServiceImpl implements ProjectService{

	@Autowired
	ProjectMapper projectMapper;
	
	@Override
	public List<Consumption> findAllConsumptions() {
		return projectMapper.findAllConsumptions();
	}

	@Override
	public EasyUIPage queryConsumption(Integer pageNum, Integer pageSize) {
		EasyUIPage easyUIPage=new EasyUIPage();
		PageHelper.startPage(pageNum, pageSize);
		List<Consumption> list = this.projectMapper.findAllConsumptions();
		PageInfo<Consumption> pageInfo = new PageInfo<Consumption>(list);
		easyUIPage.setRows(pageInfo.getList());
		easyUIPage.setTotal(pageInfo.getTotal());
		return easyUIPage;
	}

	
}
