package entities;

import javax.swing.JOptionPane;

/**
 *
 * @author 1072511349
 */
public class CarroPasseio extends Veiculo {
    private String cor;
    private String modelo;

    public CarroPasseio() {
    }

    public CarroPasseio(String cor, String modelo, int peso, int velocmax, double preco) {
        super(peso, velocmax, preco);
        this.cor = cor;
        this.modelo = modelo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    
    public void leitura(){
        super.leitura();
        setCor(JOptionPane.showInputDialog("Digite a cor: "));
        setModelo(JOptionPane.showInputDialog("Digite o modelo: "));
    }
    public String toString(){
        return super.toString() + "\n Cor: " + getCor() + "\n Modelo: " + getModelo();
    }
    public void imprimir(){
       super.imprimir();
    }
}
