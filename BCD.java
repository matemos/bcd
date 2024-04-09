package bcd;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.Button;
import javafx.geometry.Insets;
import java.util.Hashtable;

public class BCD extends Application {

	TextField tNum = new TextField();
	
	Label lRis = new Label("result");
	
	Hashtable<Integer, String> ht = new Hashtable<>();
	
	public void start(Stage stage) {
		
		GridPane grid = new GridPane();
		
		grid.setHgap(10);
		grid.setVgap(10);
		grid.setPadding(new Insets(10));
		
		Button pCalcola = new Button("codifica");
		pCalcola.setOnAction(e -> {});
		
		grid.add(new Label("Decimale da convertire"), 0, 0);
		grid.add(tNum, 0, 1);
		grid.add(pCalcola, 0, 2);
		grid.add(lRis, 0, 3);
		
		Scene scene = new Scene(grid);
		
		stage.setScene(scene);
		stage.setTitle("Codifica BCD");
		stage.show();
		
	}
	
	public static void main(String[] args) {
		launch(args);
	}

}
