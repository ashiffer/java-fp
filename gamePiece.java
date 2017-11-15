class gamePiece{
	//Attributes (Common)
	public int xLoc, yLoc;
	public int health;
	public int currentVel;

	//Methods (Common)
	public void movePiece(){
		switch {
			case UP = //KEYCODES
			case DOWN =
			case LEFT = 
			case RIGHT = 
		}
public class KeyEventDemo extends Application {
  @Override // Override the start method in the Application class
  public void start(Stage primaryStage) {
    // Create a pane and set its properties
    Pane pane = new Pane();
    Text text = new Text(20, 20, "A");

    pane.getChildren().add(text);
    text.setOnKeyPressed(e -> {          
      switch (e.getCode()) {
        case DOWN: text.setY(text.getY() + 10); break;
        case UP:  text.setY(text.getY() - 10); break;
        case LEFT: text.setX(text.getX() - 10); break;
        case RIGHT: text.setX(text.getX() + 10); break;
        //default: 
          //if (Character.isLetterOrDigit(e.getText().charAt(0)))
           // text.setText(e.getText());
      }
    });

	}
}







