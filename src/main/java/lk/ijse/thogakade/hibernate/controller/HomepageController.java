package lk.ijse.thogakade.hibernate.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

public class HomepageController {

    @FXML
    private Button custManage;

    @FXML
    private Button itemManage;

    @FXML
    private AnchorPane mainPane;

    @FXML
    private Button orderManage;

    @FXML
    private Button placeOrder;

    @FXML
    void custManageOnAction(ActionEvent event) throws IOException {
        AnchorPane anchorPane = FXMLLoader.load(getClass().getResource("/view/customer.fxml"));

        Scene scene = new Scene(anchorPane);

        Stage stage = (Stage)mainPane.getScene().getWindow();
        stage.setScene(scene);
        stage.setTitle("Customer Management");
        stage.centerOnScreen();
    }


    @FXML
    void itemManageOnAction(ActionEvent event) throws IOException {
        AnchorPane anchorPane=FXMLLoader.load(getClass().getResource("/view/item.fxml"));

        Scene scene=new Scene(anchorPane);

        Stage stage=(Stage)mainPane.getScene().getWindow();
        stage.setScene(scene);
        stage.setTitle("Item Manage");
        stage.centerOnScreen();

    }

    @FXML
    void orderManageOnACtion(ActionEvent event) throws IOException {
        AnchorPane anchorPane=FXMLLoader.load(getClass().getResource("/view/order.fxml"));

        Scene scene=new Scene(anchorPane);

        Stage stage=(Stage)mainPane.getScene().getWindow();
        stage.setScene(scene);
        stage.setTitle("Order Manage");
        stage.centerOnScreen();

    }

    @FXML
    void placeOrderOnAction(ActionEvent event) throws IOException {
        AnchorPane anchorPane=FXMLLoader.load(getClass().getResource("/view/placeOrder.fxml"));

        Scene scene=new Scene(anchorPane);

        Stage stage=(Stage)mainPane.getScene().getWindow();
        stage.setScene(scene);
        stage.setTitle("Place Order");
        stage.centerOnScreen();

    }

}
