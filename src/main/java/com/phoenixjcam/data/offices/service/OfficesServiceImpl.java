package com.phoenixjcam.data.offices.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.phoenixjcam.data.offices.dao.OfficesDAO;
import com.phoenixjcam.data.offices.model.OfficesModel;

@Service
@Transactional
public class OfficesServiceImpl implements OfficesService
{
	@Autowired
	private OfficesDAO officesDAO;
	
	@Override
	public List<OfficesModel> getOffices()
	{
		List<OfficesModel> officesList = officesDAO.getOffices();
		
		return officesList;
	}
	
}
