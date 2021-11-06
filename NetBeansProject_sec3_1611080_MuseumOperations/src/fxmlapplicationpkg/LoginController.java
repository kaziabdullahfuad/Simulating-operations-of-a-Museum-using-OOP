
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
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import users.Curator;
import users.Director;
import users.MuseumMember;
import users.Registrar;
import users.User;


public class LoginController implements Initializable {

    @FXML
    private TextField userIdTxtField;
    @FXML
    private TextField passwordIdTxtField;
    @FXML
    private Label invalidLbl;

   
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void loadUIOnClick(ActionEvent event) throws IOException {
        
       // User MuseumMember=null;
     // MuseumMember= User.login(Integer.parseInt(userIdTxtField.getText()),passwordIdTxtField.getText());
      User loan=User.login(userIdTxtField.getText(), passwordIdTxtField.getText());
      
      if(loan instanceof MuseumMember)
      {
          /*Parent fileChooserViewParent = FXMLLoader.load(getClass().getResource("MemberUIFXML.fxml"));
        Scene fileChooserViewScene = new Scene(fileChooserViewParent);
        //Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        Stage newWindow  = new Stage();
        
        newWindow.setTitle("File Chooser Test Stage");
        newWindow.setScene(fileChooserViewScene);
        newWindow.show();*/
          
          FXMLLoader loader=new FXMLLoader(getClass().getResource("MemberUIFXML.fxml"));
         Parent fileChooserViewParent = loader.load();
         MemberUIFXMLController controller=loader.getController();
         controller.initData((MuseumMember) loan);
        Scene fileChooserViewScene = new Scene(fileChooserViewParent);
        //Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        Stage newWindow  = new Stage();
        
        newWindow.setTitle("Museum Member UI");
        newWindow.setScene(fileChooserViewScene);
        newWindow.show();
          
      }
      else if(loan instanceof Registrar)
      {
          //System.out.println("Ami Registrar");
          
          FXMLLoader loader=new FXMLLoader(getClass().getResource("RegistrarUIFXML.fxml"));
         Parent fileChooserViewParent = loader.load();
         RegistrarUIFXMLController controller=loader.getController();
         controller.initData((Registrar) loan);
        Scene fileChooserViewScene = new Scene(fileChooserViewParent);
        //Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        Stage newWindow  = new Stage();
        
        newWindow.setTitle("Registrar UI");
        newWindow.setScene(fileChooserViewScene);
        newWindow.show();
      }
      else if(loan instanceof Director)
      {
          FXMLLoader loader=new FXMLLoader(getClass().getResource("DirectorUIFXML.fxml"));
         Parent fileChooserViewParent = loader.load();
         DirectorUIFXMLController controller=loader.getController();
         controller.initData((Director) loan);
        Scene fileChooserViewScene = new Scene(fileChooserViewParent);
        //Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        Stage newWindow  = new Stage();
        
        newWindow.setTitle("Director UI");
        newWindow.setScene(fileChooserViewScene);
        newWindow.show();
      }
      else if(loan instanceof Curator)
      {
          FXMLLoader loader=new FXMLLoader(getClass().getResource("CuratorUI.fxml"));
         Parent fileChooserViewParent = loader.load();
         CuratorUIController controller=loader.getController();
         controller.initData((Curator) loan);
        Scene fileChooserViewScene = new Scene(fileChooserViewParent);
        //Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        Stage newWindow  = new Stage();
        
        newWindow.setTitle("Curator UI");
        newWindow.setScene(fileChooserViewScene);
        newWindow.show();
      }
      else{
          //System.out.println("No");
          invalidLbl.setText("Invalid userID or Password");
      }
        
    }
    
}
