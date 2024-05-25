package test;
import java.sql.*;
public class EmployeeLoginDAO {
		public LoginEmployeeBean leb = null;
	public LoginEmployeeBean login(String uN,String pW) {
		try {
			Connection con= DBConnection.getCon();
			PreparedStatement ps = con.prepareStatement
					("select * from employee60 where uname=? and pword=?");
			ps.setString(1, uN);
			ps.setString(2, pW);
		ResultSet rs = ps.executeQuery();
		if(rs.next()) {
				leb= new LoginEmployeeBean();
				leb.seteId(rs.getString(1));
				leb.setuName(rs.getString(2));
				leb.setpWord(rs.getString(3));
				leb.setfName(rs.getString(4));
				leb.setlName(rs.getString(5));
				leb.setAddr(rs.getString(6));
				leb.setmId(rs.getString(7));
				leb.setPhNo(rs.getLong(8));
		}
		}catch(Exception e) {
			System.err.println(e.toString());
		}
		return leb;
	}
}
