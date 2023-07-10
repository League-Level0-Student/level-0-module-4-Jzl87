package _01_double._2_test_scores;

import javax.swing.JOptionPane;

public class TestScore {
	public static void main(String[] args) {
		String score = JOptionPane.showInputDialog(null, "What was your score?");
		double scoreDouble = Double.parseDouble(score);
		
		if (scoreDouble >= 90) {
			JOptionPane.showMessageDialog(null, "You achieved an A!");
		} else if (scoreDouble >= 80 && scoreDouble < 90) {
			JOptionPane.showMessageDialog(null, "You scored a B.");
		} else if (scoreDouble >= 70 && scoreDouble < 80) {
			JOptionPane.showMessageDialog(null, "You got a C ...");
		} else if (scoreDouble >= 60 && scoreDouble < 70) {
			JOptionPane.showMessageDialog(null, "you got a D, study harder");
		} else {
			JOptionPane.showMessageDialog(null, "You failed.");
		} 
	}
}
