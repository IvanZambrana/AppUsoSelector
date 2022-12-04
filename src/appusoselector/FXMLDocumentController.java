/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXML2.java to edit this template
 */
package appusoselector;

import componentes_zambranaivan.SelectorDeslizamiento;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;

/**
 *
 * @author Ivan
 */
public class FXMLDocumentController implements Initializable {
    
    @FXML
    private Label label;
    @FXML
    private SelectorDeslizamiento Uno;
    @FXML
    private SelectorDeslizamiento Dos;
   
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        Uno.setOnAction((ActionEvent event) -> {
            label.setText("Has pulsado el de arriba");
        });
        Dos.setOnAction((ActionEvent event) -> {
            label.setText("Has pulsado el de abajo");
        });

    }    
    
}
