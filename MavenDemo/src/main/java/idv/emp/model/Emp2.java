package idv.emp.model;
import java.math.BigDecimal;
import java.sql.Date;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Column;


@Entity
@Table(name = "emp2")
public class Emp2 {
	
	private String ename;
    
	private String job;
    
	private Date hiredate;
    
	private BigDecimal sal;
    
	private BigDecimal comm;
    
	private Integer deptno;
    
    @EmbeddedId
	private EmpId id;
	
	public Emp2() {
	}

	public EmpId getId() {
		return this.id;
	}

	public void setId(EmpId id) {
		this.id = id;
	}
	
    @Column(name = "ename")
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	
    @Column(name = "job")
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}
	
    @Column(name = "hiredate")
	public Date getHiredate() {
		return hiredate;
	}
	public void setHiredate(Date hiredate) {
		this.hiredate = hiredate;
	}
	
    @Column(name = "sal")
	public BigDecimal getSal() {
		return sal;
	}
	public void setSal(BigDecimal sal) {
		this.sal = sal;
	}
	
    @Column(name = "comm")
	public BigDecimal getComm() {
		return comm;
	}
	public void setComm(BigDecimal comm) {
		this.comm = comm;
	}
    @Column(name = "deptno")
	public Integer getDeptno() {
		return deptno;
	}
	public void setDeptno(Integer deptno) {
		this.deptno = deptno;
	}


	

}
