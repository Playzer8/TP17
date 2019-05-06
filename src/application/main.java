package application;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import model.Model;

public class Main extends Application
{
	public void start (Stage primaryStage)
	{
		primaryStage.show();
		View vue = new View(primaryStage);
		Model model = new Model();
		
		vue.init(model);
		model.init(vue);
		
		Scene scene = new Scene(vue);
		primaryStage.setTitle("Bar à Tapas");
		primaryStage.setScene(scene);
		primaryStage.setResizable(false);
		
		primaryStage.show();
		
	}
	
	public static void main(String[] args)
	{
		Application.launch(Main.class);
	}

}
