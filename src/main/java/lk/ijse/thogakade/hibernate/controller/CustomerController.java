package lk.ijse.thogakade.hibernate.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import lk.ijse.thogakade.hibernate.bo.custom.CustomerBO;
import lk.ijse.thogakade.hibernate.bo.custom.impl.CustomerBOImpl;
import lk.ijse.thogakade.hibernate.dto.CustomerDTO;

import java.io.IOException;

public class CustomerController {
        CustomerBO customerBO=new CustomerBOImpl();

        @FXML
        private TextField MobileNum;

        @FXML
        private TextField address;

        @FXML
        private Button back;

        @FXML
        private Button btnAdd;

        @FXML
        private TextField custId;

        @FXML
        private TextField custName;

        @FXML
        private Button delete;

        @FXML
        private Button update;

         @FXML
         private AnchorPane custPane;


    @FXML
    void backOnAction(ActionEvent event) throws IOException {
        AnchorPane anchorPane = FXMLLoader.load(getClass().getResource("/view/homepage.fxml"));

        Scene scene = new Scene(anchorPane);

        Stage stage = (Stage)custPane.getScene().getWindow();
        stage.setScene(scene);
        stage.setTitle("Home Page");
        stage.centerOnScreen();
    }

    @FXML
    void btnAddOnAction(ActionEvent event) {
        int id= Integer.parseInt(custId.getText());
        String name=custName.getText();
        String mobileNum=MobileNum.getText();

        CustomerDTO dto=new CustomerDTO(id,name,mobileNum);

        try {
        boolean isSaved=customerBO.saveCustomer(dto);

        if(isSaved){
            new Alert(Alert.AlertType.CONFIRMATION,"customer saved").show();
        }
        }catch (Exception e){
            new Alert(Alert.AlertType.ERROR,e.getMessage()).show();
        }
        }


    @FXML
    void deleteOnAction(ActionEvent event) {
        String id=custId.getText();

        try {
            boolean isDelete=customerBO.deleteCustomer(Integer.parseInt(id));

            if(isDelete){
                new Alert(Alert.AlertType.CONFIRMATION,"customer deleted").show();
            }
        }catch (Exception e){
            new Alert(Alert.AlertType.ERROR,e.getMessage()).show();
        }


    }

    @FXML
    void updateOnAction(ActionEvent event) {

        int id= Integer.parseInt(custId.getText());
        String name=custName.getText();
        String mobileNum=MobileNum.getText();

        CustomerDTO dto=new CustomerDTO(id,name,mobileNum);

        try {
            boolean isUpdated=customerBO.updateCustomer(dto);

            if(isUpdated){
                new Alert(Alert.AlertType.CONFIRMATION,"customer updated").show();
            }
        }catch (Exception e){
            new Alert(Alert.AlertType.ERROR,e.getMessage()).show();
        }
    }

}
