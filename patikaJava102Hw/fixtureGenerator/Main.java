package patikaJava102Hw.fixtureGenerator;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class Main {

	public static void main(String[] args) {
		int roundCount;
		
		List<String> list = new ArrayList<String>();
		list.add("Galatasaray");
		list.add("Bursaspor");
		list.add("Fenerbahçe");
		list.add("Beþiktaþ");
		list.add("Baþakþehir");
		list.add("Trabzonspor");
		
		if(list.size()%2==1) {
			list.add("Bay");
		}
		roundCount = (list.size()-1)*2;
		
		Map<String, String> map = new TreeMap<String, String>();
		
		map.put(null, null);
		
		
		System.out.println("Takýmlar");
		for(String s : list) {
			System.out.println("- " + s);
		}
		
		
	}
}
