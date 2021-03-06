package fr.formation.sports;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class SportMeeting {

    private List<Match> matchs = new ArrayList<>();

    public SportMeeting(Match... matchs) {
	Objects.requireNonNull(matchs);
	if (matchs.length == 0) {
	    throw new IllegalArgumentException(
	            "Should contains at least 1 match");
	}
	for (Match match : matchs) {
	    addMatch(match);
	}
    }

    public SportMeeting(Match match) {
	addMatch(match);
    }

    public static void beginChampionship(List<Match> matchs) {
	for (Match match : matchs) {
	    match.saveScoreHalfTime();
	    match.results();
	}
    }

    private void addMatch(Match match) {
	Objects.requireNonNull(match, "a match cannot be null");
	matchs.add(match);
    }
}