package football;
import java.lang.reflect.Array;
import java.util.ArrayList;

public class TeamController extends FootballTeams{
	
	TeamAwards awards = new TeamAwards();
	//Design of constructor
	public TeamController(String team, ArrayList<String> clubInterC, String[] prizes) {
		super();
		// TODO Auto-generated constructor stub
		//Design of constructor
		 awards.setTeam(team.toUpperCase());
		 System.out.println("\n" + awards.getTeam());
		 for(int i = 0; i < prizes.length; i++) {
			 System.out.println(prizes[i]);
			 clubInterC.add(prizes[i]);
		 } 
		 
		 awards.setAwards(clubInterC);
		 
	}
	
	public static void getPlayers() {
		
	}
	  
}
