package it.unibo.tavernproj.view.disegno;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JLabel;

/**
 *  @author Giulia Lucchi
 *
 */

public class DrawButton implements IDrawButton{
  
  private final JButton button;
  private final JLabel label;
  
/**
 * In the constructor initialize the label and the button
 * 
 * @param button
 *       the button to set
 * @param label
 *      the label 
 */
  public DrawButton(final JButton button, final JLabel label) {
    this.button = button;
    this.label = label;
    this.label.setBackground(Color.white);
  }

  @Override
  public void setting() {
    this.button.setFont(new Font("Arial", Font.BOLD, 12));
    this.button.setBackground(Color.white);
    this.button.setBorderPainted(true);
    this.button.setSize(10, 40);
  }
}