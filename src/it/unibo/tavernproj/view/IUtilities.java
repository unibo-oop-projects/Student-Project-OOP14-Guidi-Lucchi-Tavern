package it.unibo.tavernproj.view;

import java.awt.LayoutManager;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 * @author
 * 		Eleonora Guidi
 * 
 */

public interface IUtilities {
	
	/**
	 * Crea un pannello con sfondo bianco.
	 * 
	 * Creates a JPanel with a white background.
	 * 
	 * @param lm
	 * 		il layout che si vuole usare nel pannello.
	 * 		the layout you want to use in the JPanel.
	 * 
	 * @return
	 * 		il pannello creato.
	 * 		the JPanel created.
	 */
	JPanel buildPanel(LayoutManager lm);
	
	/**
	 * Crea una JLabel usando come sfondo l'immagine al percorso passato.
	 * It creates a new JLabel with the image passed as background.
	 *
	 * @param srt
	 * 		il path dell'immagine.
	 * 		the image path.
	 * 
	 * @throws IllegalArgumentException
	 * 		se il percorso immesso e' errato.
	 * 		if you passed a wrong path.
	 * 
	 * @return
	 * 		la JLabel creata.
	 * 		the JLabel created.
	 */
	JLabel buildLogo(String srt);
	
	JLabel buildMap(String srt);
	
	/**
	 * Crea un bottne usando come sfondo l'immagine al percorso passato,
	 * sfondo bianco e senza borso.
	 * It creates a new JButton with the image passed as background, 
	 * white background base and no border.
	 *
	 * @param srt
	 * 		il path dell'immagine.
	 * 		the image path.
	 * 
	 * @throws IllegalArgumentException
	 * 		se il percorso immesso e' errato.
	 * 		if you passed a wrong path.
	 * 
	 * @return
	 * 		il JButton creato.
	 * 		the JButton created.
	 */
	JButton buildButton(String srt);	
	
	ImageIcon getButtonIcon(final String srt);
	
	JLabel dateLabel();

  String getCurrentDate();

}