public class PainelControle implements ObservadorSensor {
    @Override
    public void atualizar(double temperatura, double umidade, double poluicao) {
        System.out.println("Painel de Controle: Temperatura=" + temperatura + ", Umidade=" + umidade + ", Poluição=" + poluicao);
    }
}
