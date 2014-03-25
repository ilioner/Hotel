package com.hotel.login;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import entity.AdminUser;
import service.HotelService;
/**
 * Servlet implementation class LoginServlet
 */
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String userName = request.getParameter("username");
		String pwd = request.getParameter("pwd");
		AdminUser admin = new AdminUser();
		admin.username = userName;
		admin.password = pwd;
		int flag = HotelService.adminLoginConfrim(admin);
		switch(flag){
			case 0:
			{
				System.out.println("login ok");
				response.sendRedirect("index.html");
				break;
			}
			case 1:
			{
				System.out.println("error username");
				break;
			}
			case 2:
			{
				System.out.println("error pwd");
				break;
			}
			case 3:
			{
				System.out.println("other info error");
				break;
			}
			default:
			{
				break;
			}
		}
//		response.sendRedirect("index.html");
	}

}
