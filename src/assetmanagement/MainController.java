/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assetmanagement;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;

/**
 *
 * @author orporwongsawan
 */
public class MainController implements Initializable {
    
    @FXML
    private Label label;
    @FXML
    private Button btnLogin;
    
    
    @FXML
    private void LoginSuccess(ActionEvent event) throws IOException {
        
                FXMLLoader loader=new FXMLLoader();
                loader.setLocation(getClass().getResource("Main.fxml"));
                loader.load();
                Parent p=loader.getRoot();
                
                Stage stage=new Stage();
                Scene scene=new Scene(p);
                stage.setScene(scene);
                stage.show();
                
                Stage stagelogin = (Stage) btnLogin.getScene().getWindow();
                stagelogin.close();
    }
    @FXML
    private void OpenAdd(ActionEvent event) throws IOException{
        FXMLLoader loader=new FXMLLoader();
                loader.setLocation(getClass().getResource("Asset_add.fxml"));
                loader.load();
                Parent p=loader.getRoot();
                
                Stage stage=new Stage();
                Scene scene=new Scene(p);
                stage.setScene(scene);
                stage.show();
    }
    @FXML 
    private void OpenDetials(ActionEvent event) throws IOException{
        FXMLLoader loader=new FXMLLoader();
                loader.setLocation(getClass().getResource("Asset_Details.fxml"));
                loader.load();
                Parent p=loader.getRoot();
                
                Stage stage=new Stage();
                Scene scene=new Scene(p);
                stage.setScene(scene);
                stage.show();
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
       
    }    
    
}
