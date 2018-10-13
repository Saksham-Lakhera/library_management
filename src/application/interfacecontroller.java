package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class interfacecontroller {

	
	public void interfere(ActionEvent event) throws Exception
	{
		String value=((Button)event.getSource()).getText();
		if(value.equals("ADD BOOK"))
		{
		
			Stage primaryStage=new Stage();
			Parent root = FXMLLoader.load(getClass().getResource("/application/main.fxml"));
			Scene scene = new Scene(root,400,400);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setTitle("Add New Book");
			primaryStage.setWidth(574.0);
			primaryStage.setHeight(385.0);
			primaryStage.setMaxWidth(574.0);
			primaryStage.setMaxHeight(385.0);
			primaryStage.setScene(scene);
			primaryStage.show();
			
		}
		else if(value.equals("ADD MEMBER"))
        {
			Stage primaryStage=new Stage();
			Parent root = FXMLLoader.load(getClass().getResource("/application/member.fxml"));
			Scene scene = new Scene(root,400,400);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setTitle("Add New Member");
            primaryStage.setWidth(574.0);
            primaryStage.setHeight(385.0);
			primaryStage.setMaxWidth(574.0);
			primaryStage.setMaxHeight(385.0);
			primaryStage.setScene(scene);
			primaryStage.show();
		}
		else if(value.equals("ISSUE BOOK"))
		{
			Stage primaryStage=new Stage();
			Parent root = FXMLLoader.load(getClass().getResource("/application/issue.fxml"));
			Scene scene = new Scene(root,400,400);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
            primaryStage.setTitle("Book Issue");
			primaryStage.setWidth(574.0);
			primaryStage.setHeight(385.0);
			primaryStage.setScene(scene);
			primaryStage.show();
			
		}
		else if(value.equals("RETURN BOOK"))
		{
			Stage primaryStage=new Stage();
			Parent root = FXMLLoader.load(getClass().getResource("/application/return.fxml"));
			Scene scene = new Scene(root,400,400);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
            primaryStage.setTitle("Book Return");
			primaryStage.setWidth(574.0);
			primaryStage.setHeight(385.0);
			primaryStage.setMaxWidth(574.0);
			primaryStage.setMaxHeight(385.0);
			primaryStage.setScene(scene);
			primaryStage.show();
			
		}
		else if(value.equals("BOOKS LIST"))
		{

			Stage primaryStage=new Stage();
			Parent root = FXMLLoader.load(getClass().getResource("/application/bookslist.fxml"));
			Scene scene = new Scene(root,400,400);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
            primaryStage.setTitle("Book List");
			primaryStage.setWidth(574.0);
			primaryStage.setHeight(385.0);
			primaryStage.setMaxWidth(574.0);
			primaryStage.setMaxHeight(385.0);
			primaryStage.setScene(scene);
			primaryStage.show();



		}
		else if(value.equals("SEARCH MEMBER"))
		{

			Stage primaryStage=new Stage();
			Parent root = FXMLLoader.load(getClass().getResource("/application/memberlists.fxml"));
			Scene scene = new Scene(root,400,400);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setTitle("Search Member ");
			primaryStage.setWidth(649.0);
			primaryStage.setHeight(448.0);
			primaryStage.setScene(scene);
			primaryStage.show();


		}
	}
	
	
	}