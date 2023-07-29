package _99_extra;

import java.applet.AudioClip;

import javax.swing.JApplet;
import javax.swing.JOptionPane;

public class DontForgetTheLyrics {
	/*
	 * For this game, we'll play the start of a song, and the player has to guess the rest of the lyrics.
	 * 
	 * 1. To record a sound clip, open Audacity and record your song.
	 * 
	 * 2. Click File -> Export Audio, and save your file on the Desktop.
	 * 
	 * 3. Drag your file from the Desktop into the "default package" under "src".
	 */
	public static void setup() {
		JOptionPane.showMessageDialog(null, "The purpose of this game is simple, we will play a song and you will guess what it is");
	}
	
	public static void main(String[] args) {
		// 4. Make a pop-up to explain the game.
	
		// 5. Use the playSound method to play your song.
		playSound("gummybear.aup3");
		// 6. Make a pop-up for the player to type their answer.
		String guess = JOptionPane.showInputDialog("What song is this?");
		// 7. If they answered correctly, tell them that they were right.
		if (guess.equals("gummy bear")) {
			JOptionPane.showMessageDialog(null, "You were right");
		} else {
			JOptionPane.showMessageDialog(null, "You were wrong, it was the gummy bear song");
		}
		// 8. Otherwise, tell them they are wrong, and give them the answer.
		playSound("shittymusic1.aup3");
		// 6. Make a pop-up for the player to type their answer.
		String guess2 = JOptionPane.showInputDialog("What song is this?");
		// 7. If they answered correctly, tell them that they were right.
		if (guess2.equals("gummy bear")) {
			JOptionPane.showMessageDialog(null, "You were right");
		} else {
			JOptionPane.showMessageDialog(null, "You were wrong, it was the after dark");
		}
		// 9. Record another sound and repeat steps 5-8.

		// 10. [optional] Add a points variable that will calculate their final score.
	}

	public static void playSound(String fileName) {
		AudioClip audioClip = JApplet.newAudioClip(new DontForgetTheLyrics().getClass().getResource(fileName));
		audioClip.play();
	}
}


