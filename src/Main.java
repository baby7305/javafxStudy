import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class Main extends Application {
	Stage window;
	Button button;

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		window = primaryStage;
		window.setTitle("JavaFx Study");
		window.setOnCloseRequest(x -> {
			closeProgram();
		});

		button = new Button();
		button.setText("close program");
		button.setOnAction(x -> {
			closeProgram();
		});

		StackPane layout = new StackPane();
		layout.getChildren().add(button);

		Scene scene = new Scene(layout, 300, 250);
		primaryStage.setScene(scene);
		primaryStage.show();
	}

	public void closeProgram() {
		Boolean answer = new ConfirmBox().display("Exit", "Sure you want to exit");
		if (answer) {
			window.close();
		}
	}
}
