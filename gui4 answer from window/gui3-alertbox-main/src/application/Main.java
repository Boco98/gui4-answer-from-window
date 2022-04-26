package application;
	
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.control.Label;

public class Main extends Application {
	Stage window;
	Button button;
	
	public static void main(String[] args) {
		launch(args);
	}
	
	@Override
	public void start(Stage primaryStage) {
		window =  primaryStage;
		window.setTitle("thenewboston");
		
		button  = new Button("Click me");
		Label labela = new Label("Najvise volim da jebem na groblju!!! Denifer lopezz");
		button.setOnAction(e -> {
			boolean result = ConfirmBox.display("Title of window", "Are you sure you want send a naked pics_?");
			labela.setText(""+result);
		});
		VBox layout = new VBox(2);
		layout.setMinWidth(200);
		layout.setMinHeight(200);
		layout.getChildren().addAll(button, labela);
		
		Scene scene  = new Scene(layout, 400, 400);
		window.setScene(scene);
		window.show();
		
	}
	
	
}
