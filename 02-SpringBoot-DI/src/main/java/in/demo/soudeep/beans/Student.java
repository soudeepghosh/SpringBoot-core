package in.demo.soudeep.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Student {
	static {
		System.out.println("Student.class file is loading...");
	}

	public Student() {
		System.out.println("Student Object is created...");
	}
	
//	@Autowired
//	@Qualifier("courseName")
	@Value("#{courseName}")
	private ICourseMaterial courseMaterial;
	
	public void preparation(String examName) {
		System.out.println("Preparation started for :: " + examName);
		
		String content = courseMaterial.courseContent();
		Double price = courseMaterial.price();
		
		System.out.println("Preparation is going on using " + content + " material with price :: " + price);
		System.out.println("Preparation completed for " + examName);
	}
}
