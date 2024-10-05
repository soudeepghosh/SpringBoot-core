package in.demo.soudeep;

import java.util.Scanner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

import in.demo.soudeep.controller.MainController;

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

		//Asking the container to give Controller Object
		MainController controller = context.getBean(MainController.class);
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the designation count :: ");
		int count = scanner.nextInt();
		String[] desg = null;
		
		if(count>=1) {
			desg = new String[count];
		} else {
			System.out.println("Invalid Designation count...");
			return;
		}
		//Keep the designations of the employees collected from the user in the constructed array
		for(int i=0;i<count;i++) {
			System.out.println("Enter the designation(s) :: ");
			desg[i] = scanner.next(); 
		}
		
		
			try {
				System.out.println("==========================================================");
				controller.showEmpByDesg(desg).forEach(System.out::println);
				System.out.println("==========================================================");
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		scanner.close();
		((ConfigurableApplicationContext) context).close();
		// Stop the container
		System.out.println("***********Container Stopped****************");
	}

}
