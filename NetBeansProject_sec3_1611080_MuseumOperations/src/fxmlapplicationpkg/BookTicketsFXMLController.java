
package fxmlapplicationpkg;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import users.MuseumMember;


public class BookTicketsFXMLController implements Initializable {
  
    private MuseumMember m;
    @FXML
    private TextField ticketsTxtField;
    @FXML
    private DatePicker ticketsDate;
    @FXML
    private Label showBilllbl;
    @FXML
    private TextField nameField;
    @FXML
    private ComboBox locationCombo;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        locationCombo.getItems().add("Hallway");
        locationCombo.getItems().addAll("Garden","The palace");
        locationCombo.setValue("The Palace");        
        
    }    

    @FXML
    private void showBillOnClick(ActionEvent event) {
        
        Museum mus = new Museum();
        float bills;
      bills=mus.calculateBill(Integer.parseInt(ticketsTxtField.getText()));
        //System.out.println(bills);
        //System.out.println(mus.getUniqueID());
        String s=String.valueOf(bills); 
        showBilllbl.setText(s);
    }

    @FXML
    private void generateBillonClick(ActionEvent event) {
        
        Museum mus=new Museum();
        mus.generateBill(nameField.getText(),Float.parseFloat(showBilllbl.getText()),ticketsDate.getValue()
                          ,ticketsTxtField.getText());
        
    }
    
}
