package com.kim.sep14.main;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//LearnServlet  �� ��Ĺ�� ��� 
@WebServlet("/LearnServlet")

//httpServlet Ŭ������ �ִ� ��� ��ӹ���.
public class LearnServlet extends HttpServlet {
	
//�۾��ϸ鼭 ���� ǥ���϶�� �ִ°�(������ ����)	
	private static final long serialVersionUID = 1L;
       
//�⺻������ �� �ǹ̾��� (������ ����)	
    public LearnServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

    //event-driven-programming (�̺�Ʈ ��� ���α׷���)
    //Tomcat �� ������ ->  Learnservlet �� ���� -> 
    // tomcat�� Learnservlet�̶�� ��ü������ ���ѷ��� ->
    // � �̺�Ʈ�� �߻��ϸ� �װ��� ó���ϰ� ������ ����
    // �Ʒ� �� �޼ҵ尡 �ٽ�
    
    
// �������ٰ� Ŭ���̾�Ʈ�� �� �������� get��� ��û�ϸ�
// ��Ĺ�� doget�޼ҵ带 �ڵ����� ȣ��
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

    
// �������ٰ� Ŭ���̾�Ʈ�� �� �������� post��� ��û�ϸ�
// ��Ĺ�� dopost �޼ҵ带 �ڵ����� ȣ��
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
