package com.semi.member.controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import com.semi.member.model.vo.Member;
import com.semi.member.service.MemberService;
import com.semi.member.service.MemberServiceImpl;

import java.io.IOException;
import java.util.List;

public class FindId2Controller extends HttpServlet {
    private static final long serialVersionUID = 1L;

    private MemberService memberService = new MemberServiceImpl();

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");

        // 'searchName'과 'searchPhone'을 받아옴
        String searchName = request.getParameter("searchName");
        String searchPhone = request.getParameter("searchPhone");

        List<Member> searchResults = null;

        // 조건이 모두 입력되었는지 확인하고 검색 실행
        if ((searchName != null && !searchName.isEmpty()) && (searchPhone != null && !searchPhone.isEmpty())) {
            // 이름과 전화번호로 회원 정보를 검색
            searchResults = memberService.searchMembersByNameAndPhone(searchName, searchPhone);
        } else {
            // 오류 처리: 이름과 전화번호가 입력되지 않은 경우
            request.setAttribute("error", "이름과 전화번호를 입력해 주세요.");
            request.getRequestDispatcher("/views/jsp/FindId1.jsp").forward(request, response);
            return;
        }

        // 검색 결과가 없는 경우 처리
        if (searchResults == null || searchResults.isEmpty()) {
            request.setAttribute("error", "해당하는 회원 정보를 찾을 수 없습니다.");
            request.getRequestDispatcher("/views/jsp/FindId1.jsp").forward(request, response);
        } else {
            // 검색 결과를 request에 저장하고 FindId2.jsp로 전달
            request.setAttribute("memberList", searchResults);
            request.getRequestDispatcher("/views/jsp/FindId2.jsp").forward(request, response);
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }
}
