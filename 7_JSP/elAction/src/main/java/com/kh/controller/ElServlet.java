package com.kh.controller;

import java.io.IOException;

import com.kh.model.vo.Person;

import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

/**
 * Servlet implementation class ElServlet
 */
public class ElServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ElServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		/*
		 * 데이터를 담을 수 있는 JSP내장객체의 종류
		 * 
		 * 1. ServletContext(application scope)
		 * 	  한 애플리케이션당 단 1개 존재하는 객체
		 *    이 영역에 데이터를 담으면 애플리케이션 전역에서 사용이 가능
		 *    공유범위가 가장 크다
		 *    프로젝트 1개가 실행되면 무조건 ServletContext1개가 생긴다.
		 *    
		 * 2. HttpSession(session Scope)
		 * 	  한 브라우저당 1개 존재하는 객체(브라우저에서 요청을 하면 톰캣서버에 session이 1개 만들어진다.)
		 *    이 영역에 데이터를 담으면 jsp/servlet단에서 사용이 가능
		 *    session이 만들어질때 session 아이디가 만들어진다.(난수로 되어있음)
		 *    서버가 다시 브라우저로 전송할때 아이디를 같이 보내면서 브라우저의 쿠키에 아이디를 저장해놓음.
		 *    만약 브라우저가 다시 요청을 보낸다면 세션 아이디를 같이 보낼경우 같은 브라우저인지 아닌지 서버는 판단할 수 있음.
		 *    보통 로그인에 많이 사용됨.(다시 접속할 때 로그인 안해도 됨.)(하지만 쿠키를 지우면 다시 접속할 때 다시 로그인하라고 뜸)
		 *    
		 * 3. HttpServletRequest(request scope)
		 * 	  요청때마다 매번 자동으로 생성되는 객체(자동으로 생성되기 때문에, 별도로 생성하거나 가져올 필요가 없다.)
		 * 	  이 영역에 데이터를 담으면 해당 request객체를 포워딩받는 응답jsp에서만 사용 가능
		 * 	  하나의 HTTP 요청 동안만 유지되는 범위. 
		 * 	  요청을 처리하는 동안만 데이터가 유지되고, 응답이 끝나면 사라진다.
		 * 
		 * 4. PageContext(page scope)
		 * 	  jsp페이지마다 존재하는 객체
		 *    공유범위가 가장 작음(해당 페이지에서만 공유)
		 *    다른 JSP 페이지로 이동하거나, 다른 서블릿으로 포워딩될 때는 데이터가 유지되지 않는다.
		 *    각 JSP 페이지가 고유한 PageContext 객체를 가지고 있으며, 이 객체를 사용하여 해당 페이지 내에서만 데이터에 접근할 수 있다.
		 *    
		 * 위 4개의 객체들에 
		 * 데이터를 담을 때 -> .setAttribute('키', 값)
		 * 데이터를 꺼낼 때 -> .getAttribute('키')
		 * 데이터를 삭제할 때 -> .removeAttribute('키')
		 */
		
		//application scope
		ServletContext application = request.getServletContext();
		application.setAttribute("scope", "application");
		
		//session scope
		HttpSession session = request.getSession();
		session.setAttribute("academy", "kh");
		session.setAttribute("teacher", new Person("김지원", 27, "여자"));
		session.setAttribute("scope", "session");
		
		//request scope
		request.setAttribute("classRoom", "I강의장");
		request.setAttribute("student", new Person("최지원", 20, "남자"));
		request.setAttribute("scope", "request");
		
		//응답페이지를 지정하여 해당 페이지가 포워딩되도록 설정 
		request.getRequestDispatcher("views/1_EL/01_el.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}