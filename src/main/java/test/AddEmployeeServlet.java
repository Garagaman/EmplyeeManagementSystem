package test;
import java.io.*;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;
@SuppressWarnings("serial")
@WebServlet("/add")
public class AddEmployeeServlet extends HttpServlet{
			@Override
	protected void doPost(HttpServletRequest req,HttpServletResponse res)throws
		ServletException,IOException
	{
		HttpSession hs=req.getSession(false);
		if(hs==null) {
			req.setAttribute("msg","Session Expired....<br>");
			req.getRequestDispatcher("Msg.jsp").forward(req, res);
		}else {
			String id = req.getParameter("id");
			String name=req.getParameter("name");
			String desg=req.getParameter("desg");
			float bSal= Float.parseFloat(req.getParameter("bsal"));
			float hr= Float.parseFloat(req.getParameter("hra"));
			float d= Float.parseFloat(req.getParameter("da"));
				float hra=hr*bSal;
				float da=d*bSal;
			float totalSal= bSal+hra+da;
		EmployeeBean eb=new EmployeeBean();// Bean Object
			//Loading Data to Bean Object 
			eb.seteId(id);
			eb.seteName(name);
			eb.seteDesg(desg);
			eb.setTotsal(bSal);
			eb.setHra(hra);
			eb.setDa(da);
			eb.setTotsal(totalSal);
		AddEmployeeDAO aed=new AddEmployeeDAO();
			int k= aed.insert(eb);
			if(k>0) {
				req.getRequestDispatcher("AddEmployee.jsp").forward(req, res);
			}
			
			
			
		}
	}

}
