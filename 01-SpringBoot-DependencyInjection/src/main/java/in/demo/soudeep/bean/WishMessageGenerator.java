package in.demo.soudeep.bean;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("wmg")
public class WishMessageGenerator {
	
	static {
		System.out.println("WishMessageGenerator.class file is loading...");
	}
	
	public WishMessageGenerator() {
		System.out.println("WishMessageGenerator object is created...");
	}
	
	@Autowired
	private LocalDateTime ldt;
	
	public String doWish(String username) {
		
		System.out.println("WishMessageGenerator.doWish()...");
		
		int hour = ldt.getHour();
		String msg = "";
		if(hour < 12) {
			msg = "Good Morning";
		} else if(hour < 17) {
			msg = "Good Afternoon";
		} else if(hour < 20) {
			msg = "Good Evening";
		} else {
			msg = "Good Night";
		}
		
		return "Hello, " + username + " :: " + msg;
	}
}
