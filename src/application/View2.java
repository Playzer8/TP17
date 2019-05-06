package application;

import javafx.geometry.Insets;
import javafx.scene.control.Label;
import javafx.scene.control.TabPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import model.Model;

public class View2 extends TabPane
{
	
	private Stage secondaryStage;
	private Model model;
	private Label titre;
	private Model model2;
	private VBox container;
	
	public View2(Stage secondayStage) 
	{
		this.secondaryStage = secondaryStage;
		
		titre = new Label("Historique des commandes");
		this.setPadding(new Insets(15, 20, 10, 10));
		this.setPrefSize(700, 700);
		this.getChildren().add(titre);
		this.getChildren().add(container);
	}
	
	public void init(Model model2) 
	{
		this.model2 = model2;
	}


}
