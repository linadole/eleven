
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author hazem
 */
public class DButil {

    static Statement st;
    static Connection con;

    static String driver = "com.mysql.jdbc.Driver";
    static String url = "jdbc:mysql://localhost:3306/";
    static String db = "marwa";
    static String user = "root";
    static String pass = "root";

    public static Statement connectDB() {

        try {
            Class.forName(driver);
            con = DriverManager.getConnection(url+db,user, pass);
            st = con.createStatement();

        } catch (ClassNotFoundException | SQLException ex) {
            System.out.println(ex.getMessage());
            try {
                con.close();
            } catch (SQLException ex1) {
                System.out.println(ex1.getMessage());
            }
        }

        return st;

    }
    

}
