import javax.swing.*;
import java.awt.*;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;

public class CreatureComponent extends JComponent {

    private static final int PIXEL_SIZE = 13;

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g;
        // Sky background
        g2.setColor(new Color(135, 206, 250));
        g2.fillRect(0, 0, getWidth(), getHeight());
        Color dragonGreen = new Color(31, 161, 0);
        Color orange = new Color(255,126,28);
        Color dragonRed = new Color(178, 34, 34);
        Color dragonLightPurple = new Color(175, 53, 84);
        Color dragonDarkPurple = new Color(90, 24, 40);
        Color grey = new Color(211,211,211);
        Color blue = new Color(40,94,246);
        drawPixelArtDragon(g2, dragonGreen, orange, dragonRed, dragonLightPurple, grey, dragonDarkPurple, blue);
    }

    private void drawPixelArtDragon(Graphics2D g2, Color green, Color orange, Color red, Color lightPurple, Color grey, Color darkPurple, Color blue) {
        //Dragon outline
        int[][] blackPixels = {
                {0, 25}, {0, 26}, {1, 27}, {2, 28}, {3, 28}, {4, 29}, {3, 30}, {2, 30}, {1, 31},
                {0, 32}, {0, 33}, {0, 34}, {0, 35}, {0, 36}, {0, 37}, {1, 38}, {2, 38}, {3, 39},
                {4, 39}, {5, 40}, {6, 40}, {7, 40}, {8, 40}, {9, 40}, {10, 40}, {11, 40},
                {12, 40}, {13, 40}, {14, 40}, {15, 40}, {16, 40}, {17, 40}, {18, 40}, {19, 40},
                {20, 40}, {21, 40}, {22, 40}, {23, 40}, {24, 40}, {25, 40}, {26, 40}, {27, 40},
                {28, 40}, {29, 40}, {30, 40}, {31, 40}, {31, 39}, {30, 38}, {29, 37}, {28, 36},
                {28, 35}, {28, 34}, {28, 33}, {28, 37}, {27, 32}, {27, 31}, {27, 30}, {28, 29},
                {28, 28}, {28, 27}, {27, 26}, {26, 25}, {25, 25}, {24, 25}, {23, 25}, {22, 24},
                {21, 23}, {20, 22}, {22, 22}, {21, 21}, {20, 21}, {23, 21}, {24, 21}, {25, 21},
                {26, 22}, {27, 21}, {28, 20}, {28, 19}, {28, 18}, {27, 17}, {26, 16}, {25, 16},
                {24, 16}, {23, 16}, {23, 15}, {23, 14}, {24, 13}, {25, 12}, {25, 11}, {24, 10},
                {23, 11}, {22, 13}, {22, 12}, {21, 12}, {20, 11}, {19, 11}, {18, 11}, {17, 11},
                {16, 11}, {15, 12}, {15, 13}, {14, 12}, {13, 11}, {12, 10}, {11, 11}, {11, 12},
                {12, 13}, {13, 14}, {13, 15}, {13, 16}, {13, 17}, {13, 18}, {14, 19}, {14, 20},
                {14, 21}, {13, 21}, {12, 20}, {11, 19}, {10, 20}, {9, 21}, {8, 22}, {7, 21},
                {6, 20}, {5, 19}, {4, 20}, {4, 21}, {4, 22}, {5, 23}, {6, 24}, {7, 25}, {8, 26},
                {9, 26}, {10, 26}, {11, 26}, {12, 26}, {13, 27}, {13, 28}, {13, 29}, {12, 30},
                {12, 31}, {11, 32}, {10, 33}, {9, 34}, {8, 34}, {7, 34}, {6, 33}, {5, 32},
                {5, 31}, {6, 30}, {7, 29}, {7, 28}, {7, 27}, {6, 26}, {5, 25}, {4, 25}, {3, 25},
                {2, 24}, {1, 23}, {0, 24}, {14, 14}
        };
        for (int[] pixel : blackPixels) {
            fillPixel(g2, Color.BLACK, pixel[0], pixel[1]);
        }
        //Dragon green pixels

        fillPixel(g2, green, 16,12);
        fillPixel(g2, green, 17,12);
        fillPixel(g2, green, 18,12);
        fillPixel(g2, green, 19,12);
        fillPixel(g2, green, 20,12);
        fillPixel(g2, green, 16,13);
        fillPixel(g2, green, 17,13);
        fillPixel(g2, green, 18,13);
        fillPixel(g2, green, 19,13);
        fillPixel(g2, green, 20,13);
        fillPixel(g2, green, 21,13);
        fillPixel(g2, green, 15,14);
        fillPixel(g2, green, 16,14);
        fillPixel(g2, green, 17,14);
        fillPixel(g2, green, 18,14);
        fillPixel(g2, green, 19,14);
        fillPixel(g2, green, 20,14);
        fillPixel(g2, green, 21,14);
        fillPixel(g2, green, 22,14);
        fillPixel(g2, green, 14,15);
        fillPixel(g2, green, 15,15);
        fillPixel(g2, green, 19,15);
        fillPixel(g2, green, 14,16);
        fillPixel(g2, green, 15,16);
        fillPixel(g2, green, 19,16);
        fillPixel(g2, green, 14,17);
        fillPixel(g2, green, 15,17);
        fillPixel(g2, green, 16,17);
        fillPixel(g2, green, 17,17);
        fillPixel(g2, green, 18,17);
        fillPixel(g2, green, 19,17);
        fillPixel(g2, green, 20,17);
        fillPixel(g2, green, 21,17);
        fillPixel(g2, green, 22,17);
        fillPixel(g2, green, 23,17);
        fillPixel(g2, green, 24,17);
        fillPixel(g2, green, 25,17);
        fillPixel(g2, green, 26,17);

        fillPixel(g2, green, 14,18);
        fillPixel(g2, green, 15,18);
        fillPixel(g2, green, 16,18);
        fillPixel(g2, green, 17,18);
        fillPixel(g2, green, 18,18);
        fillPixel(g2, green, 19,18);
        fillPixel(g2, green, 20,18);
        fillPixel(g2, green, 21,18);
        fillPixel(g2, green, 22,18);
        fillPixel(g2, green, 23,18);
        fillPixel(g2, green, 24,18);
        fillPixel(g2, green, 25,18);
        fillPixel(g2, green, 26,18);
        fillPixel(g2, green, 27,18);

        fillPixel(g2, green, 15,19);
        fillPixel(g2, green, 16,19);
        fillPixel(g2, green, 17,19);
        fillPixel(g2, green, 18,19);
        fillPixel(g2, green, 19,19);
        fillPixel(g2, green, 20,19);
        fillPixel(g2, green, 21,19);
        fillPixel(g2, green, 22,19);
        fillPixel(g2, green, 23,19);
        fillPixel(g2, green, 24,19);
        fillPixel(g2, green, 25,19);
        fillPixel(g2, green, 26,19);
        fillPixel(g2, green, 27,19);

        fillPixel(g2, green, 15,20);
        fillPixel(g2, green, 16,20);
        fillPixel(g2, green, 17,20);
        fillPixel(g2, green, 18,20);
        fillPixel(g2, green, 19,20);

        fillPixel(g2, green, 15,21);
        fillPixel(g2, green, 16,21);
        fillPixel(g2, green, 17,21);
        fillPixel(g2, green, 18,21);
        fillPixel(g2, green, 19,21);
        fillPixel(g2, green, 14,22);
        fillPixel(g2, green, 15,22);
        fillPixel(g2, green, 16,22);
        fillPixel(g2, green, 17,22);
        fillPixel(g2, green, 18,22);
        fillPixel(g2, green, 19,22);
        fillPixel(g2, green, 14,23);
        fillPixel(g2, green, 15,23);
        fillPixel(g2, green, 16,23);
        fillPixel(g2, green, 17,23);
        fillPixel(g2, green, 18,23);
        fillPixel(g2, green, 19,23);
        fillPixel(g2, green, 20,23);
        fillPixel(g2, green, 13,24);
        fillPixel(g2, green, 14,24);
        fillPixel(g2, green, 15,24);
        fillPixel(g2, green, 16,24);
        fillPixel(g2, green, 17,24);
        fillPixel(g2, green, 18,24);
        fillPixel(g2, green, 19,24);
        fillPixel(g2, green, 20,24);
        fillPixel(g2, green, 21,24);
        fillPixel(g2, green, 15,24);
        fillPixel(g2, green, 14,25);
        fillPixel(g2, green, 13,25);

        fillPixel(g2, green, 15,25);
        fillPixel(g2, green, 16,25);
        fillPixel(g2, green, 17,25);
        fillPixel(g2, green, 18,25);
        fillPixel(g2, green, 19,25);

        fillPixel(g2, green, 14,26);
        fillPixel(g2, green, 13,26);

        fillPixel(g2, green, 15,26);
        fillPixel(g2, green, 16,26);
        fillPixel(g2, green, 17,26);
        fillPixel(g2, green, 18,26);
        fillPixel(g2, green, 19,26);
        fillPixel(g2, green, 20,26);
        fillPixel(g2, green, 21,26);
        fillPixel(g2, green, 24,26);
        fillPixel(g2, green, 25,26);
        fillPixel(g2, green, 26,26);
        fillPixel(g2, green, 14,27);
        fillPixel(g2, green, 15,27);
        fillPixel(g2, green, 16,27);
        fillPixel(g2, green, 17,27);
        fillPixel(g2, green, 18,27);
        fillPixel(g2, green, 19,27);
        fillPixel(g2, green, 20,27);
        fillPixel(g2, green, 21,27);
        fillPixel(g2, green, 22,27);
        fillPixel(g2, green, 25,27);
        fillPixel(g2, green, 26,27);
        fillPixel(g2, green, 27,27);
        fillPixel(g2, green, 14,28);
        fillPixel(g2, green, 15,28);
        fillPixel(g2, green, 16,28);
        fillPixel(g2, green, 17,28);
        fillPixel(g2, green, 18,28);
        fillPixel(g2, green, 19,28);
        fillPixel(g2, green, 20,28);
        fillPixel(g2, green, 21,28);
        fillPixel(g2, green, 22,28);
        fillPixel(g2, green, 14,29);
        fillPixel(g2, green, 15,29);
        fillPixel(g2, green, 16,29);
        fillPixel(g2, green, 17,29);
        fillPixel(g2, green, 18,29);
        fillPixel(g2, green, 19,29);
        fillPixel(g2, green, 13,30);
        fillPixel(g2, green, 14,30);
        fillPixel(g2, green, 15,30);
        fillPixel(g2, green, 16,30);
        fillPixel(g2, green, 17,30);
        fillPixel(g2, green, 18,30);
        fillPixel(g2, green, 19,30);
        fillPixel(g2, green, 13,31);
        fillPixel(g2, green, 14,31);
        fillPixel(g2, green, 15,31);
        fillPixel(g2, green, 16,31);
        fillPixel(g2, green, 17,31);
        fillPixel(g2, green, 18,31);
        fillPixel(g2, green, 19,31);
        fillPixel(g2, green, 12,32);
        fillPixel(g2, green, 13,32);
        fillPixel(g2, green, 14,32);
        fillPixel(g2, green, 15,32);
        fillPixel(g2, green, 16,32);
        fillPixel(g2, green, 17,32);
        fillPixel(g2, green, 18,32);
        fillPixel(g2, green, 19,32);
        fillPixel(g2, green, 11,33);
        fillPixel(g2, green, 12,33);
        fillPixel(g2, green, 13,33);
        fillPixel(g2, green, 14,33);
        fillPixel(g2, green, 15,33);
        fillPixel(g2, green, 16,33);
        fillPixel(g2, green, 17,33);
        fillPixel(g2, green, 18,33);
        fillPixel(g2, green, 19,33);
        fillPixel(g2, green, 10,34);
        fillPixel(g2, green, 11,34);
        fillPixel(g2, green, 12,34);
        fillPixel(g2, green, 13,34);
        fillPixel(g2, green, 14,34);
        fillPixel(g2, green, 15,34);
        fillPixel(g2, green, 16,34);
        fillPixel(g2, green, 17,34);
        fillPixel(g2, green, 18,34);
        fillPixel(g2, green, 19,34);
        fillPixel(g2, green, 20,34);

        fillPixel(g2, green, 1,35);
        fillPixel(g2, green, 2,35);
        fillPixel(g2, green, 3,35);
        fillPixel(g2, green, 4,35);
        fillPixel(g2, green, 5,35);
        fillPixel(g2, green, 6,35);
        fillPixel(g2, green, 7,35);
        fillPixel(g2, green, 8,35);
        fillPixel(g2, green, 9,35);
        fillPixel(g2, green, 10,35);
        fillPixel(g2, green, 11,35);
        fillPixel(g2, green, 12,35);
        fillPixel(g2, green, 13,35);
        fillPixel(g2, green, 14,35);
        fillPixel(g2, green, 15,35);
        fillPixel(g2, green, 16,35);
        fillPixel(g2, green, 17,35);
        fillPixel(g2, green, 18,35);
        fillPixel(g2, green, 19,35);
        fillPixel(g2, green, 20,35);

        fillPixel(g2, green, 1,36);
        fillPixel(g2, green, 2,36);
        fillPixel(g2, green, 3,36);
        fillPixel(g2, green, 4,36);
        fillPixel(g2, green, 5,36);
        fillPixel(g2, green, 6,36);
        fillPixel(g2, green, 7,36);
        fillPixel(g2, green, 8,36);
        fillPixel(g2, green, 9,36);
        fillPixel(g2, green, 10,36);
        fillPixel(g2, green, 11,36);
        fillPixel(g2, green, 12,36);
        fillPixel(g2, green, 13,36);
        fillPixel(g2, green, 14,36);
        fillPixel(g2, green, 15,36);
        fillPixel(g2, green, 16,36);
        fillPixel(g2, green, 17,36);
        fillPixel(g2, green, 18,36);
        fillPixel(g2, green, 19,36);
        fillPixel(g2, green, 20,36);

        fillPixel(g2, green, 1,37);
        fillPixel(g2, green, 2,37);
        fillPixel(g2, green, 3,37);
        fillPixel(g2, green, 4,37);
        fillPixel(g2, green, 5,37);
        fillPixel(g2, green, 6,37);
        fillPixel(g2, green, 7,37);
        fillPixel(g2, green, 8,37);
        fillPixel(g2, green, 9,37);
        fillPixel(g2, green, 10,37);
        fillPixel(g2, green, 11,37);
        fillPixel(g2, green, 12,37);
        fillPixel(g2, green, 13,37);
        fillPixel(g2, green, 14,37);
        fillPixel(g2, green, 15,37);
        fillPixel(g2, green, 16,37);
        fillPixel(g2, green, 17,37);
        fillPixel(g2, green, 18,37);
        fillPixel(g2, green, 19,37);
        fillPixel(g2, green, 20,37);

        fillPixel(g2, green, 3,38);
        fillPixel(g2, green, 4,38);
        fillPixel(g2, green, 5,38);
        fillPixel(g2, green, 6,38);
        fillPixel(g2, green, 7,38);
        fillPixel(g2, green, 8,38);
        fillPixel(g2, green, 9,38);
        fillPixel(g2, green, 10,38);
        fillPixel(g2, green, 11,38);
        fillPixel(g2, green, 12,38);
        fillPixel(g2, green, 13,38);
        fillPixel(g2, green, 14,38);
        fillPixel(g2, green, 15,38);
        fillPixel(g2, green, 16,38);
        fillPixel(g2, green, 17,38);
        fillPixel(g2, green, 18,38);
        fillPixel(g2, green, 19,38);
        fillPixel(g2, green, 20,38);
        fillPixel(g2, green, 21,38);
        fillPixel(g2, green, 28,38);

        fillPixel(g2, green, 5,39);
        fillPixel(g2, green, 6,39);
        fillPixel(g2, green, 7,39);
        fillPixel(g2, green, 8,39);
        fillPixel(g2, green, 9,39);
        fillPixel(g2, green, 10,39);
        fillPixel(g2, green, 11,39);
        fillPixel(g2, green, 12,39);
        fillPixel(g2, green, 13,39);
        fillPixel(g2, green, 14,39);
        fillPixel(g2, green, 15,39);
        fillPixel(g2, green, 16,39);
        fillPixel(g2, green, 17,39);
        fillPixel(g2, green, 18,39);
        fillPixel(g2, green, 19,39);
        fillPixel(g2, green, 20,39);
        fillPixel(g2, green, 21,39);
        fillPixel(g2, green, 24,39);
        fillPixel(g2, green, 25,39);
        fillPixel(g2, green, 26,39);
        fillPixel(g2, green, 27,39);
        fillPixel(g2, green, 28,39);

        fillPixel(g2, green, 1,34);
        fillPixel(g2, green, 2,34);
        fillPixel(g2, green, 3,34);
        fillPixel(g2, green, 4,34);
        fillPixel(g2, green, 5,34);
        fillPixel(g2, green, 6,34);

        fillPixel(g2, green, 1,33);
        fillPixel(g2, green, 2,33);
        fillPixel(g2, green, 3,33);
        fillPixel(g2, green, 4,33);
        fillPixel(g2, green, 5,33);

        fillPixel(g2, green, 1,32);
        fillPixel(g2, green, 2,32);
        fillPixel(g2, green, 3,32);
        fillPixel(g2, green, 4,32);
        fillPixel(g2, green, 2,31);
        fillPixel(g2, green, 3,31);
        fillPixel(g2, green, 4,31);
        fillPixel(g2, green, 4,30);
        fillPixel(g2, green, 5,30);
        fillPixel(g2, green, 5,29);
        fillPixel(g2, green, 6,29);
        fillPixel(g2, green, 4,28);
        fillPixel(g2, green, 5,28);
        fillPixel(g2, green, 6,28);
        fillPixel(g2, green, 2,27);
        fillPixel(g2, green, 3,27);
        fillPixel(g2, green, 4,27);
        fillPixel(g2, green, 5,27);
        fillPixel(g2, green, 6,27);
        fillPixel(g2, green, 1,26);
        fillPixel(g2, green, 2,26);
        fillPixel(g2, green, 3,26);
        fillPixel(g2, green, 4,26);
        fillPixel(g2, green, 5,26);
        fillPixel(g2, green, 1,25);
        fillPixel(g2, green, 2,25);
        fillPixel(g2, green, 1,24);
        //Dragon orange pixels
        fillPixel(g2, orange, 5,21);
        fillPixel(g2, orange, 6,21);
        fillPixel(g2, orange, 10,21);
        fillPixel(g2, orange, 11,21);
        fillPixel(g2, orange, 12,21);
        fillPixel(g2, orange, 5,20);
        fillPixel(g2, orange, 11,20);
        fillPixel(g2, orange, 5,22);
        fillPixel(g2, orange, 6,22);
        fillPixel(g2, orange, 7,22);
        fillPixel(g2, orange, 9,22);
        fillPixel(g2, orange, 10,22);
        fillPixel(g2, orange, 11,22);
        fillPixel(g2, orange, 12,22);
        fillPixel(g2, orange, 13,22);
        fillPixel(g2, orange, 6,23);
        fillPixel(g2, orange, 7,23);
        fillPixel(g2, orange, 8,23);
        fillPixel(g2, orange, 9,23);
        fillPixel(g2, orange, 10,23);
        fillPixel(g2, orange, 11,23);
        fillPixel(g2, orange, 12,23);
        fillPixel(g2, orange, 13,23);
        fillPixel(g2, orange, 7,24);
        fillPixel(g2, orange, 8,24);
        fillPixel(g2, orange, 9,24);
        fillPixel(g2, orange, 10,24);
        fillPixel(g2, orange, 11,24);
        fillPixel(g2, orange, 12,24);
        fillPixel(g2, orange, 8,25);
        fillPixel(g2, orange, 9,25);
        fillPixel(g2, orange, 10,25);
        fillPixel(g2, orange, 11,25);
        fillPixel(g2, orange, 12,25);
        fillPixel(g2, orange, 20,25);
        fillPixel(g2, orange, 21,25);
        fillPixel(g2, orange, 22,25);
        fillPixel(g2, orange, 22,26);
        fillPixel(g2, orange, 23,26);
        fillPixel(g2, orange, 23,27);
        fillPixel(g2, orange, 24,27);
        fillPixel(g2, orange, 23,28);
        fillPixel(g2, orange, 24,28);
        fillPixel(g2, orange, 25,28);
        fillPixel(g2, orange, 20,29);
        fillPixel(g2, orange, 23,29);
        fillPixel(g2, orange, 24,29);
        fillPixel(g2, orange, 25,29);
        fillPixel(g2, orange, 26,29);
        fillPixel(g2, orange, 20,30);
        fillPixel(g2, orange, 21,30);
        fillPixel(g2, orange, 23,30);
        fillPixel(g2, orange, 24,30);
        fillPixel(g2, orange, 25,30);
        fillPixel(g2, orange, 26,30);
        fillPixel(g2, orange, 20,31);
        fillPixel(g2, orange, 21,31);
        fillPixel(g2, orange, 22,31);
        fillPixel(g2, orange, 23,31);
        fillPixel(g2, orange, 24,31);
        fillPixel(g2, orange, 25,31);
        fillPixel(g2, orange, 26,31);
        fillPixel(g2, orange, 20,32);
        fillPixel(g2, orange, 21,32);
        fillPixel(g2, orange, 22,32);
        fillPixel(g2, orange, 23,32);
        fillPixel(g2, orange, 24,32);
        fillPixel(g2, orange, 25,32);
        fillPixel(g2, orange, 26,32);
        fillPixel(g2, orange, 20,33);
        fillPixel(g2, orange, 21,33);
        fillPixel(g2, orange, 22,33);
        fillPixel(g2, orange, 23,33);
        fillPixel(g2, orange, 24,33);
        fillPixel(g2, orange, 25,33);
        fillPixel(g2, orange, 26,33);
        fillPixel(g2, orange, 27,33);
        fillPixel(g2, orange, 20,34);
        fillPixel(g2, orange, 21,34);
        fillPixel(g2, orange, 22,34);
        fillPixel(g2, orange, 23,34);
        fillPixel(g2, orange, 24,34);
        fillPixel(g2, orange, 25,34);
        fillPixel(g2, orange, 26,34);
        fillPixel(g2, orange, 27,34);
        fillPixel(g2, orange, 21,35);
        fillPixel(g2, orange, 22,35);
        fillPixel(g2, orange, 23,35);
        fillPixel(g2, orange, 24,35);
        fillPixel(g2, orange, 25,35);
        fillPixel(g2, orange, 26,35);
        fillPixel(g2, orange, 27,35);
        fillPixel(g2, orange, 21,36);
        fillPixel(g2, orange, 22,36);
        fillPixel(g2, orange, 23,36);
        fillPixel(g2, orange, 24,36);
        fillPixel(g2, orange, 25,36);
        fillPixel(g2, orange, 26,36);
        fillPixel(g2, orange, 27,36);
        fillPixel(g2, orange, 21,37);
        fillPixel(g2, orange, 22,37);
        fillPixel(g2, orange, 23,37);
        fillPixel(g2, orange, 24,37);
        fillPixel(g2, orange, 25,37);
        fillPixel(g2, orange, 26,37);
        fillPixel(g2, orange, 27,37);
        fillPixel(g2, orange, 22,38);
        fillPixel(g2, orange, 23,38);
        fillPixel(g2, orange, 24,38);
        fillPixel(g2, orange, 25,38);
        fillPixel(g2, orange, 26,38);
        fillPixel(g2, orange, 27,38);
        //Light Purple in eyes
        fillPixel(g2, lightPurple, 17,15);
        fillPixel(g2, lightPurple, 17,16);
        fillPixel(g2, lightPurple, 21,15);
        fillPixel(g2, lightPurple, 21,16);
        //Dark Purple in eyes
        fillPixel(g2, darkPurple, 18,15);
        fillPixel(g2, darkPurple, 18,16);
        fillPixel(g2, darkPurple, 22,15);
        fillPixel(g2, darkPurple, 22,16);
        //Red
        fillPixel(g2, red, 20,20);
        fillPixel(g2, red, 24,20);
        //Grey
        fillPixel(g2, grey, 21,20);
        fillPixel(g2, grey, 22,20);
        fillPixel(g2, grey, 23,20);
        fillPixel(g2, grey, 25,20);
        fillPixel(g2, grey, 26,20);
        fillPixel(g2, grey, 27,20);
        //Blue horns
        fillPixel(g2, blue, 12,11);
        fillPixel(g2, blue, 24,11);
        fillPixel(g2, blue, 12,12);
        fillPixel(g2, blue, 13,12);
        fillPixel(g2, blue, 23,12);
        fillPixel(g2, blue, 24,12);
        fillPixel(g2, blue, 13,13);
        fillPixel(g2, blue, 14,13);
        fillPixel(g2, blue, 23,13);
        //Ellipse for Clouds
        Ellipse2D.Double cloud1 = new Ellipse2D.Double(200,25,100,80);
        Ellipse2D.Double cloud2 = new Ellipse2D.Double(235,5,175,120);
        Ellipse2D.Double cloud3 = new Ellipse2D.Double(350,40,90,70);
        Ellipse2D.Double cloud4 = new Ellipse2D.Double(380,30,30,10);
        Ellipse2D.Double cloud5 = new Ellipse2D.Double(300,25,100,80);
        Ellipse2D.Double cloud6 = new Ellipse2D.Double(335,5,175,120);
        Ellipse2D.Double cloud7 = new Ellipse2D.Double(450,40,90,70);
        Ellipse2D.Double cloud8 = new Ellipse2D.Double(480,30,30,10);
        Ellipse2D.Double cloud9 = new Ellipse2D.Double(600,25,100,80);
        Ellipse2D.Double cloud10 = new Ellipse2D.Double(635,5,175,120);
        Ellipse2D.Double cloud11 = new Ellipse2D.Double(750,40,90,70);
        Ellipse2D.Double cloud12 = new Ellipse2D.Double(780,30,30,10);
        Ellipse2D.Double cloud13 = new Ellipse2D.Double(700,25,100,80);
        Ellipse2D.Double cloud14 = new Ellipse2D.Double(735,5,175,120);
        Ellipse2D.Double cloud15 = new Ellipse2D.Double(850,40,90,70);
        Ellipse2D.Double cloud16 = new Ellipse2D.Double(880,30,30,10);
        g2.setColor(Color.WHITE);
        drawCloud(g2, cloud1, cloud2, cloud3, cloud4, cloud5, cloud6, cloud7, cloud8);
        drawCloud(g2, cloud9, cloud10, cloud11, cloud12, cloud13, cloud14, cloud15, cloud16);
        //Fire
        int x = 390;
        int y = 230;
        Ellipse2D redCore = new Ellipse2D.Double(x, y, 50, 50);
        Ellipse2D orangeLayer = new Ellipse2D.Double(x - 10, y - 10, 70, 70);
        g2.setColor(Color.RED);
        g2.fill(redCore);
        g2.setColor(Color.ORANGE);
        g2.fill(orangeLayer);
        g2.setColor(Color.YELLOW);
        g2.setStroke(new BasicStroke(3));
        Line2D flame1 = new Line2D.Double(x + 25, y, x + 45, y - 30);
        Line2D flame2 = new Line2D.Double(x + 25, y + 50, x + 45, y + 80);
        Line2D flame3 = new Line2D.Double(x + 25, y + 25, x + 60, y + 25);
        Line2D flame4 = new Line2D.Double(x, y + 25, x - 30, y + 25);
        Line2D flame5 = new Line2D.Double(x + 5, y + 5, x - 20, y - 20);
        Line2D flame6 = new Line2D.Double(x + 5, y + 45, x - 20, y + 80);
        g2.draw(flame1);
        g2.draw(flame2);
        g2.draw(flame3);
        g2.draw(flame4);
        g2.draw(flame5);
        g2.draw(flame6);
        Ellipse2D glow = new Ellipse2D.Double(x - 20, y - 20, 90, 90);
        g2.setColor(new Color(255, 255, 150, 150));
        g2.fill(glow);
        // Ground
        g2.setColor(new Color(60, 179, 113));
        g2.fillRect(0, getHeight() - 100, getWidth(), 100);

        // Castle walls
        g2.setColor(new Color(169, 169, 169));
        g2.fillRect(500, 550, 400, 200);
        g2.fillRect(450, 500, 100, 250);
        g2.fillRect(850, 500, 100, 250);
        for (int i = 0; i < 5; i++) {
            g2.fillRect(510 + i * 80, 530, 40, 20);
        }
        for (int i = 0; i < 2; i++) {
            g2.fillRect(460 + i * 40, 480, 40, 20);
        }
        for (int i = 0; i < 2; i++) {
            g2.fillRect(860 + i * 40, 480, 40, 20);
        }
        g2.setColor(new Color(139, 69, 19));
        g2.fillRect(670, 650, 60, 100);
        g2.setColor(Color.BLACK);
        g2.fillRect(470, 550, 30, 30);
        g2.fillRect(470, 600, 30, 30);

        g2.fillRect(800, 550, 30, 30);
        g2.fillRect(800, 600, 30, 30);
        g2.setColor(Color.RED);
        g2.fillRect(480, 450, 10, 50);
        g2.fillRect(880, 450, 10, 50);

        g2.setColor(Color.WHITE);
        g2.fillRect(490, 450, 40, 20);
        g2.fillRect(890, 450, 40, 20);
        g2.fillRect(890, 500, 40, 20);

    }

    private void drawCloud(Graphics2D g2, Ellipse2D.Double cloudA, Ellipse2D.Double cloudB, Ellipse2D.Double cloudC, Ellipse2D.Double cloudD, Ellipse2D.Double cloudE, Ellipse2D.Double cloudF, Ellipse2D.Double cloudG, Ellipse2D.Double cloudH) {
        g2.fill(cloudA);
        g2.fill(cloudB);
        g2.fill(cloudC);
        g2.fill(cloudD);
        g2.fill(cloudE);
        g2.fill(cloudF);
        g2.fill(cloudG);
        g2.fill(cloudH);
    }

    private void fillPixel(Graphics2D g2, Color color, int x, int y) {
        g2.setColor(color);
        g2.fillRect(x * PIXEL_SIZE, y * PIXEL_SIZE, PIXEL_SIZE, PIXEL_SIZE);
    }

}