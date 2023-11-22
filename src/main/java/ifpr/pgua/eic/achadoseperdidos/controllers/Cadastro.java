package ifpr.pgua.eic.achadoseperdidos.controllers;


import ifpr.pgua.eic.achadoseperdidos.App;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;

public class Cadastro {

    public Cadastro(Object cadastro) {
    }

    @FXML
        void Cancelar(ActionEvent event) {
            App.popScreen();
        }

    @FXML
    void Confirma(ActionEvent event) {
        String nome = tfNome.getText();
        String contato = tfContato.getText();
        String endereço = tfEndereço.getText();
        String email = tfEmail.getText();
        String senha = tfSenha.getText();
       
        

    }

    @FXML
    private TextField tfContato;
  
    @FXML
    private TextField tfNome;

    @FXML
    private TextField tfEndereço;

    @FXML
    private TextField tfEmail;

    @FXML
    private TextField tfSenha;

}

