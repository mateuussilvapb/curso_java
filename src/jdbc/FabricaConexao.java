package jdbc;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class FabricaConexao {

    public static Connection getConexao() {
        try {
            Properties prop = getProperties();
            /*
            Variável resposável por indicar: 
                1. O drive utilizado para realizar a conexão;
                2. O tipo de banco de dados utilizado;
                3. O tipo de conexão: local ou não;
                4. O banco de dados a ser utilizado.
            Além disso, é possível especificar diversas coisas, como a porta que
            deve ser utilizada para realizar a conexão, por exemplo.
             */
            String url = prop.getProperty("banco.url");
            String usuario = prop.getProperty("banco.usuario");
            String senha = prop.getProperty("banco.senha");
            return DriverManager.getConnection(url, usuario, senha);
        } catch (SQLException | IOException e) {
            throw new RuntimeException(e);
        }
    }

    private static Properties getProperties() throws IOException {
        /*
        Para resgatar o diretório padrão do usuário, utilizar comando:
        'System.getProperty("user.home");'
         */
        Properties prop = new Properties();
        String raiz = System.getProperty("user.home");
        String caminho = raiz + "/conexao.properties";
        caminho = caminho.replaceAll("\\\\", "/");
        System.out.println(caminho);
        InputStream stream = new FileInputStream(caminho);
        prop.load(stream);
        return prop;
    }
}
