package com.it.test;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.it.dao.FounderMessageDao;
import com.it.entity.FounderMessageAndUserAndFile;

public class TestThree {

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
		FounderMessageAndUserAndFile fmauaf = dao.getThree(1042);
		System.out.println(fmauaf);

		sqlSession.close();
	}

}
