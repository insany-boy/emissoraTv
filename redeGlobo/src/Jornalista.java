public class Jornalista extends Funcionario {
    private String area;

    public Jornalista(String nome, String area) {
        super(nome, "Jornalista");
        this.area = area;
    }

    @Override
    public void trabalhar() {
        System.out.println(getNome() + " está cobrindo noticias ná área de " + area + ".");
    }
}
