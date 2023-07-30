package _99_extra;


import javax.swing.JOptionPane;

public class SimpleCalculator {
	public static void main(String[] args) {

		// 1. Get 2 numbers from the user and convert them to integer.
		String num1 = JOptionPane.showInputDialog("GIVE ME A NUMBER!!!");
		int one  = Integer.parseInt(num1);
		String num2  = JOptionPane.showInputDialog( "gimme another number.");
		int two = Integer.parseInt(num2);
		// 2. Customize pop-up to support add/subtract/multiply/divide operations.
		int operation = JOptionPane.showOptionDialog(null, "question", "Pop-up Title", 0,
				JOptionPane.INFORMATION_MESSAGE, null, new String[] { "add", "subtract", "multiply", "divide" },
				null);
		if (operation == 0) {
			addition(one, two);
		} else if (operation == 1) {
			subtract(one, two);
		} else if (operation == 2) {
			multiply(one, two);
		} else if (operation == 3) {
			divide(one, two);
		}
	

		// 5. Call the methods created in steps 3 and 4 to perform the appropriate operation.

		// 6. Wrap steps 1, 2 and 5 in a for loop to repeat calculator operations
	}

	// 3. Create method for addition operation.
	public static void addition(int one, int two) {
		int sol = one + two;
		JOptionPane.showMessageDialog(null, one + " + " + two + " = " + sol);
	}
	//    Method should create pop-up that shows equation and solution, eg. 45 + 25 = 70.
	//    HINT: use 'static void add(int num1, num2) { ... }
	public static void multiply (int one, int two) {
		int sol = one * two;
		JOptionPane.showMessageDialog(null, one + " * " + two + " = " + sol );
	}
	public static void divide (double one, double two) {
		double sol = one / two;
		JOptionPane.showMessageDialog(null, one + " / " + two + " = " + sol );
	}
	public static void subtract (int one, int two) {
		int sol = one - two;
		JOptionPane.showMessageDialog(null, one + " - " + two + " = " + sol );
	}
	// 4. Create similar methods for subtraction, multiplication and division.
}