package in.vinay.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.vinay.dao.ICustomerRepo;
import in.vinay.model.Customer;

@Service
public class CustomerServiceImpl implements ICustomerService {

	@Autowired
	private ICustomerRepo dao;
	
	@Override
	public String saveCustomer(Customer customer) {
		Customer c1=dao.save(customer);
		return "Customer added with id : "+c1.getCid();
	}

	@Override
	public Customer getCustomerById(Long cid) {
		return dao.findById(cid).get();
	}

	@Override
	public String updateCustomer(Customer customer) {
		Customer c1=dao.save(customer);
		return "Customer updated with id : "+c1.getCid();
	}

	@Override
	public String deleteCustomerById(Long cid) {
		Customer customer=dao.findById(cid).get();
		if(customer!=null) {
			return "Item deleted with id : "+cid;
		}
		return "Item not found for the given id : "+cid;
	}

	@Override
	public Customer updateCustomerById(Long cid) {
		return dao.findById(cid).get();
	}

}
