package com.javaex.ex06;

public class PointApp {

	public static void main(String[] args) {
		
		Point p1 = new Point(2, 3);
		Point p2 = new Point(2, 3);
		Point p3 = new Point(5, 3);
		Point p4 = p1;
		
		System.out.println(p1 == p2); // ==데이터값이 아닌 주소값이 같은지 비교 
		System.out.println(p2 == p3);
		System.out.println(p3 == p4);
		System.out.println(p4 == p1); //주소값이 같으니까	 Point p4 = p1;
		System.out.println(p1.equals(p2));
		System.out.println(p4.equals(p1)); //주소값이 같으니까 Point p4 = p1;
	}

}


