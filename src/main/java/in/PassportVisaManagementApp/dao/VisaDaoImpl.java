package in.PassportVisaManagementApp.dao;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import in.PassportVisaManagementApp.model.Visa;

@Repository
@Transactional
public class VisaDaoImpl implements VisaDao {
	@Autowired
	private SessionFactory sessionFactory;

	public int createVisa(Visa visa) {
		// TODO Auto-generated method stub
		return 0;
	}

	public Visa getVisa(String visaId) {
		// TODO Auto-generated method stub
		return null;
	}

	public boolean updateVisa(Visa visa) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean deleteVisa(Visa Visa) {
		// TODO Auto-generated method stub
		return false;
	}	
}
