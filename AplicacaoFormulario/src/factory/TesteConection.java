package factory;

import java.sql.SQLException;
import java.sql.Connection;

public class TesteConection {
    
    public static void main(String[] args) throws SQLException {
        Connection conect = new ConectionFactory().getConnection();
        System.out.println("Conexão Aberta");
        
        conect.close(); 
    }
}
