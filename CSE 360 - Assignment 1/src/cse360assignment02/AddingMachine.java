/**
 * <h1> AddingMachine </h1>
 * AddingMachine adds and subtracts numbers from an integer called total and can return
 * a history of changes as a string.
 * 
 * @author Hayden Hannappel
 * @version 2.0
 * 
 */
package cse360assignment02;

public class AddingMachine {
  private int total;
  private String history = "0";
  
  public AddingMachine () {
    total = 0;  // not needed - included for clarity
  }
  
  /**
   * grabs total
   * @return total
   */
  public int getTotal () {
    return total;
  }
  
  /**
   * adds to total and updates history
   * @param value - integer to be added to total
   */
  public void add (int value) {
	  total = total + value;
	  history = history + " + " + value;
  }

  /**
   * subtracts from total and updates history
   * @param value - integer to be subtracted from total
   */
  public void subtract (int value) {
	  total = total - value;
	  history = history + " - " + value;
  }

  /**
   * keeps history of changes to total and shows it as string
   * @return string representation of history
   */
  public String toString () {
    return history;
  }

  /**
   * clears total and history
   */
  public void clear() {
	  total = 0;
	  history = "0";
  }
}