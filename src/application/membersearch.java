package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;


import java.util.Iterator;

public class membersearch {
    @FXML
    private TextField memberid1;
    @FXML
    private TextField membername1;
    @FXML
    private Label showmember1;
    @FXML
    private Label showbooks1;

    @FXML
    public void search(ActionEvent event) {
        Iterator<memberdetails> itr = membercontroller.a.iterator();
        int flag = 0;
        String books = "";
        String id = memberid1.getText();
        String mn = membername1.getText();
        while (itr.hasNext()) {
            memberdetails md = itr.next();

            if (md.memberid.equals(id)) {
                showbooks1.setText("");
                books = "";
                showmember1.setText("MEMBER ID:" + md.memberid + "\n" + "MEMBER NAME:" + md.membername + "\n" + "MEMBER PHONE:" + md.memberphone + "MEMBER MAIL:" + "\n" + md.memberemail);
                flag = 1;
                Iterator<issuedetails> it = issuecontroller.a.iterator();

                while (it.hasNext()) {
                    issuedetails bd = it.next();
                    if (bd.memberid.equals(md.memberid)) {
                        Iterator<booksdetails> itr1 = bookscontroller.a.iterator();
                        while (itr1.hasNext()) {
                            booksdetails bk = itr1.next();
                            if (issuecontroller.hash_Set.contains(bk.bookid) && bk.bookid.equals(bd.bookid)) {
                                books += "BOOK ID:" + bk.bookid + "\n" + "BOOK NAME:" + bk.bookn + "\n" + "BOOK AUTHOR:" + bk.bookauthor + "\n" + "BOOK PUBLICATION:" + bk.bookpublication + "\n";
                            }
                        }

                    }

                }
                showbooks1.setText(books);
                books = "";
            } else if (md.membername.equals(mn)) {
                showbooks1.setText("");
                books = "";
                showmember1.setText("MEMBER ID:" + md.memberid + "\n" + "MEMBER NAME:" + md.membername + "\n" + "MEMBER PHONE:" + md.memberphone + "MEMBER MAIL:" + "\n" + md.memberemail);
                flag = 1;
                Iterator<issuedetails> it = issuecontroller.a.iterator();

                while (it.hasNext()) {
                    issuedetails bd = it.next();
                    if (bd.memberid.equals(md.memberid)) {
                        Iterator<booksdetails> itr1 = bookscontroller.a.iterator();
                        while (itr1.hasNext()) {
                            booksdetails bk = itr1.next();
                            if (issuecontroller.hash_Set.contains(bk.bookid) && bk.bookid.equals(bd.bookid)) {
                                books += "BOOK ID:" + bk.bookid + "\n" + "BOOK NAME:" + bk.bookn + "\n" + "BOOK AUTHOR:" + bk.bookauthor + "\n" + "BOOK PUBLICATION:" + bk.bookpublication + "\n";
                            }
                        }

                    }

                }
                showbooks1.setText(books);
                books = "";
            }
            if (flag == 0) {
                showmember1.setText("MEMBER NOT FOUND");
                showbooks1.setText("");
            }
        }
    }
}
