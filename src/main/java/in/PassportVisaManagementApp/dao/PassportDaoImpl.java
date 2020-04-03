package in.PassportVisaManagementApp.dao;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import in.PassportVisaManagementApp.model.Passport;

@Repository
@Transactional
public class PassportDaoImpl implements PassportDao {
	@Autowired
	private SessionFactory sessionFactory;

	public int createPassport(Passport passport) {
		// TODO Auto-generated method stub
		return 0;
	}

	public Passport getPassport(String passportId) {
		// TODO Auto-generated method stub
		return null;
	}

	public boolean updatePassport(Passport passpost) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean deletePassport(Passport passpost) {
		// TODO Auto-generated method stub
		return false;
	}	
	
}
