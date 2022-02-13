package com.mobily.customer;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomerController {

	@GetMapping("/customer")
	List<CustomerDto> getCustomer() {
	
		List<CustomerDto> allCustomers= new ArrayList();
		CustomerDto dto = new CustomerDto();
		dto.setFirstName("Umair");
		dto.setLastName("Saleem");
		allCustomers.add(dto);
		
		dto = new CustomerDto();
		dto.setFirstName("Sulaiman");
		dto.setLastName("A. Altayar");
		allCustomers.add(dto);
		
		dto = new CustomerDto();
		dto.setFirstName("Suresh");
		dto.setLastName("Vathsavai");
		allCustomers.add(dto);
		
		dto = new CustomerDto();
		dto.setFirstName("Nagendra");
		dto.setLastName("Gundluru");
		allCustomers.add(dto);
		
	    return allCustomers;
	  }
}
