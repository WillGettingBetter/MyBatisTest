package com.it.test;

import java.io.IOException;
import java.io.InputStream;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.it.dao.SmsUserDao;
import com.it.entity.SmsUser;

public class Test {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) throws ParseException {
		// ���������ļ�
		String resource = "mybatis-config.xml";
		InputStream is = null;
		try {
			is = Resources.getResourceAsStream(resource);
		} catch (IOException e) {
			e.printStackTrace();
		}

		// ʹ��SqlSessionFactoryBuilder����sqlSessionFactory
		SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder()
				.build(is);

		// ʹ��sqlSessionFactory��ȡSession
		SqlSession sqlSession = sqlSessionFactory.openSession();// һ�����������дtrue

		// ��ȡmapper�ӿڵĴ������
		SmsUserDao dao = sqlSession.getMapper(SmsUserDao.class);

		// ͨ��id�����û���Ϣ
		
		/* SmsUser user = dao.getUserByid(1001); System.out.println(user);*/
		 

		// �����ݿ��в����û�

		/*
		 * SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");// ʱ��ת��
		 * SmsUser user = null; user = new SmsUser(1002, "���ʶ�", "123456", "Ů",
		 * "18355095204", sdf.parse("1990-09-12")); int temp =
		 * dao.insertUser(user); System.out.println(temp);
		 */

		/*
		 * List<SmsUser> list = dao.getUserInfo("��"); for (SmsUser smsUser :
		 * list) { System.out.println(smsUser); }
		 */

		/*
		 * String userPsw = dao.getUserPsw(1001, "����");
		 * System.out.println("���ݵ������ǣ�" + userPsw);
		 */

		// �õ����ݿ��������û���Ϣ
		/*
		 * List<SmsUser> list = dao.getUsers(); for (SmsUser smsUser : list) {
		 * System.out.println(smsUser); }
		 */

		// �޸����ݿ����û���Ϣ

		/*
		 * SmsUser user = new SmsUser(1001, "����", null, null, null, null); int
		 * temp = dao.updateInfo(user); System.out.println(temp);
		 */

		// ͨ��useridɾ��ָ���û���Ϣ
		/*
		 * int temp = dao.deleteUser(1002); System.out.println(temp);
		 */

		/*
		 * String str = "1001,188138,188131,188137";
		 * 
		 * @SuppressWarnings("rawtypes") Map map = new HashMap();
		 * map.put("type", str.split(",")); List<SmsUser> list =
		 * dao.getSomeUsers(map); for (SmsUser smsUser : list) {
		 * System.out.println(smsUser); }
		 */

		// �ύ���� ����ʹ��SqlSession sqlSession = sqlSessionFactory.openSession(true);
		/* sqlSession.commit(); */

		/*SmsUser user = new SmsUser();
		user.setUserid(188137);
		user.setUsername("��");
		List<SmsUser> list = dao.findUserInfo(user);
		for (SmsUser smsUser : list) {
			System.out.println(smsUser);
		}*/
		
		/*List<Integer> list=new ArrayList<Integer>();
		list.add(188138);
		list.add(188137);
		list.add(188132);
		List<SmsUser> userList=dao.getListUser(list);
		for (SmsUser smsUser : userList) {
			System.out.println(smsUser);
		}*/
		
		int[] arrs={188138,188137,188132};
		List<SmsUser> userList=dao.getListUser1(arrs);
		for (SmsUser smsUser : userList) {
			System.out.println(smsUser);
		}
		// �رջỰ
		sqlSession.close();
	}
}
