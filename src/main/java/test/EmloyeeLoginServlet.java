package test;
import java.io.*;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;
@SuppressWarnings("serial")
@WebServlet("/elogin")
public class EmloyeeLoginServlet extends HttpServlet{
		protected void doPost(HttpServletRequest req,HttpServletResponse res)throws
		ServletException,IOException{
			String uN=req.getParameter("uname");
			String pW=req.getParameter("pword");
		LoginEmployeeBean leb=new EmployeeLoginDAO().login(uN, pW);
		if(leb==null) {
			req.setAttribute("msg","Invalid Login Process...<br>");
			req.getRequestDispatcher("Msg.jsp").forward(req, res);
		}else {
			HttpSession hs= req.getSession();
				hs.setAttribute("lebean", leb);
			req.getRequestDispatcher("EmployeeLogin.jsp").forward(req, res);
		}
		}
}
