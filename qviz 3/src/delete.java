import java.sql.Connection;
import java.sql.DriverManager;


    import java.sql.Connection;
    import java.sql.DriverManager;
    import java.sql.Statement;

        public class delete {
            public static void main(String[] args) throws Exception{
                Class.forName("org.h2.Driver");
            try {

                Connection myconn = DriverManager.getConnection("jdbc:h2:tcp://localhost/~/test", "sa","123");
                Statement myStatement = myconn.createStatement();

                String query = "DELETE FROM car WHERE model ='mybach'";

                int deletedRows=myStatement.executeUpdate(query);
                System.out.println("ჩაიწერა");

            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

