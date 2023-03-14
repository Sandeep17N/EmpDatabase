package jspiders.springBoot.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import jspiders.springBoot.model.santhosh;

public interface santhoshRepos extends JpaRepository<santhosh,Long> {
	@Query(value="Select * from santhosh order by name",nativeQuery = true)
	List<santhosh> sortedByName();
	
	@Query(value="Select * from santhosh where esubject='springboot'",nativeQuery = true)
	List<santhosh>JspEmpSpringBoot();

}
