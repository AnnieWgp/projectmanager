package cn.taobao.projectmanager.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.taobao.projectmanager.pojo.Consumption;
import cn.taobao.projectmanager.pojo.Contype;
import cn.taobao.projectmanager.service.ConsumptionService;
import cn.taobao.projectmanager.service.ContypeService;

@Controller
@RequestMapping(value="/consum")
public class ConsumAction {

	@Autowired
	ConsumptionService ConsumptionService;
	
	@RequestMapping(value="/list")
	public String getCon(Model model,int tId){
		List<Consumption> list =  this.ConsumptionService.queryConsumption(tId);
		model.addAttribute("Consumptions",list);
		return  "consumptions";
	}
	
	@RequestMapping(value="/getlist")
	@ResponseBody
	public List<Consumption> getConsum(@RequestParam(value="tId",required=true)int t_id){
		List<Consumption> list =  this.ConsumptionService.queryConsumption(t_id);
		return  list;
	}
	
	@RequestMapping(value="/addcon")
	public String addCons(Model model,@RequestParam(value="cName",required=true)String name,@RequestParam(value="tId",required=true)Integer tid ,@RequestParam(value="cNote",required=false)String note){
		Consumption consumption = new Consumption();
		consumption.setcName(name);
		consumption.setcNote(note);
		consumption.settId(tid);
		ConsumptionService.addConsumption(consumption);
		model.addAttribute("tId",tid);
		return  "success2";
	}
}
