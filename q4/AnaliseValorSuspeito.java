public class AnaliseValorSuspeito extends Verificacao {
    @Override
    public boolean verificar(Transacao transacao) {
        if (transacao.getValor() > 10000) {
            System.out.println("Transação barrada: Valor suspeito.");
            return false;
        }
        System.out.println("Análise de valor suspeito: OK");
        if (proxima != null) {
            return proxima.verificar(transacao);
        }
        return true;
    }
}
