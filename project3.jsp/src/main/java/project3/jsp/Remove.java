package project3.jsp;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.patientDao;
@WebServlet("/pqr")
public class Remove extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String s1=req.getParameter("id");
		int id=Integer.parseInt(s1);
		
		
		
		patientDao p=new patientDao();
		p.remove(id);
		
		}
	

}
