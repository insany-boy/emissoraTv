public class Documentario extends Programa {
    private String tema;

    public Documentario(String nome, String horario, String tema) {
        super(nome, "Documentario", horario);
        this.tema = tema;
    }

    @Override
    public void exibirInformacoes() {
        System.out.println("Documentário: " + getNome());
        System.out.println("Tema: " + tema);
        System.out.println("Horário: " + getHorario());
    }
}
