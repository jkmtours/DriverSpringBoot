package com.quote.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.quote.entity.Driver;
import com.quote.repo.DriverDAO;

@Service
@Transactional(propagation=Propagation.REQUIRES_NEW, readOnly=true)
public class DriverServiceImpl implements DriverService {

	@Autowired
	DriverDAO quoteServiceDAO;

	/**
	 * 
	 */
	public List<Driver> getDrivers() {
		return quoteServiceDAO.getDrivers();
	}	

}
