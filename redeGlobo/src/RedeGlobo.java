public class RedeGlobo {
    public static void main(String[] args) throws Exception {
        Canal redeGlobo = new Canal("Rede Globo", 11);

        Programa jornalNacional = new Programa("Jornal Nacional", "Noticias", "20:30");
        Novela noveladasNove = new Novela("Amor de Mãe", "Drama", "21:00", "Manuela Dias", 150);
        RealityShow bbb = new RealityShow("Big Brother Brasil", "22:00", "Tiago Leifert");
        Documentario documentario = new Documentario("Planeta Terra", "23:00", "Meio ambiente");

        noveladasNove.adicionarAtor("Regina Casé");
        noveladasNove.adicionarAtor("Adriana Esteves");

        Apresentador apresentador1 = new Apresentador("William Bonner", "Jornal Nacional");
        Jornalista jornalista1 = new Jornalista("Renata Vasconcelos", "Política");

        redeGlobo.adiconarPrograma(jornalNacional);
        redeGlobo.adiconarPrograma(noveladasNove);
        redeGlobo.adiconarPrograma(bbb);
        redeGlobo.adiconarPrograma(documentario);

        redeGlobo.exibirDetalhesCanal();
        System.out.println("------------------------");

        redeGlobo.exibirGrade();

        System.out.println("Funcionários trabalhando:");
        apresentador1.trabalhar();
        jornalista1.trabalhar();
        System.out.println("------------------------");

        System.out.println("Transmissão ao vivo:");
        jornalNacional.iniciarTransmissao();
        jornalNacional.pararTranmissao();
        System.out.println("------------------------");

        System.out.println();
        noveladasNove.iniciarTransmissao();
        noveladasNove.pararTranmissao();
        System.out.println("------------------------");

        bbb.iniciarTransmissao();
        bbb.pararTranmissao();
        System.out.println("------------------------");

        documentario.iniciarTransmissao();
        documentario.pararTranmissao();

    }
}
