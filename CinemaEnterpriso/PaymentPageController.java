package CinemaEnterpriso;

import Food.Food;
import User.User;
import User.UserList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;

public class PaymentPageController {

    @FXML
    private Button cashBTN;

    @FXML
    private Button cardBTN;

    @FXML
    void cardBTNClicked(ActionEvent event) throws IOException {
        UserList.getUsers().get(0).getReceipt().setPaymentMethod("Paid by Card");
        UserList.getUsers().get(0).getReceipt().setTotal(
                (UserList.getUsers().get(0).getReceipt().getTickets() * UserList.getUsers().get(0).getReceipt().getTheatre().getFilm().getPrice()));
        cardBTN.getScene().getWindow().hide();
        Stage CardPay = new Stage();
        Parent root = FXMLLoader.load(getClass().getResource("CardPayment.fxml"));
        CardPay.setTitle("Card Payment");
        CardPay.setScene(new Scene(root, 350, 372));
        CardPay.show();

    }

    @FXML
    void cashBTNClicked(ActionEvent event) throws IOException {

        UserList.getUsers().get(0).getReceipt().setPaymentMethod("Paid By Cash");
        UserList.getUsers().get(0).getReceipt().setTotal(
                (UserList.getUsers().get(0).getReceipt().getTickets() * UserList.getUsers().get(0).getReceipt().getTheatre().getFilm().getPrice()) );
        cashBTN.getScene().getWindow().hide();
        Stage receipt = new Stage();
        Parent root = FXMLLoader.load(getClass().getResource("Receipt.fxml"));
        receipt.setTitle("Receipt");
        receipt.setScene(new Scene(root, 600, 400));
        receipt.show();

    }
}
