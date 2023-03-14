package jspiders.springBoot.serviceimpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import jspiders.springBoot.Exception.DatabaseNotFoundException;
import jspiders.springBoot.model.santhosh;
import jspiders.springBoot.repo.santhoshRepos;
import jspiders.springBoot.service.empService;

@Service
public class empSreviceimpl implements empService{
	@Autowired
	santhoshRepos repo;

	@Override
	public santhosh savesanthosh(santhosh emp) {
		return repo.save(emp);



	}
    @Override
	public List<santhosh> getallEmp() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}
	
	public santhosh JspEmptyId(Long id) {
		Optional<santhosh> emp=repo.findById(id);
		if(emp.isPresent()) {
			return emp.get();
		}
		else {
			throw new DatabaseNotFoundException("Employee","ID",id);
		}
	}
	@Override
	public List<santhosh> sortedByName() {
		
		return repo.sortedByName();
	}
	@Override
	public List<santhosh> JspEmpSpringBoot() {
		
		return repo.JspEmpSpringBoot();
	}
	@Override
	public santhosh update(santhosh emp, Long id) {
		
		santhosh exist=repo.findById(id).orElseThrow(()->new DatabaseNotFoundException("Employee","ID",id));
		exist.setName(emp.getName());
		exist.setEsubject(emp.getEsubject());
		exist.setEmail(emp.getEmail());
		exist.setEphno(emp.getEphno());
		repo.save(exist);
		return exist;
	}

	

}
