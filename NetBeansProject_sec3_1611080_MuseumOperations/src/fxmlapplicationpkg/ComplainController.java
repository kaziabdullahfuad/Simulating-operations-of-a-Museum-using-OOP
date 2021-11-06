
package fxmlapplicationpkg;

import java.io.FileWriter;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;


public class ComplainController implements Initializable {

    @FXML
    private TextField complain;
    @FXML
    private DatePicker complainDate;
    @FXML
    private TextField complainProposal;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void addToComplainButtonOnClick(ActionEvent event) {
        try {
            FileWriter fw=new FileWriter("Complain.txt",true);
            String str="";
            
            str+=complain.getText()+","+complainDate.getValue()+","+complainProposal.getText()+"\n";
            
            fw.write(str);
            fw.close();
        } catch (IOException ex) {
            Logger.getLogger(CreateMeetingFXMLController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
