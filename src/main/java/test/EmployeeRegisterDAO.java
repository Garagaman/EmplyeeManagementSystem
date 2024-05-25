package test;
import java.sql.*;
public class EmployeeRegisterDAO {
			public int k=0;
		public int register(LoginEmployeeBean leb) {
			try {
				Connection con=DBConnection.getCon();
			PreparedStatement ps= con.prepareStatement
					("insert into employee60 values(?,?,?,?,?,?,?,?)");
			ps.setString(1, leb.geteId());
			ps.setString(2, leb.getuName());
			ps.setString(3, leb.getpWord());
			ps.setString(4, leb.getfName());
			ps.setString(5, leb.getlName());
			ps.setString(6, leb.getAddr());
			ps.setString(7, leb.getmId());
			ps.setLong(8, leb.getPhNo());
		      k = ps.executeUpdate();
			
			}catch(Exception e) {
				System.err.println(e.toString());
			}
			return k;
		}	
}
