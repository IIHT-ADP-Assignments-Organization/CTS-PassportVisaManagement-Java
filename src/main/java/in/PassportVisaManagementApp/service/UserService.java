package in.PassportVisaManagementApp.service;

import in.PassportVisaManagementApp.model.User;

public interface UserService {
	
	int createUser(User user);

	User getUser(int userId);

	boolean updateUser(User user);

	boolean deleteUser(User user);

}
