
import java.util.Random;

import javax.swing.JOptionPane;

public class Coin {
	public static void main(String[] args) {
		
		Random ran = new Random();
		int coin = ran.nextInt();
		
		String start = JOptionPane.showInputDialog("Start");
		
		if (start.equals("yes") && coin % 2 == 0) {
			JOptionPane.showMessageDialog(null,  "Go On a run");
		} else {
			JOptionPane.showMessageDialog(null,  "Play video games with jaison");	
		}
	}
}
