package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CriarBanco {

    public static void criarBanco(String[] args) throws SQLException {
        /*
        Variável resposável por indicar: 
            1. O drive utilizado para realizar a conexão;
            2. O tipo de banco de dados utilizado;
            3. O tipo de conexão: local ou não.
         */
//        String url = "jdbc:mysql://localhost";
//        String usuario = "root";
//        String senha = "";
//        Connection conexao = DriverManager.getConnection(url, usuario, senha);
        Connection conexao = FabricaConexao.getConexao();
        Statement stmt = conexao.createStatement();
        stmt.execute("CREATE DATABASE IF NOT EXISTS curso_java");
        System.out.println("Banco criado com sucesso!");

        conexao.close();
    }
}
