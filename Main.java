import java.util.Map;

public class Main {
	public static void main(String args[]) {
		BicycleSpareParts parts=new BicycleSpareParts();
		Bicycle b=new Bicycle();
		
		Inventory inventory=new Inventory();
		System.out.println("the number of cycles produced: "+inventory.noOfCyclesProduced());
		Map<String, Integer> shortage=inventory.itemsShortage();
		for(Map.Entry<String,Integer> map: shortage.entrySet()) {
			System.out.println("Item: "+map.getKey()+" shortage by: "+map.getValue());
		}
	}
}
