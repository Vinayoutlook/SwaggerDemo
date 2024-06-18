package in.vinay.restController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import in.vinay.model.Customer;
import in.vinay.service.ICustomerService;

@RestController
@RequestMapping("/api/customer")
public class CustomerController {

	@Autowired
	private ICustomerService service;
	
	@PostMapping("/save")
	public ResponseEntity<String> saveCustomer(@RequestBody Customer customer){
		String msg=service.saveCustomer(customer);
		return new ResponseEntity<String>(msg,HttpStatus.ACCEPTED);
	}
	
	@GetMapping("/get")
	public ResponseEntity<Customer> getCustomerById(@RequestParam Long cid){
		Customer customer=service.getCustomerById(cid);
		return new ResponseEntity<Customer>(customer,HttpStatus.OK);
	}
	
	@PutMapping("/update/id")
	public ResponseEntity<Customer> updateCustomerById(@RequestParam Long cid){
		Customer customer=service.updateCustomerById(cid);
		return new ResponseEntity<Customer>(customer,HttpStatus.ACCEPTED);
	}
	
	@PutMapping("/update")
	public ResponseEntity<String> updateCustomer(@RequestBody Customer customer){
		String msg=service.updateCustomer(customer);
		return new ResponseEntity<String>(msg,HttpStatus.ACCEPTED);
	}
	
	@DeleteMapping("/delete")
	public ResponseEntity<String> deleteCustomerById(@RequestParam Long cid){
		String msg=service.deleteCustomerById(cid);
		return new ResponseEntity<String>(msg,HttpStatus.OK);
	}
	
}
