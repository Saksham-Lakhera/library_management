package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.net.URL;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.ResourceBundle;

import javafx.concurrent.Task;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.ProgressBar;
import javafx.stage.Stage;

public class MainController  {

	@FXML
	private Label lLogin;
	@FXML
	private TextField tfUsername;
	
	@FXML
	private TextField tfPassword;


	
	public void login(ActionEvent event) throws Exception
    {
		if((tfUsername.getText().equals("shivam") && tfPassword.getText().equals("sm"))||(tfUsername.getText().equals("siddhant") && tfPassword.getText().equals("ss"))||(tfUsername.getText().equals("saksham") && tfPassword.getText().equals("sl")))
		{
			lLogin.setText("Login Succesful!");

			String line;

	    	try (
	    	    FileReader isr = new FileReader("C:\\Users\\saksham\\Desktop\\Libmanage\\src\\application\\books.txt");
	    	    BufferedReader br = new BufferedReader(isr)) {
	    	    while ((line = br.readLine()) != null) {
	    	    	String[] str=line.split(" ");
						booksdetails bd=new booksdetails();
	    	    	bd.bookid=str[0];
	    	    	bd.bookn=str[1];
	    	    	bd.bookauthor=str[2];
	    	    	bd.bookpublication=str[3];
	    	    	bookscontroller.a.add(bd);
	    	    	bookscontroller.hash_Set.add(str[0]);

	    	    }}
				catch(Exception e)
	    	{
	    		System.out.println(e);
	    	}

	    	try (
		    	    FileReader isr = new FileReader("C:\\Users\\saksham\\Desktop\\Libmanage\\src\\application\\membersid.txt");
		    	    BufferedReader br2 = new BufferedReader(isr)) {

				while ((line = br2.readLine()) != null) {
					String[] str = line.split(" ");
					memberdetails  mem=new memberdetails();
					mem.memberid = str[0];
					mem.membername = str[1];
					mem.memberphone = str[2];
					mem.memberemail = str[3];
					membercontroller.a.add(mem);
					membercontroller.hash_Set.add(str[0]);
				}

			}catch(Exception e)
		    	{
		    		System.out.println(e);
		    	}
				


	    	
	    	try (
		    	    FileReader isr = new FileReader("C:\\Users\\saksham\\Desktop\\Libmanage\\src\\application\\issue.txt");
		    	    BufferedReader br1 = new BufferedReader(isr)) {
		    	    while ((line = br1.readLine()) != null) {
		    	    	String [] str=line.split(" ");
						issuedetails isue=new issuedetails();
		    	    	isue.bookid=str[0];
		    	    	isue.memberid=str[1];
		    	    	issuecontroller.a.add(isue);
		    	    	issuecontroller.hash_Set.add(isue.bookid);
		    	    }

		    	}catch(Exception e)
		    	{
		    		System.out.println(e);
		    	}

			


			
			
			
			Stage primaryStage=new Stage();
			Parent root = FXMLLoader.load(getClass().getResource("/application/interface.fxml"));
			Scene scene = new Scene(root,400,400);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setTitle("Library Assistant Menu");
			primaryStage.setWidth(649.0);
			primaryStage.setHeight(448.0);
			primaryStage.setScene(scene);
			primaryStage.show();

			
			
		}
		else {
			lLogin.setText("Login Failed!");
		}
	}


}
