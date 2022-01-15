import java.util.HashMap;
import java.util.Map;

public class Bicycle {
	private static Map<String,Integer> sparePartsQuantity;
	
	
	Bicycle(){
		
		sparePartsQuantity=new HashMap<>();
		sparePartsQuantity.put(BicycleSpareParts.getSpareParts().get(0), 1);
		sparePartsQuantity.put(BicycleSpareParts.getSpareParts().get(1), 1);
		sparePartsQuantity.put(BicycleSpareParts.getSpareParts().get(2), 2);
		sparePartsQuantity.put(BicycleSpareParts.getSpareParts().get(3), 1);
		sparePartsQuantity.put(BicycleSpareParts.getSpareParts().get(4), 2);
		sparePartsQuantity.put(BicycleSpareParts.getSpareParts().get(5), 2);
		sparePartsQuantity.put(BicycleSpareParts.getSpareParts().get(6), 1);
		sparePartsQuantity.put(BicycleSpareParts.getSpareParts().get(7), 1);
		sparePartsQuantity.put(BicycleSpareParts.getSpareParts().get(8), 2);
	}
	
	public static Map<String, Integer> getSparePartsQuantity() {
		return sparePartsQuantity;
	}
}
