package test;
import java.io.*;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;
@SuppressWarnings("serial")
@WebServlet("/elogout")
public class EmloyeeLogoutServlet extends HttpServlet {
	protected void doGet(HttpServletRequest req,HttpServletResponse res) throws
	ServletException,IOException{
		HttpSession hs = req.getSession(false);
			if(hs==null) {
				req.setAttribute("msg", "Session Expired....<br>");
			}else {
				hs.removeAttribute("lebean");
				hs.invalidate();
			req.setAttribute("msg", "Employee LoggedOut Successfully....<br>");
			}
		req.getRequestDispatcher("Msg.jsp").forward(req, res);
	}

}
