package demo.mapper;

import demo.model.User;

public interface UserMapper extends BaseMapper<User> {
	/**
	 * 登录方法
	 * @param username 登录的用户名
	 * @param password 登录的密码
	 * @return 登录的对象信息
	 */
	User login(String username, String password);
	/**
	 * 判断用户名是否存在
	 * @param username 用户名 
	 * @return 用户名是否存在, 存在则返回true, 不存在则返回false
	 */
	boolean exist(String username);
}
