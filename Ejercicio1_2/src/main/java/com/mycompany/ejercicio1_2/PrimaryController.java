package com.mycompany.ejercicio1_2;


import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class PrimaryController {
    @FXML Label lbl;
    @FXML private TextArea txta;
    @FXML private TextArea txta2;
    @FXML Button btn;
    @FXML Button btn2;
    @FXML TextField txt;
    
    
    @FXML
    private void btn_click(){
        int op1;
        int quin=0, dosc=0, cien=0, cinc=0,
        vein=0, diez=0, cinco=0, dos=0, uno=0;
        op1 = Integer.parseInt(txt.getText());
    while(op1 != 0){
       if(op1>=500){
        op1=op1-500;
        quin++;
    } else if(op1>=200){
        op1=op1-200;
        dosc++;
    } else if(op1>=100){
        op1=op1-100;
        cien++;
    } else if(op1>=50){
        op1=op1-50;
        cinc++;
    } else if(op1>=20){
        op1=op1-20;
        vein++;
    } else if(op1>=10){
        op1=op1-10;
        diez++;
    } else if(op1>=5){
        op1=op1-5;
        cinco++;
    } else if(op1>=2){
        op1=op1-2;
        dos++;
    } else{
        op1--;
        uno++;
    }
   }
     txta2.setText(""+quin +"\n"+ dosc+"\n"+ cien+ "\n"+ cinc+
     "\n"+ vein+"\n"+ diez+"\n"+ cinco + "\n"+ dos +"\n"+ uno);
}       
    @FXML
    private void btn_click2(){
        txt.clear();
        txta2.clear();
    }
}
