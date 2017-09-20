package com.quote.repo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.quote.entity.Driver;

@Repository
public class DriverDAOImpl implements DriverDAO {

	public List<Driver> getDrivers() {
		String sql="";
		//List<QuoteResponse> resp  = getJdbcTemplate().query(sql, new BeanPropertyRowMapper(QuoteResponse.class));
		List<Driver> driverList = new ArrayList<Driver>();
		
		Driver driver = new Driver();
		driver.setId(100);
		driver.setName("John");
		driverList.add(driver);
		
		Driver driver1 = new Driver();
		driver1.setId(101);
		driver1.setName("Kurt");
		driverList.add(driver1);
		
		Driver driver2 = new Driver();
		driver2.setId(102);
		driver2.setName("James");
		driverList.add(driver2);
		
		return driverList;
	}	

}
