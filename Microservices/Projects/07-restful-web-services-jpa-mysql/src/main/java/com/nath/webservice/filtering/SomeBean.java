package com.nath.webservice.filtering;

import com.fasterxml.jackson.annotation.JsonFilter;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
@AllArgsConstructor
//@JsonIgnoreProperties({"field1","field2"})
@JsonFilter("SomeBeanFilter")
public class SomeBean {
	
	private String field1;
	
	//@JsonIgnore
	private String field2;

	private String field3;

}
