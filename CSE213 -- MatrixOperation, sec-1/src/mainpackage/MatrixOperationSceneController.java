/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mainpackage;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

/**
 * FXML Controller class
 *
 * @author User
 */
public class MatrixOperationSceneController implements Initializable {

    @FXML    private TextField rowTextField;
    @FXML    private TextField colTextField;
    @FXML    private Label outputLabel;
    Matrix m1,m2,m3;
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void generateMatricesButtonOnClick(MouseEvent event) {
        m1 = new Matrix();
        m1.generateMatrixWithRandomValues(        
            Integer.parseInt(rowTextField.getText()),
            Integer.parseInt(colTextField.getText())
        );
        m2 = new Matrix();
        m2.generateMatrixWithRandomValues(
            Integer.parseInt(rowTextField.getText()),
            Integer.parseInt(colTextField.getText())       
        );
    }

    @FXML
    private void addAndShowMatricesButtonOnClick(ActionEvent event) {
       m3 = m1.addMatrix(m2);
       String outputStr="";
       outputStr += "Matrix m1:\n";
       outputStr += m1.getStringValueOfMatrix();
       outputStr += "Matrix m2:\n";
       outputStr += m2.getStringValueOfMatrix();
       outputStr += "Added Matrix m3:\n";
       outputStr += m3.getStringValueOfMatrix();
       outputLabel.setText(outputStr);
    }
    
}
