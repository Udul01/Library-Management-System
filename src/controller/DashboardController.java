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

public class DashboardController {

    @FXML
    private AnchorPane root;

    @FXML
    void btnManageBookCategory(ActionEvent event) throws IOException {
        URL resource = this.getClass().getResource("/view/ManageBookCategories.fxml");
        Parent root = FXMLLoader.load(resource);
        Stage manageb = new Stage();
        manageb.setScene(new Scene(root));
        manageb.show();
        manageb.setTitle("Manage Book Categories");
    }
}
