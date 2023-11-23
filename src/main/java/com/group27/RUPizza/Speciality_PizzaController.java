package com.group27.RUPizza;

import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class Speciality_PizzaController {

    @FXML
    private ComboBox<String> pizzaComboBox;
    @FXML
    private ImageView pizzaImageView;
    @FXML
    private ToggleGroup sizeToggleGroup;
    @FXML
    private RadioButton sizeSmall, sizeMedium, sizeLarge;
    @FXML
    private ListView<String> toppingsListView;
    @FXML
    private CheckBox extraCheeseCheckBox, extraSauceCheckBox;
    @FXML
    private CheckBox sauceAlfredoCheckBox, sauceTomatoCheckBox;
    @FXML
    private Label totalPriceLabel;
    @FXML
    private Button confirmButton, refreshButton;

    public void initialize() {
        // UI components here
        sizeToggleGroup = new ToggleGroup();
        sizeSmall.setToggleGroup(sizeToggleGroup);
        sizeMedium.setToggleGroup(sizeToggleGroup);
        sizeLarge.setToggleGroup(sizeToggleGroup);

        setupListeners();

        // names of pizza
        pizzaComboBox.getItems().addAll("Deluxe", "Meatzza", "Supreme"); 

        // Set up listeners to update the UI based on user interactions
        setupListeners();
    }

    private void setupListeners() {
        // Listener for pizza selection changes
        pizzaComboBox.getSelectionModel().selectedItemProperty().addListener((obs, oldSelection, newSelection) -> {
            updatePizzaImage(newSelection);
            updateToppingsList(newSelection);
        });

        // Listener for size selection changes
        sizeToggleGroup.selectedToggleProperty().addListener((obs, oldToggle, newToggle) -> updatePrice());

        // toDO
    }


    private void updatePizzaImage(String pizzaName) {
        // Logic to update the pizza image based on selected pizza
        // Image pizzaImage = new Image(getImagePathForPizza(pizzaName));
        // pizzaImageView.setImage(pizzaImage);
    }

    private void updateToppingsList(String pizzaName) {
        // Logic to update the toppings list based on selected pizza
    }

    private void updatePrice() {
        // Logic to calculate and update the price
    }

    @FXML
    private void handleConfirmAction() {
        // Handle confirm action
    }

    @FXML
    private void handleRefreshAction() {
        // Handle refresh action:
    }
