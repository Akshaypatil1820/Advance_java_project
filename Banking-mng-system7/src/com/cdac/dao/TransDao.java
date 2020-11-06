package com.cdac.dao;

import java.util.List;

import com.cdac.dto.Trans;

public interface TransDao {

	void insertTrans(Trans trans);
	void deleteTrans(int transId);
	Trans selectTrans(int transId);
	void updateTrans(Trans trans);
	List<Trans> selectAll(int userId);
}
