public class AnaliseGeolocalizacao extends Verificacao {
    @Override
    public boolean verificar(Transacao transacao) {
        if (!"Brasil".equals(transacao.getGeolocalizacao())) {
            System.out.println("Transação barrada: Geolocalização suspeita.");
            return false;
        }
        System.out.println("Análise de geolocalização: OK");
        if (proxima != null) {
            return proxima.verificar(transacao);
        }
        return true;
    }
}
