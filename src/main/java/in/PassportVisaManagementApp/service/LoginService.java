package in.PassportVisaManagementApp.service;

import in.PassportVisaManagementApp.model.User;

public interface LoginService {
	
	boolean createUser(User user);
	boolean userLogin(String userName,String password);
	boolean userResetPassword(String userName,String password);
	
}
