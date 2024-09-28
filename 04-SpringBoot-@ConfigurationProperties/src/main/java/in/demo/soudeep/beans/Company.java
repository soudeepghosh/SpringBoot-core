package in.demo.soudeep.beans;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component("company")
@ConfigurationProperties(prefix = "my.app")
public class Company {
	
	static {
		System.out.println("Company.class is loading....");
	}
	
	public Company() {
		System.out.println("Company object is created :: using zero param constructor");
	}
	
	private String title;
	private String location;
	private String course;
	
	public void setTitle(String title) {
		System.out.println("Company.setTitle()");
		this.title = title;
	}

	public void setLocation(String location) {
		System.out.println("Company.setLocation()");
		this.location = location;
	}

	public void setCourse(String course) {
		System.out.println("Company.setCourse()");
		this.course = course;
	}

	@Override
	public String toString() {
		return "Company [title=" + title + ", location=" + location + ", course=" + course + "]";
	}
	
	
}
