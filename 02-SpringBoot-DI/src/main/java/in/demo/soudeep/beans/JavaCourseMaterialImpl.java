package in.demo.soudeep.beans;

import org.springframework.stereotype.Component;

@Component("java")
public final class JavaCourseMaterialImpl implements ICourseMaterial {

	static {
		System.out.println("JavaCourseMaterial.class file is loading...");
	}

	public JavaCourseMaterialImpl() {
		System.out.println("JavaCourseMaterial Object is created...");
	}
	
	@Override
	public String courseContent() {
		return "1. OOPS 2. ExceptionHandling 3. Collections ...";
	}

	@Override
	public Double price() {
		// TODO Auto-generated method stub
		return 15000.0;
	}

}
