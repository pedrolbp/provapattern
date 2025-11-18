public class Transacao {
    private double valor;
    private String geolocalizacao;
    private String historicoUsuario;
    private String dispositivo;

    public Transacao(double valor, String geolocalizacao, String historicoUsuario, String dispositivo) {
        this.valor = valor;
        this.geolocalizacao = geolocalizacao;
        this.historicoUsuario = historicoUsuario;
        this.dispositivo = dispositivo;
    }

    public double getValor() {
        return valor;
    }

    public String getGeolocalizacao() {
        return geolocalizacao;
    }

    public String getHistoricoUsuario() {
        return historicoUsuario;
    }

    public String getDispositivo() {
        return dispositivo;
    }
}
