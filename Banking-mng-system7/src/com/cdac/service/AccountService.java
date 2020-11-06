package com.cdac.service;

import java.util.List;

import com.cdac.dto.Account;

public interface AccountService {

	void addAccount(Account account);
	void removeAccount(int accountId);
	Account findAccount(int accountId);
	void modifyAccount(Account account);
	List<Account> selectAll(int userId);
}
