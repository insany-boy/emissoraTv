public class RealityShow extends Programa {
    private String apresentador;

    public RealityShow(String nome, String horario, String apresentador) {
        super(nome, "Reality Show", horario);
        this.apresentador = apresentador;
    }

    @Override
    public void exibirInformacoes() {
        System.out.println("Reality Show: " + getNome());
        System.out.println("Horário: " + getHorario());
        System.out.println("Apresentador: " + apresentador);
    }
}
