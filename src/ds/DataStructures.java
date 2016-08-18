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
		System.out.println("The answer is: " + s.push(z));	

	}
	
}

// int x = Integer.parseInt();

// System.out.println(s.pop());

// if (x)

// s.push(5); //how you add items
// s.push(15);
// s.push(1);

// System.out.println(s.pop()); //last in first outs

// teach a computer how to do math 5*2+3

// userInput for string
// for:go over one character at a time
// if: if char is a number then push to the stack
// Else pop numbers and do the operation and push back to the stack
// 52*3+
// 63-1+
// for loop with if statements
// convert string to number int x = Integer.parse()
// submit by 9 am
