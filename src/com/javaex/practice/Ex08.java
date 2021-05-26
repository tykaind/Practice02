package com.javaex.practice;

import java.util.Scanner;

public class Ex08 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자 3개를 입력해주세요");
		
		System.out.print("숫자1: ");
		int a = sc.nextInt();
		
		System.out.print("숫자2: ");
		int b = sc.nextInt();
		
		System.out.print("숫자3: ");
		int c = sc.nextInt();

		if( b>a && c>a) {
			System.out.println("가장 작은수는 "+a+" 입니다.");
		}else {
			if(a>b && c>b) {
			System.out.println("가장 작은수는 "+b+" 입니다.");
			}else {
				if(a>c && b>c) {
					System.out.println("가장 작은수는 "+c+" 입니다.");					
				}
			}
		}
		sc.close();

	}

}
