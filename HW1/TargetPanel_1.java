import javax.swing.JPanel;
import java.awt.*;

public class TargetPanel extends JPanel {

    private final int MAX_WIDTH = 300, NUM_RINGS = 5, RING_WIDTH = 25;

    public TargetPanel() {
        setBackground(Color.cyan);
        setPreferredSize(new Dimension(300, 300));
    }

    public void paintComponent(Graphics page) {
        super.paintComponent(page);

        int diameter = 2 * MAX_WIDTH;
        page.setColor(Color.white);

        for (int i = 0; i < NUM_RINGS; i++) {
            int x = (300 - diameter) / 2;
            int y = (300 - diameter) / 2;

            if (page.getColor() == Color.white) {
                page.setColor(Color.black);
            } else {
                page.setColor(Color.white);
            }

            page.fillOval(x, y, diameter, diameter);
            diameter = diameter - 2 * RING_WIDTH;
        }

        int x = (300 - diameter) / 2;
        int y = (300 - diameter) / 2;
        page.setColor(Color.red);
        page.fillOval(x, y, diameter, diameter);
    }
}
