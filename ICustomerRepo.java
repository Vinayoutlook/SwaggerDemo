package in.vinay.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import in.vinay.model.Customer;

public interface ICustomerRepo extends JpaRepository<Customer, Long> {

}
