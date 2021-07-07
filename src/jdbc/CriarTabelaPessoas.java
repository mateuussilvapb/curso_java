package jdbc;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class CriarTabelaPessoas {

    public static void criarTabelaPessoas(String[] args) throws SQLException {
        Connection conexao = FabricaConexao.getConexao();
        /*
        'Text Block': Com essa nova funcionalidade, é possível definir um bloco
        de texto, sem a necessidade de utilizar o '+' para sua organização.
        Só basta colocar o texto entre 6 aspas.
        */
        String sql = "CREATE TABLE IF NOT EXISTS pessoas ("
                + "codigo INT AUTO_INCREMENT PRIMARY KEY, "
                + "nome VARCHAR(80) NOT NULL"
                + ")";
        Statement stmt = conexao.createStatement();
        stmt.execute(sql);
        System.out.println("Tablea criada com sucesso!");
        conexao.close();
    }

}
