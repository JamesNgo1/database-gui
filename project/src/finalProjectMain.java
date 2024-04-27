import java.beans.Statement;
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

			String query = "insert into product(prodName, price) values('rice', 1.99)";

			java.sql.Statement st = con.createStatement();
			st.execute(query);
			



		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

        //open execute close . open execute close 

        //open 


        //close after done 
		
		FinalProjectGUI frame = new FinalProjectGUI();
		frame.setVisible(true);
	}

}
