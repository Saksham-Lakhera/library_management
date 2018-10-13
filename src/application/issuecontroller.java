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

public class issuecontroller{
	@FXML
	private Label issuelabel;
	@FXML
	private TextField memberid;
	@FXML
	private TextField bookid;
     @FXML
	private Label showbook;


	public static ArrayList<issuedetails> a=new ArrayList<>();
	public static Set<String> hash_Set = new HashSet<String>();
	@FXML
	public void check(ActionEvent event)
	{
		issuedetails b=new issuedetails();
		 b.memberid=memberid.getText();
		 b.bookid=bookid.getText();
		 if(!membercontroller.hash_Set.contains(b.memberid))
		 {
			 issuelabel.setText("MEMBER NOT FOUND");
		 }
		 else if(!bookscontroller.hash_Set.contains(b.bookid)) {
			 issuelabel.setText("BOOK NOT FOUND");

		 }
		 else if(issuecontroller.hash_Set.contains(b.bookid)) {
			 issuelabel.setText("BOOK NOT AVAILABLE");
			 showbook.setText("NOT FOUND");
		 }
		 else
		 	{showbook.setText("FOUND");
		 	    issuelabel.setText("ISSUED SUCCESSFULLY");
                Iterator<booksdetails> itr=bookscontroller.a.iterator();
                while(itr.hasNext())
                {
                    booksdetails bk=itr.next();
                    if(bk.bookid.equals(b.bookid))
                    {
                        showbook.setText("BOOK ID:"+bk.bookid+"\n"+"BOOK NAME:"+bk.bookn+"\n"+"BOOK AUTHOR:"+bk.bookauthor+"\n"+"BOOK PUBLICATION:"+bk.bookpublication);
                        break;
                    }
                }
		 		try( FileWriter f=new FileWriter("C:\\Users\\saksham\\Desktop\\Libmanage\\src\\application\\issue.txt",true)){
				 f.write("\n"+b.bookid+" "+b.memberid);
				 a.add(b);
				 hash_Set.add(b.bookid);
				 }catch(Exception e)
				{
				 System.out.println(e);
				}
			 }

		}
}
