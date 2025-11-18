public class Main {
    public static void main(String[] args) {
        Verificacao analiseValor = new AnaliseValorSuspeito();
        Verificacao analiseGeo = new AnaliseGeolocalizacao();
        Verificacao verificacaoHistorico = new VerificacaoHistoricoUsuario();
        Verificacao verificacaoDispositivo = new VerificacaoDispositivo();

        analiseValor.setProxima(analiseGeo);
        analiseGeo.setProxima(verificacaoHistorico);
        verificacaoHistorico.setProxima(verificacaoDispositivo);

        Transacao transacao1 = new Transacao(5000, "Brasil", "bom", "conhecido");
        boolean aprovada1 = analiseValor.verificar(transacao1);
        System.out.println("Transação 1 aprovada: " + aprovada1);

        Transacao transacao2 = new Transacao(15000, "Brasil", "bom", "conhecido");
        boolean aprovada2 = analiseValor.verificar(transacao2);
        System.out.println("Transação 2 aprovada: " + aprovada2);
    }
}
