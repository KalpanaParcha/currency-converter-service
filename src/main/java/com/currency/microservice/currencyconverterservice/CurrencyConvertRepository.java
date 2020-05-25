package com.currency.microservice.currencyconverterservice;

import org.springframework.data.jpa.repository.JpaRepository;

public interface CurrencyConvertRepository extends JpaRepository<ConvertValue,Long>{

	ConvertValue findByFromAndTo(String from,String to);
}
