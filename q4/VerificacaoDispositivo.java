public class VerificacaoDispositivo extends Verificacao {
    @Override
    public boolean verificar(Transacao transacao) {
        if ("incomum".equals(transacao.getDispositivo())) {
            System.out.println("Transação barrada: Dispositivo incomum.");
            return false;
        }
        System.out.println("Detecção de dispositivo: OK");
        if (proxima != null) {
            return proxima.verificar(transacao);
        }
        return true;
    }
}
