import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;


public class JDBC {
    public static void main(String[]  arg) {
        String url = "jdbc:mysql://127.0.0.1:3306/Univer";
        String user = "root";
        String password = "root2022";
        String query = "select name from soltanlilian_profesor where id = 3";

        try{
            Connection myConn = DriverManager.getConnection(url,user, password);
            Statement myStat = myConn.createStatement();
            ResultSet myResult = myStat.executeQuery(query);
            myResult.next();
            String table = myResult.getString("name");
            System.out.println(table);
            myStat.close();
            myConn.close();
        }
        catch(Exception e){
            e.printStackTrace();

        }
    }
}
