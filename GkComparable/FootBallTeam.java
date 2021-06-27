package GkComparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.google.common.collect.ImmutableBiMap.Builder;

public class FootBallTeam {
	

	public static void main(String[] args) {
		List<Player> players=new ArrayList<>();
		
		players.add(Player.builder().withAge(12).withName("Ronalo").withRanking("A").build());
		players.add(Player.builder().withAge(1).withName("John").withRanking("B").build());
		players.add(Player.builder().withAge(2).withName("Tim").withRanking("C").build());
		players.add(Player.builder().withAge(3).withName("Knoop").withRanking("D").build());
		System.out.println("Before sort"+players);
		Comparator<Player> comparebyAge=(a,b) ->a.getAge() - b.getAge();
		
		Comparator<Player> comparebyName=(a,b) ->a.getName().compareTo(b.getName());
		
		Comparator<Player> comparebyRanking=(a,b) -> a.getRanking().compareTo(b.getRanking());
		
		Collections.sort(players,comparebyAge);
		System.out.println("After sort compare by Age "+players);
		Collections.sort(players, comparebyName);
		System.out.println("After sort compare by Name"+players);
		Collections.sort(players, comparebyRanking);
		
		System.out.println("After sort compare by Ranking "+players);
	}
	
	

}
