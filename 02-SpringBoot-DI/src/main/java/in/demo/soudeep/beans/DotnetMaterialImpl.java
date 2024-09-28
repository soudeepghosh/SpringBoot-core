package in.demo.soudeep.beans;

import org.springframework.stereotype.Component;

@Component("dotnet")
public final class DotnetMaterialImpl implements ICourseMaterial {

	static {
		System.out.println("DotNetCourseMaterial.class file is loading...");
	}

	public DotnetMaterialImpl() {
		System.out.println("DotNetCourseMaterial Object is created...");
	}
	
	@Override
	public String courseContent() {
		return "1. C#Ooops 2.C#Excpetionhandling 3.C#Collections...";
	}

	@Override
	public Double price() {
		// TODO Auto-generated method stub
		return 7000.0;
	}

}
