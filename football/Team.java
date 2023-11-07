package football;
import java.util.ArrayList;
public class Team {
	public void getTheTeams() {
		ArrayList<String> footballTeams = new ArrayList< String>();
		  footballTeams.add("liverpool");
		  footballTeams.add("milan");
		  footballTeams.add("boca juniors");
	  
		  ArrayList<String> stadium = new ArrayList<String>();
		    stadium.add("wembley");
		    stadium.add("giusepe meassa");
		    stadium.add("el armando");
		    System.out.println("Intercontinental Cup Winners");
		    System.out.println("List of Teams:");
	  for(int n = 0; n < footballTeams.size(); n++) {
		
		System.out.println(footballTeams.get(n).toUpperCase() +"(" + stadium.get(n).toUpperCase()+ "-Stadium)");
		
	  }
	} 
}
