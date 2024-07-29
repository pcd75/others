package com.nath.webservice.user;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString

@Entity
public class Role {
	
	@Id
	@GeneratedValue
	private Integer id;
	
	@Size(min=3)
	private String roleName;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JsonIgnore
	private User user;

}
