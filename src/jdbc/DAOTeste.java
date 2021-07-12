package jdbc;

public class DAOTeste {

    public static void main(String[] args) {
        DAO dao = new DAO();
        String sql = "INSERT INTO pessoas (nome) VALUES (?)";
        System.out.println(dao.incluir(sql, "Mateus Dias"));
        System.out.println(dao.incluir(sql, "Maria do Desterro"));
        System.out.println(dao.incluir(sql, "Zeneuda Dias"));
        System.out.println(dao.incluir(sql, "Marcos Dias"));
        dao.close();
    }
}
