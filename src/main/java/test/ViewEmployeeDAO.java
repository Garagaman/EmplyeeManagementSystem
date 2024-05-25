package test;
import java.sql.*;
import java.util.*;
public class ViewEmployeeDAO {
		public ArrayList<EmployeeBean> al=new ArrayList<>();
		public ArrayList<EmployeeBean>retrieve(){
			try {
				Connection con = DBConnection.getCon();
			PreparedStatement ps = con.prepareStatement
					("select * from employee61");
			ResultSet rs=ps.executeQuery();
			while(rs.next()) {
				EmployeeBean eb = new EmployeeBean();//Bean Object 
				eb.seteId(rs.getString(1));
				eb.seteName(rs.getString(2));
				eb.seteDesg(rs.getString(3));
				eb.setbSal(rs.getFloat(4));
				eb.setHra(rs.getFloat(5));
				eb.setDa(rs.getFloat(6));
				eb.setTotsal(rs.getFloat(7));
				al.add(eb);// Adding bean object to array list
			}//End of loop
			}catch(Exception e) {e.printStackTrace();}
			return al;
		}
}
