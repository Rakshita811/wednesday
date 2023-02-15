package project3.jsp;

import java.io.IOException;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.patientDao;
import dto.patient;
@WebServlet("/xyz")
public class Demo extends HttpServlet{
@Override
protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	// TODO Auto-generated method stub
	String s1=req.getParameter("id");
	int id=Integer.parseInt(s1);
	String name=req.getParameter("name");
	String bloodgroup=req.getParameter("bloodgroup");
	String s2=req.getParameter("phnumber");
	long phnumber=Long.parseLong(s2);
	
	
	patient patient=new patient();
	patient.setId(id);
	patient.setName(name);
	patient.setBloodgroup(bloodgroup);
	patient.setPhnumber(phnumber);
	
	
	
//	to insert data in database we use below code
	patientDao patientDao =new patientDao();
	patientDao.insert(patient);
	
	
	
	
	
//	the below code is for update
//	patient patient=new patient();
//	patient.setId(id);
//	patient.setName(name);
//	patient.setBloodgroup(bloodgroup);
//	patient.setPhnumber(phnumber);
//	
//	patientDao p=new patientDao();
//	p.update(id,phnumber);
//	
//	
}
}
