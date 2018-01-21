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
		SmsUserDao dao = sqlSession.getMapper(SmsUserDao.class);

		// 通过id查找用户信息
		
		/* SmsUser user = dao.getUserByid(1001); System.out.println(user);*/
		 

		// 向数据库中插入用户

		/*
		 * SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");// 时间转化
		 * SmsUser user = null; user = new SmsUser(1002, "林允儿", "123456", "女",
		 * "18355095204", sdf.parse("1990-09-12")); int temp =
		 * dao.insertUser(user); System.out.println(temp);
		 */

		/*
		 * List<SmsUser> list = dao.getUserInfo("娟"); for (SmsUser smsUser :
		 * list) { System.out.println(smsUser); }
		 */

		/*
		 * String userPsw = dao.getUserPsw(1001, "杨幂");
		 * System.out.println("杨幂的密码是：" + userPsw);
		 */

		// 得到数据库中所有用户信息
		/*
		 * List<SmsUser> list = dao.getUsers(); for (SmsUser smsUser : list) {
		 * System.out.println(smsUser); }
		 */

		// 修改数据库中用户信息

		/*
		 * SmsUser user = new SmsUser(1001, "杨幂", null, null, null, null); int
		 * temp = dao.updateInfo(user); System.out.println(temp);
		 */

		// 通过userid删除指定用户信息
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

		// 提交事务 或者使用SqlSession sqlSession = sqlSessionFactory.openSession(true);
		/* sqlSession.commit(); */

		/*SmsUser user = new SmsUser();
		user.setUserid(188137);
		user.setUsername("娟");
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
		// 关闭会话
		sqlSession.close();
	}
}
