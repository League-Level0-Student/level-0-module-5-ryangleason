import javax.swing.JOptionPane;

public class PrimeOrNot {
	public static void main(String[] args) {
		String NumString = JOptionPane.showInputDialog("Enter a number");
		int Num = Integer.parseInt(NumString);
		boolean prime = true;

		for (int i = 2; i < Num / 2; i++) {

			if (Num % i == 0) {
				prime = false;

			}

			//System.out.println(prime);

		}
		if (prime == true) {
			JOptionPane.showMessageDialog(null, "It is prime");
		}
		if (prime == false) {
			JOptionPane.showMessageDialog(null, "This number isn't prime");
		}
	}
}
