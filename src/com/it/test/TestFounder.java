package com.it.test;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.it.dao.FounderMessageDao;
import com.it.entity.FounderMessageAndUser;

public class TestFounder {
	public static void main(String[] args) {
		// 加载配置文件
		String resource = "mybatis-config.xml";
		InputStream is = null;
		try {
			is = Resources.getResourceAsStream(resource);
		} catch (IOException e) {
			e.printStackTrace();
		}

		// 使用SqlSessionFactoryBuilder创建sqlSessionFactory
		SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder()
				.build(is);

		// 使用sqlSessionFactory获取Session
		SqlSession sqlSession = sqlSessionFactory.openSession();// 一般会在括号内写true

		// 获取mapper接口的代理对象
		FounderMessageDao dao = sqlSession.getMapper(FounderMessageDao.class);
		FounderMessageAndUser fmau = dao.getAllInfo(1031);

		System.out.println(fmau);

		sqlSession.close();
	}
}
