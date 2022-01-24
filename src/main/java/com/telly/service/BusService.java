package com.telly.service;

import java.sql.Date;
import java.util.List;

import com.telly.controllers.Bus;
import com.telly.controllers.BusDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.annotation.Secured;
import org.springframework.stereotype.Service;

@Service("busService")
public class BusService {
	
	@Autowired
	private BusDao busDao;
	
	public void create(Bus bus){
		busDao.create(bus);
	}
	
	public List<Bus> getCity(String leaveFrom, String goingTo, Date dateLeave, Date dateReturn){
		return busDao.getCity(leaveFrom, goingTo, dateLeave, dateReturn);
	}
	
	
	

}
