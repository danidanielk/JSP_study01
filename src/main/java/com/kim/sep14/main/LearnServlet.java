package com.kim.sep14.main;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//LearnServlet  을 톰캣에 등록 
@WebServlet("/LearnServlet")

//httpServlet 클래스에 있는 기능 상속받음.
public class LearnServlet extends HttpServlet {
	
//작업하면서 버전 표시하라고 있는거(지워도 무방)	
	private static final long serialVersionUID = 1L;
       
//기본생성자 별 의미없음 (지워도 무방)	
    public LearnServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

    //event-driven-programming (이벤트 기반 프로그래밍)
    //Tomcat 이 실행중 ->  Learnservlet 을 실행 -> 
    // tomcat이 Learnservlet이라는 객체를만들어서 무한루프 ->
    // 어떤 이벤트가 발생하면 그것을 처리하고 루프로 복귀
    // 아래 두 메소드가 핵심
    
    
// 루프돌다가 클라이언트가 이 서블릿으로 get방식 요청하면
// 톰캣이 doget메소드를 자동으로 호출
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

    
// 루프돌다가 클라이언트가 이 서블릿으로 post방식 요청하면
// 톰캣이 dopost 메소드를 자동으로 호출
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
