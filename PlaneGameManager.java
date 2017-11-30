import javafx.scene.image.ImageView;
import javafx.scene.image.Image;
import javafx.animation.AnimationTimer;
import javafx.scene.text.Text;


public class PlaneGameManager{
	//Global variables
	Obstacle[] cloudArray;
	Obstacle[] fuelArray;
	Obstacle[] missileArray;
	Image cloudImage = new Image("/images/cloud.gif");
    Image missileImage = new Image("/images/missile.gif");
    Image fuelImage = new Image("/images/fuel.gif");
    Text healthText;
    Thread animationThread;
    private boolean running;

	public PlaneGameManager(Obstacle[] cloudArray, Obstacle[] fuelArray, Obstacle[] missileArray, Text healthText){
		this.cloudArray = cloudArray;
		this.fuelArray = fuelArray;
		this.missileArray = missileArray;
		this.healthText = healthText;

		for(int i = 0; i < 100; i++){
			cloudArray[i] = new Obstacle(cloudImage, -10);
		}
		for(int i = 0; i < 20; i++){
			fuelArray[i] = new Obstacle(fuelImage, 10);
		}
		for(int i = 0; i < 10; i++){
			missileArray[i] = new Obstacle(missileImage, -100);
		}
	}

	public void setHealth(int health){
		healthText.setText("Health: "+health);
	}

	public void pauseGame(){
		running = false;
	}

	public void startGame(int level, userPiece jet){
		Obstacle.jet = jet;
		jet.setGameManager(this);
		animationThread = new Thread( new Runnable() {
			@Override
			public void run(){
				running = true;
				while(running){
					for(Obstacle cloud : cloudArray){
        			    cloud.movePiece();			
        			}
        			for(Obstacle fuel : fuelArray){
        			    fuel.movePiece();
        			}
        			for(Obstacle missile : missileArray){
        			    missile.movePiece();
        			}
        			try{
						Thread.sleep(10+(int)(40.0/(float)level));
					} catch (InterruptedException e){
						System.out.println(e.getStackTrace());
					}
				}
			}
		});
		animationThread.start();
    }
}





