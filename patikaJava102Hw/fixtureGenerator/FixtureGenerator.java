package patikaJava102Hw.fixtureGenerator;
import java.util.LinkedList;
import java.util.List;

public class FixtureGenerator<T extends Object> {

    public List<List<Fixture<T>>> getFixtures(List<T> teams, boolean includeReverseFixtures) {

        int numberOfTeams = teams.size();
        
        boolean ghost = false;
        if (numberOfTeams % 2 != 0) {
            numberOfTeams++;
            ghost = true;
        }

        int totalRounds = numberOfTeams - 1;
        int matchesPerRound = numberOfTeams / 2;
        List<List<Fixture<T>>> rounds = new LinkedList<List<Fixture<T>>>();

        for (int round = 0; round < totalRounds; round++) {
            List<Fixture<T>> fixtures = new LinkedList<Fixture<T>>();
            for (int match = 0; match < matchesPerRound; match++) {
                int home = (round + match) % (numberOfTeams - 1);
                int away = (numberOfTeams - 1 - match + round) % (numberOfTeams - 1);
                if (match == 0) {
                    away = numberOfTeams - 1;
                }
                fixtures.add(new Fixture<T>(teams.get(home), teams.get(away)));
            }
            rounds.add(fixtures);
        }

        List<List<Fixture<T>>> interleaved = new LinkedList<List<Fixture<T>>>();

        int evn = 0;
        int odd = (numberOfTeams / 2);
        for (int i = 0; i < rounds.size(); i++) {
            if (i % 2 == 0) {
                interleaved.add(rounds.get(evn++));
            } else {
                interleaved.add(rounds.get(odd++));
            }
        }

        rounds = interleaved;

        for (int roundNumber = 0; roundNumber < rounds.size(); roundNumber++) {
            if (roundNumber % 2 == 1) {
                Fixture fixture = rounds.get(roundNumber).get(0);
                rounds.get(roundNumber).set(0, new Fixture(fixture.getAwayTeam(), fixture.getHomeTeam()));
            }
        }
        
        if(includeReverseFixtures){
            List<List<Fixture<T>>> reverseFixtures = new LinkedList<List<Fixture<T>>>();
            for(List<Fixture<T>> round: rounds){
                List<Fixture<T>> reverseRound = new LinkedList<Fixture<T>>();
                for(Fixture<T> fixture: round){
                    reverseRound.add(new Fixture<T>(fixture.getAwayTeam(), fixture.getHomeTeam()));
                }
                reverseFixtures.add(reverseRound);
            }
            rounds.addAll(reverseFixtures);
        }

        return rounds;
    }
}