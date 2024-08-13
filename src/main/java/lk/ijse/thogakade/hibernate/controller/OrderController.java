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
import lk.ijse.thogakade.hibernate.bo.custom.ItemBO;
import lk.ijse.thogakade.hibernate.bo.custom.OrderBO;
import lk.ijse.thogakade.hibernate.bo.custom.impl.ItemBOImpl;
import lk.ijse.thogakade.hibernate.bo.custom.impl.OrderBOImpl;
import lk.ijse.thogakade.hibernate.dto.ItemDTO;
import lk.ijse.thogakade.hibernate.dto.OrderDTO;

import java.io.IOException;

public class OrderController {
    OrderBO orderBO=new OrderBOImpl();


    @FXML
    private Button backBtn;

    @FXML
    private Button btnAdd;

    @FXML
    private Button btnDelete;

    @FXML
    private Button btnUpdte;

    @FXML
    private AnchorPane orderPane;

    @FXML
    private TextField txtCustId;

    @FXML
    private TextField txtDes;

    @FXML
    private TextField txtQty;


    @FXML
    private TextField txtOrderId;

    @FXML
    void backBtnOnActon(ActionEvent event) throws IOException {
        AnchorPane anchorPane = FXMLLoader.load(getClass().getResource("/view/homepage.fxml"));

        Scene scene = new Scene(anchorPane);

        Stage stage = (Stage)orderPane.getScene().getWindow();
        stage.setScene(scene);
        stage.setTitle("Home Page");
        stage.centerOnScreen();

    }

    @FXML
    void btnAddOnActon(ActionEvent event) {
        int id= Integer.parseInt(txtOrderId.getText());
        String customerId=txtCustId.getText();
        String des=txtDes.getText();
        String qty=txtQty.getText();

        OrderDTO dto =new OrderDTO(id,customerId,des,qty);

        try {
            boolean isSaved=orderBO.savOrder(dto);

            if(isSaved){
                new Alert(Alert.AlertType.CONFIRMATION,"order saved").show();
            }
        }catch (Exception e){
            new Alert(Alert.AlertType.ERROR,e.getMessage()).show();
        }

    }

    @FXML
    void btnDeleteOnActon(ActionEvent event) {
        String id=txtOrderId.getText();

        try {
            boolean isDelete=orderBO.deleteOrder(Integer.parseInt(id));

            if(isDelete){
                new Alert(Alert.AlertType.CONFIRMATION,"order deleted").show();
            }
        }catch (Exception e){
            new Alert(Alert.AlertType.ERROR,e.getMessage()).show();
        }


    }

    @FXML
    void btnUpdteOnActon(ActionEvent event) {

        int id= Integer.parseInt(txtOrderId.getText());
        String customerId=txtCustId.getText();
        String des=txtDes.getText();
        String qty=txtQty.getText();

        OrderDTO dto=new OrderDTO(id,customerId,des,qty);

        try {
            boolean isUpdated=orderBO.updateOrder(dto);

            if(isUpdated){
                new Alert(Alert.AlertType.CONFIRMATION,"item updated").show();
            }
        }catch (Exception e){
            new Alert(Alert.AlertType.ERROR,e.getMessage()).show();
        }
    }

    }
    
