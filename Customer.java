package in.vinay.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name="cust")
public class Customer {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long cid;
	
	private String name;
	
	private String address;
	
	private Long number;
	
}
