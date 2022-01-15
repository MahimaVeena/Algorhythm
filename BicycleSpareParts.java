import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class BicycleSpareParts {
	private static List<String> spareParts;
	
	BicycleSpareParts(){
		spareParts=new ArrayList<>();
		spareParts.add("Seat");
		spareParts.add("Frame");
		spareParts.add("BrakeSet");
		spareParts.add("HandleBar");
		spareParts.add("Wheels");
		spareParts.add("Tires");
		spareParts.add("Chain");
		spareParts.add("CrankSet");
		spareParts.add("Pedals");
	}

	public static List<String> getSpareParts() {
		return spareParts;
	}
	
}
