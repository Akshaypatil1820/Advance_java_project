package com.cdac.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cdac.dao.TransDao;
import com.cdac.dto.Trans;

@Service
public class TransServiceImple implements TransService {

	@Autowired
	private TransDao transDao;
	
	@Override
	public void addTrans(Trans trans) {
		transDao.insertTrans(trans);
		
	}

	@Override
	public void removeTrans(int transId) {
		transDao.deleteTrans(transId);
		
	}

	@Override
	public Trans findTrans(int transId) {
		return transDao.selectTrans(transId);
	}

	@Override
	public void modifyTrans(Trans trans) {
		transDao.updateTrans(trans);
	}

	@Override
	public List<Trans> selectAll(int userId) {
		return transDao.selectAll(userId);
	}

}
