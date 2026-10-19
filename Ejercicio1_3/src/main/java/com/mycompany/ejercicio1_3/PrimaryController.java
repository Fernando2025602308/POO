package com.mycompany.ejercicio1_3;

import java.io.IOException;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class PrimaryController {
    @FXML TextField txt;
    @FXML private TextField txt2;
    @FXML private TextField txt3;
    @FXML private TextField txt4;
    @FXML private TextField txt5;
    @FXML private TextField txt6;
    @FXML private TextField txt7;
    @FXML private TextArea txta;
    @FXML  Button btn;
    @FXML  Button btn2;
    
    @FXML
    private void btn_analizar() {
       int get,get2, acum=0,res, cont=0,par=0,imp=0,mayor=0,menor=9;
       String resul = "";
       get = Integer.parseInt(txt.getText());
      get2 = get;
       while(get !=0){
           res= get % 10;
           if(get %2 == 0){
               par = par + res;
           } else{
               imp = imp + res;
           }
           if(res > mayor ){
               mayor = res;
           } else if (res < menor){
               menor = res;
           }
           acum = acum + res;
           cont++;
           get = get/10;
       }
       for (int i = 1; i <= get2; i++) {
        if (get2 % i == 0) {
        resul = resul + i + "\n";
    }
       }
       txt3.setText(""+imp);
       txt4.setText(""+par);
       txt2.setText(""+cont);
       txt5.setText(""+acum);
       txt6.setText(""+mayor);
       txt7.setText(""+menor);
       txta.setText(""+resul);
       
    }
    @FXML
    private void btn_limpiar() {
        txt.clear();
        txt2.clear();
        txt3.clear();
        txt4.clear();
        txt5.clear();
        txt6.clear();
        txt7.clear();
        txta.clear();
    }
}
