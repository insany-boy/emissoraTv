public class Apresentador extends Funcionario {
    private String programaApresentado;
    
    public Apresentador(String nome, String programaApresentado) {
        super(nome, "Apresentador");
        this.programaApresentado = programaApresentado;
    }

    @Override

    public void trabalhar() {
        System.out.println(getNome() + " está apresentando o programa " + programaApresentado + ".");
    }
}