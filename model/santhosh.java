package jspiders.springBoot.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class santhosh {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long eid;
	private String name;
	private String  esubject;
	private String email;
	private long ephno;
	

}
