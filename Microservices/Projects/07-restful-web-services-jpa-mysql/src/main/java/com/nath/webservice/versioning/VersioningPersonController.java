package com.nath.webservice.versioning;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class VersioningPersonController {
	
	@GetMapping("/v1/person")
	public PersonV1 getFirstVersion() {
		return new PersonV1("Bob Charlie");
	}
	
	@GetMapping("/v2/person")
	public PersonV2 getSecondVersion() {
		return new PersonV2(new Name("Bob", "Charlie"));
	}
	
	@GetMapping(path = "/person", params = "version=1")
	public PersonV1 getFirstVersionRequestParameter() {
		return new PersonV1("Bob Charlie");
	}
	
	@GetMapping(path = "/person", params = "version=2")
	public PersonV2 getSecondVersionRequestParameter() {
		return new PersonV2(new Name("Bob", "Charlie"));
	}
	
	@GetMapping(path = "/person/header", headers = "X-API-VERSION=1")
	public PersonV1 getFirstVersionRequestheader() {
		return new PersonV1("Bob Charlie");
	}
	
	@GetMapping(path = "/person/header", headers = "X-API-VERSION=2")
	public PersonV2 getSecondVersionRequestheader() {
		return new PersonV2(new Name("Bob", "Charlie"));
	}
	
	@GetMapping(path = "/person/accept", produces = "application/vnd.company.app-v1+json")
	public PersonV1 getFirstVersionAcceptheader() {
		return new PersonV1("Bob Charlie");
	}
	
	@GetMapping(path = "/person/accept", produces = "application/vnd.company.app-v2+json")
	public PersonV2 getSecondVersionAcceptheader() {
		return new PersonV2(new Name("Bob", "Charlie"));
	}

}
