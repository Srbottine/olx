/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package olx;

import javafx.scene.chart.PieChart;

/**
 *
 * @author fabri
 */
public class Chat {
    String texto;
    PieChart.Data data;

    public Chat(String texto, PieChart.Data data) {
        this.texto = texto;
        this.data = data;
    }
    
    String mandaTexto() {
        
    }
    
    void excluirMensagem() {
        
    }
}
