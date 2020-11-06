package com.cdac.dao;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate4.HibernateCallback;
import org.springframework.orm.hibernate4.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.cdac.dto.Account;

@Repository
public class AccountDaoImple implements AccountDao {

	@Autowired
	private HibernateTemplate hibernateTemplate;
	
	@Override
	public void insertAcount(Account account) {
		hibernateTemplate.execute(new HibernateCallback<Void>() {

			@Override
			public Void doInHibernate(Session session) throws HibernateException {
				Transaction tr = session.beginTransaction();
				session.save(account);
				tr.commit();
				session.flush();
				session.close();
				return null;
			}
			
		});
		
	}

	@Override
	public void deleteAccount(int accountId) {
		hibernateTemplate.execute(new HibernateCallback<Void>() {

			@Override
			public Void doInHibernate(Session session) throws HibernateException {
				Transaction tr = session.beginTransaction();
				//session.delete(new Account(accountId));
				return null;
			}
			
		});
	}

	@Override
	public Account selectAccount(int accountId) {
		Account account = hibernateTemplate.execute(new HibernateCallback<Account>() {

			@Override
			public Account doInHibernate(Session session) throws HibernateException {
				Transaction tr = session.beginTransaction();
				Account ex = (Account)session.get(Account.class, accountId);
				tr.commit();
				session.flush();
				session.close();
				return ex;
			}
			
		});
		return account;
	}

	@Override
	public void updateAccount(Account account) {
		hibernateTemplate.execute(new HibernateCallback<Void>() {

			@Override
			public Void doInHibernate(Session session) throws HibernateException {
				Transaction tr = session.beginTransaction();
				
				session.update(account);
				
				tr.commit();
				session.flush();
				session.close();
				return null;
			}
			
		});
		
		
	}

	@Override
	public List<Account> selectAll(int userId) {
		List<Account> expList = hibernateTemplate.execute(new HibernateCallback<List<Account>>() {

			@Override
			public List<Account> doInHibernate(Session session) throws HibernateException {
				Transaction tr = session.beginTransaction();
				Query q = session.createQuery("from Account where userId = ?");
				q.setInteger(0, userId);
				List<Account> li = q.list();
				System.out.println(li); 
				tr.commit();
				session.flush();
				session.close();
				return li;
			}
			
		});
		return expList;
	}

}
