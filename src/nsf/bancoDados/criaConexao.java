/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nsf.bancoDados;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class criaConexao {

    public static java.sql.Connection getConexao() throws SQLException {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("Conectado ao Banco!");
            return DriverManager.getConnection("jdbc:mysql://localhost/bd_nsf", "root", "root");
        } catch (ClassNotFoundException e) {
            throw new SQLException(e.getMessage());
        }
    }

}
