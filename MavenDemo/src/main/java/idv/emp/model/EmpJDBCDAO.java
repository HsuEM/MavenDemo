//package idv.emp.model;
//
//import java.util.*;
//import java.sql.*;
//
//public class EmpJDBCDAO implements EmpDAO_interface {
//	String driver = "org.postgresql.Driver";
//
//    String url = "jdbc:postgresql://localhost:5432/testDB" ;  //連線ip ,port ,table name
//	String userid = "test1";
//	String passwd = "test1";
//
//	private static final String INSERT_STMT = 
//		"INSERT INTO emp2 (empno,ename,job,hiredate,sal,comm,deptno) VALUES (emp2_seq.NEXTVAL, ?, ?, ?, ?, ?, ?)";
//	private static final String GET_ALL_STMT = 
//		"SELECT empno,ename,job,to_char(hiredate,'yyyy-mm-dd') hiredate,sal,comm,deptno FROM emp2 order by empno";
//	private static final String GET_ONE_STMT = 
//		"SELECT empno,ename,job,to_char(hiredate,'yyyy-mm-dd') hiredate,sal,comm,deptno FROM emp2 where empno = ?";
//	private static final String DELETE = 
//		"DELETE FROM emp2 where empno = ?";
//	private static final String UPDATE = 
//		"UPDATE emp2 set ename=?, job=?, hiredate=?, sal=?, comm=?, deptno=? where empno = ?";
//
//	
//	@Override
//	public List<Emp2> getAll() {
//		List<Emp2> list = new ArrayList<Emp2>();
//		Emp2 empVO = null;
//		EmpId empid = null;
//
//		Connection con = null;
//		PreparedStatement pstmt = null;
//		ResultSet rs = null;
//
//		try {
//			Class.forName(driver);
//			con = DriverManager.getConnection(url, userid, passwd);
//			pstmt = con.prepareStatement(GET_ALL_STMT);
//			rs = pstmt.executeQuery();
//
//			while (rs.next()) {
//				empVO = new Emp2();
//				empid = new EmpId();
//				empid.setEmpNo(rs.getInt("empno"));
//				empVO.setEname(rs.getString("ename"));
//				empVO.setJob(rs.getString("job"));
//				empVO.setHiredate(rs.getDate("hiredate"));
//				empVO.setSal(rs.getBigDecimal("sal"));
//				empVO.setComm(rs.getBigDecimal("comm"));
//				empVO.setDeptno(rs.getInt("deptno"));
//				empVO.setId(empid);
//				list.add(empVO); // Store the row in the list
//			}
//
//			// Handle any driver errors
//		} catch (ClassNotFoundException e) {
//			throw new RuntimeException("Couldn't load database driver. "
//					+ e.getMessage());
//			// Handle any SQL errors
//		} catch (SQLException se) {
//			throw new RuntimeException("A database error occured. "
//					+ se.getMessage());
//			// Clean up JDBC resources
//		} finally {
//			if (rs != null) {
//				try {
//					rs.close();
//				} catch (SQLException se) {
//					se.printStackTrace(System.err);
//				}
//			}
//			if (pstmt != null) {
//				try {
//					pstmt.close();
//				} catch (SQLException se) {
//					se.printStackTrace(System.err);
//				}
//			}
//			if (con != null) {
//				try {
//					con.close();
//				} catch (Exception e) {
//					e.printStackTrace(System.err);
//				}
//			}
//		}
//		return list;
//	}
//
//	public static void main(String[] args) {
//
//		EmpJDBCDAO dao = new EmpJDBCDAO();
//
//		List<Emp2> list = dao.getAll();
//		for (Emp2 aEmp : list) {
//			System.out.print(aEmp.getId().getEmpNo() + ",");
//			System.out.print(aEmp.getEname() + ",");
//			System.out.print(aEmp.getJob() + ",");
//			System.out.print(aEmp.getHiredate() + ",");
//			System.out.print(aEmp.getSal() + ",");
//			System.out.print(aEmp.getComm() + ",");
//			System.out.print(aEmp.getDeptno());
//			System.out.println();
//		}
//	}
//}