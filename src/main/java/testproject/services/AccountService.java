package testproject.services;

import java.util.ArrayList;

import testproject.cargos.Account;

public class AccountService {

	ArrayList<Account> accountList = new ArrayList<Account>();

	public Account getAccount(int accountId) {
		for (int i = 0; i < accountList.size(); i++) {
			if (accountList.get(i).getAccountId() == accountId) {
				return accountList.get(i);
			}
		}
		return null;
	}

	public void addAccount(Account account) {
		accountList.add(account);
	}

}
