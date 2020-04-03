package in.PassportVisaManagementApp.service;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import in.PassportVisaManagementApp.model.User;
@Component
@Repository
@Transactional
public class LoginServiceImpl implements LoginService {
	
	@Autowired
	private SessionFactory sessionFactory;
	public boolean createUser(User user) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean userResetPassword(String userName, String password) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean userLogin(String userName, String password) {
		// TODO Auto-generated method stub
		return false;
	}	
}
