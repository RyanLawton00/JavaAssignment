package CinemaEnterpriso;

import Film.FilmList;
import Food.FoodList;
import Theatre.Theatre;
import Theatre.TheatreList;
import User.User;
import User.UserList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Stage;


import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class FilmPageController implements Initializable {

    @FXML
    private Label filmnameLBL;

    @FXML
    private Label durationLBL;

    @FXML
    private Label dateOfReleaseLBL;

    @FXML
    private Label directorLBL;

    @FXML
    private Label castLBL;

    @FXML
    private Label filmDescriptionLBL;

    @FXML
    private ComboBox<String> ticketsCombo;

    @FXML
    private Label totalLBL;
    @FXML
    private Button nextBTN;


    @Override
    public void initialize(URL location, ResourceBundle resources) {

        filmnameLBL.setText(TheatreList.getSelectedTheatre().getFilm().getFilmname());
        durationLBL.setText(TheatreList.getSelectedTheatre().getFilm().getDuration());
        dateOfReleaseLBL.setText(TheatreList.getSelectedTheatre().getFilm().getDateofRelease());
        directorLBL.setText(TheatreList.getSelectedTheatre().getFilm().getDirector());
        castLBL.setText(TheatreList.getSelectedTheatre().getFilm().getCast());
        filmDescriptionLBL.setText(TheatreList.getSelectedTheatre().getFilm().getFilmDescription());

        ticketsCombo.getItems().addAll("1", "2", "3", "4");
    }
        @FXML
        void nextButtonClick (ActionEvent event) throws IOException {

            if (ticketsCombo.getSelectionModel().isEmpty()) {
                Alert select = new Alert(Alert.AlertType.ERROR);
                select.setTitle("Select Amount Of Tickets");
                select.setHeaderText("Select Amount Of Tickets");
                select.setContentText("Select Amount Of Tickets");
                select.showAndWait();


            } else {

                UserList.getUsers().get(0).getReceipt().setTickets(Integer.parseInt(ticketsCombo.getValue()));


                TheatreList.getSelectedTheatre().setSeats(TheatreList.getSelectedTheatre().getSeats() - Integer.parseInt(ticketsCombo.getValue()));
                nextBTN.getScene().getWindow().hide();
                Stage FoodPage = new Stage();
                Parent root = FXMLLoader.load(getClass().getResource("FoodPage.fxml"));
                FoodPage.setTitle("Select Food");
                FoodPage.setScene(new Scene(root, 600, 400));
                FoodPage.show();
            }
        }
        @FXML
        void ticketsComboClicked(ActionEvent event) {

    }

}
