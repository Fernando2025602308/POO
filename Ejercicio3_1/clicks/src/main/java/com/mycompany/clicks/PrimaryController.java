package com.mycompany.clicks;

import java.io.IOException;
import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ProgressBar;
import javafx.scene.control.TextField;

public class PrimaryController {
    @FXML Label lbl;
     @FXML Label lbl1;
    @FXML private TextField txt;
    @FXML private Button btn;
    @FXML private Button btn1;
    @FXML ProgressBar tiempo;
    
    private int cont = 0;
    @FXML
    private void btn_click() {
       cont++;
     txt.setText(""+cont);
    }
    @FXML
    private void btnEsperar_click(){
        btn1.setDisable(true);
        Thread hilo = new Thread(() ->{
        for(int i = 1; i <= 100 ; i++){
            try{
               Thread.sleep(100);
            }catch (InterruptedException ex){
                ex.printStackTrace();
            }
       final double valorprog = (double) i / 100;
       final boolean termino = (i == 100);
       Platform.runLater(()->{
           tiempo.setProgress(valorprog);
           if(termino){
               btn1.setDisable(false);
           }
       });
    }
    });
    hilo.start();
}
}