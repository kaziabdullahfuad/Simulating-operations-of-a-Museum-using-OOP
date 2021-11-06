
package fxmlapplicationpkg;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;


public class ArtGalleryController implements Initializable {

    @FXML
    private Label label1;
    @FXML
    private Label label2;
    @FXML
    private Label label3;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void womanButtonOnClick(MouseEvent event) {
        label1.setText("Woman with a Veil \n 1512 - 1515 ca.");
    }

    @FXML
    private void manButtonOnClick(MouseEvent event) {
        label2.setText("Bust of Antoninus Pius \n Mid 2nd century A.D.");
    }

    @FXML
    private void bladeButtonOnClick(MouseEvent event) {
        
        label3.setText("Blade Sharpener \n late 17th century - early 18th century.");
    }
    
}
