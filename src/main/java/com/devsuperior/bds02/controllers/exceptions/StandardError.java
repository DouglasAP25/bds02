package com.devsuperior.bds02.controllers.exceptions;

import java.io.Serializable;
import java.time.LocalDate;

public class StandardError implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private Long id;
	private String name;
	private LocalDate date;
	private String url;

	public StandardError() {		
	}

	public StandardError(Long id, String name, LocalDate date, String url) {
		super();
		this.id = id;
		this.name = name;
		this.date = date;
		this.url = url;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}
	
	
}
