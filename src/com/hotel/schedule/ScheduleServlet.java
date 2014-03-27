package com.hotel.schedule;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import service.HotelService;
import entity.HotelClient;

/**
 * Servlet implementation class ScheduleServlet
 */
public class ScheduleServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ScheduleServlet() {
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
		System.out.println(request.getParameter("method"));
		request.setCharacterEncoding("GB18030");
		if(request.getParameter("method").equals("yuding")) 
		{
	        yuding(request,response); 
		} else if (request.getParameter("method").equals("deleteSchedule")){
			deleteThisSchedule(request,response);
		}
	}

	private void deleteThisSchedule(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		String idCard = request.getParameter("idCard");
		if(HotelService.deleteThisSchedule(idCard)){
			System.out.println(" delete OK");
			request.setAttribute("status","É¾³ý³É¹¦");   
			getServletContext().getRequestDispatcher("/UI/common/success.jsp").forward   
			  (request,   response);  
		}else{
			System.out.println(" delete error");
			request.setAttribute("status","É¾³ýÊ§°Ü£¬Çë¼ì²éÉí·ÝÖ¤ºÅÂë");   
			getServletContext().getRequestDispatcher("/UI/common/fail.jsp").forward   
			  (request,   response);
		}
	}

	private void yuding(HttpServletRequest request, HttpServletResponse response) throws IOException,ServletException {
		HotelClient client = new HotelClient();
		client.cleintname = request.getParameter("clientname");
		String sexClient = request.getParameter("sex");
		client.sex = sexClient;
		client.age = request.getParameter("age");
		client.shenfenzheng = request.getParameter("shenfenzheng");
		client.minzu = request.getParameter("minzu");
		client.dianhua = Integer.valueOf(request.getParameter("dianhua")).intValue();
		int key = HotelService.clientYuding(client);
		switch(key)
		{
			case 0:
				response.sendRedirect("UI/common/success.html");
				break;
			case 1:
				response.sendRedirect("UI/content/schedule/scheduleInfo.html");
				break;
			default:
				break;
		}
	}

}
