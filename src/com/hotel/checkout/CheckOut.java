package com.hotel.checkout;

import java.io.IOException;
import java.util.HashMap;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import service.HotelService;
import jdbcUtil.HotelJDBC;

/**
 * Servlet implementation class CheckOut
 */
public class CheckOut extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CheckOut() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String idCard = request.getParameter("idCard");
		String roomNo = request.getParameter("roomNo");
		boolean key = HotelService.checkOutThis(idCard,roomNo);
		if (key){
			request.setAttribute("status", "退房成功");
			getServletContext().getRequestDispatcher("/UI/common/success.jsp").forward   
			  (request,   response); 
		}else{
			request.setAttribute("status", "退房失败");
			getServletContext().getRequestDispatcher("/UI/common/fail.jsp").forward   
			  (request,   response); 
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String roomno = request.getParameter("roomno");
		HashMap map = HotelJDBC.getChectOutUser(roomno);
		if(map != null){
			request.setAttribute("hashmap", map);
			getServletContext().getRequestDispatcher("/UI/checkoutView/checkOut.jsp").forward   
			  (request,   response); 
		}else{
			request.setAttribute("status", "查找失败或者该帐号不存在");
			getServletContext().getRequestDispatcher("/UI/common/fail.jsp").forward   
			  (request,   response); 
		}
	}

}
