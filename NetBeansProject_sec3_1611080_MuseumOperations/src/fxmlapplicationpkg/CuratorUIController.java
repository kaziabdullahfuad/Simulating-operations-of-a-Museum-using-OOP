/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fxmlapplicationpkg;

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
import users.Curator;

/**
 * FXML Controller class
 *
 * @author fuadj
 */
public class CuratorUIController implements Initializable {
 
    @FXML
    private Label curatorNamelbl;
    
    private Curator cured;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
    public void initData(Curator c)
    {
        cured=c;
        curatorNamelbl.setText(c.getName());
    }
    
    @FXML
    private void viewMeetingOnClick(ActionEvent event) throws IOException {
        Parent fileChooserViewParent = FXMLLoader.load(getClass().getResource("ViewMeetingFXML.fxml"));
        Scene fileChooserViewScene = new Scene(fileChooserViewParent);
        //Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        Stage newWindow  = new Stage();
        
        newWindow.setTitle("View Meeting Schedule");
        newWindow.setScene(fileChooserViewScene);
        newWindow.show();
    }

    @FXML
    private void complainButtonOnClick(ActionEvent event) throws IOException {
        Parent fileChooserViewParent = FXMLLoader.load(getClass().getResource("Complain.fxml"));
        Scene fileChooserViewScene = new Scene(fileChooserViewParent);
        //Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        Stage newWindow  = new Stage();
        
        newWindow.setTitle("Complain UI");
        newWindow.setScene(fileChooserViewScene);
        newWindow.show();
        
    }

    @FXML
    private void createEventsOnClick(ActionEvent event) {
    }
    
}
