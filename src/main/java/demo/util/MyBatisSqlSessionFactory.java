package demo.util;

import java.io.IOException;
import java.io.Reader;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class MyBatisSqlSessionFactory {
	//MyBatis配置文件所在位置
	private static String resource = "mybatis.xml"; 
	private static SqlSessionFactory factory = null;//定义一个myBatis的Session工厂类
	
	static {
		try {
			//加载配置文件
			Reader reader = Resources.getResourceAsReader(resource);
			//通过配置文件实例化Session工厂类
			factory = new SqlSessionFactoryBuilder().build(reader);
		} catch (IOException e) {
			e.printStackTrace();
		} 
	}
	
	public static SqlSession getSession(){
		return factory.openSession();//通过openSession方法获取一个Session对象
	}
}
