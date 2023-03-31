package basic.dev;

import java.util.Scanner;
import java.util.Stack;

public class MianApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<Integer> s = new Stack<>();
		s.push(1);
		s.push(2);
		s.push(3);
		s.push(4);
		s.push(5);
		//2.a
		System.out.println("Số phân tử trong S là : " + s.size());
		//2.b
		xuatNoiDungPhanTuN(s);
		//2.c
		System.out.println("\nNội dung trong stack : " + s);
		//2.d
		xoaPhanTu(s);
		//4
		Stack<Integer> daoNguocStack = reverseStack(s);
		System.out.println("Stack sau khi đảo ngược : " + daoNguocStack);
		
		
	}
	private static Stack<Integer> reverseStack(Stack<Integer> s) {
		// TODO Auto-generated method stub
		 Stack<Integer> reversedStack = new Stack<>();
	        
	        while (!s.isEmpty()) {
	            int element = s.pop();
	            reversedStack.push(element);
	        }
	        
	        return reversedStack;
	    }

	private static void xoaPhanTu(Stack<Integer> s) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập vị trí phân tử muốn xóa : ");
		int n = sc.nextInt();
		 if (n >= 0 && n < s.size()) {
		        int removedElement = s.remove(s.size() - n - 1);
		        System.out.println("Stack sau khi xóa: " + s);
		    } else {
		        System.out.println("Vị trí không có trong Stack!");
		    }
	}

	private static void xuatNoiDungPhanTuN(Stack<Integer> s) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập vị trí phân tử muốn xuất nội dung : ");
		int n = sc.nextInt();
		if( n < s.size()) {
			 int element = s.get(s.size()-n-1);
			 System.out.printf("Vị trí %d có nội dung là : " + element,n);
		}else {
			System.out.println("Vị trí không có trong stack!");
		}
	}

}
