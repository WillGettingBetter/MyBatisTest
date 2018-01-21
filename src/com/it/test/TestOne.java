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

public class TestOne {
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
		List<FounderMessageOne> list = dao.getAll();
		for (FounderMessageOne founderMessageOne : list) {
			System.out.println(founderMessageOne);
		}
		
//		System.out.println("第七条的messagecontent是"+list.get(6).getMessagecontent()+"::第七条的username::"+list.get(6).getFounderUser().getUser_name());
		sqlSession.close();
	}
}
