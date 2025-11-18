public class VerificacaoHistoricoUsuario extends Verificacao {
    @Override
    public boolean verificar(Transacao transacao) {
        if ("suspeito".equals(transacao.getHistoricoUsuario())) {
            System.out.println("Transação barrada: Histórico do usuário suspeito.");
            return false;
        }
        System.out.println("Verificação de histórico do usuário: OK");
        if (proxima != null) {
            return proxima.verificar(transacao);
        }
        return true;
    }
}
