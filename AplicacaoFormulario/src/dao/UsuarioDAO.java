package dao;

import factory.ConectionFactory;
import modelo.Usuario;
import java.sql.*;
import java.sql.PreparedStatement;

public class UsuarioDAO {

    private Connection conection;
    Long id;
    String nome;
    String cpf;
    String email;
    String telefone;

    public UsuarioDAO() {
        this.conection = new ConectionFactory().getConnection();
    }

    public void adicionar(Usuario usuario) {
        String sql = "INSERT INTO tbl_usuario(nome,cpf,email,telefone) VALUES(?,?,?,?)";
        try {
            PreparedStatement stmt = conection.prepareStatement(sql);
            stmt.setString(1, usuario.getNome());
            stmt.setString(2, usuario.getCpf());
            stmt.setString(3, usuario.getEmail());
            stmt.setString(4, usuario.getTelefone());
            stmt.execute();
            stmt.close();
        } catch (SQLException u) {
            throw new RuntimeException(u);
        }
    }
}
