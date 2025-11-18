public class ModuloHistorico implements ObservadorSensor {
    @Override
    public void atualizar(double temperatura, double umidade, double poluicao) {
        System.out.println("Registro Histórico: Dados salvos - Temp: " + temperatura + ", Umid: " + umidade + ", Pol: " + poluicao);
    }
}
