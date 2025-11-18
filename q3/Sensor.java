import java.util.ArrayList;
import java.util.List;

public class Sensor {
    private List<ObservadorSensor> observadores = new ArrayList<>();
    private double temperatura;
    private double umidade;
    private double poluicao;

    public void adicionarObservador(ObservadorSensor obs) {
        observadores.add(obs);
    }

    public void removerObservador(ObservadorSensor obs) {
        observadores.remove(obs);
    }

    public void notificarObservadores() {
        for (ObservadorSensor obs : observadores) {
            obs.atualizar(temperatura, umidade, poluicao);
        }
    }

    public void atualizarDados(double temp, double umid, double pol) {
        this.temperatura = temp;
        this.umidade = umid;
        this.poluicao = pol;
        notificarObservadores();
    }
}
