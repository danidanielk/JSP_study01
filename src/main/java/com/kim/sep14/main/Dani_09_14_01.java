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
		//랜선에 붙어있는 응답용 빨대 
//		PrintWriter out =  response.getWriter();
//		out.print("<html>");
//		out.print("<head><title>Hello!</title><meta charset='EUC-KR'></head>");
//		out.print("<body>");
//		for (int i = 0; i < 5; i++) {
//			out.print("<marquee>Hello!</marquee>");
//		}			
//		out.print("</body>");
//		out.print("</html>");
	
		
		
		//서블릿을 실행했을때 주소창의 요청 파라미터 lang 의 값으로 
		//	korean을 입력하면 '네'
		//	english를 입력하면 'yes'
		//	그외에는 '몰라'
		// <h1> 태그를 써서 출력해보자.
		
		
		// 클라이언트에게 서버측이 어떤 방식으로 인코딩을 했는지 항상 알려줘야한다.
		response.setCharacterEncoding("EUC-KR");
		
		// ?변수명=값&변수명=값&... 요청파라미터 lang 의 값으로 ;;? 해보자
		String language =  request.getParameter("lang");
		
		PrintWriter out =  response.getWriter();
		out.print("<html>");
		out.print("<head><title>Hello!</title><meta charset='EUC-KR'></head>");
		out.print("<body>");
		out.print("<h1>");
		if(language.equals("korean")) {
			out.print("네");
		}else if(language.equals("english")) {
			out.print("yes");
			
		}else {
			out.print("몰라");
		}
		out.print("</h1>");
		out.print("</body>");
		out.print("</html>");
		
	}
//post 방식 요청받으면  프로그램을 통해서만 가능(계정의 비밀번호같이 주소값에 숨기고 싶은것들..)
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
	
	}

}
