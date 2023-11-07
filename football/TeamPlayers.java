package football;


public class TeamPlayers {
	String [] playersList;
public TeamPlayers(String team, boolean suppliers) {
	super();
	// TODO Auto-generated constructor stub
	switch(team) {
	case "liverpool":
		setLiverpool(suppliers);
		break;
	case "milan":
		setMilan(suppliers);
		break;
	case "boca":
		setBoca(suppliers);
		break;
		
	}
}


protected void setLiverpool(boolean value) {
	System.out.println("\nPlayers list Liverpool");
	String [] willPlay = {"van der saar","rooney", "cuadrado","diaz", "CR7"};
	String [] willPlaysuppliers = {"benny", "hill","beckham", "tierry henri","rodriguez"};
	if(value != false) {
		setPlayersList(willPlay);
	}else {
		setPlayersList(willPlaysuppliers);
	}
}
protected void setBoca(boolean value) {
	System.out.println("\nPlayers list Boca Juniors");
	String [] willPlay = {"franco armani","redondo","maradona" ,"la bruja", "di bala"};
	String [] willPlaysuppliers = {"cordoba","pelottudo", "ruggeri","pedernera","batistuta"};
	if(value == true) {
		setPlayersList(willPlay);
	}else {
		setPlayersList(willPlaysuppliers);
	}
}
protected void setMilan(boolean value) {
	System.out.println("\nPlayers list A.C. MILAN");
	String [] willPlay = {"luigi buffpm","maldini","messi", "panucci", "totti"};
	String [] willPlaysuppliers = {"pagliuca","donadoni","del piero", "pirlo","materasi"};
	if(value == true) {
		setPlayersList(willPlay);
	}else {
		setPlayersList(willPlaysuppliers);
	}
}
protected String[] getPlayersList() {
	return playersList;
}


protected void setPlayersList(String[] playersList) {
	this.playersList = playersList;
}





}
