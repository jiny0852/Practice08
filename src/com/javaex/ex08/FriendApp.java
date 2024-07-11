package com.javaex.ex08;

import java.util.Scanner;

public class FriendApp {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("친구를 3명 등록해 주세요");
		
		Friend[] fArr = new Friend[3];
		for (int i = 0; i < fArr.length ; i++ ) {
			String s = sc.nextLine();
			
			//여길 예쁘게 줄여보시오
			Friend f = new Friend();
			
			String[] r = s.split(" ");
			
			f.setName(r[0]);
			f.setHp(r[1]);
			f.setSchool(r[2]);
			
			fArr[i] = f;
			//
		}
		
		for(int i = 0; i < fArr.length ; i++) {
			//System.out.println(fArr[i].toString());
			System.out.println(fArr[i].showInfo());
		}
		
		
		
		sc.close();

	}

}
