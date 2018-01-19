package com.accenture.ia.incomepredictorservice.service.impl;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.apache.spark.sql.SparkSession;
import org.springframework.stereotype.Service;

import com.accenture.ia.incomepredictorservice.dto.InputDto;
import com.accenture.ia.incomepredictorservice.service.SparkService;

@Service
public class SparkServiceImpl implements SparkService {
	
//	private SparkSession spark;
//	
//	@PostConstruct
//	public void init() {
//		spark = SparkSession.builder().appName("MLAdultIncome").getOrCreate();
//	}

	@Override
	public Boolean evaluate(InputDto input) {
		return Boolean.FALSE;
	}

//	@PreDestroy
//	public void close() {
//		spark.close();
//	}
}
