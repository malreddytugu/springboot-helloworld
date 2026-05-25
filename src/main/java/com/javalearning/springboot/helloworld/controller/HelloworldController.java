package com.javalearning.springboot.helloworld.controller;


import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.javalearning.springboot.helloworld.config.DatasourceProps;
import com.javalearning.springboot.helloworld.config.DbConfig;
import com.javalearning.springboot.helloworld.model.Employee;
import com.javalearning.springboot.helloworld.service.EmployeeService;
import com.javalearning.springboot.helloworld.service.LazyLoadingBean;
import com.javalearning.springboot.helloworld.utils.Beautiful;
import com.javalearning.springboot.helloworld.utils.RagiFlour;
import com.javalearning.springboot.helloworld.utils.Student;

@RestController
@PropertySource("classpath:custom.properties")
public class HelloworldController {

	private static final Logger logger = LoggerFactory.getLogger(HelloworldController.class);

	@Autowired
	Beautiful beatiful;

	@Autowired
	Student student;

	@Autowired
	@Qualifier("ragiPorridge")
	RagiFlour flour;

	@Autowired
	RagiFlour ragiBall;

	@Autowired
	private LazyLoadingBean lazyLoadingBean;

	@Value("${name}")
	private String name;

	@Value("${age}")
	private int age;

	@Value("${unknown.param:some default}")
	private String unknownParam;

	@Value("${emails}")
	private String[] emails;

	@Value("${emails}")
	private List<String> emailList;

	@Value("${message}")
	private String message;

	@Value("#{${valuesMap}}")
	private Map<String, Integer> valueMap;

	@Value("#{${valuesMap}.key1}")
	private Integer valuesMapKey1;

	@Autowired
	private DatasourceProps datasourceProps;

	@Autowired
	private DbConfig dbConfig;

	@Value("${spring.profiles.active}")
	List<String> activeProfiles;

	@Autowired
	ProfileController profileController;

	@Autowired
	EmployeeService employeeService;

	@GetMapping("/hello")
	public Employee hello(@RequestParam(required = true) String msg, @RequestParam(defaultValue = "0") int age) {
		logger.debug("***************{}", msg);
		logger.trace("TRACE");
		logger.debug("DEBUG");
		logger.info("INFO");
		logger.warn("WARN");
		logger.error("ERROR");

		logger.info(flour.getRagiRecipe());
		logger.info(ragiBall.getRagiRecipe());

		logger.info("@Value String   {}", name);
		logger.info("@Value integer  {}", age);
		logger.info("@Value unknownParam  : {}", unknownParam);

		logger.info("emails.length : {}", emails.length);
		for (int i = 0; i < emails.length; i++) {
			logger.info(emails[i]);
		}

		logger.info("Custom Message : {}", message);

		Set<String> keys = valueMap.keySet();
		for (String key : keys) {
			logger.info("{} : {}", key, valueMap.get(key));
		}

		Set<Entry<String, Integer>> entries = valueMap.entrySet();
		for (Entry<String, Integer> entry : entries) {
			logger.info("{} : {}", entry.getKey(), entry.getValue());
		}

		logger.info(datasourceProps.toString());
		logger.info(dbConfig.toString());

		logger.info("activeProfiles : {}", activeProfiles);

		profileController.getActiveProfiles();

		logger.info("valuesMapKey1 : {}", valuesMapKey1);

		logger.info(employeeService.getAll().toString());

		return new Employee(101l, "Malreddy", "malreddy.tugu@gmail.com", "IT", "Bangalore");
	}
}
