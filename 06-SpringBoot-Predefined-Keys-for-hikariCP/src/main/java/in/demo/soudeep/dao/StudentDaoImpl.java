package in.demo.soudeep.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import in.demo.soudeep.bean.Student;

@Component("dao")
public class StudentDaoImpl implements IStudentDao {
	private static final String SQL_SELECT_QUERY = "SELECT sid, sname, sage, saddress FROM student WHERE sid = ?";
	@Autowired
	private DataSource dataSource;
	
	@Override
	public Student fetchStudentData(Integer sid) {
		Student student = null;
		try(Connection connection = dataSource.getConnection();) {
			
			try(PreparedStatement pstmt = connection.prepareStatement(SQL_SELECT_QUERY);){
				pstmt.setInt(1, sid);
				
				try(ResultSet resultSet = pstmt.executeQuery();){
					if (resultSet != null) {
						if (resultSet.next()) {
							student = new Student();
							student.setSid(resultSet.getInt("sid"));
							student.setSname(resultSet.getString("sname"));
							student.setSage(resultSet.getInt("sage"));
							student.setSaddress(resultSet.getString("saddress"));
						}
					}
				}
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return student;
	}

}
