package com.example.bank_management;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.io.IOException;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class HelloController {

    @FXML
    private TextField txtWithBalance;
    @FXML
    private Button btnWithdraw;

    @FXML
    private TextField txtBalLeft;

    @FXML
    private TextField txtWithAmm;


    @FXML
    private Button btnDepoBack;
    @FXML
    private TextField btnAccount;

    @FXML
    private Button btnBackAgain;

    @FXML
    private Button btnDepo;

    @FXML
    private Button btnEdit;

    @FXML
    private Button btnProfile;

    @FXML
    private Button btnSave;

    @FXML
    private TextField btnTime;

    @FXML
    private Button btnWith;

    @FXML
    private TextField txtAccNum;

    @FXML
    private TextField txtNewEmail;

    @FXML
    private TextField txtnewAddress;

    @FXML
    private TextField txtnewContact;

    @FXML
    private TextField txtnewDOB;

    @FXML
    private TextField txtnewName;

    @FXML
    private TextField txtnewUser;


    @FXML
    private Button btnBack;

    @FXML
    private Button btnSubmit;

    @FXML
    private Text rdGender;

    @FXML
    private TextField txtAddress;

    @FXML
    private TextField txtContact;

    @FXML
    private TextField txtDOB;

    @FXML
    private TextField txtEmail;

    @FXML
    private PasswordField txtPass;

    @FXML
    private TextField txtUser;

    @FXML
    private TextField txtfisrtname;

    @FXML
    private TextField txtmiddlename;

    @FXML
    private TextField txtsurname;
    @FXML
    private Button btnCreate;

    @FXML
    private Button btnSignIn;

    @FXML
    private Label lblDisplay;

    @FXML
    private TextField txtPassword;

    @FXML
    private TextField txtUserName;
    @FXML
    private Button btnDeposit;

    @FXML
    private Button btnSearch;

    @FXML
    private TextField txtAmount;

    @FXML
    private TextField txtBalance;

    @FXML
    private TextField txtDepoAcc;

    @FXML
    private TextField txtDepoName;

    @FXML
    private TextField txtDepoUser;

    @FXML
    private Button btnWithSearch;

    @FXML
    void onWithSearch(ActionEvent event) {
        txtDepoAcc.setText("20948746");
        txtDepoUser.setText("Albert");
        txtDepoName.setText("Albert Essilfie");

        double withbalance=200.00;
        txtWithBalance.setText(String.valueOf(withbalance));


    }



    @FXML
    void onWith(ActionEvent event) {

         String amountWith=txtWithAmm.getText();
        int intAmountWith = Integer.parseInt(amountWith);



        double withbalance=200.00;
        txtWithBalance.equals(withbalance);
        txtWithBalance.setText(String.valueOf(withbalance));

        double Cal2=withbalance-intAmountWith;
        txtBalLeft.setText(String.valueOf(Cal2));


    }

    @FXML
    void onDepoBack(ActionEvent event) throws IOException {
        btnDepoBack.getScene().getWindow().hide();


        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("mainApp.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 600, 400);
        Stage stage=new Stage();
        stage.setTitle("Access Bank Mobile");
        stage.setScene(scene);
        stage.setResizable(false);
        stage.show();

    }


    @FXML
    void onDeposit(ActionEvent event) {
        String ammEntered=txtAmount.getText();
        int intAmount = Integer.parseInt(ammEntered);

        double balance=0.00;
        txtBalance.equals(balance);

        double cal=balance+intAmount;
        txtBalance.setText(String.valueOf(cal));

        txtAmount.setText("");

    }

    @FXML
   public void onSearch(ActionEvent event) {
        txtDepoAcc.setText("20948746");
        txtDepoUser.setText("Albert");
        txtDepoName.setText("Albert Essilfie");

        double balance=0.00;
        txtBalance.setText(String.valueOf(balance));




    }


    @FXML
    void onBackAgain(ActionEvent event) throws IOException {
        btnBackAgain.getScene().getWindow().hide();

        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("landing_Page.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 600, 377);
        Stage stage=new Stage();
        stage.setTitle("Access Bank Mobile");
        stage.setScene(scene);
        stage.setResizable(false);
        stage.show();
    }

    @FXML
    void onDepo(ActionEvent event) throws IOException {



        btnDepo.getScene().getWindow().hide();

        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("Deposit.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 401, 353);
        Stage stage=new Stage();
        stage.setTitle("Access Bank Mobile");
        stage.setScene(scene);
        stage.setResizable(false);
        stage.show();



    }

    @FXML
    void onEdit(ActionEvent event) {
        txtnewAddress.setText("");
        txtnewContact.setText("");
        txtnewDOB.setText("");
        txtNewEmail.setText("");
        txtnewUser.setText("");
        txtnewName.setText("");

    }



    @FXML
    void onSave(ActionEvent event) {

    }

    @FXML
    void onWithdraw(ActionEvent event) throws IOException {

        btnWithdraw.getScene().getWindow().hide();

        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("Withdraw.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 408, 367);
        Stage stage=new Stage();
        stage.setTitle("Withdraw");
        stage.setScene(scene);
        stage.setResizable(false);
        stage.show();

    }

    @FXML
    void onBack(ActionEvent event) throws IOException {
        btnBack.getScene().getWindow().hide();

        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("landing_Page.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 600, 377);
        Stage stage=new Stage();
        stage.setTitle("Access Bank Mobile");
        stage.setScene(scene);
        stage.setResizable(false);
        stage.show();
    }

    @FXML
    public void onSubmit(ActionEvent event) throws IOException {

        String name=txtfisrtname.getText();
        String name2=txtmiddlename.getText();
        String name3=txtsurname.getText();
        String age=txtDOB.getText();
        String phone=txtContact.getText();
        String mail=txtEmail.getText();
        String pass=txtPass.getText();
        String userName=txtUser.getText();
        String address=txtAddress.getText();



        btnSubmit.getScene().getWindow().hide();
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("landing_Page.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 600, 377);
        Stage stage=new Stage();
        stage.setTitle("Access Bank Mobile");
        stage.setScene(scene);
        stage.setResizable(false);
        stage.show();

    }
    @FXML
    private void onProfile(ActionEvent event) {
        String name=txtfisrtname.getText();


        LocalTime day=LocalTime.now();
        System.out.println(day);
        btnAccount.setText("20948746");
        txtAccNum.setText("20948746");
        btnTime.setText(String.valueOf(day));

        txtnewName.setText(name);


    }


    @FXML
    void onbtnCreate(ActionEvent event) throws IOException {

        btnSignIn.getScene().getWindow().hide();

        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("newAccount.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 644, 400);
        Stage stage=new Stage();
        stage.setTitle("Access Bank Mobile");
        stage.setScene(scene);
        stage.setResizable(false);
        stage.show();

    }

    @FXML
    void onbtnSignIn(ActionEvent event) throws IOException {
        String name="admin";
        String pass="1234";


        String actualName=txtUserName.getText();
        String actualPass=txtPassword.getText();


        if (actualName.equals(name)&&actualPass.equals(pass)){
            txtUserName.setText("");
            txtPassword.setText("");

            lblDisplay.setText("Login successful");
            lblDisplay.setTextFill(Color.GREEN);

            btnSignIn.getScene().getWindow().hide();


            FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("mainApp.fxml"));
            Scene scene = new Scene(fxmlLoader.load(), 600, 400);
            Stage stage=new Stage();
            stage.setTitle("Access Bank Mobile");
            stage.setScene(scene);
            stage.setResizable(false);
            stage.show();



        }
        else {
            txtUserName.setText("");
            txtPassword.setText("");

            lblDisplay.setText("Login unsuccessful");
            lblDisplay.setTextFill(Color.RED);
        }

    }


}