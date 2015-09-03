package testproject.controllers;

import java.util.ArrayList;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import testproject.cargos.Account;

@Controller
public class AccountController {
	
	ArrayList<Account> accountList = new ArrayList<Account>();

	@RequestMapping(path = "/accounts/{accountId}", produces = MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	public Account getAccount(@PathVariable int accountId) {
		for(int i = 0; i < accountList.size(); i++) {
			if(accountList.get(i).getAccountId() == accountId ) {
				return accountList.get(i);
			}
		}
		return null;	
	}
	
	
	@RequestMapping(path = "/accounts", consumes = MediaType.APPLICATION_JSON_VALUE, method=RequestMethod.POST)
	@ResponseStatus(HttpStatus.OK)
	public void addAccount(@RequestBody Account account) {
		accountList.add(account);
	}
	
	
}
