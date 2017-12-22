package cn.taobao.projectmanager.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.taobao.projectmanager.mapper.ConsumptionMapper;
import cn.taobao.projectmanager.pojo.Consumption;
import cn.taobao.projectmanager.pojo.Contype;
import cn.taobao.projectmanager.service.ConsumptionService;

@Service
public class ConsumptionServiceImpl implements ConsumptionService{

	@Autowired
	ConsumptionMapper consumptionMapper;


	@Override
	public void addConsumption(Consumption consumption) {
		consumptionMapper.addConsumption(consumption);
		
	}


	@Override
	public Boolean deleteConsumption(int c_id) {
		int index = this.consumptionMapper.deleteConsumption(c_id);
		if(index>0){
			return true;
		}
		return false;
	}
	
	@Override
	public Boolean updateConsumption(int t_id,String c_name,String c_note) {
		int index = this.consumptionMapper.updateConsumption(t_id, c_name, c_note);
		if(index>0){
			return true;
		}
		return false;
	}
	
	@Override
	public List<Consumption> queryConsumption(int t_id) {
		List<Consumption> list= this.consumptionMapper.queryConsumption(t_id);
		return list;
	}
}
