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
 * 测试二级缓存，二级缓存是默认没有开启的，需要进行一定的配置(针对不同的会话)
 * 
 * @author SJF18
 * 
 */
public class TestTwoLevelCaching {

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
		SqlSession session = sqlSessionFactory.openSession();// 一般会在括号内写true

		// 获取mapper接口的代理对象
		FounderMessageDao dao = session.getMapper(FounderMessageDao.class);

		System.out.println("开始第一次查询~~~~~~~~~~~~~");
		FounderMessageAndUser uua = dao.getAllInfo(1031);
		System.out.println("结束第一次查询~~~~~~~~~~~~~");
		session.close();

		// 创建第二个会话
		SqlSession session2 = sqlSessionFactory.openSession();// 一般会在括号内写true
		FounderMessageDao dao2 = session2.getMapper(FounderMessageDao.class);

		System.out.println("开始第二次查询~~~~~~~~~~~~~");
		FounderMessageAndUser uua2 = dao2.getAllInfo(1031);
		System.out.println("结束第二次查询~~~~~~~~~~~~~");
		session2.close();
	}

}
