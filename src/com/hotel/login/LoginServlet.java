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
		System.out.println("get method");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Post method");
		request.setCharacterEncoding("GB18030");
		String userName = request.getParameter("username");
		String pwd = request.getParameter("pwd");
		AdminUser admin = new AdminUser();
		admin.username = userName;
		admin.password = pwd;
		System.out.println("---------");
		int flag = HotelService.adminLoginConfrim(admin);
		switch(flag){
			case 0:
			{
				System.out.println("login ok");
				response.sendRedirect("UI/content/schedule/scheduleInfo.html");
				break;
			}
			case 1:
			{
				System.out.println("error username");
				request.setAttribute("status", "用户名错误");
				getServletContext().getRequestDispatcher("/UI/common/fail.jsp").forward   
				  (request,   response);  
				break;
			}
			case 2:
			{
				System.out.println("error pwd");
				request.setAttribute("status", "密码错误");
				getServletContext().getRequestDispatcher("/UI/common/fail.jsp").forward   
				  (request,   response);
				break;
			}
			case 3:
			{
				System.out.println("other info error");
				request.setAttribute("status", "内部错误");
				getServletContext().getRequestDispatcher("/UI/common/fail.jsp").forward   
				  (request,   response);
				break;
			}
			default:
			{
				request.setAttribute("status", "内部错误");
				getServletContext().getRequestDispatcher("/UI/common/fail.jsp").forward   
				  (request,   response);
				break;
			}
		}
	}

}
