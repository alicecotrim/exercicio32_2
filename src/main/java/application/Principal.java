package application;
import entities.CarroPasseio;
import entities.Caminhao;
import javax.swing.JOptionPane;
/**
 *
 * @author 1072511349
 */
public class Principal {

    public static void main(String[] args) {
        int resposta;
        
        do {
            resposta = Integer.parseInt(JOptionPane.showInputDialog("Selecione o tipo de veículo:"
                + "\nCarro: digite 1"
                + "\nCaminhão: digite 2"
                + "\nDigite outra tecla pra sair."));
            
            if (resposta == 1){
            CarroPasseio ve1 = new CarroPasseio();
            ve1.leitura();
            ve1.imprimir();
            } 
            else if (resposta ==2){
            Caminhao ve2 = new Caminhao();
            ve2.leitura();
            ve2.imprimir();
            }
        } while (resposta == 1 || resposta ==2);
    }
}
