public abstract class RelatorioCreator {
    public abstract Relatorio criarRelatorio();

    public void prepararRelatorio() {
        Relatorio rel = criarRelatorio();
        rel.preparar();
    }
}
