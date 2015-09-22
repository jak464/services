package testproject.controllers;

import org.springframework.beans.factory.annotation.Autowired;
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
import testproject.services.AccountService;

@Controller
public class AccountController {
	
	@Autowired
	private AccountService service;

	@RequestMapping(path = "/accounts/{accountId}", produces = MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	public Account getAccount(@PathVariable int accountId) {
		return service.getAccount(accountId);
	}
	
	
	@RequestMapping(path = "/accounts", consumes = MediaType.APPLICATION_JSON_VALUE, method=RequestMethod.POST)
	@ResponseStatus(HttpStatus.OK)
	public void addAccount(@RequestBody Account account) {
		service.addAccount(account);
	}
}
