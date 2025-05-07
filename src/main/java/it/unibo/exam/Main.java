package it.unibo.exam;

import javax.swing.JFrame;
import it.unibo.exam.controller.input.KeyHandler;

/**
 * Main application class that initializes the application window.
 */
public final class Main {
    private Main() {
        throw new UnsupportedOperationException("Main class cannot be instantiated");
    }
    
    public static void main(final String[] args) {
        KeyHandler keyHandler = new KeyHandler();
        
        final JFrame window = new JFrame();
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setExtendedState(JFrame.MAXIMIZED_BOTH);
        window.setResizable(true);
        window.setTitle("UNIBO");
        window.addKeyListener(keyHandler);
        window.setVisible(true);
        window.setLocationRelativeTo(null);
        
        System.out.println("Application started successfully!");
    }
}