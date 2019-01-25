package idv.emp.model;
// Generated Nov 18, 2018 8:46:17 PM by Hibernate Tools 5.2.11.Final

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * YlRoleId generated by hbm2java
 */
@Embeddable
public class EmpId implements java.io.Serializable {

	/**
	 * 
	 */
	private BigDecimal empno;

	public EmpId() {
	}

	public EmpId(BigDecimal empno) {
		this.empno = empno;
	}

	@Column(name = "empno", nullable = false)
	public BigDecimal getEmpno() {
		return this.empno;
	}

	public void setEmpno(BigDecimal empno) {
		this.empno = empno;
	}

	

}
