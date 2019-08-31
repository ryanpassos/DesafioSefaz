package usuario;

import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Ryan Passos
 */
public class NegocioUsuario implements InterfaceUsuario {
    
    @Override
    public void cadastrarUsuario(Usuario u) throws Exception {
     
     if (u == null) {
         throw new Exception("Crie um Usuário Válido.");
     } 
     if (u.getLogin().trim().equals("")) { 
         throw new Exception("Favor preencher o campo de login.");
     }
     if (u.getLogin()== null) {
            throw new Exception("Digite um Login.");
     }
     if (u.getLogin().trim().equals("") == true){
        throw new Exception("Digite um Login.");
     }
     if (u.getLogin().trim().length() < 6) {
         throw new Exception("Seu login precisa de no minimo 6 caracteres.");
     }
     if (u.getNome().trim().equals("")) { 
         throw new Exception("Favor preencher o campo de nome.");
     }
     if (u.getSenha()== null) {
         throw new Exception("Digite uma senha.");  
     }
     if (u.getSenha().trim().length() < 6) {
         throw new Exception("Senha muito fraca! A senha deve possuir mais que 6 caracteres e ao menos 1 número e 1 letra");
     } 
     if (u.getSenha().trim().equals("")) { 
         throw new Exception("Favor preencher o campo de senha.");
     }
     if (u.getEmail()== null) {
            throw new Exception("Digite um Email.");
     }
     if (u.getEmail().trim().equals("")) { 
         throw new Exception("Favor preencher o campo de email.");
     }
     if (u.getDdd()== 0){
         throw new Exception("Favor preencher o seu Codigo da Região (ddd).");
     }
     if (u.getNumero().trim().equals("")) {
         throw new Exception("Por favor, preencha o campo Telefone.");
     }
     if (u.getTipo()== null){
         throw new Exception ("Por favor, escolhar o tipo do Telefone.");
     }
        DadosUsuario dados = new DadosUsuario();
        dados.cadastrarUsuario(u);
        JOptionPane.showMessageDialog(null, "Usuário cadastrado com sucesso.");
    
    }
        
      @Override
    public void atualizarUsuario(Usuario u) throws Exception {
         
          if (u.getNome().trim().equals("")) {
            throw new Exception("Por favor, preencha o campo nome.");
        }
          if (u.getLogin().trim().equals("")) {
            throw new Exception("Por favor, preencha o campo login.");
        }
          if (u.getEmail().trim().equals("")) {
            throw new Exception("Por favor, preencha o campo email.");
        }
          if (u.getNumero().trim().equals("")) {
            throw new Exception("Por favor, preencha o campo numero.");
        }
          if (u.getSenha().trim().length() < 6) {
         throw new Exception("Senha muito fraca, deve possuir no mínimo 6 caracteres.");
        } 
        DadosUsuario dados = new DadosUsuario();
        dados.atualizarUsuario(u);
        JOptionPane.showMessageDialog(null, "Usuário atualizado com sucesso.");
    }

    @Override
    public void removerUsuario(Usuario u) throws SQLException, Exception {
     
         if (u.getLogin().trim().equals("") ) {
            throw new Exception("Usuário não encontrado.");
        }
         if (u.getLogin()== null) {
            throw new Exception("Por favor, preencha o campo login.");
        } 
        DadosUsuario dados = new DadosUsuario();
        dados.removerUsuario(u);
        JOptionPane.showMessageDialog(null, "Usuário removido com sucesso.");
    }    
    
    @Override
    public void fazerLogin(Usuario u) throws SQLException, Exception {
        
        if (u.getLogin().trim().equals("") ) {
            throw new Exception("Usuário não encontrado.");
        }
         if (u.getLogin()== null) {
            throw new Exception("Por favor, preencha o campo login.");
        } 
         if (u.getLogin().trim().length() < 6) {
         throw new Exception("Seu login precisa de no minimo 6 caracteres.");
        }
         if (u.getSenha().trim().equals("") ) {
            throw new Exception("Por favor, preencha o campo senha.");
        }
         if (u.getSenha()== null) {
            throw new Exception("Por favor, preencha o campo senha.");
        } 
         if (u.getSenha().trim().length() < 6) {
         throw new Exception("Senha muito fraca, deve possuir no mínimo 6 caracteres.");
        }
        DadosUsuario dados = new DadosUsuario();
        dados.fazerLogin(u);
        JOptionPane.showMessageDialog(null, "Seja Bem Vindo.");
    }
  
    
    @Override
    public ArrayList<Usuario> listarUsuario(Usuario filtro) throws Exception {
        
        Usuario u = new Usuario();
        if (u.getLogin()== null) {
            throw new Exception("Usuario não encontrado.");
        }

        if (u.getLogin().equals("")) {
            throw new Exception("Usuario não encontrado.");
        }
        
        if (u.getNome()== null) {
            throw new Exception("Usuario não encontrado.");
        }

        if (u.getNome().equals("")) {
            throw new Exception("Usuario não encontrado.");
        }
           
        DadosUsuario dados = new DadosUsuario();
        return dados.listarUsuario(filtro);
    }
    
}
