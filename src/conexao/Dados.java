package conexao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Ryan Passos
 */
public abstract class Dados {

    private Statement stmt;
    public Connection conn;

    public java.sql.Statement conectar() throws ClassNotFoundException, SQLException {
        return this.conectarMySql();
    }

    public void desconectar() throws SQLException {
        conn.close();
    }

    private java.sql.Statement conectarMySql() throws ClassNotFoundException, SQLException {
            String driver = "com.mysql.jdbc.Driver";
            String url = "jdbc:mysql://localhost:3306/desafio";
            String usuario = "root";
            String senha = "";
            Class.forName(driver);
            //obtem uma conexao com o sgbd
            conn = DriverManager.getConnection(url, usuario, senha);
            stmt = conn.createStatement();
            return stmt;
    }
}
