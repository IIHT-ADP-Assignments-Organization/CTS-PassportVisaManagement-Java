package in.PassportVisaManagementApp.dao;

import in.PassportVisaManagementApp.model.User;

public interface LoginDao {

	boolean createUser(User user);

	boolean userLogin(String userName, String password);

	boolean userResetPassword(String userName, String password);

}
