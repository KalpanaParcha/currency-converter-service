package com.currency.microservice.currencyconverterservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CurrencyConverterController {
	
	@Autowired
	private CurrencyConvertRepository repository;
	
	@Autowired
	private Environment env;
	
	@GetMapping("/currency-convert/from/{from}/to/{to}")
	public ConvertValue getConvertedValue(@PathVariable String from, @PathVariable String to) {
		ConvertValue convertObj=repository.findByFromAndTo(from, to);
		convertObj.setPort(Integer.parseInt(env.getProperty("server.port")));
		return convertObj;
	}
}
