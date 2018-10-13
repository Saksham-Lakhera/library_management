package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

import javax.swing.table.TableCellEditor;
import java.util.Iterator;

public class bookslistcontroller {
@FXML
private Label label1;
@FXML
private Label label2;
    @FXML
    private Label label3;
    @FXML
    private Label label4;
    @FXML

    public void check(ActionEvent event) {
        String s1,s2,s3,s4;
        s1=s2=s3=s4="";
    Iterator<booksdetails> itr = bookscontroller.a.iterator();
        while (itr.hasNext()) {
            booksdetails bd= itr.next();
            s1+=bd.bookid+"\n";
            s2+=bd.bookn+"\n";
            s3+=bd.bookauthor+"\n";
            s4+=bd.bookpublication+"\n";
        }
        label1.setText(s1);
        label2.setText(s2);
        label3.setText(s3);
        label4.setText(s4);
    }
}