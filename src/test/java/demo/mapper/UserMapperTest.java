package demo.mapper;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import demo.model.User;
import demo.util.MyBatisSqlSessionFactory;

public class UserMapperTest {
	private SqlSession session = MyBatisSqlSessionFactory.getSession();
	//让mybatis生成相应的接口对象
	private UserMapper mapper = session.getMapper(UserMapper.class);
	
	@Test
	public void testFindById(){
		System.out.println(mapper.findById(1));
	}
	
	@Test
	public void testFind(){
		System.out.println(mapper.find());
	}
	@Test
	public void testSave(){
		User user = new User();
		user.setName("chan");
		user.setPassword("6464");
		mapper.save(user);
		session.commit();
	}
}
