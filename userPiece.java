import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class userPiece extends gamePiece{
	public ImageView icon;
	private PlaneGameManager game;

	public void setGameManager(PlaneGameManager game){
		this.game = game;
	}

	public userPiece(){
		xLoc = 5;
		yLoc = 200;
		health = 100;
    	Image jetImage = new Image("/images/jet.gif");
    	this.icon = new ImageView(jetImage);
    	this.icon.setY(yLoc);
	}

	public void updateHealth(int obstacleHealth){
		health += obstacleHealth;
		System.out.println(health);
		game.setHealth(health);
		if(health <= 0){
			game.pauseGame();
		}
	}

	public void moveUser(int y){
		yLoc += y;
		this.icon.setY(yLoc);
	}
}