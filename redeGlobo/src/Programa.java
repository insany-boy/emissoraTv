import java.util.ArrayList;
import java.util.List;

public class Programa {
    private String nome;
    private String genero;
    private String horario;

    public Programa(String nome, String genero, String horario) {
        this.nome = nome;
        this.genero = genero;
        this.horario = horario;
    }

    public String getNome() { 
        return nome;
    }

    public String getGenero() {
        return genero;
    }
    
    public String getHorario() {
        return horario;
    }

    public void exibirInformacoes() {
        System.out.println("Programa: " + nome);
        System.out.println("Gênero: " + genero);
        System.out.println("Horario: " + horario);
    }

    public void iniciarTransmissao() {
        System.out.println("Iniciando a transmissão do programa: " + nome);
    }

    public void pararTranmissao() {
        System.out.println("Encerrando a transmissão do programa: " + nome);
    }
}
