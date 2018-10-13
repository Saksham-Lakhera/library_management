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

public class returncontroller {
	@FXML
	private Label returnlabel;
	@FXML
	private TextField bookid;
	@FXML
	private TextField memberid;
@FXML
private Label br;
	@FXML
	public void check(ActionEvent event) {
		String bookid1 = bookid.getText();
		String memberid1 = memberid.getText();
		Iterator<issuedetails> it = issuecontroller.a.iterator();

		if (!membercontroller.hash_Set.contains(memberid1)) {
			returnlabel.setText("MEMBER NOT FOUND");
		} else if (!bookscontroller.hash_Set.contains(bookid1)) {
			returnlabel.setText("BOOK NOT FOUND");

		} else if (!issuecontroller.hash_Set.contains(bookid1)) {
			returnlabel.setText("BOOK NOT ISSUED");
		} else {
			int flag = 0;
			while (it.hasNext()) {
				issuedetails bd= it.next();
				if (bd.bookid.equals(bookid1) && !bd.memberid.equals(memberid1)) {
					flag = 1;
					break;
				}
			}
			if (flag != 1) {
				returnlabel.setText("RETURNED SUCCESSFULLY");
				Iterator<booksdetails> itr=bookscontroller.a.iterator();
				while(itr.hasNext())
				{
					booksdetails bk=itr.next();
					if(bk.bookid.equals(bookid1))
					{
						br.setText("BOOK ID:"+bk.bookid+"\n"+"BOOK NAME:"+bk.bookn+"\n"+"BOOK AUTHOR:"+bk.bookauthor+"\n"+"BOOK PUBLICATION:"+bk.bookpublication);
						break;
					}
				}
				String line, val = "";
				try (FileReader fr = new FileReader("C:\\Users\\saksham\\Desktop\\Libmanage\\src\\application\\issue.txt");
					 BufferedReader br = new BufferedReader((fr));
					 FileWriter fw = new FileWriter("C:\\Users\\saksham\\Desktop\\Libmanage\\src\\application\\temp.txt")) {
					while ((line = br.readLine()) != null) {
						String[] str = line.split(" ");
						if (str[0].equals(bookid1)) {
							issuecontroller.hash_Set.remove(bookid1);
							/*Iterator<booksdetails> itr1 = bookscontroller.a.iterator();
							while (itr1.hasNext()) {
								booksdetails bk = itr1.next();
								if (bk.bookid.equals(bookid1)){
							issuecontroller.a.remove(bk);

						}

							}*/
							continue;
						}
						fw.write(line + "\n");
					}
				} catch (IOException e) {
					System.out.println(e);
				}
				try (FileReader fr = new FileReader("C:\\Users\\saksham\\Desktop\\Libmanage\\src\\application\\temp.txt");
					 BufferedReader br = new BufferedReader((fr));
					 FileWriter fw = new FileWriter("C:\\Users\\saksham\\Desktop\\Libmanage\\src\\application\\issue.txt")) {
					while ((line = br.readLine()) != null) {
						String[] str = line.split(" ");
						fw.write(line + "\n");

					}
				} catch (IOException e) {
					System.out.println(e);
				}
			} else {
				returnlabel.setText("MISMATCH");
			}

		}
	}
}