package in.demo.soudeep.beans;

import org.springframework.stereotype.Component;

@Component("ui")
public final class UICourseMaterialImpl implements ICourseMaterial {

	static {
		System.out.println("UICourseMaterial.class file is loading...");
	}

	public UICourseMaterialImpl() {
		System.out.println("UICourseMaterial Object is created...");
	}
	
	@Override
	public String courseContent() {
		return "1. HTML 2. CSS 3. JS ....";
	}

	@Override
	public Double price() {
		return 2500.0;
	}

}
