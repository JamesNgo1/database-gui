import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class finalProjectMain {
    public static void main(String[] args) {
		//protocol , ip address ,and then the port 
		String jdbcConn = "jdbc:mysql://localhost:3306/finalguiproject?";
		String uname = "guest";
		String password = "guestguest";

		//connection obect
		try {
			Connection con = DriverManager.getConnection(jdbcConn, uname, password);

			System.out.println("connection worked");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		FinalProjectGUI frame = new FinalProjectGUI();
		frame.setVisible(true);
	}

}
