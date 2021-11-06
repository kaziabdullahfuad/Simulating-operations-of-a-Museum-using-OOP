
package fxmlapplicationpkg;

import java.io.File;
import java.io.FileNotFoundException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextArea;

/**
 * FXML Controller class
 *
 * @author fuadj
 */
public class ViewComplainController implements Initializable {

    @FXML
    private TextArea complainArea;

    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void loadComplainOnClick(ActionEvent event) {
        
        File file=new File("Complain.txt");
       Scanner sc;
       
        try {
            sc=new Scanner(file);
            String str="";
            while(sc.hasNextLine())
            {
                //str=sc.nextLine();
                str=str.concat(sc.nextLine()+"\n");
            }
            //System.out.println(str);
            complainArea.setText(str);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(ViewMeetingFXMLController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
