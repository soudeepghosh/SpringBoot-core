package in.demo.soudeep.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import in.demo.soudeep.bean.EmployeeBo;

@Repository("dao")
public class EmployeeDaoImpl implements IEmployeeDao {
	
	private static final String SQL_SELECT_QUERY = "SELECT empno, ename, job, salary, deptno, mgrno FROM employee WHERE job IN";
	
	@Autowired
	private DataSource dataSource;
	
	@Override
	public List<EmployeeBo> fetchEmpByDesg(String condition) throws Exception {
		System.out.println(dataSource.getClass().getName());
		String query = SQL_SELECT_QUERY+condition+" ORDER BY ename";
		System.out.println(query);
		List<EmployeeBo> listBo = new ArrayList<>();
		try(Connection connection = dataSource.getConnection();
			Statement statement = connection.createStatement();
			ResultSet resultSet = statement.executeQuery(query);) 
		{		
			while(resultSet.next()) {
				EmployeeBo bo = new EmployeeBo();
				bo.setEmpNo(resultSet.getInt("empno"));
				bo.setEname(resultSet.getString("ename"));
				bo.setJob(resultSet.getString("job"));
				bo.setSalary(resultSet.getFloat("salary"));
				bo.setDeptNo(resultSet.getInt("deptno"));
				bo.setMgrNo(resultSet.getInt("mgrno"));
				
				listBo.add(bo);
			}	
			
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return listBo;
	}

}
