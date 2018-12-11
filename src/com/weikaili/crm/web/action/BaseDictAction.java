package com.weikaili.crm.web.action;

import java.io.IOException;
import java.util.List;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.weikaili.crm.domain.BaseDict;
import com.weikaili.crm.service.BaseDictService;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;
import net.sf.json.JsonConfig;

public class BaseDictAction extends ActionSupport implements ModelDriven<BaseDict> {
	private BaseDict baseDict = new BaseDict();
	@Override
	public BaseDict getModel() {
		// TODO Auto-generated method stub
		return baseDict;
	}
	// inject service
	private BaseDictService baseDictService;
	public void setBaseDictService(BaseDictService baseDictService) {
		this.baseDictService = baseDictService;
	}
	
	public String findByTypeCode() throws IOException {
//		System.out.println("baseDictAction's findbyTypeCode execute!");
		List<BaseDict> list = baseDictService.findByTypeCode(baseDict.getDict_type_code());
		//list -> json ----jsonlib/fastjson
		//JSONArray : arry/list -> JSON
		//JSONObject : Map/Object -> JSON
		JsonConfig jsonConfig = new JsonConfig();
		jsonConfig.setExcludes(new String[] {"dict_sort", "dict_enable", "dict_memo"});
		JSONArray jsonArray = JSONArray.fromObject(list,jsonConfig);
		System.out.println(jsonArray.toString());
		ServletActionContext.getResponse().setContentType("text/html;charset=UTF-8");
		ServletActionContext.getResponse().getWriter().println(jsonArray.toString());
		return NONE;
	}
}
