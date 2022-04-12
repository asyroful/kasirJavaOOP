package koneksi;
import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

public class koneksi {
    Connection koneksi;
    
    public static Connection koneksi(){
    try {
        Class.forName("com.mysql.jdbc.Driver");
        Connection koneksi = DriverManager.getConnection("jdbc:mysql://localhost/otodrive", "root", "");
        return koneksi;
    } catch (Exception e){
        JOptionPane.showMessageDialog(null, e);
        return null;
    }
}
}
