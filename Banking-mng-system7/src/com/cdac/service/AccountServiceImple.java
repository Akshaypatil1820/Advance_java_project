package com.cdac.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cdac.dao.AccountDao;
import com.cdac.dto.Account;

@Service
public class AccountServiceImple implements AccountService {


	@Autowired
	private AccountDao accountDao;
	
	@Override
	public void addAccount(Account account) {
		accountDao.insertAcount(account);
		
	}

	@Override
	public void removeAccount(int accountId) {
		accountDao.deleteAccount(accountId);
		
	}

	@Override
	public Account findAccount(int accountId) {
		return accountDao.selectAccount(accountId);
	}

	@Override
	public void modifyAccount(Account account) {
		accountDao.updateAccount(account);
		
	}

	@Override
	public List<Account> selectAll(int userId) {
		return accountDao.selectAll(userId);
	}

}
