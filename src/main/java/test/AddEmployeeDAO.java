package test;
import java.sql.*;
public class AddEmployeeDAO {
		public int k = 0;
	public int insert(EmployeeBean eb) {
	try {
		Connection con=DBConnection.getCon();//Accessing the Existing Connection
			PreparedStatement ps =con.prepareStatement
					("insert into employee61 values(?,?,?,?,?,?,?)");
				ps.setString(1,eb.geteId());
				ps.setString(2, eb.geteName());
				ps.setString(3,eb.geteDesg());
				ps.setFloat(4, eb.getbSal());
				ps.setFloat(5, eb.getHra());
				ps.setFloat(6, eb.getDa());
				ps.setFloat(7,eb.getTotsal());
				 k=ps.executeUpdate();
	}catch(Exception e) {
		System.err.println(e.toString());
	}
		return k;
	}
		
		
		
}
