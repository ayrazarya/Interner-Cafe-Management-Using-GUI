
package NCafeManagement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Time;
import javax.swing.JOptionPane;
public class DatabaseConnection {
    public static Connection setConnection() {
        Connection connection = null;
        try{
            String url = "jdbc:mysql://localhost:3306/warned_db";
            String user = "root";
            String pass = "";
            String db = "warned_db";
                Class.forName("com.mysql.jdbc.Driver");
                connection = DriverManager.getConnection(url, user, pass);
        }catch(Exception e){
            System.out.println("Error "+e.getMessage());
        }return connection;
    }
    
    public static void main(String[] args) {
        try {
            Statement statement = setConnection().createStatement();
            ResultSet rs = statement.executeQuery("SELECT * FROM tb_pc");
            while (rs.next()) {
                String duration = rs.getString("duration");
                
String[] parts = duration.split(":");

// Ambil nilai jam, menit, dan detik dari masing-masing bagian
int hours = Integer.parseInt(parts[0]);
int minutes = Integer.parseInt(parts[1]);
int seconds = Integer.parseInt(parts[2]);

// Konversi jam, menit, dan detik menjadi milidetik
long totalMilliseconds = (hours * 3600 + minutes * 60 + seconds) * 1000;

System.out.println("Total milidetik: " + totalMilliseconds);
                long start = rs.getTimestamp("pc_start").getTime();
                long now = System.currentTimeMillis();
                System.out.println((now-start)+" - "+totalMilliseconds);
            }
            } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    public void SelectFromDBUsername (String username){
        try {
            Statement statement = setConnection().createStatement();
            ResultSet rs = statement.executeQuery("SELECT Status FROM tb_username WHERE Username = '" + username + "'");
        }
        catch(Exception E) {
        }
    }
}