package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class FabricaConexao {

    public static Connection getConexao() {
        try {
            /*
            Variável resposável por indicar: 
                1. O drive utilizado para realizar a conexão;
                2. O tipo de banco de dados utilizado;
                3. O tipo de conexão: local ou não;
                4. O banco de dados a ser utilizado.
            Além disso, é possível especificar diversas coisas, como a porta que
            deve ser utilizada para realizar a conexão, por exemplo.
             */
            String url = "jdbc:mysql://localhost/curso_java?verifyServerCertificate=false&useSSL=true";
            String usuario = "root";
            String senha = "";
            return DriverManager.getConnection(url, usuario, senha);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

}
