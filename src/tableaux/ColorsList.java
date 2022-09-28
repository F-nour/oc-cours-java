package tableaux;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ColorsList {

	public static void main(String[] args) {
		List<String> colors = new ArrayList<String>();
		colors.add("green");
		colors.add("yellow");
		colors.add("red");
		System.out.println("valeurs du tableau colors : " + colors);
		System.out.println("taille du tableau colors : " + colors.size());
		colors.add(1, "orange");
		System.out.println("taille du tableau colors : " + colors.size());
		System.out.println("valeurs du tableau colors : " + colors);
		colors.set(0, "black");
		System.out.println("valeurs du tableau colors : " + colors);
		colors.remove(2);
		System.out.println("valeurs du tableau colors : " + colors);
		System.out.println("taille du tableau colors : " + colors.size());
		
		Map<String, Integer> ages = new HashMap<String, Integer>();
		ages.put("Jean", 54);
		ages.put("Michel", 38);
		System.out.println(ages);
		System.out.println("Michel a " + ages.get("Michel") + " ans");
		
	}

}
