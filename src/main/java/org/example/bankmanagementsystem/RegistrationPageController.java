package org.example.bankmanagementsystem;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXRadioButton;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class RegistrationPageController {

    @FXML
    private JFXButton Done;

    @FXML
    private DatePicker birthDate;

    @FXML
    private ComboBox<?> country;

    @FXML
    private TextField fatherName;

    @FXML
    private JFXRadioButton female;

    @FXML
    private TextField firstName;

    @FXML
    private TextField id;

    @FXML
    private TextField initial;

    @FXML
    private TextField lastName;

    @FXML
    private JFXRadioButton male;

    @FXML
    private PasswordField password;

    @FXML
    private TextField phoneNum;

    @FXML
    private JFXButton verify;

}
