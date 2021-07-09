package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class AtualizarRegistro {
    
    public static void main(String[] args) throws SQLException {
        Connection conexao = FabricaConexao.getConexao();
        Scanner entrada = new Scanner(System.in);
        String sqlConsulta = "SELECT * FROM pessoas WHERE codigo = ?";
        System.out.print("Informe ID para pesquisa: ");
        int id = entrada.nextInt();
        PreparedStatement stmt = conexao.prepareCall(sqlConsulta);
        stmt.setInt(1, id);
        ResultSet resultado = stmt.executeQuery();
        if (resultado.next()) {
            System.out.println("A pessoa encontrada foi : " + resultado.getString("nome"));
            entrada.nextLine();
            System.out.print("Informe o novo nome que você deseja setar: ");
            String novoNome = entrada.nextLine();
            String sqlAtualizacao = "UPDATE pessoas SET nome = ? WHERE codigo = ?";
            stmt = conexao.prepareStatement(sqlAtualizacao);
            stmt.setString(1, novoNome);
            stmt.setInt(2, resultado.getInt("codigo"));
            int novoResultado = stmt.executeUpdate();
            if (novoResultado > 0) {
                System.out.println("Registro atualizado com sucesso!");
            } else {
                System.out.println("Houve um erro ao atualizar o banco de dados.");
            }
        }
        stmt.close();
        conexao.close();
        entrada.close();
    }
}
