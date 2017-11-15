import java.lang.*;

public class PlaneGame{

	public static void main(String[] args){
		user user = new user();
		obstacle cloud = new obstacle();
		obstacle fuel = new obstacle();
		obstacle missile = new obstacle();
		user.health = 100;
		cloud.health = -10;
		fuel.health  = 5;
		missile.health  = -100;
		user.xLoc = 0;
		user.yLoc = 5;
		bomb.generatePiece();
		cloud.generatePiece();
		fuel.generatePiece();
	}
}

class 
