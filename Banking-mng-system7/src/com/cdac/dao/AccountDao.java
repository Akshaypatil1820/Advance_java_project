package com.cdac.dao;

import java.util.List;

import com.cdac.dto.Account;

public interface AccountDao {

	void insertAcount(Account account);
	void deleteAccount(int accountId);
	Account selectAccount(int accountId);
	void updateAccount(Account account);
	List<Account> selectAll(int userId);
}
