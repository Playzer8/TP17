package application;

import javafx.scene.Scene;
import javafx.stage.Stage;
import model.Model;

public class Main2 
{
	public void start (Stage secondaryStage)
	{
		secondaryStage.show();
		View vue2 = new View(secondaryStage);
		Model model2 = new Model();
		
		vue2.init(model2);
		model2.init(vue2);
		
		Scene scene2 = new Scene(vue2);
		secondaryStage.setTitle("Bar à Tapas");
		secondaryStage.setScene(scene2);
		secondaryStage.setResizable(false);
		
		secondaryStage.show();
		
	}
}
