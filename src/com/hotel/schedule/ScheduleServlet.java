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
		} else if (request.getParameter("method").equals("getAScheduel")){
			System.out.println("geta ");
			getASchedule(request,response);
		} else if (request.getParameter("method").equals("modifyThisSchedule")){
			modifyASchedule(request,response);
		}
	}

	private void modifyASchedule(HttpServletRequest request,
			HttpServletResponse response) {
		HotelClient client = new HotelClient();
		client.clientname = request.getParameter("clientname");
		String sexClient = request.getParameter("sex");
		client.sex = sexClient;
		client.age = request.getParameter("age");
		client.shenfenzheng = request.getParameter("shenfenzheng");
		client.minzu = request.getParameter("minzu");
		client.dianhua = Integer.valueOf(request.getParameter("dianhua")).intValue();
		
	}

	private void getASchedule(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		String idCard = request.getParameter("idCard");
		System.out.println("geta "+idCard);
		if (idCard.length() != 0){
			if (HotelService.getClientSchedule(idCard) != null)
			{
				System.out.println("get ok");
				HotelClient client = HotelService.getClientSchedule(idCard);
				request.setAttribute("HotelClient",client);   
				getServletContext().getRequestDispatcher("/UI/content/schedule/modifySchedule.jsp").forward   
				  (request,   response);
			}else
			{
				System.out.println("get error");
				request.setAttribute("status","查找失败，请检查您所输入的身份证号码或者稍后再试，");   
				getServletContext().getRequestDispatcher("/UI/common/fail.jsp").forward   
				  (request,   response);
			}
		}
	}

	private void deleteThisSchedule(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		String idCard = request.getParameter("idCard");
		if(HotelService.deleteThisSchedule(idCard)){
			System.out.println(" delete OK");
			request.setAttribute("status","删除成功");   
			getServletContext().getRequestDispatcher("/UI/common/success.jsp").forward   
			  (request,   response);  
		}else{
			System.out.println(" delete error");
			request.setAttribute("status","删除失败，请检查身份证号码");   
			getServletContext().getRequestDispatcher("/UI/common/fail.jsp").forward   
			  (request,   response);
		}
	}

	private void yuding(HttpServletRequest request, HttpServletResponse response) throws IOException,ServletException {
		HotelClient client = new HotelClient();
		client.clientname = request.getParameter("clientname");
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
				request.setAttribute("status","预定成功");   
				getServletContext().getRequestDispatcher("/UI/common/success.jsp").forward   
				  (request,   response);
				break;
			case 1:
				response.sendRedirect("UI/content/schedule/scheduleInfo.html");
				break;
			default:
				break;
		}
	}

}
