package com.xworkz.autowire.thing;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Component
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class SensoredDoor {
	@Autowired
	@Qualifier("company")
	private String companyName;
	@Autowired
	private Camera camera;

}
