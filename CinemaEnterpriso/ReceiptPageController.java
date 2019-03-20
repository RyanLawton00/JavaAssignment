package CinemaEnterpriso;

import Food.Food;
import Theatre.Theatre;
import Theatre.TheatreList;
import User.User;
import User.UserList;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class ReceiptPageController implements Initializable {
    @FXML
    private Button doneBTN;

    @FXML
    private Label filmnameLBL;

    @FXML
    private Label theatreLBL;

    @FXML
    private Label totalLBL;

    @FXML
    private Label theatreLocationLBL;

    @FXML
    private Label paymentMethodLBL;

    @FXML
    private Label ticketsLBL;

    @FXML
    private ListView<Food> foodsListView;

    @FXML
    void doneBTNClicked(ActionEvent event) throws IOException {
        doneBTN.getScene().getWindow().hide();
        Stage receipt = new Stage();
        Parent root = FXMLLoader.load(getClass().getResource("MainPage.fxml"));
        receipt.setTitle("MainPage");
        receipt.setScene(new Scene(root, 600, 400));
        receipt.show();

    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {

        double totalFoodPrice = 0.0;


        for(Food food : UserList.getUsers().get(0).getReceipt().getFoods()) {
            totalFoodPrice = totalFoodPrice + food.getPrice();

        }

            UserList.getUsers().get(0).getReceipt().setTotal(UserList.getUsers().get(0).getReceipt().getTotal() + totalFoodPrice);


        filmnameLBL.setText(UserList.getUsers().get(0).getReceipt().getTheatre().getFilm().getFilmname());
        theatreLBL.setText(UserList.getUsers().get(0).getReceipt().getTheatre().getTheatreName());
        theatreLocationLBL.setText(UserList.getUsers().get(0).getReceipt().getTheatre().getTheatreLocation());
        paymentMethodLBL.setText(UserList.getUsers().get(0).getReceipt().getPaymentMethod());
        ticketsLBL.setText(String.valueOf(UserList.getUsers().get(0).getReceipt().getTickets()));
        totalLBL.setText(String.valueOf(UserList.getUsers().get(0).getReceipt().getTotal()));
        ObservableList<Food> theatresObservableList = FXCollections.observableArrayList(UserList.getUsers().get(0).getReceipt().getFoods());
        foodsListView.setItems(theatresObservableList);
    }

}
