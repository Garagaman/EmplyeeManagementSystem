package test;
import java.io.*;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;
@SuppressWarnings("serial")
@WebServlet("/rel")
public class RegisterEmployeeServlet extends HttpServlet {
	protected void doPost(HttpServletRequest req,HttpServletResponse res)throws
	ServletException,IOException{
		LoginEmployeeBean leb= new LoginEmployeeBean();
		leb.seteId(req.getParameter("eid"));
		leb.setuName(req.getParameter("uname"));
		leb.setpWord(req.getParameter("pword"));
		leb.setfName(req.getParameter("fname"));
		leb.setlName(req.getParameter("lname"));
		leb.setAddr(req.getParameter("addr"));
		leb.setmId(req.getParameter("mid"));
		leb.setPhNo(Long.parseLong(req.getParameter("phno")));
		int k = new EmployeeRegisterDAO().register(leb);
		if(k>0) {
			req.getRequestDispatcher("RegisterEmployee.jsp").forward(req, res);
		}
	}

}
