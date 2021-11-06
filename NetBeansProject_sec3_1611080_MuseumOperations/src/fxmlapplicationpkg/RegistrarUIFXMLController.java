
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
import users.Registrar;


public class RegistrarUIFXMLController implements Initializable {
 
    private Registrar reg;
    @FXML
    private Label showNamelbl;
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }
   
     public void initData(Registrar r){
         
         reg=r;
         showNamelbl.setText(reg.getName());
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
    private void complainOnClick(ActionEvent event) throws IOException {
        Parent fileChooserViewParent = FXMLLoader.load(getClass().getResource("Complain.fxml"));
        Scene fileChooserViewScene = new Scene(fileChooserViewParent);
        //Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        Stage newWindow  = new Stage();
        
        newWindow.setTitle("Complain UI");
        newWindow.setScene(fileChooserViewScene);
        newWindow.show();
    }

    @FXML
    private void addMuseumObjectsOnClick(ActionEvent event) throws IOException {
        Parent fileChooserViewParent = FXMLLoader.load(getClass().getResource("AddMuseumObjectsFXML.fxml"));
        Scene fileChooserViewScene = new Scene(fileChooserViewParent);
        //Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        Stage newWindow  = new Stage();
        
        newWindow.setTitle("Add Museum Objects UI");
        newWindow.setScene(fileChooserViewScene);
        newWindow.show();
    }
        
    
}
