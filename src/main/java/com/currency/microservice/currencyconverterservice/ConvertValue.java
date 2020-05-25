package com.currency.microservice.currencyconverterservice;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import org.springframework.beans.factory.annotation.Value;

@Entity
public class ConvertValue {

	@Id
	private Long id;
	
	@Column(name = "currency_from")
	private String from;
	
	@Column(name = "currency_to")
	private String to;
	private BigDecimal conversionFactor;
	
	private int port;
	
	public ConvertValue() {
		// TODO Auto-generated constructor stub
	}
	
	public ConvertValue(Long id,String from,String to,BigDecimal conversionFactor) {
		// TODO Auto-generated constructor stub
		super();
		this.id=id;
		this.from=from;
		this.to=to;
		this.conversionFactor=conversionFactor;
		
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getFrom() {
		return from;
	}

	public void setFrom(String from) {
		this.from = from;
	}

	public String getTo() {
		return to;
	}

	public void setTo(String to) {
		this.to = to;
	}

	public BigDecimal getConversionFactor() {
		return conversionFactor;
	}

	public void setConversionFactor(BigDecimal conversionFactor) {
		this.conversionFactor = conversionFactor;
	}

	public int getPort() {
		return port;
	}

	public void setPort(int port) {
		this.port = port;
	}
	
	
}
