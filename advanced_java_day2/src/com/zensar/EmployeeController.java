package com.zensar;

import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.http.*;

import com.zensar.bean.Employee;



public class EmployeeController extends HttpServlet {

	public void doGet(HttpServletRequest req,HttpServletResponse res) {
		System.out.println("inside get method !!!!!!!!");
		EmployeeDAO employeeDAO = new EmployeeDAO();
		List<Employee> listOfAllEmployees = employeeDAO.getAllEmployees();
		System.out.println("listOfAllEmployees:"+listOfAllEmployees);
		RequestDispatcher rd = req.getRequestDispatcher("viewAllEmployees.jsp");
		req.setAttribute("listOfAllEmployees", listOfAllEmployees);
		try {
		rd.forward(req, res);
		}catch(Exception e) {
		System.out.println("Exception Occured:"+e);
		}
	}
	
	
	public void doPost(HttpServletRequest req,HttpServletResponse res){
		
		int employeeId = Integer.parseInt(req.getParameter("employeeId"));
		String employeeName = req.getParameter("employeeName");
		String designation = req.getParameter("designation");
		int salary = Integer.parseInt(req.getParameter("salary"));
		String gender = req.getParameter("gender");
		System.out.println("EmpID=" + employeeId);
		System.out.println("EmpName=" + employeeName);
		System.out.println("Designation=" + designation);
		System.out.println("Salary=" + salary);
		System.out.println("Gender="+ gender);
		
		EmployeeDAO employee = new EmployeeDAO();
		Employee employee1 = new Employee(employeeId, employeeName, designation, salary, gender);
		employee.addEmployee(employee1);
		
		RequestDispatcher rd = req.getRequestDispatcher("result.jsp");
		try{
			rd.forward(req, res);
		}catch(Exception e) {
			e.printStackTrace();
		}
	
	}
	
}
