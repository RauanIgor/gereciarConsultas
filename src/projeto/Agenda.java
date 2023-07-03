package projeto;

import java.util.ArrayList;


public class Agenda {
	private int qtdVagas;
    private String data;
    private ArrayList<Consulta>consultas;

    public Agenda(int qtdVagas, String data) {
        this.qtdVagas = qtdVagas;
        this.data = data;
        consultas = new ArrayList<>();
    }

    public int getQtdVagas() {
        return qtdVagas;
    }

    public String getData() {
        return data;
    }

    public ArrayList<Consulta> getConsultas() {
        return consultas;
    }

}
