public abstract class Verificacao {
    protected Verificacao proxima;

    public void setProxima(Verificacao proxima) {
        this.proxima = proxima;
    }

    public abstract boolean verificar(Transacao transacao);
}
