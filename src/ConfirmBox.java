import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Modality;
import javafx.stage.Stage;


/**
 * Created by Administrator on 2018/1/9.
 */
public class ConfirmBox {
	static boolean answer;

	public static boolean display(String title, String message) {
		Stage window = new Stage();

		window.initModality(Modality.APPLICATION_MODAL);
		window.setTitle(title);
		window.setMinWidth(250);
		Label label = new Label(message);

		Button yesButton = new Button("yes");
		Button noButton = new Button("no");
		yesButton.setOnAction(x -> {
			answer = true;
			window.close();
		});
		noButton.setOnAction(x -> {
			answer = false;
			window.close();
		});

		VBox layout = new VBox(10);
		layout.getChildren().addAll(label, yesButton, noButton);
		layout.setAlignment(Pos.CENTER);
		Scene scene = new Scene(layout);
		window.setScene(scene);
		window.showAndWait();

		return answer;
	}
}