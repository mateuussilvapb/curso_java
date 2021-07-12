package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ExcluirPessoa {

    public static void excluirPessoa(String[] args) throws SQLException {
        Scanner entrada = new Scanner(System.in);

        Connection conexao = FabricaConexao.getConexao();
        String sql = "SELECT * FROM pessoas";
        PreparedStatement stmt = conexao.prepareStatement(sql);
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
        System.out.print("\n\nInforme o ID: ");
        int id = entrada.nextInt();
        entrada.nextLine();
        sql = "SELECT nome FROM pessoas WHERE codigo = ?";
        stmt = conexao.prepareStatement(sql);
        stmt.setInt(1, id);
        resultado = stmt.executeQuery();
        if (resultado.next()) {
            System.out.print("\nTem certeza que deseja excluir " + resultado.getString("nome") + "? S/N: ");
            String decisao = entrada.nextLine();
            if (decisao.equalsIgnoreCase("s") || decisao.equalsIgnoreCase("sim") || decisao.isEmpty() || decisao.equalsIgnoreCase("")) {
                sql = "DELETE FROM pessoas WHERE codigo = " + id;
                stmt = conexao.prepareStatement(sql);
                if (stmt.executeUpdate() > 0) {
                    System.out.println("Pessoa excluida com sucesso!");
                } else {
                    System.out.println("Erro ao executar exclusao.");
                }
            }
        } else {
            System.out.println("ERRO!");
        }

        stmt.close();
        entrada.close();
        conexao.close();
    }
}
