package com.nath.exam_rest_api.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Exam {

	private long id;

	private String firstName;

	private String lastName;

	private String email;

}
