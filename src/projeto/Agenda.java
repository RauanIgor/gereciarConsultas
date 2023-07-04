package projeto;
import java.util.Collections;
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
    
    public void setQtdVagas() {
        this.qtdVagas -= 1;
    }

    public String getData() {
        return data;
    }

    public ArrayList<Consulta> getConsultas() {
        return consultas;
    }
    
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Data: ").append(data).append("\n");
        sb.append("Quantidade de vagas: ").append(qtdVagas).append("\n");
        sb.append("Consultas:\n");
        if(consultas.isEmpty()) {
        	sb.append("Nenhuma consulta cadastrada!\n");
        }
        else {
        	Collections.sort(consultas);
	        for (Consulta consulta : consultas) {
	            sb.append(consulta.toString()).append("\n");
	        }
        }
        return sb.toString();
    }

}
