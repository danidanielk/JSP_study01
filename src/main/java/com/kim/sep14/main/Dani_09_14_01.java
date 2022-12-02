package com.kim.sep14.main;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Dani_09_14_01")
public class Dani_09_14_01 extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//������ �پ��ִ� ����� ���� 
//		PrintWriter out =  response.getWriter();
//		out.print("<html>");
//		out.print("<head><title>Hello!</title><meta charset='EUC-KR'></head>");
//		out.print("<body>");
//		for (int i = 0; i < 5; i++) {
//			out.print("<marquee>Hello!</marquee>");
//		}			
//		out.print("</body>");
//		out.print("</html>");
	
		
		
		//������ ���������� �ּ�â�� ��û �Ķ���� lang �� ������ 
		//	korean�� �Է��ϸ� '��'
		//	english�� �Է��ϸ� 'yes'
		//	�׿ܿ��� '����'
		// <h1> �±׸� �Ἥ ����غ���.
		
		
		// Ŭ���̾�Ʈ���� �������� � ������� ���ڵ��� �ߴ��� �׻� �˷�����Ѵ�.
		response.setCharacterEncoding("EUC-KR");
		
		// ?������=��&������=��&... ��û�Ķ���� lang �� ������ ;;? �غ���
		String language =  request.getParameter("lang");
		
		PrintWriter out =  response.getWriter();
		out.print("<html>");
		out.print("<head><title>Hello!</title><meta charset='EUC-KR'></head>");
		out.print("<body>");
		out.print("<h1>");
		if(language.equals("korean")) {
			out.print("��");
		}else if(language.equals("english")) {
			out.print("yes");
			
		}else {
			out.print("����");
		}
		out.print("</h1>");
		out.print("</body>");
		out.print("</html>");
		
	}
//post ��� ��û������  ���α׷��� ���ؼ��� ����(������ ��й�ȣ���� �ּҰ��� ����� �����͵�..)
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
	
	}

}
