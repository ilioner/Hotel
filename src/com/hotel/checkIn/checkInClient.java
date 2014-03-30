package com.hotel.checkIn;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import entity.HotelRoom;
import service.HotelService;

/**
 * Servlet implementation class checkInClient
 */
public class checkInClient extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public checkInClient() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		String method = request.getParameter("method");
		if(method != null){
			HashMap map = HotelService.getRoomNoAndClientSchedule();
			request.setAttribute("map", map);
			getServletContext().getRequestDispatcher("/UI/checkInView/checkInRoom.jsp").forward   
			  (request,   response);
		}else{
				String idCard = request.getParameter("idCard");
				String roomNo = request.getParameter("roomNo");
				if(HotelService.updateAllInfoClientAndRoom(idCard,roomNo))
				{
					response.sendRedirect("/Hotel/checkInClient?method=getAll");
				}else{
					request.setAttribute("status", "µÇ¼ÇÈë×¡Ê§°Ü");
					getServletContext().getRequestDispatcher("/UI/common/fail.jsp").forward   
					  (request,   response);  
				}
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

}
