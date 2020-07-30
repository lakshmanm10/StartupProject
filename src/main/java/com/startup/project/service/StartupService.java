package com.startup.project.service;

import org.springframework.data.jpa.repository.Query;

import com.startup.project.model.StartupModel;

public interface StartupService {
	public Object findAll();

}
