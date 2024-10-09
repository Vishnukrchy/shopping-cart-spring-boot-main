package com.ecom.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class OrderAddress {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	private String firstName;

	private String lastName;

	private String email;

	private String mobileNo;
    @Column(name = "address")
	private String address;

	private String city;

	private String state;

	private String pincode;

}
