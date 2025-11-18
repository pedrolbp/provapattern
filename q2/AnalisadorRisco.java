public class AnalisadorRisco {
    private CalculoRisco estrategia;

    public void setEstrategia(CalculoRisco estrategia) {
        this.estrategia = estrategia;
    }

    public String analisar(double investimento, double volatilidade) {
        return estrategia.calcularPerfil(investimento, volatilidade);
    }
}
