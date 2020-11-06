package com.cdac.cntr;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.cdac.dto.Trans;

import com.cdac.dto.User;

import com.cdac.service.TransService;

@Controller
@SessionAttributes("user")
public class TransController {
	
	@Autowired
	private TransService transService;
	
	@RequestMapping(value = "/prep_trans_add_form.htm",method = RequestMethod.GET)
	public String prepTransAddForm(ModelMap map) {
		map.put("trans", new Trans());
		return "trans_add_form";
	}
	

	@RequestMapping(value = "/trans_add.htm",method = RequestMethod.POST)
	public String transAdd(Trans trans,HttpSession session) {
		int userId = ((User)session.getAttribute("user")).getUserId();
		trans.setUserId(userId); 
		transService.addTrans(trans);
		return "home";
	}
	
	@RequestMapping(value = "/trans_list.htm",method = RequestMethod.GET)
	public String allTrans(ModelMap map,HttpSession session) {
		int userId = ((User)session.getAttribute("user")).getUserId();
		List<Trans> li = transService.selectAll(userId);
		map.put("expList", li);
		return "trans_list";
	}
	
	@RequestMapping(value = "/trans_delete.htm",method = RequestMethod.GET)
	public String transDelete(@RequestParam int transId,ModelMap map,HttpSession session) {
		
		transService.removeTrans(transId); 
		int userId = ((User)session.getAttribute("user")).getUserId();
		List<Trans> li = transService.selectAll(userId);
		map.put("expList", li);
		return "trans_list";
	}
	
	@RequestMapping(value = "/trans_update_form.htm",method = RequestMethod.GET)
	public String transUpdateForm(@RequestParam int transId,ModelMap map) {
		
		Trans exp = transService.findTrans(transId);
		map.put("trans", exp);
		return "trans_update_form";
	}
	
	@RequestMapping(value = "/trans_update.htm",method = RequestMethod.POST)
	public String transUpdate(Trans trans,ModelMap map,HttpSession session) {
		
		int userId = ((User)session.getAttribute("user")).getUserId();
		trans.setUserId(userId);
		transService.modifyTrans(trans);
			
		List<Trans> li = transService.selectAll(userId);
		map.put("expList", li);
		return "trans_list";
	}
}
