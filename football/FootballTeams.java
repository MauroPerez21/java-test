package football;
import java.util.ArrayList;

//import javax.swing.JTextArea;
/*
 * DATA MODELLING JAVA 
 * @main Class
 * */
public class FootballTeams {
	public static void main(String [] args) 
	{
		
		//List the teams and the stadiums MODEL
		
		 Team team = new Team();
		 team.getTheTeams();
		//Design of constructor
			//JTextArea areaTextoSalida = new JTextArea ();
		 TeamAwards awards = new TeamAwards();
		ArrayList<String> clubInterC = new ArrayList< String>();
		//Calls the method ArrayList in the class
		 awards.setAwards(clubInterC);
		 
		 System.out.println(awards.getTeam());
		 for(int i = 0; i < awards.getAwards().size(); i++) {
			 System.out.println(awards.getAwards().get(i));
		 } 
		 
		 //TeamsController plot the award-issues by CONSTRUCTOR METHOD
		 String [] prizesA = 
				{"InterC-79", "interC-89","interC-99"};
		 reporteUno("liverpool",clubInterC, prizesA);
		 
		 String [] prizesB = 
				{"InterC-95"};
		 reporteUno("boca",clubInterC, prizesB);
		 String [] prizesC = 
				{"InterC-37", "interC-50","interC-99", "interC-2001", "interC-2002","interC-2003","interC-2009"};
		 reporteUno("milan",clubInterC, prizesC);
		 
		//TeamPlayers MODEL class outputs
		 reporteDos("liverpool", false);
		 reporteDos("boca", false);
		 reporteDos("milan", false); 
		  
	}
	public static void reporteUno(String team, ArrayList<String> clubInterC, String [] prizes) {
		//Testing the method
		 //Teamplayers will return lists of team player by the ArrayList MODEL 
		TeamController liverpool = new TeamController(team, clubInterC, prizes);
		 TeamPlayers playersList = new TeamPlayers(team, true);
			
		 String [] posiciones = getPosiciones();
		 
		 for(int i=0; i< playersList.getPlayersList().length; i++) {
			 System.out.println(posiciones[i]+ ": " + playersList.getPlayersList()[i]);
		 }
	}
	private static void reporteDos(String team, boolean b) {
		System.out.println("\n "+team.toUpperCase()+" Replacements:");
		TeamPlayers playersList = new TeamPlayers(team, b);
		String [] posiciones = getPosiciones();
		 for(int i=0; i< playersList.getPlayersList().length; i++) {
			 System.out.println(posiciones[i]+ ": " + playersList.getPlayersList()[i]);
		 }
		
	}
	private static String []getPosiciones() {
		// TODO Auto-generated method stub
		String [] posiciones = 
			{"arquero","lat-izq", "centro","lat-der","delantero"};
		return posiciones;
		
	}
	
	
}
