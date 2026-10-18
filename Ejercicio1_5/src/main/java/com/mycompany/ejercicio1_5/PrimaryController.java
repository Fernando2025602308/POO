package com.mycompany.ejercicio1_5;

import java.io.IOException;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class PrimaryController {
    @FXML Label lbl;
    @FXML Label lbl2;
    @FXML Label lbl3;
    @FXML Label lbl4;
    @FXML Label lbl5;
    @FXML Label lbl6;
    @FXML Label lbl7;
    @FXML Label lbl8;
    @FXML TextField txt;
    @FXML TextField txt2;
    @FXML TextField txt3;
    @FXML TextField txt4;
    @FXML TextField txt5;
    @FXML TextField txt6;
    @FXML TextField txt7;
    @FXML Button btn;
    @FXML Button btn2;
    
    @FXML
    private void btn_calcular(){
       int al,re,tr,te,ot, total = 0;
        al = Integer.parseInt(txt.getText());
        re = Integer.parseInt(txt2.getText());
        tr = Integer.parseInt(txt3.getText());
        te = Integer.parseInt(txt4.getText());
        ot = Integer.parseInt(txt5.getText());
        
        total = al+re+tr+te+ot;
        txt6.setText(""+total);
        if(al > re && al > tr && al > te && al > ot ){
            txt7.setText("Alimentacion");
        } else if(re > al && re > tr && re > te && re > ot ){
            txt7.setText("Refigerios");
        } else if(tr > al && tr > re && tr > te && tr > ot ){
            txt7.setText("Transporte");
        } else if(te > al && te > re && te > tr && te > ot ){
            txt7.setText("Telefonia");
        } else{
            txt7.setText("Otros");
        }
        
    }
    @FXML
    private void btn_limpiar(){
     txt.clear();
     txt2.clear();
     txt3.clear();
     txt4.clear();
     txt5.clear();
     txt6.clear();
     txt7.clear();
    }
}
