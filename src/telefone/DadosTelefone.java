package telefone;

import conexao.Dados;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Ryan Passos
 */
public class DadosTelefone extends Dados implements InterfaceTelefone {

    @Override
    public void cadastrarTelefone(Telefone t) throws Exception {
        
        conectar();

        String sql = "INSERT INTO Telefone (ddd, numero, tipo) ";
        sql += "VALUES (?,?,?);";
        try {
            PreparedStatement cmd = conn.prepareStatement(sql);
            cmd.setInt(1, t.getDdd());
            cmd.setString(2, t.getNumero());
            cmd.setString(3, t.getTipo());
            cmd.execute();

        } catch (SQLException erro) {
            throw new Exception("Problemas ao executar o cadastro!" + erro.getMessage());
        }
        desconectar();
    }

    @Override
    public void atualizarTelefone(Telefone t) throws Exception {
        
        conectar();
        String sql = "UPDATE Telefone SET numero = ?, ddd = ? WHERE tipo = ?";

        try {
            PreparedStatement cmd = conn.prepareStatement(sql);
            cmd.setString(1, t.getNumero());
            cmd.setInt(2, t.getDdd());
            cmd.setString(3, t.getTipo());
            cmd.execute();
        } catch (SQLException erro) {

            throw new Exception("Problemas ao executar a atualização!" + erro.getMessage());
        }

        desconectar();
    }

    @Override
    public void removerTelefone(Telefone t) throws Exception {
        
        conectar();
        String Sql = "DELETE FROM Telefone WHERE tipo = ?; ";
        try {
            PreparedStatement Cmd = conn.prepareStatement(Sql);
            Cmd.setString(1, t.getTipo());
            Cmd.execute();
        } catch (SQLException e) {
            throw new Exception("Problemas ao apagar o Usuario: " + e.getMessage());
        }
        desconectar();
    }

    @Override
    public ArrayList<Telefone> listarTipo(Telefone filtro) throws Exception {
      
        int posPar = 1;
        ArrayList<Telefone> retorno = new ArrayList<>();
        //abrindo a conexÃ£o
        conectar();

        String sql = " SELECT numero, ";
        sql += " id, ddd ";
        sql += "  FROM Telefone WHERE tipo IS NOT NULL ";
        if (filtro.getNumero() != null && filtro.getNumero().equals("") == false) {
            sql += "AND numero = ? ";
        }

        try {
            //executando a instrução sql
            PreparedStatement cmd = conn.prepareStatement(sql);
            if (filtro.getNumero() != null && filtro.getNumero().equals("") == false) {
                cmd.setString(posPar, filtro.getNumero());
                posPar++;
            }
            ResultSet leitor = cmd.executeQuery();
            
            while (leitor.next()) {
                Telefone t = new Telefone();
                t.setNumero(leitor.getString("numero"));
                t.setDdd(leitor.getInt("ddd"));
                t.setTipo(leitor.getString("tipo"));
                retorno.add(t);
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
