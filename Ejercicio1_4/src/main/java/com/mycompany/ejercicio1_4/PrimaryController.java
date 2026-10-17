package com.mycompany.ejercicio1_4;

import java.io.IOException;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class PrimaryController {
    @FXML Label lbl;
    @FXML TextField txt;
    @FXML Button btn;
    @FXML Button btn2;
    @FXML private TextArea txta;
    
    
    @FXML
    private void btn_calcular() {
    int get, mult;
    String res = "";
    get = Integer.parseInt(txt.getText()); 
        for(int i = 1; i<11; i++){
            mult = i * get;
            res=res+""+get+"X"+i+"="+mult+"\n";
        }
      txta.setText(res);
    }
    @FXML
    private void btn_limpiar(){
     txt.clear();
     txta.clear();
    }
}
