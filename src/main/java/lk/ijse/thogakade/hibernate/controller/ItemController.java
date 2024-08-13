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
import lk.ijse.thogakade.hibernate.bo.custom.ItemBO;
import lk.ijse.thogakade.hibernate.bo.custom.impl.CustomerBOImpl;
import lk.ijse.thogakade.hibernate.bo.custom.impl.ItemBOImpl;
import lk.ijse.thogakade.hibernate.dto.CustomerDTO;
import lk.ijse.thogakade.hibernate.dto.ItemDTO;

import java.io.IOException;

public class ItemController {
    ItemBO itemBO=new ItemBOImpl();

    @FXML
    private Button btnAdd;

    @FXML
    private Button btnBack;

    @FXML
    private Button btnDelete;

    @FXML
    private Button btnUpdate;

    @FXML
    private AnchorPane itemPane;

    @FXML
    private TextField txtItemId;

    @FXML
    private TextField txtItemName;

    @FXML
    private TextField txtPrice;

    @FXML
    private TextField txtQty;

    @FXML
    void btnAddOnAction(ActionEvent event) {
        int id= Integer.parseInt(txtItemId.getText());
        String name=txtItemName.getText();
        String price=txtPrice.getText();
        String qty=txtQty.getText();

        ItemDTO dto =new ItemDTO(id,name,price,qty);

        try {
            boolean isSaved=itemBO.saveItem(dto);

            if(isSaved){
                new Alert(Alert.AlertType.CONFIRMATION,"item saved").show();
            }
        }catch (Exception e){
            new Alert(Alert.AlertType.ERROR,e.getMessage()).show();
        }
    }


    @FXML
    void btnBackOnAction(ActionEvent event) throws IOException {
        AnchorPane anchorPane = FXMLLoader.load(getClass().getResource("/view/homepage.fxml"));

        Scene scene = new Scene(anchorPane);

        Stage stage = (Stage)itemPane.getScene().getWindow();
        stage.setScene(scene);
        stage.setTitle("Home Page");
        stage.centerOnScreen();
    }

    @FXML
    void btnDeleteOnAction(ActionEvent event) {
        String id=txtItemId.getText();

        try {
            boolean isDelete=itemBO.deleteItem(Integer.parseInt(id));

            if(isDelete){
                new Alert(Alert.AlertType.CONFIRMATION,"item deleted").show();
            }
        }catch (Exception e){
            new Alert(Alert.AlertType.ERROR,e.getMessage()).show();
        }


    }

    @FXML
    void btnUpdateOnAction(ActionEvent event) {

        int id= Integer.parseInt(txtItemId.getText());
        String name=txtItemName.getText();
        String price=txtPrice.getText();
        String qty=txtQty.getText();

        ItemDTO dto=new ItemDTO(id,name,price,qty);

        try {
            boolean isUpdated=itemBO.updateItem(dto);

            if(isUpdated){
                new Alert(Alert.AlertType.CONFIRMATION,"item updated").show();
            }
        }catch (Exception e){
            new Alert(Alert.AlertType.ERROR,e.getMessage()).show();
        }
    }

    }


