package testproject.controllers;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import testproject.cargos.Account;

@Controller
public class AccountController {

	@RequestMapping(path = "/accounts/{accountId}", produces = MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	private Account getAccount(@PathVariable int accountId) {
		Account jackAccount = new Account();
		jackAccount.setAccountId(accountId);
		jackAccount.setFirstName("Jack");
		jackAccount.setLastName("Pham");
		return jackAccount;
	}

}
