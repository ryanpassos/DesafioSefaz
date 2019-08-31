package desafiosefaz;

import conexao.Dados;
import javax.swing.JOptionPane;

/**
 *
 * @author Ryan Passos
 */
public class DesafioSefaz {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         try {
            // TODO code application logic here
            Dados d = new Dados() {};
            //d.conectar();
            d.desconectar();
            JOptionPane.showMessageDialog(null, "Conectou");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }
    
}
