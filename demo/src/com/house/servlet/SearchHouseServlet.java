package com.house.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.house.dao.IHouseRentDao;
import com.house.dao.impl.HouseRentDaoImpl;
import com.house.vo.Rent;


public class SearchHouseServlet extends HttpServlet {

	/**
		 * The doGet method of the servlet. <br>
		 *
		 * This method is called when a form has its tag value method equals to get.
		 * 
		 * @param request the request send by the client to the server
		 * @param response the response send by the server to the client
		 * @throws ServletException if an error occurred
		 * @throws IOException if an error occurred
		 */
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		doPost(request, response);
	}

	/**
		 * The doPost method of the servlet. <br>
		 *
		 * This method is called when a form has its tag value method equals to post.
		 * 
		 * @param request the request send by the client to the server
		 * @param response the response send by the server to the client
		 * @throws ServletException if an error occurred
		 * @throws IOException if an error occurred
		 */
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		//ËÑË÷ºÃ·¿×Ó
		String type = request.getParameter("type") ;
		String sname = request.getParameter("sname") ;
		IHouseRentDao dao = new HouseRentDaoImpl();
		HashMap<String, Object> params = new HashMap<String, Object>();
		switch(type){
			case "0":
				params.put("rarea", sname);
				break;
			case "1":
				params.put("rprice", sname);
				break;
			case "2":
				params.put("rposition", sname);
				break; 
			case "3":
				params.put("rdate", sname);
				break ;
		}
		ArrayList<Rent> datas = dao.searchHouse(params) ;
		request.setAttribute("datas", datas);
		request.getRequestDispatcher("search.jsp").forward(request, response);
		
		out.flush();
		out.close();
	}

}
