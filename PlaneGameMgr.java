/************************************************************************************
* PlaneGame.java
* Final Project: Plane flying game
* Author: Alex Shiffer
* Collaborations: 
* Date: TBD
*
* Variable List:
* 
*
* Method List:

Plane Icon credit
<div>Icons made by <a href="https://www.flaticon.com/authors/dave-gandy" title="Dave Gandy">Dave Gandy</a> from <a href="https://www.flaticon.com/" title="Flaticon">www.flaticon.com</a> is licensed by <a href="http://creativecommons.org/licenses/by/3.0/" title="Creative Commons BY 3.0" target="_blank">CC 3.0 BY</a></div>
*Cloud Icon Credit
<div>Icons made by <a href="https://www.flaticon.com/authors/smashicons" title="Smashicons">Smashicons</a> from <a href="https://www.flaticon.com/" title="Flaticon">www.flaticon.com</a> is licensed by <a href="http://creativecommons.org/licenses/by/3.0/" title="Creative Commons BY 3.0" target="_blank">CC 3.0 BY</a></div>
Missile Icon Credit
<div>Icons made by <a href="http://www.freepik.com" title="Freepik">Freepik</a> from <a href="https://www.flaticon.com/" title="Flaticon">www.flaticon.com</a> is licensed by <a href="http://creativecommons.org/licenses/by/3.0/" title="Creative Commons BY 3.0" target="_blank">CC 3.0 BY</a></div>
Gas Icon Credit
<div>Icons made by <a href="http://www.freepik.com" title="Freepik">Freepik</a> from <a href="https://www.flaticon.com/" title="Flaticon">www.flaticon.com</a> is licensed by <a href="http://creativecommons.org/licenses/by/3.0/" title="Creative Commons BY 3.0" target="_blank">CC 3.0 BY</a></div>
*************************************************************************************/
import java.lang.*;

public class PlaneGame{

	public static void main(String[] args){
		user user = new user();
		obstacle cloud = new obstacle();
		obstacle fuel = new obstacle();
		obstacle bomb = new obstacle();
		user.health = 100;
		cloud.health = -10;
		fuel.health  = 5;
		bomb.health  = -100;
		user.xLoc = 0;
		user.yLoc = 5;
		bomb.generatePiece();
		cloud.generatePiece();
		fuel.generatePiece();

		//System.out.println(bomb.yLoc);
	}
}
class gamePiece{
	public int xLoc, yLoc;
	public int health;
}

class user extends gamePiece{
	int score = 0;
	public void changeUserHealth(int ){
		if (yLoc == yLoc)
	}
}

class obstacle extends gamePiece{
	public void generatePiece(){
    	xLoc = 10;
	    yLoc = (int)(Math.random() * 10);
	}
}



