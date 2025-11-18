public class ModeloModerado implements CalculoRisco {
    @Override
    public String calcularPerfil(double investimento, double volatilidade) {
        if (volatilidade > 0.3) {
            return "Perfil Moderado: Risco médio, retorno equilibrado.";
        } else {
            return "Perfil Moderado: Baixo risco, retorno moderado.";
        }
    }
}
