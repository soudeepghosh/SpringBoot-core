package in.demo.soudeep.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class BillGenerator {
	
	@Value("#{info.getIdlyPrice() + info.getDosaPrice() + info.getVadaPrice()}")
	private Float billAmount;
	
	@Autowired
	private ItemsInfo items;

	@Override
	public String toString() {
		return "BillGenerator [billAmount=" + billAmount + ", items=" + items + "]";
	}
	
}
