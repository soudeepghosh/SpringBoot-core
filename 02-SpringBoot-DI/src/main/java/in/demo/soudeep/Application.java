package in.demo.soudeep;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ImportResource;

import in.demo.soudeep.beans.Student;


@SpringBootApplication
@ImportResource("in/demo/soudeep/cfgs/applicationContext.xml")
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
		Student student = context.getBean("student", Student.class);
		student.preparation("TCG interview");
		
		((ConfigurableApplicationContext) context).close();
		// Stop the container
				System.out.println("***********Container Stopped****************");
	}

}
