package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ConsultarPessoa2 {

    public static void consultarPessoa2(String[] args) throws SQLException {
        Scanner entrada = new Scanner(System.in);
        Connection conexao = FabricaConexao.getConexao();
        String sql = "SELECT * FROM pessoas WHERE nome LIKE ?";
        System.out.print("Informe uma palavra para consultar: ");
        String consulta = entrada.next();
        PreparedStatement stmt = conexao.prepareStatement(sql);
        stmt.setString(1, "%" + consulta + "%");
        ResultSet resultado = stmt.executeQuery();
        List<Pessoa> pessoas = new ArrayList<>();
        while (resultado.next()) {
            int codigo = resultado.getInt("codigo");
            String nome = resultado.getString("nome");
            pessoas.add(new Pessoa(codigo, nome));
        }
        for (Pessoa pessoa : pessoas) {
            System.out.println(pessoa.getCodigo() + " ---> " + pessoa.getNome());
        }
        stmt.close();
        conexao.close();
        entrada.close();
    }
}
