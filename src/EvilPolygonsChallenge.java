import java.awt.Color;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class EvilPolygonsChallenge {
	static Robot a = new Robot();

	public static void main(String[] args) {
		// 1. Create a robot

		// 2. Set the speed to 100
		a.setSpeed(100);
		a.penDown();
		int colorChoice = JOptionPane.showOptionDialog(null, "Choose your color thingy", "diabedies",
				JOptionPane.INFORMATION_MESSAGE, JOptionPane.DEFAULT_OPTION, null,
				new String[] { "RED", "GREEN", "BLUE" }, 0);

		// 3. Set the pen color of the robot according to the value of the colorChoise
		// variable
		if (colorChoice == 0) {
			a.setPenColor(255, 0, 0);

		}
		if (colorChoice == 1) {
			a.setPenColor(0, 200, 0);

		}
		if (colorChoice == 2) {
			a.setPenColor(0, 0, 255);
		}

		// 4. Ask the use how many polygons they want to be drawn.
		for (int i = 5; i > 1; i++) {

			String answerString = JOptionPane.showInputDialog("How many polygons to you want to have drawn?");
			int answerInt = Integer.parseInt(answerString);

			if (answerInt == 1) {
				square();

			}
			if (answerInt == 2) {
				square();
				square();

			}
			if (answerInt == 3) {
				square();
				square();
				square();
			}
			if (answerInt == 4) {
				square();
				square();
				square();
				square();
			}
			if (answerInt == 5) {
				square();
				square();
				square();
				square();
				square();
			}
			if (answerInt == 6) {
				square();
				square();
				square();
				square();
				square();
				square();
			}
			if (answerInt == 7) {
				square();
				square();
				square();
				square();
				square();
				square();
				square();
			}
			if (answerInt == 8) {
				square();
				square();
				square();
				square();
				square();
				square();
				square();
				square();

			}
			if (answerInt == 9) {
				square();
				square();
				square();
				square();
				square();
				square();
				square();
				square();
				square();

			}
			if (answerInt > 11) {
				JOptionPane.showMessageDialog(null, "calm yourself kiddo, enter something under 10");

			}
			if (answerInt < 9) {
				break;
			}
		}

		// 5. Use the robot to draw the number of polygons the user requested.

		// 6. Make it so your shapes do not overlap

		// 7. Challenge: add more colors to the Option Dialog.
	}

	static void square() {
		for (int i = 0; i < 8; i++) {
			a.move(25);
			a.turn(45);

		}
		;
		for (int i = 0; i < 1; i++) {

			a.turn(-90);
			a.penUp();
			a.move(50);
			a.turn(-45);
			a.penDown();
		}
	}
}
