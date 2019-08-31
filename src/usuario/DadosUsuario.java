package usuario;

import conexao.Dados;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Ryan Passos
 */
public class DadosUsuario extends Dados implements InterfaceUsuario {

    @Override
    public void cadastrarUsuario(Usuario u) throws Exception {

        conectar();

        String sql = "INSERT INTO Usuario (login, nome, email, senha) ";
        sql += "VALUES (?,?,?,?);";

        try {
            PreparedStatement cmd = conn.prepareStatement(sql);
            cmd.setString(1, u.getLogin());
            cmd.setString(2, u.getNome());
            cmd.setString(3, u.getEmail());
            cmd.setString(4, u.getSenha());
            cmd.execute();

        } catch (SQLException erro) {
            throw new Exception("Problemas ao executar o cadastro!" + erro.getMessage());
        }

        desconectar();
    }
    @Override
    public void atualizarUsuario(Usuario u) throws Exception {

        conectar();
        String sql = "UPDATE Usuario SET login = ?, nome = ? WHERE senha = ?";

        try {
            PreparedStatement cmd = conn.prepareStatement(sql);
            cmd.setString(1, u.getLogin());
            cmd.setString(2, u.getNome());
            cmd.setString(3, u.getSenha());
            cmd.execute();
        } catch (SQLException erro) {

            throw new Exception("Problemas ao executar a atualização!" + erro.getMessage());
        }

        desconectar();
    }

    @Override
    public void removerUsuario(Usuario u) throws Exception {
        conectar();
        String Sql = "DELETE FROM Usuario WHERE login = ?; ";
        try {
            PreparedStatement Cmd = conn.prepareStatement(Sql);
            Cmd.setString(1, u.getLogin());
            Cmd.execute();
        } catch (SQLException e) {
            throw new Exception("Problemas ao apagar o Usuario: " + e.getMessage());
        }
        desconectar();
    }
    
    @Override
    public void fazerLogin(Usuario u) throws Exception {
        conectar();
        String Sql = "SELECT FROM Usuario WHERE login = ?; ";
        try {
            PreparedStatement Cmd = conn.prepareStatement(Sql);
            Cmd.setString(1, u.getLogin());
            Cmd.execute();
        } catch (SQLException e) {
            throw new Exception("Problemas com o login." + e.getMessage());
        }
        desconectar();
   }
        
    

    @Override
    public ArrayList<Usuario> listarUsuario(Usuario filtro) throws Exception {
        int posPar = 1;
        ArrayList<Usuario> retorno = new ArrayList<>();
        //abrindo a conexÃ£o
        conectar();

        String sql = " SELECT * from usuario ORDER BY nome ASC";
            sql += "  FROM Usuario WHERE login IS NOT NULL ";
        if (filtro.getLogin() != null && filtro.getLogin().equals("") == false) {
            sql += "AND login = ? ";
        }
        if (filtro.getNome() != null && filtro.getNome().trim().equals("") == false) {
            sql += "AND nome LIKE ? ";
        }

        try {
            //executando a instrução sql
            PreparedStatement cmd = conn.prepareStatement(sql);
            if (filtro.getLogin() != null && filtro.getLogin().equals("") == false) {
                cmd.setString(posPar, filtro.getLogin());
                posPar++;
            }
            if (filtro.getNome() != null && filtro.getNome().trim().equals("") == false) {
                cmd.setString(posPar, filtro.getNome());
                posPar++;
            }
            ResultSet leitor = cmd.executeQuery();
            
            while (leitor.next()) {
                Usuario u = new Usuario();
                u.setLogin(leitor.getString("login"));
                u.setNome(leitor.getString("nome"));
                u.setEmail(leitor.getString("email"));
                retorno.add(u);
            }
        } catch (SQLException erro) {
            //caso haja algum erro neste mÃ©todo serÃ¡ levantada esta execeÃ§Ã£o
            throw new Exception("Erro ao listar usuario: " + erro.getMessage());
        }
        //fechando a conexÃ£o com o banco de dados
        desconectar();
        return retorno;
    }


}
