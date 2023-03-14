package jspiders.springBoot.service;

import java.util.List;

import org.springframework.stereotype.Service;

import jspiders.springBoot.model.santhosh;
@Service
public interface empService {
	santhosh savesanthosh(santhosh emp);

	List<santhosh> getallEmp();
	
	santhosh JspEmptyId(Long id); 
	
	List<santhosh> sortedByName();

	List<santhosh>JspEmpSpringBoot();
	santhosh update(santhosh emp,Long id);

}
