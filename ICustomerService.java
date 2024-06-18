package in.vinay.service;

import in.vinay.model.Customer;

public interface ICustomerService {

	public String saveCustomer(Customer customer);
	
	public Customer getCustomerById(Long cid);
	
	public Customer updateCustomerById(Long cid);
	
	public String updateCustomer(Customer customer);
	
	public String deleteCustomerById(Long cid);
	
}
