package entities;

import javax.swing.JOptionPane;

/**
 *
 * @author 1072511349
 */
public class Caminhao extends Veiculo {
    private double cargamax;
    private int alturamax;
    private int comprimento;

    public Caminhao() {
    }

    public Caminhao(double cargamax, int alturamax, int comprimento, int peso, int velocmax, double preco) {
        super(peso, velocmax, preco);
        this.cargamax = cargamax;
        this.alturamax = alturamax;
        this.comprimento = comprimento;
    }

    public double getCargamax() {
        return cargamax;
    }

    public void setCargamax(double cargamax) {
        this.cargamax = cargamax;
    }
    public void setCargamax(String cargamax) {
        this.cargamax = Double.parseDouble(cargamax);
    }

    public int getAlturamax() {
        return alturamax;
    }

    public void setAlturamax(int alturamax) {
        this.alturamax = alturamax;
    }
    public void setAlturamax(String alturamax) {
        this.alturamax = Integer.parseInt(alturamax);
    }

    public int getComprimento() {
        return comprimento;
    }

    public void setComprimento(int comprimento) {
        this.comprimento = comprimento;
    }
    public void setComprimento(String comprimento) {
        this.comprimento = Integer.parseInt(comprimento);
    }
    public void leitura(){
        super.leitura();
        setCargamax(JOptionPane.showInputDialog("Digite a carga máxima: "));
        setAlturamax(JOptionPane.showInputDialog("Digite a altura máxima: "));
        setComprimento(JOptionPane.showInputDialog("Digite o comprimento: "));
    }
    public String toString(){
        return super.toString() + "\n Carga máxima: " + getCargamax() + "\n Altura máxima: " + getAlturamax();
    }
    public void imprimir(){
       super.imprimir();
    }

    
}
