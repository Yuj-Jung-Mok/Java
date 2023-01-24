package com.test;

import java.util.Arrays;
import java.util.Scanner;

class Question {
	
	public String question() {
		// 사용자가 선택한 성격 유형과 점수 위치를 고정적으로 정해놓습니다.
		char[] mbti = {'R', 'T', 'C', 'F', 'J', 'M', 'A', 'N'};
		int[] score = new int[mbti.length];
		
		// 각 지문별로 어떤 유형의 질문인지 정해놓습니다.
		String[] survey = { "RT", "TR", "FC", "CF", "MJ", "JM", "AN", "NA" };
		
		// 사용자가 지문별로 응답한 성격 유형과 점수를 저장해놓는 공간을 만듭니다.
		char[] key = new char[survey.length];
		int[] value = new int[survey.length];
		
		// 사용자가 선택한 지문 결과를 토대로 성격 유형을 출력해줄 변수를 지정 해놓습니다.
		String result = "";
		
		// 콘솔창에서 사용자가 입력한 값을 받기 위해 스캐너를 사용합니다.
		Scanner sc = new Scanner(System.in);
		
		// 정해진 지문의 갯수만큼 동작하기 위해 cnt 변수를 지정하여 비교합니다.
		int cnt = 0;
		while (cnt < survey.length) {
			// 사용자의 입력을 유도합니다.
			System.out.print((cnt + 1) + "번 문항 [" + survey[cnt] + "]. 1 ~ 7 사이의 숫자를 입력하세요 ! >> ");
			int choice = sc.nextInt();
			
			// 사용자가 지정된 범위를 벗어난 값을 입력하지 못하게 유도합니다.
			while(choice < 1 || choice > 7) {
				System.out.println("\n범위를 벗어난 숫자입니다. 다시 입력하세요.");
				System.out.print((cnt + 1) + "번 문항 [" + survey[cnt] + "]. 1 ~ 7 사이의 숫자를 입력하세요 ! >> ");
				choice = sc.nextInt();
			}
			
			// 사용자가 4 미만의 숫자 입력 시 "RT" 유형 중 "R"을 저장하기 위한 조건을 지정합니다.
			if (choice < 4) key[cnt] = survey[cnt].charAt(0);
			// 사용자가 4 초과의 숫자 입력 시 "RT" 유형 중 "T"를 저장하기 위한 조건을 지정합니다.
			else if(choice > 4) key[cnt] = survey[cnt].charAt(1);
			// 사용자가 4 입력 시 어느 유형에도 해당하지 않기에 정해진 규칙대로 "RT" 유형 중 알파벳 순으로 "R"을 저장하기 위한 조건을 지정합니다.
			else key[cnt] = survey[cnt].charAt(0) < survey[cnt].charAt(1) ? survey[cnt].charAt(0) : survey[cnt].charAt(1);
			
			// 예를 들어 사용자가 "RT" 지문에서 1점을 입력한다면 1 - 4를 동작하게 하여 abs함수를 통해 -3을 3으로 변환합니다.
			value[cnt] = Math.abs(choice - 4);
			
			// 지문의 갯수만큼 돌기위해 cnt 변수를 증가 시킵니다.
			cnt++;
		}
		sc.close();
		
		// 각 유형의 mbti 유형을 포함하는지 확인하기 위해 mbti 갯수만큼 반복합니다.
		for(int i = 0; i < mbti.length; i++) {
			// 사용자가 선택한 지문의 갯수만큼 반복합니다.
			for(int j = 0; j < survey.length; j++) {
				// 예를 들어 "R" 유형의 mbti 유형을 선택한 값이 있는지 사용자가 응답한 지문의 갯수만큼 돌립니다.
				// 모든 지문을 돌았으면 안쪽 반복문을 벗어나 다시 바깥쪽 반복문을 돌고 "R" 다음 "T" 유형을 모든 지문과 비교합니다.
				// 그리고 조건에 부합하다면 score 배열에 점수를 저장 시킵니다. 각 배열의 위치는 mbti의 점수를 고정적으로 모아놓게 지정했습니다.
				if(mbti[i] == key[j]) score[i] += value[j];
			}
		}
		
		// 위 반복문을 통해 배열에 정해진 위치에 각 유형의 점수가 저장됐습니다.
		// 모든 성격 유형은 2개 중 한개씩만 가져오기 때문에 반복문의 증가값을 2씩 지정합니다.
		for(int i = 0; i < score.length; i+=2) {
			// 예를 들어 "R", "T" 유형 중 "R" 유형의 점수가 높다면 최종 출력 변수에 "R"을 저장합니다.
			if(score[i] > score[i+1]) result += mbti[i];
			// "R", "T" 유형 중 "T" 유형의 점수가 높다면 최종 출력 변수에 "T"을 저장합니다.
			else if((score[i] < score[i+1])) result += mbti[i+1];
			// "R", "T" 유형의 점수가 동일하다면 규칙대로 알파벳순으로 최종 출력 변수에 "R"을 저장합니다.
			else result += mbti[i] < mbti[i+1] ? mbti[i] : mbti[i+1];
		}
		
		// 각 항목별로 어느 점수를 얻었는지 확인하기 위한 출력문 입니다.
		System.out.println("\n[R, T, C, F, J, M, A, N]");
		System.out.println(Arrays.toString(score));
		
		return result;
	}

}

public class MBTI {

	public static void main(String[] args) {
		Question q = new Question();
		System.out.println("\n당신의 MBTI는 " + q.question() + " 유형 입니다.");
	}

}
