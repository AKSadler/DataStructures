package ds;

import java.util.Scanner;
import java.util.Stack;

public class DataStructures {

	public static void main(String[] args) {

		Scanner scan1 = new Scanner(System.in);

		System.out.println("Please enter a math problem: ");
		String userInput = scan1.nextLine();

		Stack<Integer> s = new Stack<Integer>();
		int x = 0;
		int y = 0;
		int z = 0;

		z = getAnswer(userInput, s, z);
		System.out.println("The answer is: " + s.push(z));	

	}

	public static int getAnswer(String userInput, Stack<Integer> s, int z) {
		int x;
		int y;
		for (int i = 0; i < userInput.length(); i++) {
			char c = userInput.charAt(i);

			if (c >= '0' && c <= '9') {

				x = Character.getNumericValue(c);
				// System.out.println(x);
				s.push(x);
			}

			else {

				switch (c) {
				case '*':
					x = s.pop();
					y = s.pop();
					z = x * y;
					s.push(z);
					break;

				case '/':
					x = s.pop();
					y = s.pop();
					z = y / x;
					s.push(z);
					break;

				case '-':
					x = s.pop();
					y = s.pop();
					z = y - x;
					s.push(z);
					break;

				case '+':
					x = s.pop();
					y = s.pop();
					z = x + y;
					s.push(z);
					break;
				}
				
			}
			
		}
		return z;
	}
	
}

