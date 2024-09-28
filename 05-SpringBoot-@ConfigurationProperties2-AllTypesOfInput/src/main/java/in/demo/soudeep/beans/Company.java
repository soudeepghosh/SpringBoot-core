package in.demo.soudeep.beans;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

//@Component("company")
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
	@Override
	public String toString() {
		return "Company [title=" + title + ", location=" + location + ", course=" + course + "]";
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	
	
}
