/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


public class ModeloConservador implements CalculoRisco {

    public ModeloConservador() {
    }

    @Override
    public String calcularPerfil(double investimento, double volatilidade) {
        if (volatilidade < 0.1) {
            return "Perfil Conservador: Baixo risco, retorno baixo.";
        } else {
            return "Perfil Conservador: Médio risco, retorno baixo.";
        }
    }

}
