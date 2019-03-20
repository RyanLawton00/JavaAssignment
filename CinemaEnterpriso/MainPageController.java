package CinemaEnterpriso;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Label;
import User.User;
import User.UserList;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class MainPageController implements Initializable {

    @FXML
    private Button theatresBTN;

    @FXML
    private Button quitBTN;

    @FXML
    private Label userNameLBL;

    @FXML
    private Label ageLBL;

    @FXML
    private Label nameLBL;

    @FXML
    private Label namesLBL;


    @Override
    public void initialize(URL location, ResourceBundle resources) {
        userNameLBL.setText(UserList.getUsers().get(0).getUsername());
        namesLBL.setText(UserList.getUsers().get(0).getName());
        ageLBL.setText(String.valueOf(UserList.getUsers().get(0).getAge()));



    }

   public void theatreButtonClicked(ActionEvent event) throws IOException{
       theatresBTN.getScene().getWindow().hide();
       Stage MainPage = new Stage();
       Parent root = FXMLLoader.load(getClass().getResource("Theatre.fxml"));
       MainPage.setTitle("Theatre Page");
       MainPage.setScene(new Scene(root, 600, 400));
       MainPage.show();

   }

   public void quitButtonClicked(){
       Alert quit = new Alert(Alert.AlertType.CONFIRMATION);
       quit.setTitle("Quit");
       quit.setHeaderText("Quit");
       quit.setContentText("Are You Sure You Want To Quit");
       quit.showAndWait();
       if (quit.getResult() == ButtonType.OK){
           System.exit(1);


       }







   }



}