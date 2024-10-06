public class Funcionario {
    private String nome;
    private String funcao;

    public Funcionario(String nome, String funcao) {
        this.nome = nome;
        this.funcao = funcao;
    }

    public String getNome() {
        return nome;
    }

    public String getFuncao() {
        return funcao;
    }

    public void trabalhar() {
        System.out.println(nome + " está trabalhando como " + funcao + ".");
    }
}


