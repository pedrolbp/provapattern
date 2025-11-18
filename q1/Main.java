public class Main {
    public static void main(String[] args) {
        // Teste RelatorioDiario
        Relatorio relatorioDiario = new RelatorioDiario();
        relatorioDiario.preparar();

        // Teste RelatorioSemanal
        Relatorio relatorioSemanal = new RelatorioSemanal();
        relatorioSemanal.preparar();

        // Teste RelatorioSemanalCreator
        RelatorioCreator creatorSemanal = new RelatorioSemanalCreator();
        creatorSemanal.prepararRelatorio();
    }
}
