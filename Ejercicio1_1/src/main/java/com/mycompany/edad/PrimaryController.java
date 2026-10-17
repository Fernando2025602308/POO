package com.mycompany.edad;

import java.io.IOException;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class PrimaryController {

    @FXML TextField txt1;
    @FXML TextField txt2;
    @FXML Label lbl1;
    @FXML Label lbl2;
    @FXML Label lbl3;
    
    @FXML
    private void btn_calcular() {
        int op1, anio,mes,op2;
        String sum = "";
            op1 = Integer.parseInt(txt1.getText().replace("/",""));
            anio = (20261231 - op1)/10000;
            mes = (20261231 - op1)/1000;
            for(int i = 0; i<2; i++){
                op2 = mes % 10;
                sum = sum + op2;
            }
            txt2.setText("Tienes "+ anio +" años con " + sum + " meses");
    }
    @FXML
    private void btn_limpiar(){
        txt1.clear();
        txt2.clear();
    }
}
