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
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;
import users.Director;


public class DirectorUIFXMLController implements Initializable {

    private Director dirt;
    @FXML
    private Label directorNamelbl;
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void createMeetingsOnClick(ActionEvent event) throws IOException{
        
       Parent fileChooserViewParent = FXMLLoader.load(getClass().getResource("CreateMeetingFXML.fxml"));
        Scene fileChooserViewScene = new Scene(fileChooserViewParent);
        //Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        Stage newWindow  = new Stage();
        
        newWindow.setTitle("Create Meeting");
        newWindow.setScene(fileChooserViewScene);
        newWindow.show();
    }

    @FXML
    private void seeComplainListOnClick(ActionEvent event) throws IOException {
        Parent fileChooserViewParent = FXMLLoader.load(getClass().getResource("ViewComplain.fxml"));
        Scene fileChooserViewScene = new Scene(fileChooserViewParent);
        //Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        Stage newWindow  = new Stage();
        
        newWindow.setTitle("View Complain");
        newWindow.setScene(fileChooserViewScene);
        newWindow.show();
        
    }
    public void initData(Director d)
    {
        dirt=d;
        directorNamelbl.setText(d.getName());
    }
    
}
