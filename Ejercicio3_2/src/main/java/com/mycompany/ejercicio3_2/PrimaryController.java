package com.mycompany.ejercicio3_2;

import java.io.IOException;
import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ProgressBar;

public class PrimaryController {
    @FXML Label lbl;
    @FXML Label lbl1;
    @FXML Label lbl2;
    @FXML Button btn;
    @FXML ProgressBar liebre;
    @FXML ProgressBar tortuga;
    
    
    @FXML
    private void btn_carrera(){
       btn.setDisable(true);
       Thread tortugah = new Thread(()->{
           for(int i = 1; i <= 100; i++){
               try{
                   Thread.sleep(200);
               } catch (InterruptedException ex){
                   ex.printStackTrace();
               }
               final double tortugaprog = (double) i/100;
               Platform.runLater(()->{
                   tortuga.setProgress(tortugaprog);
           });
           }
       });
       Thread liebreh = new Thread(()->{
           for(int i = 1; i <= 100; i++){
               try{
                   if(i > 30 && i <60){
                   Thread.sleep(1000);
                   } else{
                        Thread.sleep(100);
                   }
               } catch (InterruptedException ex){
                   ex.printStackTrace();
               }
               final double liebreprog = (double) i/100;
               final boolean fina = (i == 100);
               Platform.runLater(()->{
                   liebre.setProgress(liebreprog);
                   if(fina){
               btn.setDisable(false);         
                }
           });
           }
       });
       liebreh.start();
       tortugah.start();
    }
}
