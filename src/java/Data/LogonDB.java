/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Data;
import Business.User;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.DriverManager;
import java.util.logging.Logger;

/**
 *
 * @author jake
 */
public class LogonDB {

    private static final Logger LOG = Logger.getLogger(LogonDB.class.getName());
    
    public static Connection getConnection() throws SQLException, Exception{
        Connection connection = null;
        try{
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost/loginsite", DatabaseLogin.getUser(), DatabaseLogin.getPass());
        }catch(SQLException e){
            throw e;
        }catch(Exception e){
            throw e;
        }
        return connection;
    }
    
    public static void createUser(User user) throws SQLException, Exception{
        Connection con = null;
        try{
            con = getConnection();
            PreparedStatement ps = con.prepareStatement("insert into user (userEmail, userName) values (?, ?)");
            ps.setString(1, user.getEmail());
            ps.setString(2, user.getUsername());
            ps.executeUpdate();
        }catch(SQLException e){
            throw e;
        }catch(Exception e){
            throw e;
        }
    }
}
