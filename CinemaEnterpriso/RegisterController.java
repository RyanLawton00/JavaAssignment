package CinemaEnterpriso;

import User.UserList;
import User.User;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class RegisterController {
    @FXML
    private TextField nameTXT;

    @FXML
    private TextField usenameTXT;

    @FXML
    private TextField passwordTXT;

    @FXML
    private TextField ageTXT;

    @FXML
    private Button registerBTN;

    @FXML
    void RegisterButtonClicked(ActionEvent event) throws IOException {
        try {
            if (nameTXT.getText().matches("[0-9]")){
                Alert numberName = new Alert(Alert.AlertType.ERROR);
                numberName.setTitle("Numbers As Name");
                numberName.setHeaderText("Numbers In Name");
                numberName.setContentText("Numbers In Name");
                numberName.showAndWait();
            }else{
                User user = new User(usenameTXT.getText(), passwordTXT.getText(), nameTXT.getText(), Integer.parseInt(ageTXT.getText()));
                UserList.addUser(user);
                registerBTN.getScene().getWindow().hide();
                Stage MainPage = new Stage();
                Parent root = FXMLLoader.load(getClass().getResource("MainPage.fxml"));
                MainPage.setTitle("Main Page");
                MainPage.setScene(new Scene(root, 600, 400));
                MainPage.show();

            }

        } catch (NumberFormatException e){
            Alert InvalidNumberALert = new Alert(Alert.AlertType.ERROR);
            InvalidNumberALert.setTitle("Wrong Input");
            InvalidNumberALert.setContentText("Wrong Input");
            InvalidNumberALert.setHeaderText("Wrong Input");
            InvalidNumberALert.showAndWait();

        }







    }

}
