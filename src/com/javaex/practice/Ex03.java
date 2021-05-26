package com.javaex.practice;

import java.util.Scanner;

public class Ex03 {
	//나이를 입력했을때 20살보다 많으면 "1번그룹"입니다. 라고출력되고 20살이거나 낮으면
	//"2번그룹"입니다. 라고출력된다 
	//여기서 println을 사용하였기 때문에 "입니다."는 밑줄에 출력된다.
	public static void main(String[] args) {
		int age;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("나이를 입력해주세요");
		System.out.print("나이: ");
		age = sc.nextInt();
		
		if(age > 20) {
			System.out.println("\"1번그룹\"");
		}else {
			System.out.println("\"2번그룹\"");
		}
		System.out.println("입니다.");
		
		sc.close();

	}

}
