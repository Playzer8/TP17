package application;

import javafx.geometry.Insets;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.ColorPicker;
import javafx.scene.control.Label;
import javafx.scene.control.Spinner;
import javafx.scene.control.SpinnerValueFactory;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import model.Model;

public class View extends VBox
{
	
	private Stage primaryStage;
	private Model model;
	private VBox box;
	private Label titre;
	private Label nombre;
	

	
	public View(Stage primaryStage) {
		this.primaryStage = primaryStage;
		
		titre = new Label("Bienvenue à Tapas City");
		this.setPadding(new Insets(15, 20, 10, 10));
		this.setPrefSize(400, 400);
		this.getChildren().add(titre);
		box = new VBox();
		
		nombre = new Label("Nombre de personnes : ");
		
		Spinner<Integer> spinner = new Spinner<Integer>();

        SpinnerValueFactory<Integer> valueFactory = new SpinnerValueFactory<Integer>() 
        {
            public void decrement(int steps) 
            {
                int value = this.getValue()-steps;
                if (0 < value)
                {
                    removePersonne();
                    this.setValue(this.getValue()-steps);
                }
                
                
            }

            public void increment(int steps) 
            {
                int value = this.getValue()+steps;
                if(value < 5)
                {
                    addpersonne(value);
                    this.setValue(this.getValue()+steps);
                }
            
            }
        };
        valueFactory.setValue(1);
        spinner.setValueFactory(valueFactory);
        addpersonne( valueFactory.getValue());
		
		spinner.setValueFactory(valueFactory);
	
		this.getChildren().addAll(nombre, spinner);
	    
		
		
		this.getChildren().add(box);
		
		
		Button bouton = new Button("Valider");
		bouton.setPrefSize(100, 25);
		this.getChildren().add(bouton);
		
		
	}
		
	public void addpersonne(int value)
	{
		
			HBox personne1 = new HBox();
			Text p1 = new Text("personne n° " + value); 
			TextField pseudo = new TextField();
			ColorPicker colorPicker = new ColorPicker();
			personne1.getChildren().add(p1);
			personne1.getChildren().add(pseudo);
			personne1.getChildren().add(colorPicker);
			box.getChildren().add(personne1);
	}
	
	public void removePersonne()
	{
		
			Node personne1 = box.getChildren().get(box.getChildren().size()-1);
			box.getChildren().remove(personne1);
	}
	
	

	public void init(Model model) {
		this.model = model;
		
	}
		
}		
		
		
