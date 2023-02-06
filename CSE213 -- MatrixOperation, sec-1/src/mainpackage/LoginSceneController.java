/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mainpackage;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

public class LoginSceneController implements Initializable {

    @FXML
    private TextField idTextField;
    @FXML
    private PasswordField pwField;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void loginButtonOnClick(MouseEvent event) {
        String idStr;
        idStr = idTextField.getText();
        String pwStr = pwField.getText();
        //id: abc pw:123
        if( idStr.equals("abc") && pwStr.equals("123") ){
            Alert a = new Alert(Alert.AlertType.INFORMATION);
            a.setTitle("Login Status");
            a.setContentText("Login Successful");
            a.setHeaderText(null);
            a.showAndWait();           
        }
        else{
            Alert a2 = new Alert(Alert.AlertType.ERROR);
            a2.setTitle("Login Status");
            a2.setContentText("Oops! Login Failed...");
            a2.setHeaderText(null);
            a2.showAndWait();           
        }           
            
    }
    
}
