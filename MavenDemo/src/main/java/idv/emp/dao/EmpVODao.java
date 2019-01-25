package idv.emp.dao;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


import idv.emp.model.EmpId;
import idv.emp.model.Emp2;



public interface EmpVODao extends JpaRepository<Emp2,EmpId>{
	List<Emp2> findAll();

}
