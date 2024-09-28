package in.demo.soudeep;

import java.time.LocalDateTime;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

import in.demo.soudeep.bean.WishMessageGenerator;

@SpringBootApplication
public class Application {
	
	static {
		System.out.println("Aplication.class file is loading...");
	}
	
	public Application() {
		System.out.println("Application object is created...");
	}
	
	@Bean(name = "ldt1")
	public LocalDateTime getLdtObj() {
		return LocalDateTime.now();
	}
	
	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(Application.class, args);
		
		WishMessageGenerator wishMessageGenerator = context.getBean("wmg", WishMessageGenerator.class);
		String msg = wishMessageGenerator.doWish("Nitin Sir");
		System.out.println(msg);
		
		((ConfigurableApplicationContext) context).close();
	}

}
