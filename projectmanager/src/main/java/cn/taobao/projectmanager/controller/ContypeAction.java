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
@RequestMapping(value="/contype")
public class ContypeAction {

	@Autowired
	ContypeService contypeService;
	
	@RequestMapping(value="/list")
	public String getTypes(Model model){
		List<Contype> list =  this.contypeService.queryContype();
		model.addAttribute("ContypeList",list);
		return  "listype";
	}
	
	@RequestMapping(value="/getlist")
	@ResponseBody
	public List<Contype> getContype(){
		List<Contype> list =  this.contypeService.queryContype();
		return  list;
	}
	
	@RequestMapping(value="/addtype")
	public String addCon(Model model,@RequestParam(value="tName",required=true)String name,@RequestParam(value="tNote",required=false)String note){
		Contype contype = new Contype();
		contype.settName(name);
		contype.settNote(note);
		contypeService.addContype(contype);
		return  "success";
	}
	
}
