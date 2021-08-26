package launcher;

import entities.Student;
import gui.SimplePresentationScreen;

public class Launcher {
	public static void main(String [] args) {
        //Schedule a job for the event-dispatching thread:
        //creating and showing this application's GUI.
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
            	Student IEGC = new Student(74452, "García Caviglione", "Isaí Ezequiel", "ezequielcaviglione@hotmail.com", "https://github.com/Ezequiel74452", "https://avatars.githubusercontent.com/u/60025474?v=4");
            	try {
            		SimplePresentationScreen sps = new SimplePresentationScreen(IEGC);
            		sps.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
    }
}