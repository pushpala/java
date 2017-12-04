package JDBC;

/**
 * Created by smrithi on 12/4/17.
 */
public class ConTest {
    public static void main(String[] args) {
        DatabaseConnection db_obj = new DatabaseConnection();
       // db_obj.addUser ("eswar", "nonAdmin", "3456545678");
        db_obj.getUserList();
        db_obj.createTable();
        db_obj.addBills("smi", "phone","300", "jan");
    }
}
