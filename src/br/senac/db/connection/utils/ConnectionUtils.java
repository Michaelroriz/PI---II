package br.senac.db.connection.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

/**
 * @author Michael
 */
public class ConnectionUtils {
    private static Connection connection = null;
    
    //Obtém uma conexão com o banco de dados
    public static Connection getConnection() throws SQLException {
        //Só tenta abrir uma conexão se esta já não
        //existir ou estiver fechada
        if (connection == null || connection.isClosed()) {
            
            //Declaração de endereço de conexão com o banco de dados
            String dbUrl = "jdbc:derby://localhost:1572/dados_cmb";
            
            //Propriedades para armazenamento do usuário e da senha do banco
            Properties properties = new Properties();
            properties.put("user", "root");
            properties.put("password", "root");
            
            //Realiza a conexão com o banco
            connection = DriverManager.getConnection(dbUrl, properties);
        }
        
        //Retorna a conexão a quem chamou
        return connection;
    }
}
