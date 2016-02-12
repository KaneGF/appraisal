package tc.bpb.manage;

import java.util.*;

public class BeerExpert {
	public List<String> getBrands(String color1, String color2) {
		List<String> brands = new ArrayList<String>();

		if (color1.equals("amber")) {
			brands.add("Jack Amber");
			brands.add("Red Moose");
		} else {
			brands.add("Jail Pale Ale");
			brands.add("Gout Stout");
		}

		if (color2.equals("amber")) {
			brands.add("Jack Amber");
			brands.add("Red Moose");
		} else {
			brands.add("Jail Pale Ale");
			brands.add("Gout Stout");
		}
		return (brands);
	}
}
