package com.it.dao;

import java.util.List;

import com.it.entity.FounderFileAndList;
import com.it.entity.FounderMessageAndUser;
import com.it.entity.FounderMessageAndUserAndFile;
import com.it.entity.FounderMessageOne;

public interface FounderMessageDao {

	// 得到messageid对应的用户的所有信息
	public FounderMessageAndUser getAllInfo(int messageid);
	
	//得到messageid对应的用户在三个表中的所有信息
	public FounderMessageAndUserAndFile getThree(int messageid);
	
	//通过resultMap得到想要的结果，进行一对一查询
	public List<FounderMessageOne> getAll();
	
	//一对多查询，一个fild对应多条留言
	public FounderFileAndList getFileAndMsg(int fildid);
	
	
	//使用延迟加载，进行一对一查询
	public List<FounderMessageOne> getAllLazy();
}
