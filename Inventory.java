import java.util.HashMap;
import java.util.Map;

public class Inventory {
	private static Map<String,Integer> sparePartsQuantity;
	
	
	public Inventory(){
		sparePartsQuantity=new HashMap<>();
		sparePartsQuantity.put(BicycleSpareParts.getSpareParts().get(0), 50);
		sparePartsQuantity.put(BicycleSpareParts.getSpareParts().get(1), 80);
		sparePartsQuantity.put(BicycleSpareParts.getSpareParts().get(2), 25);
		sparePartsQuantity.put(BicycleSpareParts.getSpareParts().get(3), 100);
		sparePartsQuantity.put(BicycleSpareParts.getSpareParts().get(4), 60);
		sparePartsQuantity.put(BicycleSpareParts.getSpareParts().get(5), 80);
		sparePartsQuantity.put(BicycleSpareParts.getSpareParts().get(6), 100);
		sparePartsQuantity.put(BicycleSpareParts.getSpareParts().get(7), 50);
		sparePartsQuantity.put(BicycleSpareParts.getSpareParts().get(8), 150);
	}
	
	public int noOfCyclesProduced() {
		int min=Integer.MAX_VALUE;
		int i=0;
		for(Map.Entry<String, Integer> map:sparePartsQuantity.entrySet() ) {
			min=Math.min(min,(map.getValue()/(Bicycle.getSparePartsQuantity().get(map.getKey()))));
			i++;
		}
		return min;
	}
	
	public Map<String,Integer> itemsShortage(){
		int i=200;
		int quantity=0;
		Map<String,Integer> noOfItemsRequired=new HashMap<>();
		
		for(Map.Entry<String,Integer> map: sparePartsQuantity.entrySet()) {
			quantity=Bicycle.getSparePartsQuantity().get(map.getKey()) * i;
			noOfItemsRequired.put(map.getKey(),quantity-map.getValue());
		}
		return noOfItemsRequired;
	}
	
	
}
