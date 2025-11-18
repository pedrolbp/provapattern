public class ModuloAlertas implements ObservadorSensor {
    @Override
    public void atualizar(double temperatura, double umidade, double poluicao) {
        if (poluicao > 50) {
            System.out.println("Alerta: Níveis de poluição altos!");
        } else {
            System.out.println("Módulo de Alertas: Dados normais.");
        }
    }
}
