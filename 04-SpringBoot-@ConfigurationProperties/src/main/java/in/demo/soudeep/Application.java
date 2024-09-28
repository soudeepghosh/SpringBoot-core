package in.demo.soudeep;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

import in.demo.soudeep.beans.Company;



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
		
		Company company = context.getBean(Company.class);
		System.out.println(company);
		
		((ConfigurableApplicationContext) context).close();
		// Stop the container
				System.out.println("***********Container Stopped****************");
	}

}
