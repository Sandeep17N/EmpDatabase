package jspiders.springBoot.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import jspiders.springBoot.model.santhosh;
import jspiders.springBoot.service.empService;
@RestController
public class santhuEmpController {
	@Autowired
	empService service;
	@PostMapping("addSanthosh")
	
	public ResponseEntity<santhosh> saveJspEmp(@RequestBody santhosh emp){
		return new ResponseEntity<santhosh>(service.savesanthosh(emp),HttpStatus.CREATED);
		
	}
	@GetMapping("Employees")
	public List<santhosh> getallEmp(){
		return service.getallEmp();
		
	}
	@GetMapping("employee/{eid}")
	public ResponseEntity<santhosh> JspEmpById(@PathVariable("eid")Long id){
		return new ResponseEntity<santhosh>(service.JspEmptyId(id),HttpStatus.OK);
	}
	@GetMapping("santhoshsort/Byname")
	public List<santhosh>sortByName(){
		return service.sortedByName();
	}
	@GetMapping("santhosh/SpringBoot")
	public List<santhosh> JspEmpSpringBoot(){
		return service.JspEmpSpringBoot();
		
	}
	@PutMapping("update/{eid}")
	public ResponseEntity<santhosh> update(@RequestBody santhosh emp,@PathVariable("eid")Long id){
		return new ResponseEntity<santhosh>(service.update(emp, id),HttpStatus.OK);
	}

}

