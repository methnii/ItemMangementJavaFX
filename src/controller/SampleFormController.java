package controller;

import javafx.event.ActionEvent;
import javafx.scene.control.TextField;
import model.Item;

import java.util.ArrayList;

public class SampleFormController {


    public TextField txt;
    public TextField txtName;
    public TextField txtQty;
    public TextField txtPrice;
    public TextField txtdescription;

    public void btnAddItemOnAction(ActionEvent actionEvent) {

        ArrayList <Item> itemList = new ArrayList<>();

        String Name = txtName.getText();
        double qty = Double.parseDouble(txtQty.getText()) ;
        double price = Double.parseDouble(txtPrice.getText()) ;
        String description = txtdescription.getText();

        itemList.add(new Item(Name,qty,price,description));
        System.out.println(new Item (Name,qty,price,description));


    }

    public void txtName(ActionEvent actionEvent) {
    }

    public void txtQty(ActionEvent actionEvent) {
    }

    public void txtPrice(ActionEvent actionEvent) {
    }

    public void txtDescription(ActionEvent actionEvent) {
    }
}
