package com.it.test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.it.dao.FounderMessageDao;
import com.it.entity.FounderMessageOne;

public class TestDelayedLoading {
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
		SqlSession sqlSession = sqlSessionFactory.openSession();// һ�����������дtrue

		// ��ȡmapper�ӿڵĴ������
		FounderMessageDao dao = sqlSession.getMapper(FounderMessageDao.class);

		List<FounderMessageOne> list = dao.getAllLazy();

//		System.out.println(list);
		// �˴�������
		 for (FounderMessageOne founderMessageOne : list) {
		 System.out.println(founderMessageOne.getFounderUser());
		 }
		sqlSession.close();
	}
}
