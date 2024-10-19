package in.demo.soudeep.beans;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component("employee")
@ConfigurationProperties(prefix = "emp.info")
public class Employee {
	
	private Integer eid;
	private String name;
	
	//Array Object
	private String[] nickNames;
	
	//List Object
	private List<String> friendsNames;
	
	//Set Object
	private Set<Long> phoneNumber;
	
	//Map Object
	private Map<String, String> bankDetails;
	
	//Custom Object
	private Company company;
	
	public void setEid(Integer eid) {
		this.eid = eid;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setNickNames(String[] nickNames) {
		this.nickNames = nickNames;
	}

	public void setFriendsNames(List<String> friendsNames) {
		this.friendsNames = friendsNames;
	}

	public void setPhoneNumber(Set<Long> phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public void setBankDetails(Map<String, String> bankDetails) {
		this.bankDetails = bankDetails;
	}

	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", name=" + name + ", nickNames=" + Arrays.toString(nickNames)
				+ ", friendsNames=" + friendsNames + ", phoneNumber=" + phoneNumber + ", bankDetails=" + bankDetails
				+ ", company=" + company + "]";
	}

	public void setCompany(Company company) {
		this.company = company;
	}
	
	
	
}
