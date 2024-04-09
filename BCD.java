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
		
		for (int i = 0; i < 10; i++) {
            String val = Integer.toBinaryString(i);
            while (val.length() < 4) { val = "0" + val; }
            ht.put(i, val);
        }
		
		GridPane grid = new GridPane();
		
		grid.setHgap(10);
		grid.setVgap(10);
		grid.setPadding(new Insets(10));
		
		Button pCalcola = new Button("codifica");
		pCalcola.setOnAction(e -> codifica());
		
		grid.add(new Label("Decimale da convertire"), 0, 0);
		grid.add(tNum, 0, 1);
		grid.add(pCalcola, 0, 2);
		grid.add(lRis, 0, 3);
		
		Scene scene = new Scene(grid);
		
		stage.setScene(scene);
		stage.setTitle("Codifica BCD");
		stage.show();
		
	}
	
	private void codifica() {

		
		String[] sNums = tNum.getText().split("");
		String result = "";
		
		if (sNums.length > 0) {
			
			for (int i = 0; i < sNums.length; i++) {
				result+=ht.get(Integer.parseInt(sNums[i]));
			}
			
			lRis.setText(result);
			
		} else {
			System.out.println("Inserisci un valore valido!");
		}
		
	}
	
	public static void main(String[] args) {
		launch(args);
	}

}
