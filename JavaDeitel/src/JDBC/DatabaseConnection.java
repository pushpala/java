package JDBC;


import javax.swing.plaf.nimbus.State;
import java.sql.*;


/**
 * Created by smrithi on 12/4/17.
 */
public class DatabaseConnection {

    public void addUser(String name, String role, String contact){
        String query = "INSERT INTO test.usr (name, role, contact) values('"+name+"','"+role+"','"+contact+"')";
        updateQuery(query);
    }

    public void getUserList(){
        try {
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test?autoReconnect=true&useSSL=false","root","");
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * from test.usr");
            while(rs.next())
                System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getString(3)+"  "+rs.getString(4));

            con.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void createTable(){
        String query ="CREATE TABLE If NOT EXISTS `test`.`bills` (\n" +
                "  `id` INT NOT NULL AUTO_INCREMENT,\n" +
                "  `usr_name` VARCHAR(45) NULL,\n" +
                "  `bill_name` VARCHAR(45) NULL,\n" +
                "  `amount` VARCHAR(45) NULL,\n" +
                "  `month` VARCHAR(45) NULL,\n" +
                "  PRIMARY KEY (`id`));";
        updateQuery(query);
    }

    public void addBills(String name, String billName, String amount, String month){
        String query = "INSERT INTO test.bills (usr_name, bill_name, amount,month) values('"+name+"','"+billName+"','"+amount+"','"+month+"')";
        updateQuery(query);
    }

    public void updateQuery(String query){
        try {
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test?autoReconnect=true&useSSL=false","root","");
            Statement stmt = con.createStatement();
            stmt.executeUpdate(query);
            con.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}
