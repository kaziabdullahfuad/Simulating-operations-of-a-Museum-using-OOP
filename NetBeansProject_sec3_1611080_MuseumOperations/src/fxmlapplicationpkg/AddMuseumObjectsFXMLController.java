/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fxmlapplicationpkg;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.URL;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;

/**
 * FXML Controller class
 *
 * @author fuadj
 */
public class AddMuseumObjectsFXMLController implements Initializable {
   
    private ArrayList<MuseumObjects> musobj;
    @FXML
    private TableView<MuseumObjects> tableView;
    @FXML
    private TableColumn<MuseumObjects, String> nameColumn;
    @FXML
    private TableColumn<MuseumObjects, String> idcolumn;
    @FXML
    private TableColumn<MuseumObjects, LocalDate> dateColumn;
    @FXML
    private TableColumn<MuseumObjects, String> categoryColumn;
    @FXML
    private TableColumn<MuseumObjects, String> storageColumn;
    @FXML
    private TextField objectName;
    @FXML
    private TextField objectID;
    @FXML
    private TextField category;
    @FXML
    private TextField storage;
    @FXML
    private DatePicker dateAdded;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        idcolumn.setCellValueFactory(new PropertyValueFactory<MuseumObjects,String>("id"));
        nameColumn.setCellValueFactory(new PropertyValueFactory<MuseumObjects,String>("name"));
        dateColumn.setCellValueFactory(new PropertyValueFactory<MuseumObjects,LocalDate>("addedDate"));
        categoryColumn.setCellValueFactory(new PropertyValueFactory<MuseumObjects,String>("category"));
        storageColumn.setCellValueFactory(new PropertyValueFactory<MuseumObjects,String>("storage"));
    }    

    @FXML
    private void museumObjectOnClick(ActionEvent event) throws IOException {
        
        MuseumObjects musobj=new MuseumObjects(
                   objectName.getText(),
                   objectID.getText(),
                   category.getText(),
                   storage.getText(),
                   dateAdded.getValue());
           
     
      objectID.setText(null); objectName.setText(null); category.setText(null);
      storage.setText(null);
      ;
      
        try {
            ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream("MuseumObjects.bin"));
            oos.writeObject(musobj);
            oos.close();
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        }
    }

    @FXML
    private void loadObjectonClick(ActionEvent event) throws IOException, ClassNotFoundException {
        
        ObjectInputStream ois=null;
        
        //Student s;
        try {
            MuseumObjects m;
            ois=new ObjectInputStream(new FileInputStream("MuseumObjects.bin"));
            m=(MuseumObjects)ois.readObject();
            //m.Display();
            tableView.getItems().add(m);
            
            
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(AddMuseumObjectsFXMLController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
