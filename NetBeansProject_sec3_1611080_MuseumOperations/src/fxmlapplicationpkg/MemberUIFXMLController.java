
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
import users.MuseumMember;



public class MemberUIFXMLController implements Initializable {

    private MuseumMember meme;
    @FXML
    private Label showName;
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    public void initData(MuseumMember m){
        //selectedPerson = p;
        //firstNameLabel.setText(selectedPerson.getFirstName());
        //lastNameLabel.setText(selectedPerson.getLastName());
        //birthdayLabel.setText(selectedPerson.getBirthday().toString());
        //ageLabel.setText(Integer.toString(selectedPerson.getAge())+" years");
        meme=m;
        showName.setText(m.getName());
    }

    @FXML
    private void bookTicketsOnClick(ActionEvent event) throws IOException {
        
         Parent fileChooserViewParent = FXMLLoader.load(getClass().getResource("BookTicketsFXML.fxml"));
        Scene fileChooserViewScene = new Scene(fileChooserViewParent);
        //Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        Stage newWindow  = new Stage();
        
        newWindow.setTitle("Book Tickets");
        newWindow.setScene(fileChooserViewScene);
        newWindow.show();
    }

    @FXML
    private void viewArtOnClick(ActionEvent event) throws IOException {
        
        Parent fileChooserViewParent = FXMLLoader.load(getClass().getResource("ArtGallery.fxml"));
        Scene fileChooserViewScene = new Scene(fileChooserViewParent);
        //Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        Stage newWindow  = new Stage();
        
        newWindow.setTitle("Art Gallery");
        newWindow.setScene(fileChooserViewScene);
        newWindow.show();
    }

    @FXML
    private void donateButtonOnClick(ActionEvent event) {
        
    }

    @FXML
    private void becomeEliteMemberOnClick(ActionEvent event) {
    }

    @FXML
    private void viewOrderInfoOnClick(ActionEvent event) throws IOException {
        Parent fileChooserViewParent = FXMLLoader.load(getClass().getResource("OrderInfo.fxml"));
        Scene fileChooserViewScene = new Scene(fileChooserViewParent);
        //Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        Stage newWindow  = new Stage();
        
        newWindow.setTitle("Order Info");
        newWindow.setScene(fileChooserViewScene);
        newWindow.show();
        
    }
    
}
