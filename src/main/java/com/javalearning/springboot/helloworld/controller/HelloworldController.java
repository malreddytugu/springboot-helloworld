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
import com.javalearning.springboot.helloworld.utils.Beatiful;
import com.javalearning.springboot.helloworld.utils.RagiFlour;
import com.javalearning.springboot.helloworld.utils.Student;

@RestController
@PropertySource("classpath:custom.properties")
public class HelloworldController {
	
	Logger logger = LoggerFactory.getLogger(HelloworldController.class);
	
	@Autowired
	Beatiful beatiful;
	
	@Autowired
	Student student;
	
	@Autowired
	@Qualifier("ragiPorridge")
	RagiFlour flour;
	
	@Autowired
	//@Qualifier("ragiBall")
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
		//System.out.println("hello method is called...");
		logger.debug("***************"+msg);
		logger.trace("TRACE");
		logger.debug("DEBUG");
		logger.info("INFO");
		logger.warn("WARN");
		logger.error("ERROR");
		
		//System.out.println(beatiful.getBeautiful());
		//student.print();
		
		System.out.println(flour.getRagiRecipe());
		System.out.println(ragiBall.getRagiRecipe());
		System.out.println("*************************");
		
		System.out.println("@Value String   "+name);
		System.out.println("@Value integer  "+age);
		System.out.println("@Value unknownParam  : "+unknownParam);
		
		System.out.println("@Value listOfValues using String[]");
		
		//Stream.of(emails).forEach(System.out::println);
		
		System.out.println("emails.length : "+emails.length);
		for(int i=0;i<emails.length;i++) {
			System.out.println(emails[i]);
			
		}
		
		System.out.println("@Value listOfValues List<String>");
		
		//emailList.stream().forEach(System.out::println);
		for(String email : emailList) {
			System.out.println(email);
		}
		
		System.out.println("Custom Message : "+message);
//		System.out.println("valuesMap : "+valueMap);
		
		Set<String> keys = valueMap.keySet();
		for(String key : keys){
			System.out.println(key+" : "+valueMap.get(key));
		}
		
		Set<Entry<String, Integer>>  entries = valueMap.entrySet();
		
		for(Entry<String,Integer> entry : entries) {
			System.out.println(entry.getKey() + " : "+entry.getValue());
		}
		
		System.out.println(datasourceProps);
		System.out.println(dbConfig);
		
		System.out.println("activeProfiles : "+activeProfiles);
		
		profileController.getActiveProfiles();
		
		System.out.println(valuesMapKey1);
		
		/*
		 * 
		 * 
		 * System.out.println("message loaded from external file : "+message);
		 * System.out.println("datasourceProps : "+datasourceProps);
		 * 
		 * 
		 * profileController.getActiveProfiles();
		 * System.out.println("Profile : "+dbConfig.toString());
		 * 
		 * System.out.println("activeProfiles : "+activeProfiles);
		 * 
		 * System.out.println("valuesMapKey1 : "+valuesMapKey1);
		 */
		System.out.println(employeeService.getAll());
		
		return new Employee(101l, "Malreddy", "malreddy.tugu@gmail.com", "IT", "Bangalore");
	}
}
