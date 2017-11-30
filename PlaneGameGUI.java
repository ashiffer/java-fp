import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.animation.AnimationTimer;
import javafx.scene.input.KeyCode;
import javafx.scene.layout.StackPane;

public class PlaneGameGUI extends Application {
  Obstacle[] cloudArray = new Obstacle[100];
  Obstacle[] fuelArray = new Obstacle[20];
  Obstacle[] missileArray = new Obstacle[10];

  @Override // Override the start method in the Application class
  public void start(Stage primaryStage){
    // Create a pane and set its properties
    BorderPane pane = new BorderPane();
    //Pane healthPane = new Pane();
    HBox topHBox = new HBox(10);
    HBox healthLabelBox = new HBox(10);
    Text healthLabel = new Text("Health: 100");
    healthLabelBox.setSpacing(10);
    //Button startGameBt = new Button("Start Game");//Start Game button 
    //topHBox.getChildren().add(startGameBt);
    healthLabelBox.getChildren().add(healthLabel);
    //buttonPane.getChildren().add(topHBox);
    //pane.setTop(buttonPane);
    pane.getChildren().add(healthLabelBox);
    pane.setStyle("-fx-background-color: LIGHTBLUE;");

    //Call to manager and adding obstacles to pane
    //PlaneGameManager manager = new PlaneGameManager(cloudArray, fuelArray, missileArray);
    PlaneGameManager manager = new PlaneGameManager(cloudArray, fuelArray, missileArray, healthLabel);
    for(Obstacle item : cloudArray){
      pane.getChildren().add(item.icon);
    }
    for(Obstacle item : fuelArray){
      pane.getChildren().add(item.icon);
    }
    for(Obstacle item : missileArray){
      pane.getChildren().add(item.icon);
    }
    userPiece jet = new userPiece();
    pane.getChildren().add(jet.icon);

    manager.startGame(5, jet);

    //Create scene and place the pane in the stage
    Scene scene = new Scene(pane);
    primaryStage.setTitle("Plane Game"); // Set stage title
    primaryStage.setScene(scene); // Place the scene in the stage
    primaryStage.setMinWidth(500);
    primaryStage.setMinHeight(500);
    primaryStage.show();//Display
    scene.setOnKeyPressed(e -> { //this method allows user to move the plane up and down
      KeyCode key = e.getCode();          
      switch (e.getCode()){
        //need to interact with objects and create user objects
        case DOWN: jet.moveUser(10); break;
        case UP:  jet.moveUser(-10); break;
      }
    });
  }

  public static void main(String[] args) {
    Application.launch(args);
  }
} 