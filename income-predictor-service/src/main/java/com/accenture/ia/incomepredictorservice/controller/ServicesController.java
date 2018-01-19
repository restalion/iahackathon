package com.accenture.ia.incomepredictorservice.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.accenture.ia.dto.InputDto;
import com.accenture.ia.dto.InputResultDto;
import com.accenture.ia.dto.OutputDto;
import com.accenture.ia.dto.OutputResultDto;

@RestController
public class ServicesController {

	@PostMapping("/evaluate")
	public @ResponseBody OutputDto evaluate(@RequestBody InputDto inputDto) {
		return null;
	}
	
	@PostMapping("/addResult")
	public @ResponseBody OutputResultDto addResult(@RequestBody InputResultDto inputDto) {
		return null;
	}
}
