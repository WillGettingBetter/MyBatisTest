package com.it.dao;

import java.util.List;
import java.util.Map;

import com.it.entity.SmsUser;

public interface SmsUserDao {

	// ͨ��userid��ȡ����
	public SmsUser getUserByid(int userid);

	// ��ȡ���ݿ��������û���Ϣ
	public List<SmsUser> getUsers();

	// �����ݿ��в����û���Ϣ
	public int insertUser(SmsUser user);

	// ͨ��userid�޸�ָ���û���Ϣ
	public int updateInfo(SmsUser user);

	// ͨ��useridɾ��ָ���û���Ϣ
	public int deleteUser(int userid);

	// ͨ��userid��username��Ѱ���û�����
	public String getUserPsw(int userid, String username);

	// ʹ��ģ����ѯ
	public List<SmsUser> getUserInfo(String username);

	// ͨ��in��ѯ�õ���Ӧ���û���Ϣ
	public List<SmsUser> getSomeUsers(Map map);
	
	//ͨ��ģ����ѯ��userid��username
	public List<SmsUser> findUserInfo(SmsUser user);
	
	
	//foreachѭ��
	public List<SmsUser> getListUser(List<Integer> list);
	
	
	//����ѭ��
	public List<SmsUser> getListUser1(int[] arrs);

}
