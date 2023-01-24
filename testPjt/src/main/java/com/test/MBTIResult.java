package com.test;

import java.io.IOException;
import java.util.Arrays;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/mr")
public class MBTIResult extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String select_no = request.getParameter("select_no");
		String[] question_select = select_no.split(",");
		int[] choice = new int[question_select.length];
		
		int c = 0;
		for(String qs : question_select) {
			choice[c] = Integer.parseInt( qs.split("_")[1].substring(3, 4) );
			c++;
		}
		
		char[] mbti = {'R', 'T', 'C', 'F', 'J', 'M', 'A', 'N'};
		int[] score = new int[mbti.length];
		
		String[] survey = { "RT", "TR", "FC", "CF", "MJ", "JM", "AN", "NA" };
		
		char[] key = new char[survey.length];
		int[] value = new int[survey.length];
		
		String result = "";
		
		for(int i = 0; i < survey.length; i++) {
			if (choice[i] < 4) key[i] = survey[i].charAt(0);
			else if(choice[i] > 4) key[i] = survey[i].charAt(1);
			else key[i] = survey[i].charAt(0) < survey[i].charAt(1) ? survey[i].charAt(0) : survey[i].charAt(1);
			
			value[i] = Math.abs(choice[i] - 4);
		}
		
		for(int i = 0; i < mbti.length; i++) {
			for(int j = 0; j < survey.length; j++) {
				if(mbti[i] == key[j]) score[i] += value[j];
			}
		}
		
		for(int i = 0; i < score.length; i+=2) {
			if(score[i] > score[i+1]) result += mbti[i];
			else if((score[i] < score[i+1])) result += mbti[i+1];
			else result += mbti[i] < mbti[i+1] ? mbti[i] : mbti[i+1];
		}
		
		System.out.println("\n[R, T, C, F, J, M, A, N]");
		System.out.println(Arrays.toString(score));
		System.out.println(result);
		
		response.sendRedirect("mbti.jsp?result=" + result);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
