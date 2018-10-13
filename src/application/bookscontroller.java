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

public class bookscontroller{
	@FXML
	private Label booklabel;
	@FXML
	private TextField book_id;
	@FXML
	private TextField book_name;
	@FXML
	private TextField book_publication;
	@FXML
	private TextField book_author;

	
	public static ArrayList<booksdetails> a=new ArrayList<>();
	public static Set<String> hash_Set = new HashSet<String>();

	@FXML
	public void check(ActionEvent event)
	{
		booksdetails b=new booksdetails();
		 b.bookid=book_id.getText();
		 b.bookn=book_name.getText();
		 b.bookauthor=book_author.getText();
		 b.bookpublication=book_publication.getText();
		 if(hash_Set.contains(b.bookid))
			 {
			booklabel.setText("BOOK ALREADY EXISTS");
			 }
		 else
		 {
		 	try( FileWriter f=new FileWriter("C:\\Users\\saksham\\Desktop\\Libmanage\\src\\application\\books.txt",true)){
			 f.write("\n"+b.bookid+" "+b.bookn+" "+b.bookauthor+" "+b.bookpublication);
			 a.add(b);
			 hash_Set.add(b.bookid);
			booklabel.setText("ADDED SUCCESSFULLY");
			/*System.out.println("books controller:\n");
				Iterator<booksdetails> itr=a.iterator();
				while(itr.hasNext())
				{
					booksdetails bd=itr.next();
					System.out.println(bd.bookid+"\n"+bd.bookn);
				}*/
		 }catch(Exception e)
			{
			 System.out.println(e);
			}
	    }
		}
}
