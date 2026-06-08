import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.util.ArrayList;

public class DatingApp {
    public static void main(String[] args) {

        Profile gabrielle = new Profile("Gabrielle", 25, "Computer Science major", new ArrayList<String>());
        gabrielle.getInterests().add("Hiking");
        gabrielle.getInterests().add("Programming");
        gabrielle.getInterests().add("Travel");

        Profile ben = new Profile("Ben", 27, "Software engineer", new ArrayList<String>());
        ben.getInterests().add("Hiking");
        ben.getInterests().add("Gaming");
        ben.getInterests().add("Travel");

        Profile claire = new Profile("Claire", 35, "Chef and food blogger", new ArrayList<String>());
        claire.getInterests().add("Cooking");
        claire.getInterests().add("Reading");
        claire.getInterests().add("Yoga");

        ArrayList<Profile> profiles = new ArrayList<Profile>();
        profiles.add(gabrielle);
        profiles.add(ben);
        profiles.add(claire);

        for (int i = 0; i < profiles.size(); i++) {
            System.out.println(profiles.get(i).toString());
        }

        if (gabrielle.isMatch(ben)) {
            System.out.println("Gabrielle and Ben are a match!");
        } else {
            System.out.println("Gabrielle and Ben are not a match.");
        }

        if (gabrielle.isMatch(claire)) {
            System.out.println("Gabrielle and Claire are a match!");
        } else {
            System.out.println("Gabrielle and Claire are not a match.");
        }

        if (ben.isMatch(claire)) {
            System.out.println("Ben and Claire are a match!");
        } else {
            System.out.println("Ben and Claire are not a match.");
        }

        String searchInterest = "Hiking";
        System.out.println("\nProfiles interested in " + searchInterest + ":");
        for (int i = 0; i < profiles.size(); i++) {
            if (profiles.get(i).getInterests().contains(searchInterest)) {
                System.out.println("- " + profiles.get(i).getName());
            }
        }

        SwingUtilities.invokeLater(() -> gabrielle.displayProfileGUI());
    }
}

class Profile {

    private String name;
    private int age;
    private String bio;
    private ArrayList<String> interests;

    public Profile(String name, int age, String bio, ArrayList<String> interests) {
        this.name = name;
        this.age = age;
        this.bio = bio;
        this.interests = interests;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getBio() {
        return bio;
    }

    public ArrayList<String> getInterests() {
        return interests;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("+-------------------------+\n");
        sb.append("| Name: " + name + "\n");
        sb.append("| Age: " + age + "\n");
        sb.append("|\n");
        sb.append("| Bio:\n");
        sb.append("| " + bio + "\n");
        sb.append("|\n");
        sb.append("| Interests:\n");
        for (int i = 0; i < interests.size(); i++) {
            sb.append("| - " + interests.get(i) + "\n");
        }
        sb.append("+-------------------------+\n");
        return sb.toString();
    }

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

    private ImageIcon createProfileImage() {
        BufferedImage image = new BufferedImage(250, 250, BufferedImage.TYPE_INT_RGB);
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

    public boolean isMatch(Profile other) {
        int sharedInterests = 0;
        for (int i = 0; i < interests.size(); i++) {
            if (other.getInterests().contains(interests.get(i))) {
                sharedInterests++;
            }
        }
        int ageDifference = this.age - other.getAge();
        if (ageDifference < 0) {
            ageDifference = ageDifference * -1;
        }
        if (sharedInterests >= 2 && ageDifference <= 5) {
            return true;
        } else {
            return false;
        }
    }
}
