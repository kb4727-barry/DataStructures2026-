import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

/*
 * DATA STRUCTURES ASSIGNMENT
 * Dating App Profile System
 *
 * Complete the TODO sections to build a simple profile system.
 */

public class DatingApp {

    public static void main(String[] args) {

        // TODO:
        // Create Profile objects and test your methods here.

        Profile alice = new Profile();
        Profile bob = new Profile();

        // TODO:
        // Test display and matching methods

        if (alice.isMatch(bob)) {
            System.out.println("Alice and Bob are a match!");
        } else {
            System.out.println("Alice and Bob are not a match.");
        }

        SwingUtilities.invokeLater(() -> alice.displayProfileGUI());


    }
}

class Profile {

    // =========================
    // INSTANCE VARIABLES
    // =========================
    // TODO: Add variables for:
    // name, age, bio, interests (ArrayList recommended)
    

    // =========================
    // CONSTRUCTOR
    // =========================
    public Profile() {
        // TODO: Initialize variables
    }

    // =========================
    // GETTERS / SETTERS (optional)
    // =========================
    // TODO: Add getters and setters if needed

    // =========================
    // TO STRING
    // =========================
    @Override
    public String toString() {
        // TODO: Return formatted profile information
        return "";
    }

    // =========================
    // GUI DISPLAY
    // =========================
    public void displayProfileGUI() {

        JFrame frame = new JFrame("Dating Profile");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 600);

        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new BorderLayout(10, 10));

        JLabel imageLabel = new JLabel(createProfileImage());
        imageLabel.setHorizontalAlignment(SwingConstants.CENTER);

        JTextArea profileText = new JTextArea();
        profileText.setEditable(false);
        profileText.setFont(new Font("SansSerif", Font.PLAIN, 16));


        profileText.setText(this.toString());

        mainPanel.add(imageLabel, BorderLayout.NORTH);
        mainPanel.add(new JScrollPane(profileText), BorderLayout.CENTER);

        frame.add(mainPanel);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

    // You can use the method createProfileImage to display an image on the profile, 
    // or add any picture from the internet. 

    private ImageIcon createProfileImage() {

        BufferedImage image =
                new BufferedImage(250, 250, BufferedImage.TYPE_INT_RGB);

        Graphics2D g = image.createGraphics();

        g.setColor(Color.LIGHT_GRAY);
        g.fillRect(0, 0, 250, 250);

        g.setColor(Color.BLACK);

        g.fillOval(85, 40, 80, 80);

        g.drawLine(125, 120, 125, 200);
        g.drawLine(125, 140, 90, 170);
        g.drawLine(125, 140, 160, 170);
        g.drawLine(125, 200, 95, 235);
        g.drawLine(125, 200, 155, 235);

        g.drawString(name, 100, 20);

        g.dispose();

        return new ImageIcon(image);
    }

    // =========================
    // MATCHING FUNCTION
    // =========================
    public boolean isMatch(Profile other) {

        // TODO:
        // Define logic for comparing two profiles

        return false;
    }
}