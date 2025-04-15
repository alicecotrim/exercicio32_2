package entities;
import javax.swing.JOptionPane;
/**
 *
 * @author 1072511349
 */
public class Veiculo {
    private int peso;
    private int velocmax;
    private double preco;

    public Veiculo() {
    }

    public Veiculo(int peso, int velocmax, double preco) {
        this.peso = peso;
        this.velocmax = velocmax;
        this.preco = preco;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }
    public void setPeso(String peso) {
        this.peso = Integer.parseInt(peso);
    }

    public int getVelocmax() {
        return velocmax;
    }

    public void setVelocmax(int velocmax) {
        this.velocmax = velocmax;
    }
    public void setVelocmax(String velocmax) {
        this.velocmax = Integer.parseInt(velocmax);
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
    public void setPreco(String preco) {
        this.preco = Double.parseDouble(preco);
    }
    public void leitura(){
        setPeso(JOptionPane.showInputDialog("Digite o peso: "));
        setVelocmax(JOptionPane.showInputDialog("Digite a velocidade: "));
        setPreco(JOptionPane.showInputDialog("Digite o preço: "));
    }
    public String toString(){
        return "Peso: " + getPeso() + " kg" +
                "\n Velocidade máxima: " + getVelocmax() + " km/l" +
                "\n Preço: $ " + getPreco();
    }
    public void imprimir(){
        JOptionPane.showMessageDialog(null, toString());
    }
}
