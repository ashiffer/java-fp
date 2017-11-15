import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class KeyEventDemo extends Application {
  @Override // Override the start method in the Application class
  public void start(Stage primaryStage) {
    // Create a pane and set its properties
    Pane pane = new Pane();
    ImageView imageView = new ImageView(new Image("jet.gif"));
    //Text text = new Text(20, 20, "A");

    pane.getChildren().add(imageView);
    imageView.setOnKeyPressed(e -> {          
      switch (e.getCode()) {
        case DOWN: imageView.setY(imageView.getY() + 10); break;
        case UP:  imageView.setY(imageView.getY() - 10); break;
        case LEFT: imageView.setX(imageView.getX() - 10); break;
        case RIGHT: imageView.setX(imageView.getX() + 10); break;
        //default: 
          //if (Character.isLetterOrDigit(e.getText().charAt(0)))
            //text.setText(e.getText());
      }
    });
    
    // Create a scene and place the pane in the stage
    Scene scene = new Scene(pane);
    primaryStage.setTitle("KeyEventDemo"); // Set the stage title
    primaryStage.setScene(scene); // Place the scene in the stage
    primaryStage.show(); // Display the stage
    
    imageView.requestFocus(); // text is focused to receive key input
  }

  /**
   * The main method is only needed for the IDE with limited
   * JavaFX support. Not needed for running from the command line.
   */
  public static void main(String[] args) {
    launch(args);
  }
} 

