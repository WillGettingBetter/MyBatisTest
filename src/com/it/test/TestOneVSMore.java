package com.it.test;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.it.dao.FounderMessageDao;
import com.it.entity.FounderFileAndList;
import com.it.entity.FounderMessage;

public class TestOneVSMore {

	public static void main(String[] args) {
		String resource = "mybatis-config.xml";
		InputStream is = null;
		try {
			is = Resources.getResourceAsStream(resource);
		} catch (IOException e) {
			e.printStackTrace();
		}
		SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder()
				.build(is);
		SqlSession session = sqlSessionFactory.openSession();
		FounderMessageDao dao = session.getMapper(FounderMessageDao.class);
		FounderFileAndList ffa = dao.getFileAndMsg(1010);
		session.close();
		// System.out.println(ffa);

		for (FounderMessage fm : ffa.getMesList()) {
			System.out.println(fm);
		}
	}

}
