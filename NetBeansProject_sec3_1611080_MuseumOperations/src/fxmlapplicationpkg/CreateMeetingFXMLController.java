/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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


public class CreateMeetingFXMLController implements Initializable {

    @FXML
    private TextField meetingGoalField;
    @FXML
    private DatePicker meetingDate;
    @FXML
    private TextField meetingDuration;

    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void createMeetingFileOnClick(ActionEvent event) {
        
        try {
            FileWriter fw=new FileWriter("Meeting.txt",true);
            String str="";
            
            str+=meetingGoalField.getText()+","+meetingDate.getValue()+","+meetingDuration.getText()+"\n";
            
            fw.write(str);
            fw.close();
        } catch (IOException ex) {
            Logger.getLogger(CreateMeetingFXMLController.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
}
