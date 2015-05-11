package it.unibo.tavernproj.view;

/**
 * @author Eleonora Guidi
 *
 */

public interface IReservationForm {
  
  /**
   * @return
   *      the table number from the form.
   * 
   * @throws NumberFormatException
   *      if the table text box is filled with a string.
   */
  Integer getTable() throws NumberFormatException;

  /**
   * @return
   *      the costumer's name from the form.
   *      
   * @throws NullPointerException
   *      if the form field is empty.
   */
  String getName() throws NullPointerException; 

  /**
   * @return
   *      the reservation hour from the form.   
   *      
   * @throws NullPointerException
   *      if the form field is empty.
   */
  String getH() throws NullPointerException;

  /**
   * @return
   *      the costumer's phone number from the form.
   *     
   * @throws NullPointerException
   *      if the form field is empty.
   */
  String getTel() throws NullPointerException;

  /**
   * @return
   *      the number of people at the table from the form.
   *
   * @throws NumberFormatException
   *      if the number text box is filled with a string.
   */
  String getNum()throws NumberFormatException;

  /**
   * @return
   *      the menu added from the form.
   */
  String getMenu();

  /**
   * Disables all the form text fields.
   */
  void disableAll();

  /**
   * Enables all the form text fields.
   */
  void enableAll();

  /**
   * It sets the text in the table text box in the form with the string passed.
   * 
   * @param srt
   *      the table number.
   */
  void setTable(final int srt);

  /**
   * It sets the text in the name text box in the form with the string passed.
   * 
   * @param srt
   *      the costumer's name.
   */
  void setName(final String srt);

  /**
   * It sets the text in the hour text box int the form with the string passed.
   * 
   * @param srt
   *      the hour of the reservation.
   */
  void setH(final String srt);

  /**
   * It sets the text in the phone text box in the form with the string passed.
   * 
   * @param srt
   *      the phone number.
   */
  void setTel(final String srt);

  /**
   * It sets the text in the table text box in the form with the string passed.
   * 
   * @param srt
   *      the phone number.
   */
  void setNum(final int srt);

  /**
   * It sets the text in the menu text box in the form with the string passed.
   * 
   * @param srt
   *      the menu.
   */
  void setMenu(final String srt);
}
