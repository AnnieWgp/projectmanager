package cn.taobao.projectmanager.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.taobao.projectmanager.mapper.ContypeMapper;
import cn.taobao.projectmanager.pojo.Contype;
import cn.taobao.projectmanager.service.ContypeService;

@Service
public class ContypeServiceImpl implements ContypeService{

	@Autowired
	ContypeMapper contypeMapper;

	@Override
	public void addContype(Contype contype) {
		contypeMapper.addContype(contype);
	}

	@Override
	public Boolean deleteContype(int t_id) {
		int index = this.contypeMapper.deleteContype(t_id);
		if(index>0){
			return true;
		}
		return false;
	}

	@Override
	public Boolean updateContype(String t_name, String t_note) {
		int index = this.contypeMapper.updateContype(t_name, t_note);
		if(index>0){
			return true;
		}
		return false;
	}
	
	@Override
	public List<Contype> queryContype() {
		List<Contype> list= this.contypeMapper.queryContype();;
		return list;
	}
}
