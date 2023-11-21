package com.group27.RUPizza;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.StackPane;

public class MainController {

    @FXML
    private ImageView imgSpecialty, imgCurrentOrder, imgCustom, imgStoreOrders;

    BorderPane paneOriginal;

    @FXML
    private StackPane contentArea;

    @FXML
    private Button btnSpecialty, btnCustom, btnCurrentOrder, btnStoreOrders;

    @FXML
    public void initialize() {
        Image specialtyImage = new Image("/pictures/SpecialityPizza.png"); // Adjust path
        imgSpecialty.setImage(specialtyImage);

        Image customImage = new Image("/pictures/CustomPizza.png"); // Adjust path and filename
        imgCustom.setImage(customImage);

        Image currentOrderImg = new Image("/pictures/CurrentOrders.png"); // Adjust path and filename
        imgCurrentOrder.setImage(currentOrderImg);

        Image storeOrderImg = new Image("/pictures/StoreOrders.png"); // Adjust path and filename
        imgStoreOrders.setImage(storeOrderImg);

    }

    // Add methods to handle events like button clicks
    // Example:
    @FXML
    private void handleOrderSpecialty() {
        // Handle 'Order Specialty Pizzas' button click
    }

    // Other methods...
}
