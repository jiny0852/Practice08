package com.javaex.ex05;

import java.util.Scanner;

public class CalcApp {

    public static void main(String[] args) {
    	
    	Scanner sc = new Scanner(System.in);
    	boolean on = true;
    	
    	while (on) {
    		
    		System.out.print(">> ");
        	String s = sc.nextLine();
        	if (s.equals("q") ) {
        		System.out.println("종료합니다.");
        		on = false;
        	}
        	
        	String[] r = s.split(" ");
        	//System.out.println(r[0]);
        	//System.out.println(r[1]);
        	//System.out.println(r[2]);
        	
        	
        	if (r[1].equals("+")) {
        		Add result = new Add();
        		result.setValue(Integer.parseInt(r[0]), Integer.parseInt(r[2])); 
        		System.out.println(">> "+ result.calculate());
        		
        	} else if (r[1].equals("-")) {
        		Div result = new Div();
        		result.setValue(Integer.parseInt(r[0]), Integer.parseInt(r[2])); 
        		System.out.println(">> "+ result.calculate());
        		
        	} else if (r[1].equals("*")) {
        		Mul result = new Mul();
        		result.setValue(Integer.parseInt(r[0]), Integer.parseInt(r[2])); 
        		System.out.println(">> "+ result.calculate());
        		
        	} else if (r[1].equals("/")) {
        		Sub result = new Sub();
        		result.setValue(Integer.parseInt(r[0]), Integer.parseInt(r[2])); 
        		System.out.println(">> "+ result.calculate());
        		
        	} else  {
        		System.out.println("알 수 없는 연산입니다");
        	}
    		
    	}
    	
    	sc.close();
    }
}
