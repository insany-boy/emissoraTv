import java.util.ArrayList;
import java.util.List;

public class Novela extends Programa{
    private String autor;
    private int numeroCapitulos;
    private List<String> elenco;

    public Novela(String nome, String genero, String horario, String autor, int numeroCapitulos) {
        super(nome, genero, horario);
        this.autor = autor;
        this.numeroCapitulos = numeroCapitulos;
        this.elenco = new ArrayList<>();
    }
    
    public String getAutor() {
        return autor;
    }

    public int getNumeroCapitulos() {
        return numeroCapitulos;
    }
    
    public void adicionarAtor(String ator) {
        elenco.add(ator);
    }

    public void exibirElenco() {
        System.out.println("Elenco da novela " + getNome() + ":");
        for (String ator : elenco) {
            System.out.println("- " + ator);
        }
    }

    @Override
    public void exibirInformacoes() {
        System.out.println("Novela: " + getNome());
        System.out.println("Gênero: " + getGenero());
        System.out.println("Horário: " + getHorario());
        System.out.println("Autor: " + autor);
        System.out.println("Número de capítulos: " + numeroCapitulos);
        exibirElenco();
    }
}
