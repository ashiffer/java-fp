import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class Obstacle extends gamePiece{

	public ImageView icon;
	public static userPiece jet;

	public void setPiece(){
		xLoc = 400 + ((int)(Math.random() * 400)*20);
		yLoc = (int)(Math.random() * 400);//Generates random y position
		this.icon.setX(xLoc);
		this.icon.setY(yLoc);
	}

	public Obstacle(Image image, int health){
		this.icon = new ImageView(image);
		this.health = health;
		this.setPiece();
	}

	public Obstacle(){

	}

	public void movePiece(){
		xLoc--;
		if(xLoc==0){
			this.checkCollision();
			xLoc = 8400;
		}
		this.icon.setX(xLoc);
	}

	public boolean checkCollision(){
		if(Math.abs(jet.yLoc - this.yLoc)<40){
			jet.updateHealth(this.health);
			//System.out.println("Orange");
		}
        	//if(yLoc == userY){
        		//System.out.println("Pineapples");
            	//obstacle.updateHealth(health);
          	//}
        	//if(jet.health <=0){ //Stops game if health is zero or less
          		//timer.stop();
        	//}
        return false;
	}
}