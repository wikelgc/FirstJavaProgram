/**
 * 
 */
package Maintest;

import java.util.Scanner;

//import javax.security.auth.Subject;

/**
 * @author Administrator
 *1
 */
public class Maintest {
	private static final String Div = null;

	public static void main(String args[]){
		//char i;
		
		System.out.println("请选择:");
		System.out.println("1.加法");
		System.out.println("2.减法");
		System.out.println("3.乘法");
		System.out.println("4.除法");
		Scanner in = new Scanner(System.in);
		int  mm = in.nextInt();
		in.close();
		switch(mm)
		{
		case 1:System.out.println("ADD");Add();break;
		case 2:System.out.println("SUB");Sub();break;
		case 3:System.out.println("MUL");Mul();break;
		case 4:System.out.println("DIV");Div();break;
		}
		
	
	}

	private static void Div() {
		// TODO Auto-generated method stub
		Div D = new Div();
		System.out.println("输入两个数");
		Scanner in = new Scanner(System.in);
	
		int  a = in .nextInt();
		int  b = in.nextInt();
		int  c = in.nextInt();
		in.close();
		Maintest.Div.division(a);
		Maintest.Div.division(a, b);
		Maintest.Div.division(a, b, c);
	}


	private static void Mul() {
		// TODO Auto-generated method stub
		
	}

	private static void Sub() {
		// TODO Auto-generated method stub
		
	}

	private static void Add() {
		// TODO Auto-generated method stub
		
		
	}



}
