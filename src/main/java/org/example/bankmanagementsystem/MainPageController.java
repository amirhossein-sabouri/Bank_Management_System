package org.example.bankmanagementsystem;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXListView;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.Tab;
import javafx.scene.control.TextField;

public class MainPageController {

    @FXML
    private TextField AmountDeposit;

    @FXML
    private TextField AmountTransfer;

    @FXML
    private TextField AmountWithdraw;

    @FXML
    private TextField DestNumTransfer;

    @FXML
    private JFXButton DoneDeposit;

    @FXML
    private JFXButton DoneTransfer;

    @FXML
    private JFXButton DoneWithdraw;

    @FXML
    private JFXListView<?> LVtransactions;

    @FXML
    private Label UPaccontNumLBL;

    @FXML
    private Tab depositBTN;

    @FXML
    private JFXButton exitBTN;

    @FXML
    private JFXButton transactionShowBTN;

    @FXML
    private Tab transactionsBTN;

    @FXML
    private Tab transferBTN;

    @FXML
    private Tab withdrawBTN;

}

