/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

import java.text.SimpleDateFormat;
import java.util.ArrayList;

/**
 *
 * @author Rauan
 */
public class Consulta implements Comparable<Consulta> {

    private String cpf;
    private String sintomas;
    private Paciente paciente;
    

    public Consulta(String sitomas,String cpf) {
        this.cpf = cpf;
        this.sintomas = sitomas;
    }

    

    public String getSintomas() {
        return sintomas;
    }


    public String getCpf() {
        return cpf;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    @Override
    public int compareTo(Consulta t) {
        if(this.paciente.getIdade() >= 60 && t.getPaciente().getIdade() < 60){
            return -1;
        }
        else if(this.paciente.getIdade()<60 && t.getPaciente().getIdade()>=60){
            return 1;
        }
        if(this.paciente.isGestante() || t.paciente.isPne()){
            return -1;
            
        }
        return 0;
    }
}
