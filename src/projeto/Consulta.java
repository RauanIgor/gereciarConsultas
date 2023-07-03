package projeto;


public class Consulta implements Comparable<Consulta> {

    private String sintomas;
    Paciente paciente;

    public Consulta(String sitomas, Paciente paciente) {
        this.paciente = paciente;
        this.sintomas = sitomas;
    }

    public String getSintomas() {
        return sintomas;
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
