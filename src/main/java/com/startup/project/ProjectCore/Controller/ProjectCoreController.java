package com.startup.project.ProjectCore.Controller;

import java.io.File;

import org.apache.commons.codec.binary.Base64;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.startup.project.service.StartupService;

@RestController
public class ProjectCoreController {

	@Autowired
	private StartupService startupService;

	@GetMapping(value="/getall",produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<?> getall() {
	  Object gotRespons = startupService.findAll();
	    	HttpHeaders headers = new HttpHeaders();
			return new ResponseEntity<>(gotRespons, headers, HttpStatus.OK);

	    }
	
	
	/********************************/
}
