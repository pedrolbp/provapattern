public class ModeloAgressivo implements CalculoRisco {
    @Override
    public String calcularPerfil(double investimento, double volatilidade) {
        if (volatilidade > 0.5) {
            return "Perfil Agressivo: Alto risco, alto retorno potencial.";
        } else {
            return "Perfil Agressivo: Médio risco, retorno alto.";
        }
    }
}
