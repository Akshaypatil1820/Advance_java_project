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

import com.cdac.dto.Account;

import com.cdac.dto.User;
import com.cdac.service.AccountService;

@Controller
@SessionAttributes("user")
public class AccountController {
	
	@Autowired
	private AccountService accountService;
	
	@RequestMapping(value = "/prep_account_add_form.htm",method = RequestMethod.GET)
	public String prepAccountAddForm(ModelMap map) {
		map.put("account", new Account());
		return "account_add_form";
	}
	

	@RequestMapping(value = "/account_add.htm",method = RequestMethod.POST)
	public String accountAdd(Account account,HttpSession session) {
		int userId = ((User)session.getAttribute("user")).getUserId();
		account.setUserId(userId); 
		accountService.addAccount(account);
		return "home";
	}
	
	@RequestMapping(value = "/account_list.htm",method = RequestMethod.GET)
	public String allAccount(ModelMap map,HttpSession session) {
		int userId = ((User)session.getAttribute("user")).getUserId();
		List<Account> li = accountService.selectAll(userId);
		map.put("expList", li);
		return "account_list";
	}
	
	@RequestMapping(value = "/account_delete.htm",method = RequestMethod.GET)
	public String accountDelete(@RequestParam int accountId,ModelMap map,HttpSession session) {
		
		accountService.removeAccount(accountId); 
		
		int userId = ((User)session.getAttribute("user")).getUserId();
		List<Account> li = accountService.selectAll(userId);
		map.put("expList", li);
		return "account_list";
	}
	
	@RequestMapping(value = "/account_update_form.htm",method = RequestMethod.GET)
	public String accountUpdateForm(@RequestParam int accountId,ModelMap map) {
		
		Account exp = accountService.findAccount(accountId);
		map.put("account", exp);
		return "account_update_form";
	}
	
	@RequestMapping(value = "/account_update.htm",method = RequestMethod.POST)
	public String accountUpdate(Account account,ModelMap map,HttpSession session) {
		
		int userId = ((User)session.getAttribute("user")).getUserId();
		account.setUserId(userId);
		accountService.modifyAccount(account);
			
		List<Account> li = accountService.selectAll(userId);
		map.put("expList", li);
		return "account_list";
	}
}
