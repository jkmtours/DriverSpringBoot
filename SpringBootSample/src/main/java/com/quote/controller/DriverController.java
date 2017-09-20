package com.quote.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.quote.entity.Driver;
import com.quote.services.DriverService;


@RestController
public class DriverController {
	
	 @Autowired
	 DriverService driverService;
	 
	/**
	 * 
	 * @return
	 */
	 @RequestMapping(value="/api/drivers", method=RequestMethod.GET)
	 @ResponseBody
	 public List<Driver> getDrivers() {
		 List<Driver> drivers = driverService.getDrivers();
		 return drivers;
	 }
	 
}
