package com.kh.controller;

import java.io.IOException;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class RequestPostServlet
 */
public class RequestPostServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RequestPostServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//회사에서는 톰캣 10버전(자동으로 UTF-8)보다는 자동이 안되는 8버전이나 9버전일 확률이 매우 높다.
		//POST방식같은 경우
		//데이터를 추출하기전에 인코딩 형식을 설정해줘야 함
		request.setCharacterEncoding("UTF-8");
		
		//요청시 전달된 값들은 request의 parameter영역에 담겨있음
		String name = request.getParameter("name"); // "최지원" | ""
		String gender = request.getParameter("gender"); // "M" | "W" | null
		int age = Integer.parseInt(request.getParameter("age"));// "23" => 23
		String city = request.getParameter("city"); // "경기" | "서울" 등등
		double height = Double.parseDouble(request.getParameter("height")); // "179" -> 179.0000
		
		//체크박스와 같이 복수의 벨류값들을 추출하고자 할 때
		String[] foods = request.getParameterValues("food"); // ["한식", "중식"] | null
		
		System.out.println("name :" + name);
		System.out.println("gender :" + gender);
		System.out.println("age :" + age);
		System.out.println("city :" + city);
		System.out.println("height :" + height);
		
		if(foods == null) {
			System.out.println("foods : 없음 ");
		} else {
			System.out.println("foods : " + String.join(" ", foods));
		}
		
		//> service > dao > db
		/*
		 * int result = new MemberService().insertMember(name, gender...);
		 * if (result > 0) {
		 *	//성공
		 * } else {
		 * 	//실패
		 * }
		 */
		
		
		//순수 servlet방식 : java코드 내에 html을 기술
		//JSP(Java Server Page)방식 : html내에 java코드를 쓸 수 있음
		//java는 구조가 보이지 않아서 그 안에 html을 써도 구조가 잘 보이지 않음.
		//but, html은 구조적언어여서 그 안에 java를 쓰면 덩달아 구조가 잘 파악됨.
		
		//응답페이지를 만드는 과정을 jsp에게 위임
		//단, 응답화면에서 필요로하는 데이터들을 차곡차곡담아서 전달해줘야한다.
		//데이터들을 담기위한 공간 == request의 attribute영역
		//request.setAttribute("키", 값)
		
		request.setAttribute("name", name);
		request.setAttribute("age", age);
		request.setAttribute("city", city);
		request.setAttribute("height", height);
		request.setAttribute("gender", gender);
		request.setAttribute("foods", foods);
		
		//응답하고자하는 뷰(jsp) 선택해서 넘겨줌 ->getRequestDispatcher()메서드를 호출함으로서 RequestDispatcher객체를 생성 후 view라는 변수에 저장
		//RequestDispatcher객체 - (특정 경로(JSP나 다른 서블릿 등)로 요청을 전달하는 역할)
		RequestDispatcher view = request.getRequestDispatcher("/views/responsePage.jsp");
		/*
		 .forward(request, response) : 
		요청(request)과 응답(response)객체를 지정된 경로로 포워딩한다.
		즉, 기존의 요청을 그대로 유지한 상태에서 JSP 페이지로 제어를 넘기고, 해당 JSP가 응답을 생성한다.
		서버 내에서만 동작하며, 클라이언트는 실제로 어떤 JSP나 서블릿으로 요청이 전달되었는지 알 수 없다. URL이 변경되지 않는다.
		*/
		view.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("post호출완료");
		doGet(request, response);
	}

}