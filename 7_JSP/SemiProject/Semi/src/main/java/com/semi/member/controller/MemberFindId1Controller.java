package com.semi.member.controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import com.semi.member.model.vo.Member;
import com.semi.member.service.MemberService;
import com.semi.member.service.MemberServiceImpl;

import java.io.IOException;
import java.util.List;


public class MemberFindId1Controller extends HttpServlet {
    private static final long serialVersionUID = 1L;

    private MemberService memberService = new MemberServiceImpl();

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");

        // 검색 조건인 이름과 전화번호를 가져옴
        String searchName = request.getParameter("searchName");
        String searchPhone = request.getParameter("searchPhone");

        List<Member> searchResults = null;

        // 조건이 모두 입력되었는지 확인하고 검색 실행
        if (searchName != null && !searchName.isEmpty()) {
            searchResults = memberService.searchMembersByName(searchName);
        } else if (searchPhone != null && !searchPhone.isEmpty()) {
            searchResults = memberService.searchMembersByPhone(searchPhone);
        }

        // 검색 결과를 request에 저장하고 JSP로 전달
        request.setAttribute("memberList", searchResults);
        request.getRequestDispatcher("/views/jsp/FindId1.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }
}