package com.it.dao;

import java.util.List;

import com.it.entity.FounderFileAndList;
import com.it.entity.FounderMessageAndUser;
import com.it.entity.FounderMessageAndUserAndFile;
import com.it.entity.FounderMessageOne;

public interface FounderMessageDao {

	// �õ�messageid��Ӧ���û���������Ϣ
	public FounderMessageAndUser getAllInfo(int messageid);
	
	//�õ�messageid��Ӧ���û����������е�������Ϣ
	public FounderMessageAndUserAndFile getThree(int messageid);
	
	//ͨ��resultMap�õ���Ҫ�Ľ��������һ��һ��ѯ
	public List<FounderMessageOne> getAll();
	
	//һ�Զ��ѯ��һ��fild��Ӧ��������
	public FounderFileAndList getFileAndMsg(int fildid);
	
	
	//ʹ���ӳټ��أ�����һ��һ��ѯ
	public List<FounderMessageOne> getAllLazy();
}
