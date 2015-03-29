package it.unibo.tavernproj.model;

import java.util.Objects;

/**
 * @author Giulia Lucchi
 *
 */

public interface IReservation {
	
	/**
	 * @return the table
	 */
	public String getTable();

	/**
	 * @return the name
	 */
	public String getName();

	/**
	 * @return the date
	 */
	//public String getDate();

	/**
	 * @return h
	 */
	public String getHours();

	/**
	 * @return the number of telephone
	 */
	public String getTel();
	
	/**
	 * @return the number of people
	 */
	public int getNumPers();
	
	/**
	 * @return the menu, if selected and added
	 * */
	public String getMenu();
}