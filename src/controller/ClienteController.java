package controller;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import model.Cliente;

public class ClienteController extends Base {
    public void inserirCliente(Cliente cliente) {
        if (!clienteExiste(cliente.getId())) {
        String[] columns = {"IDCLIENTE", "NOMECLIENTE", "CPF", "SEXO", "CLIDESCSTATUS"};
        Object[] values = {cliente.getId(), cliente.getNomeCompleto(), cliente.getCpf(), cliente.getSexo(),cliente.getStatus()};

        insert("TBCLIENTE", columns, values);
        }
    }   
    
    public void atualizarCliente(Cliente cliente) {
        if (clienteExiste(cliente.getId())){
            String[] columns = {"IDCLIENTE", "NOMECLIENTE", "CPF", "SEXO", "CLIDESCSTATUS"};
            Object[] values = {cliente.getId(), cliente.getNomeCompleto(), cliente.getCpf(), cliente.getSexo(),cliente.getStatus()};
            
            update("TBCLIENTE", "IDCLIENTE", cliente.getId(), columns, values);
        }
    }

    public void deletarCliente(int idCliente) {
        if (clienteExiste(idCliente)) {
            delete("TBCLIENTE", "IDCLIENTE", idCliente);
        }
    }
    
    public void inserirTodosClientes(Cliente[] clientes) {
        for (Cliente cliente: clientes) {
            inserirCliente(cliente);
        }
    }

    private boolean clienteExiste(int idCliente) {
        String sql = "SELECT COUNT(*) FROM TBCLIENTE WHERE IDCLIENTE = ?";
        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setInt(1, idCliente);
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                return rs.getInt(1) > 0;
            }
        } catch (SQLException e) {
            System.out.println("Erro ao verificar cliente: " + e.getMessage());
        }
        return false;
    }
}