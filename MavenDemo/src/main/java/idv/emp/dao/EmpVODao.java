package idv.emp.dao;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


import idv.emp.model.EmpId;
import idv.emp.model.EmpVO;



@Repository
public interface EmpVODao extends JpaRepository<EmpVO,EmpId>{

}
