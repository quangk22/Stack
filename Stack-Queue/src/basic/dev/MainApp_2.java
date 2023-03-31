package basic.dev;

import java.util.Scanner;
import java.util.Stack;

public class MainApp_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<Integer> stack = new Stack<>();
		Stack<Integer> stack1 = new Stack<>();

		stack.push(123);
		stack.push(54);
		stack.push(14);
		stack.push(52);
		stack.push(34);
		stack.push(62);
		stack.push(18);
		stack.push(3);
		System.out.println("stack" + stack);
		while (stack.size() > 0) {

			int decimal = stack.pop();
			// dao nguoc statck
			stack1.push(decimal);
			String binary = decimalToBinary(decimal);
			System.out.println("Số nhị phân của " + decimal + " là : " + binary);
		}
	}

	public static String decimalToBinary(int decimal) {
		Stack<Integer> stack = new Stack<Integer>();
		while (decimal != 0) {
			int remainder = decimal % 2;
			stack.push(remainder);
			decimal /= 2;
		}
		StringBuilder binary = new StringBuilder();
		while (!stack.isEmpty()) {
			binary.append(stack.pop());
		}
		return binary.toString();
	}

}
