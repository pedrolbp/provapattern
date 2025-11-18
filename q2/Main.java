public class Main {
    public static void main(String[] args) {
        AnalisadorRisco analisador = new AnalisadorRisco();

        // Teste Modelo Agressivo
        analisador.setEstrategia(new ModeloAgressivo());
        System.out.println(analisador.analisar(10000, 0.6));

        // Teste Modelo Moderado
        analisador.setEstrategia(new ModeloModerado());
        System.out.println(analisador.analisar(10000, 0.4));

        // Teste Modelo Conservador
        analisador.setEstrategia(new ModeloConservador());
        System.out.println(analisador.analisar(10000, 0.05));
    }
}
