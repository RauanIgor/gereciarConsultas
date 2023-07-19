/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

import java.util.Date;

/**
 *
 * @author Rauan
 */
public class Prontuario {
    private Date dataCriacao;
    private String sintomas;
    private int diagnostico;
    private String intervencao;

    public Prontuario(Date dataCriacao, String sintomas, int diagnostico, String intervencao) {
        this.dataCriacao = dataCriacao;
        this.sintomas = sintomas;
        this.diagnostico = diagnostico;
        this.intervencao = intervencao;
    }
    
}
