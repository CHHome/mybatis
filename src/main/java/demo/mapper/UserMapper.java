package demo.mapper;

import demo.model.User;

public interface UserMapper extends BaseMapper<User> {
	/**
	 * ��¼����
	 * @param username ��¼���û���
	 * @param password ��¼������
	 * @return ��¼�Ķ�����Ϣ
	 */
	User login(String username, String password);
	/**
	 * �ж��û����Ƿ����
	 * @param username �û��� 
	 * @return �û����Ƿ����, �����򷵻�true, �������򷵻�false
	 */
	boolean exist(String username);
}
