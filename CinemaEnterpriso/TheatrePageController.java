package CinemaEnterpriso;

import Film.FilmList;
import Receipt.Receipt;
import Theatre.Theatre;
import Theatre.TheatreList;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.stage.Stage;
import User.UserList;


import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;



public class TheatrePageController implements Initializable {

    @FXML
    private ListView<Theatre> theatresListView;

    @FXML
    private Button theatreSelectButton;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        FilmList.initializeFilms();
        TheatreList.initializeTheatres();
        ObservableList<Theatre> theatresObservableList = FXCollections.observableArrayList(TheatreList.getTheatres());

        theatresListView.setItems(theatresObservableList);

    }


    private int selectedTheatreage() {

        return theatresListView.getSelectionModel().getSelectedItems().get(0).getFilm().getAge();
    }



    @FXML
    void theatreClickSelect(ActionEvent event) throws IOException {

        TheatreList.addSelectedTheatre(theatresListView.getSelectionModel().getSelectedItem());
        UserList.getUsers().get(0).setReceipt(new Receipt(theatresListView.getSelectionModel().getSelectedItem()));


        if (UserList.getUsers().get(0).getAge() >= selectedTheatreage()){
            theatreSelectButton.getScene().getWindow().hide();
            Stage film = new Stage();Parent root = FXMLLoader.load(getClass().getResource("Film.fxml"));
            film.setTitle("Film");
            film.setScene(new Scene(root, 600, 400));
            film.show();
        }else{
             Alert AgeAlert = new Alert(Alert.AlertType.ERROR);
             AgeAlert.setTitle("Not old enough");
             AgeAlert.setContentText("Not old enough");
             AgeAlert.setHeaderText("Not old enough");
             AgeAlert.showAndWait();
        }

    }


}






















