package in.demo.soudeep;

import java.sql.SQLException;

import javax.sql.DataSource;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

import in.demo.soudeep.bean.Student;
import in.demo.soudeep.dao.IStudentDao;
import in.demo.soudeep.dao.StudentDaoImpl;

@SpringBootApplication
public class Application {
	
	static {
		System.out.println("Aplication.class file is loading...");
	}
	
	public Application() {
		System.out.println("Application object is created...");
	}
	
	
	
	public static void main(String[] args) {
		// Start the container
		System.out.println("***********Container Started****************");
		ApplicationContext context = SpringApplication.run(Application.class, args);
		System.out.println("Name of the container is :: "+context.getClass().getName());

		DataSource ds = context.getBean(DataSource.class);
		System.out.println("===========================");
		System.out.println("DataSource :: "+ds);
		System.out.println(ds.getClass().getName());
		try {
			System.out.println(ds.getConnection());
		} catch (SQLException e) {
			e.printStackTrace();
		}
		System.out.println("===========================");
		
		IStudentDao studentDao = context.getBean("dao", StudentDaoImpl.class);
		Student student = studentDao.fetchStudentData(3);
		System.out.println(student);
		System.out.println("===========================");
		
		System.out.println(context.getBeanDefinitionCount());
		
		((ConfigurableApplicationContext) context).close();
		// Stop the container
		System.out.println("***********Container Stopped****************");
	}

}
