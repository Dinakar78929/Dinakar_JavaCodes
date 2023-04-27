package com.xworkz.police.dto;

import java.io.Serializable;
import java.time.LocalDate;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter


public class AmbulanceDTO implements Serializable, Comparable<AmbulanceDTO>{
	 

		@Min(value = 0, message = "value should be greater than 0")
		@Max(value = 100, message = "value should be less than 100")
		private int id;
		@Min(value = 0, message = "value should be greater than 0")
		@Max(value = 100, message = "value should be less than 100")
		private int regNo;
		@Min(value = 0, message = "value should be greater than 0")
		@Max(value = 100, message = "value should be less than 100")
		private int chasisNo;
		@NotEmpty

		@Size(min = 2, max = 30, message = "value should be between 2 nad 30")
		private String ownerName;

		private boolean insuranceExpired;
		@NotEmpty

		@Size(min = 2, max = 30, message = "value should be between 2 nad 30")
		private String driverName;

		private LocalDate startDate;

		
		@Override
		public int compareTo(AmbulanceDTO o) {

			return this.getOwnerName().compareTo(o.getOwnerName());
		}

	}


