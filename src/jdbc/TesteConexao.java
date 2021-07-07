package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class TesteConexao {

    public static void testeConexao(String[] args) throws SQLException {
        /*
        Variável resposável por indicar: 
            1. O drive utilizado para realizar a conexão;
            2. O tipo de banco de dados utilizado;
            3. O tipo de conexão: local ou não.
         */
        String url = "jdbc:mysql://localhost:3306?verifyServerCertificate=false&useSSL=true";
        String usuario = "root";
        String senha = "";

        Connection conexao = DriverManager.getConnection(url, usuario, senha);
        System.out.println("CONEXÃO EFETUADA COM SUCESSO!");
        conexao.close();
    }

}
