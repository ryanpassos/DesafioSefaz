package telefone;

import usuario.DadosUsuario;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Ryan Passos
 */
public class NegocioTelefone implements InterfaceTelefone {

  
    @Override
    public void cadastrarTelefone(Telefone t) throws Exception {
        
        if (t == null) {
            throw new Exception("Número do telefone inválido.");
        }
        if (t.getDdd()== 0) {
         throw new Exception("Digite código da região.");  
        }       
        if (t.getNumero()== null) {
            throw new Exception("Digite o telefone.");
        }
        if (t.getNumero().trim().equals("")) { 
            throw new Exception("Favor preencher numero do telefone.");
        }
        if (t.getTipo().trim().equals("")) {
            throw new Exception("Favor preencher tipo.");
        }
        DadosTelefone dados = new DadosTelefone();
        dados.cadastrarTelefone(t);
        JOptionPane.showMessageDialog(null, "Telefone cadastrado com sucesso.");
     }
       

    @Override
    public void atualizarTelefone(Telefone t) throws Exception {

        if (t == null) {
            throw new Exception("Número do telefone inválido.");
        }
        if (t.getDdd()== 0) {
         throw new Exception("Digite código da região.");  
        }       
        if (t.getNumero()== null) {
            throw new Exception("Digite o telefone.");
        }
        if (t.getNumero().trim().equals("")) { 
            throw new Exception("Favor preencher numero do telefone.");
        }
        if (t.getTipo().trim().equals("")) {
            throw new Exception("Favor preencher tipo.");
        }
        DadosTelefone dados = new DadosTelefone();
        dados.cadastrarTelefone(t);
        JOptionPane.showMessageDialog(null, "Telefone atualizado com sucesso.");
    }

    @Override
    public void removerTelefone(Telefone t) throws Exception {
        
        DadosTelefone dados = new DadosTelefone();
        dados.removerTelefone(t);
        JOptionPane.showMessageDialog(null, "Telefone removido com sucesso.");
    }

    @Override
    public ArrayList<Telefone> listarTipo(Telefone filtro) throws Exception {
        
        DadosTelefone dados = new DadosTelefone();
        return dados.listarTipo(filtro);
    
    }
      
  
    }
