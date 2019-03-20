package CinemaEnterpriso;

import Food.Food;
import Food.FoodList;
import User.User;
import User.UserList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class FoodPageController implements Initializable {

    @FXML
    private CheckBox chipsCheckBox;

    @FXML
    private CheckBox popcornCheckBox;

    @FXML
    private CheckBox skittlesCheckBox;

    @FXML
    private CheckBox cokeCheckBox;

    @FXML
    private CheckBox TangoCheckBox;

    @FXML
    private CheckBox haribosCheckBox;
    @FXML
    private Button buyButtonBTN;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        FoodList.initializeFoods();
        chipsCheckBox.setText("£"+ FoodList.getFoods().get(0).getPrice());
        popcornCheckBox.setText("£"+ FoodList.getFoods().get(1).getPrice());
        skittlesCheckBox.setText("£"+ FoodList.getFoods().get(4).getPrice());
        cokeCheckBox.setText("£"+ FoodList.getFoods().get(2).getPrice());
        TangoCheckBox.setText("£"+ FoodList.getFoods().get(3).getPrice());
        haribosCheckBox.setText("£"+ FoodList.getFoods().get(5).getPrice());


    }

    @FXML
    void buyButtonClicked(ActionEvent event) throws IOException {
        if(chipsCheckBox.isSelected()){
            UserList.getUsers().get(0).getReceipt().addFood(FoodList.getFoods().get(0));
        }

        if(popcornCheckBox.isSelected()){
            UserList.getUsers().get(0).getReceipt().addFood(FoodList.getFoods().get(1));
        }
        if(skittlesCheckBox.isSelected()) {
            UserList.getUsers().get(0).getReceipt().addFood(FoodList.getFoods().get(4));

        }
        if(cokeCheckBox.isSelected()) {
            UserList.getUsers().get(0).getReceipt().addFood(FoodList.getFoods().get(2));

        }
        if(TangoCheckBox.isSelected()) {
            UserList.getUsers().get(0).getReceipt().addFood(FoodList.getFoods().get(3));

        }
        if(haribosCheckBox.isSelected()) {
            UserList.getUsers().get(0).getReceipt().addFood(FoodList.getFoods().get(5));

        }

        buyButtonBTN.getScene().getWindow().hide();
        Stage Pay = new Stage();
        Parent root = FXMLLoader.load(getClass().getResource("Payment.fxml"));
        Pay.setTitle("Select Food");
        Pay.setScene(new Scene(root, 280, 108));
        Pay.show();


    }


}
