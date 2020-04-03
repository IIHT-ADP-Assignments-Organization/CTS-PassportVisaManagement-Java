package in.PassportVisaManagementApp.dao;

import in.PassportVisaManagementApp.model.User;

public interface UserDao {
	
	int createUser(User user);

	User getUser(int userId);

	boolean updateUser(User user);

	boolean deleteUser(User user);

}
