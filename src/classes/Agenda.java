/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Rauan
 */
public class Agenda {
    private int qtdVagas;
    private Date data;
    private ArrayList<Consulta>consultas;

    public Agenda(int qtdVagas, Date data) {
        this.qtdVagas = qtdVagas;
        this.data = data;
        consultas = new ArrayList<>();
    }

    public int getQtdVagas() {
        return qtdVagas;
    }

    public Date getData() {
        return data;
    }

    public ArrayList<Consulta> getConsultas() {
        return consultas;
    }
    
    
}
