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


import com.cdac.dto.Trans;

@Repository
public class TransDaoImple implements TransDao {

	@Autowired
	private HibernateTemplate hibernateTemplate;
	
	@Override
	public void insertTrans(Trans trans) {
		hibernateTemplate.execute(new HibernateCallback<Void>() {

			@Override
			public Void doInHibernate(Session session) throws HibernateException {
				Transaction tr = session.beginTransaction();
				session.save(trans);
				tr.commit();
				session.flush();
				session.close();
				return null;
			}
			
		});
		
	}

	@Override
	public void deleteTrans(int transId) {
		hibernateTemplate.execute(new HibernateCallback<Void>() {

			@Override
			public Void doInHibernate(Session session) throws HibernateException {
				Transaction tr = session.beginTransaction();
			//	session.delete(new Trans(transId));
				return null;
			}
			
		});
		
	}

	@Override
	public Trans selectTrans(int transId) {
		Trans trans = hibernateTemplate.execute(new HibernateCallback<Trans>() {

			@Override
			public Trans doInHibernate(Session session) throws HibernateException {
				Transaction tr = session.beginTransaction();
				Trans ex = (Trans)session.get(Trans.class, transId);
				tr.commit();
				session.flush();
				session.close();
				return ex;
			}
			
		});
		return trans;
	}

	@Override
	public void updateTrans(Trans trans) {
		hibernateTemplate.execute(new HibernateCallback<Void>() {

			@Override
			public Void doInHibernate(Session session) throws HibernateException {
				Transaction tr = session.beginTransaction();
				
				session.update(trans);
				
				tr.commit();
				session.flush();
				session.close();
				return null;
			}
			
		});
	}

	@Override
	public List<Trans> selectAll(int userId) {
		List<Trans> expList = hibernateTemplate.execute(new HibernateCallback<List<Trans>>() {

			@Override
			public List<Trans> doInHibernate(Session session) throws HibernateException {
				Transaction tr = session.beginTransaction();
				Query q = session.createQuery("from Trans where userId = ?");
				q.setInteger(0, userId);
				List<Trans> li = q.list();
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
