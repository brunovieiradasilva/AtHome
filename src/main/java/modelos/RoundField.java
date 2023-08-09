/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelos;

import java.awt.Graphics;
import javax.swing.BorderFactory;
import javax.swing.JTextField;

/**
 *
 * @author Bruno
 */
  public class RoundField extends JTextField {
    public RoundField(int cols) {
        super(cols);
        // We must be non-opaque since we won't fill all pixels.
        // This will also stop the UI from filling our background.
        setOpaque(false);
        // Add an empty border around us to compensate for
        // the rounded corners.
        setBorder(BorderFactory.createEmptyBorder(3, 5, 3, 5));
    }
    protected void paintComponent(Graphics g) {
        int width = getWidth();
        int height = getHeight();
        // Paint a rounded rectangle in the background.
        g.setColor(getBackground());
        g.fillRoundRect(0, 0, width, height, 8, 8);
        // Now call the superclass behavior to paint the foreground.
        super.paintComponent(g);
    }
}