package loops;

import javax.swing.JOptionPane;

public class Ex36 {

	public static void main(String[] args) {

		int initialValue, finalValue, quantityIntegers = 0, quantityOdd = 0, quantityEven = 0,
				quantityMultiple3and7 = 0;

		int a1 = 0, a2 = 0, a3 = 0, a4 = 0;

		initialValue = Integer.parseInt(JOptionPane.showInputDialog(null, "Input initial value: "));

		finalValue = Integer.parseInt(JOptionPane.showInputDialog(null, "Input final value: "));

		if (initialValue > finalValue) {

			JOptionPane.showMessageDialog(null, "Final value must be greater than initial value!!");

		}

		else {

			for (int i = initialValue; i <= finalValue; i++) {

				if (i % 2 == 0) {

					quantityEven++;

					a1 += i;

				}

				else if (i % 2 == 1) {

					quantityOdd++;

					a2 += i;

					if (i % 3 == 0 && i % 7 == 0) {

						quantityMultiple3and7++;

						a3 += i;

					}

				}

				quantityIntegers++;
				a4 += i;

			}

			a1 /= quantityEven;

			a2 /= quantityOdd;

			a3 /= quantityMultiple3and7;

			a4 /= quantityIntegers;

			JOptionPane.showMessageDialog(null,
					"Quantity of Integers: " + quantityIntegers + "\nQuantity of Even: " + quantityEven
							+ "\nQuantity of Odd: " + quantityOdd + "\nQuantity of Multiples by 3 and 7 : "
							+ quantityMultiple3and7);

			JOptionPane.showMessageDialog(null,
					"Arithmetic Mean of Even Values: " + a1 + "\nArithmetic Mean of Odd Values: " + a2
							+ "\nArithmetic Mean of multiples by 3 and 7: " + a3 + "\nArithmetic Mean of Integers: "
							+ a4);

		}

	}

}
