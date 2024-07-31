package controller;

import java.io.IOException;
import java.net.URL;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class MainController {

       @FXML
    private AnchorPane root;

    @FXML
    void btnLoginOnAction(ActionEvent event) throws IOException {
System.out.println("Login button is clicked");
   URL resource = this.getClass().getResource("/view/dashboard.fxml");
   Parent root = FXMLLoader.load(resource);
   Stage stage = new Stage();
   stage.setScene(new Scene(root));
   stage.show();
   stage.setTitle("Dashboard");

  
    }
}
