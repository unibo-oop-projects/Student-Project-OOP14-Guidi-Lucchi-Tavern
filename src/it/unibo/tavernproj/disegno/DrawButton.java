package it.unibo.tavernproj.disegno;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.JButton;
import javax.swing.JLabel;

/**
 *  @author Giulia Lucchi
 *
 */

public class DrawButton {
	
	private final JButton button;
	private final JLabel label;
	private final DrawPosition mouse;
	
	public DrawButton(final JButton button, JLabel label, DrawPosition drawPosition){
		this.button=button;
		this.label=label;
		this.label.setBackground(Color.white);
		this.mouse=drawPosition;
	}
	
	public void setting(){
		this.button.setFont(new Font("Arial", Font.BOLD, 12));
		this.button.setBackground(Color.white);
		this.button.setBorderPainted(false);
		this.button.setSize(10, 40);
		this.button.addActionListener(e->{
			label.addMouseListener(this.mouse);
		});
	}
}
