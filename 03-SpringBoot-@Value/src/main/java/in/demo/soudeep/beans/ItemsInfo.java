package in.demo.soudeep.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("info")
public class ItemsInfo {
	
	@Value("${idly.price}")
	private Float idlyPrice;
	
	@Value("${dosa.price}")
	private Float dosaPrice;
	
	@Value("${vada.price}")
	private Float vadaPrice;
	
	@Override
	public String toString() {
		return "ItemsInfo [idlyPrice=" + idlyPrice + ", dosaPrice=" + dosaPrice + ", vadaPrice=" + vadaPrice + "]";
	}

	public Float getIdlyPrice() {
		return idlyPrice;
	}

	public Float getDosaPrice() {
		return dosaPrice;
	}

	public Float getVadaPrice() {
		return vadaPrice;
	}
	
	
}
