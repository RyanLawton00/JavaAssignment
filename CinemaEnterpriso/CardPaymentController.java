package CinemaEnterpriso;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class CardPaymentController {
    @FXML
    private TextField cardNumberTXT;

    @FXML
    private TextField ccvTXT;

    @FXML
    private TextField firstNameTXT;

    @FXML
    private TextField lastNameTXT;

    @FXML
    private TextArea billingAddressTXT;

    @FXML
    private Button nextBTN;

    @FXML
    void nextBTNClicked(ActionEvent event) throws IOException {
        int length = cardNumberTXT.getText().length();
        int ccvLength = ccvTXT.getText().length();
/// .mathes(".*\\d.*") is code from stack overflow-https://stackoverflow.com/questions/18590901/check-if-a-string-contains-numbers-java

            if (cardNumberTXT.getText().matches(".*\\d.*") && (length == 16) && cardNumberTXT.getText().matches("[0-9]+")){
                if (ccvTXT.getText().matches(".*\\d.*") && (ccvLength == 3) && ccvTXT.getText().matches("[0-9]+")){
                    if(firstNameTXT.getLength() != 0 && lastNameTXT.getLength() != 0 && billingAddressTXT.getLength() != 0) {
                        Stage receipt = new Stage();
                        Parent root = FXMLLoader.load(getClass().getResource("Receipt.fxml"));
                        receipt.setTitle("Receipt");
                        receipt.setScene(new Scene(root, 394, 303));
                        receipt.show();

                    }else{
                        Alert noinput = new Alert(Alert.AlertType.ERROR);
                        noinput.setTitle("No Input");
                        noinput.setHeaderText("No Input");
                        noinput.setContentText("No Input");
                        noinput.showAndWait();
                    }

                }else{
                    Alert ccv = new Alert(Alert.AlertType.ERROR);
                    ccv.setTitle("Incorrect CCV");
                    ccv.setHeaderText("Incorrect CCV");
                    ccv.setContentText("Enter 3 Digits");
                    ccv.showAndWait();
                }

            }else {

                Alert card = new Alert(Alert.AlertType.ERROR);
                card.setTitle("Wrong Card Info");
                card.setHeaderText("Wrong Card Info");
                card.setContentText("Please Enter a 16 Digit Number");
                card.showAndWait();


            }

    }
}