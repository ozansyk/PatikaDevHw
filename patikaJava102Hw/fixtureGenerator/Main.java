package patikaJava102Hw.fixtureGenerator;


import java.util.LinkedList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		
		
		FixtureGenerator<String> fixtureGenerator = new FixtureGenerator();
		List<String> teams = new LinkedList<String>();
		teams.add("Galatasaray");
		teams.add("Bursaspor");
		teams.add("Fenerbahçe");
		teams.add("Beþiktaþ");
		teams.add("Baþakþehir");
		teams.add("Trabzonspor");
		teams.add("Adanaspor");
		
		System.out.println("Takýmlar");
		for(String s : teams) {
			System.out.println("- " + s);
		}
		System.out.println();
		
		if(teams.size()%2==1) {
			teams.add("Bay");
		}
		
		List<List<Fixture<String>>> rounds = fixtureGenerator.getFixtures(teams, true);
		for(int i=0; i<rounds.size(); i++){
		    System.out.println("Round " + (i+1));
		    List<Fixture<String>> round = rounds.get(i);
		    for(Fixture<String> fixture: round){
		        System.out.println(fixture.getHomeTeam() + " vs " + fixture.getAwayTeam());
		    }
		    System.out.println("");
		}
		
		
	}
}
