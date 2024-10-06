import java.util.ArrayList;
import java.util.List;

public class Canal {
    private String nome;
    private int numero;
    private List<Programa> gradeDeProgramacao;

    public Canal(String nome, int numero){
        this.nome = nome;
        this.numero = numero;
        this.gradeDeProgramacao = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public int getNumero() {
        return numero;
    }

    public void adiconarPrograma(Programa programa) {
        gradeDeProgramacao.add(programa);
    }

    public void exibirGrade() {
        System.out.println("Grade de Programação do Canal " + nome + ":");
        for (Programa programa : gradeDeProgramacao) {
            programa.exibirInformacoes();
            System.out.println("-------------------------");
        }
    }

        public void exibirDetalhesCanal() {
            System.out.println("Canal: " + nome + " - Número: " + numero);
        }
    }
