package com.startup.project.service.impl;

import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.startup.project.model.StartupModel;
import com.startup.project.repository.StartupRepository;
import com.startup.project.service.StartupService;

@Service
public class StartupServiceImpl implements StartupService {
	
	
	private final static String  TRN_PREFIX = "586";
	
	@Autowired
	private StartupRepository startupRepository;

	@Override
	public Object findAll() {
		System.out.println("Hello");
		Iterable<StartupModel> iterable  = startupRepository.findAll();
		Iterator<StartupModel> iterator = iterable.iterator();
			return iterator;
	}
	}
