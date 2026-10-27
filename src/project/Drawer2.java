package project;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

public class Drawer2 extends JPanel {

    private final Shape obj;

    public Drawer2(Shape obj) {
        this.obj = obj;
        setBackground(Color.WHITE);
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        if (obj instanceof Cube) {
            int side = (int) ((Cube) obj).getSide();
            int offset = side / 3;
            int x1 = 35;
            int y1 = 100;
            int x2 = x1 + offset;
            int y2 = y1 - offset;

            // Top face
            int[] xTop = {x1, x1 + side, x1 + side + offset, x1 + offset};
            int[] yTop = {y1, y1, y1 - offset, y1 - offset};
            g.setColor(new Color(173, 216, 230)); // light blue
            g.fillPolygon(xTop, yTop, 4);

            // Right face
            int[] xSide = {x1 + side, x1 + side + offset, x1 + side + offset, x1 + side};
            int[] ySide = {y1, y1 - offset, y1 - offset + side, y1 + side};
            g.setColor(new Color(70, 130, 180)); // steel blue
            g.fillPolygon(xSide, ySide, 4);

            // Front face
            g.setColor(new Color(100, 149, 237)); // cornflower blue
            g.fillRect(x1, y1, side, side);

            g.setColor(Color.BLACK);
            g.drawRect(x1, y1, side, side);
            g.drawRect(x2, y2, side, side);
            g.drawLine(x1, y1, x2, y2);
            g.drawLine(x1 + side, y1, x2 + side, y2);
            g.drawLine(x1, y1 + side, x2, y2 + side);
            g.drawLine(x1 + side, y1 + side, x2 + side, y2 + side);

        } else if (obj instanceof Circle) {
            int radius = (int) ((Circle) obj).getReduis();
            g.setColor(new Color(255, 182, 193)); // light pink
            g.fillOval(70, 45, radius, radius);
            g.setColor(new Color(199, 21, 133)); // medium violet red outline
            g.drawOval(70, 45, radius, radius);
        }
    }
}
