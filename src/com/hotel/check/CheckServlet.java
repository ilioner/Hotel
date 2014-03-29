package com.hotel.check;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import entity.HotelClient;
import entity.HotelRoom;
import service.HotelService;

/**
 * Servlet implementation class CheckServlet
 */
public class CheckServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CheckServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.setCharacterEncoding("utf-8");
		String listAll = request.getParameter("listAll");
		if(listAll != null){
			ArrayList<HotelClient> array = HotelService.getAllClientList();
			request.setAttribute("clientList", array);
			getServletContext().getRequestDispatcher("/UI/checkView/listAllClient.jsp").forward   
			  (request,   response);
		}else{
			ArrayList<HotelRoom> array = HotelService.getRoomList();
			request.setAttribute("roomList", array);
			getServletContext().getRequestDispatcher("/UI/checkView/checkview.jsp").forward   
			  (request,   response);
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.setCharacterEncoding("utf-8");
		String method = request.getParameter("method");
		String idCard = request.getParameter("shenfenzheng");
		HotelClient client = HotelService.getClientSchedule(idCard);
		request.setAttribute("client", client);
		getServletContext().getRequestDispatcher("/UI/checkView/checkAClient.jsp").forward   
		  (request,   response);
	}

}
