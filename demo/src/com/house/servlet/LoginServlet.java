package com.house.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.house.dao.IUserDao;
import com.house.dao.impl.UserDaoImpl;

public class LoginServlet extends HttpServlet {

	
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doPost(request, response);
	}

	
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		//写处理语句：
		//获取用户输入的数据：
		String uname = request.getParameter("unm") ;
		String upwd = request.getParameter("upwd") ;
//		M: model -> 处理业务逻辑（模型）
//		V: view -> jsp(视图显示)
//		C: servlet -> controler(控制器)
		IUserDao dao = new UserDaoImpl() ;
		if(dao.login(uname, upwd)){
			request.setAttribute("msg", "登陆成功！");
			request.getRequestDispatcher("main.jsp").forward(request, response);
		}else{
			request.setAttribute("msg", "登陆失败，请重试！");
			request.getRequestDispatcher("index.jsp").forward(request, response);
		}
		
		out.flush();
		out.close();
	}

}
