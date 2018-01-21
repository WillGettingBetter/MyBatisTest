package com.it.test;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.it.dao.FounderMessageDao;
import com.it.entity.FounderMessageAndUser;

/**
 * ���Զ������棬����������Ĭ��û�п����ģ���Ҫ����һ��������(��Բ�ͬ�ĻỰ)
 * 
 * @author SJF18
 * 
 */
public class TestTwoLevelCaching {

	public static void main(String[] args) {
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
		SqlSession session = sqlSessionFactory.openSession();// һ�����������дtrue

		// ��ȡmapper�ӿڵĴ������
		FounderMessageDao dao = session.getMapper(FounderMessageDao.class);

		System.out.println("��ʼ��һ�β�ѯ~~~~~~~~~~~~~");
		FounderMessageAndUser uua = dao.getAllInfo(1031);
		System.out.println("������һ�β�ѯ~~~~~~~~~~~~~");
		session.close();

		// �����ڶ����Ự
		SqlSession session2 = sqlSessionFactory.openSession();// һ�����������дtrue
		FounderMessageDao dao2 = session2.getMapper(FounderMessageDao.class);

		System.out.println("��ʼ�ڶ��β�ѯ~~~~~~~~~~~~~");
		FounderMessageAndUser uua2 = dao2.getAllInfo(1031);
		System.out.println("�����ڶ��β�ѯ~~~~~~~~~~~~~");
		session2.close();
	}

}
