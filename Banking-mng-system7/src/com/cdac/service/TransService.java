package com.cdac.service;

import java.util.List;

import com.cdac.dto.Trans;

public interface TransService {

	void addTrans(Trans trans);
	void removeTrans(int transId);
	Trans findTrans(int transId);
	void modifyTrans(Trans trans);
	List<Trans> selectAll(int userId);
}
