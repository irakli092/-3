import java.io.StringWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class irakli{
    public static void main(String[] args) throws  Exception{
Class.forName("org.h2.Driver");
        Connection myconn = DriverManager.getConnection("jdbc:h2:tcp://localhost/~/test", "sa","123");
        Statement myStatement = myconn.createStatement();
        String query = "INSERT INTO car(id,manufacturer,model,price) VALUES ('mercedes', 'maybach','70000);";
        myStatement.executeUpdate(query);
        System.out.println("ჩაიწერა");

    }
}
