import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
public class update {
    public static void main(String[] args) {
        try {
            Connection myconn = DriverManager.getConnection("jdbc:h2:tcp://localhost/~/test", "sa","123");
            Statement myStatement = myconn.createStatement();
            String query="UPDATE car SET pric='67000' id=1";

            myStatement.executeUpdate(query);
            System.out.println("ჩაიწერა");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
