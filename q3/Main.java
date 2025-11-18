public class Main {
    public static void main(String[] args) {
        Sensor sensor = new Sensor();

        ObservadorSensor painel = new PainelControle();
        ObservadorSensor historico = new ModuloHistorico();
        ObservadorSensor alertas = new ModuloAlertas();

        sensor.adicionarObservador(painel);
        sensor.adicionarObservador(historico);
        sensor.adicionarObservador(alertas);

        sensor.atualizarDados(25.5, 60.0, 45.0);
    }
}
