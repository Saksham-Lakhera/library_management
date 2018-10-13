package application;
import java.io.*;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class membercontroller{
	@FXML
	private Label memberlabel;
	@FXML
	private TextField memberid;
	@FXML
	private TextField membername;
	@FXML
	private TextField memberphone;
	@FXML
	private TextField memberemail;

	
	public static ArrayList<memberdetails> a=new ArrayList<>();
	public static Set<String> hash_Set = new HashSet<String>();
	
	@FXML
	public void check(ActionEvent event)
	{
		memberdetails b=new memberdetails();
		 b.memberid=memberid.getText();
		 b.membername=membername.getText();
		 b.memberphone=memberphone.getText();
		 b.memberemail=memberemail.getText();
		 if(hash_Set.contains(b.memberid))
			 {
memberlabel.setText("MEMBER ALREADY EXISTS");
			 }
		 else
		 {
			try( FileWriter f=new FileWriter("C:\\Users\\saksham\\Desktop\\Libmanage\\src\\application\\membersid.txt",true)){
			 f.write("\n"+b.memberid+" "+b.membername+" "+b.memberphone+" "+b.memberemail);
			 a.add(b);
			 hash_Set.add(b.memberid);
			 memberlabel.setText("ADDED SUCCESSFULLY");
		 }catch(Exception e)
			{
			 System.out.println(e);
			}
	    }
		}
}