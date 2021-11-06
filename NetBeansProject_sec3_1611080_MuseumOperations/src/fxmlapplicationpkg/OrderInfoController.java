/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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
public class OrderInfoController implements Initializable {

    @FXML
    private TextArea orderInfoArea;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void loadOrderInfoOnClick(ActionEvent event) {
        File file=new File("GenerateBill.txt");
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
            orderInfoArea.setText(str);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(ViewMeetingFXMLController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
