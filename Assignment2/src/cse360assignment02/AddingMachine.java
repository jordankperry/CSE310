package cse360assignment02;

/**
 * AddingMachine can add to, subtract from, clear, and return it's total.
 * 
 * @author Jordan Perry
 * @version 1.0.1
 */

public class AddingMachine {
  private int total;
  private String history;
  
  public AddingMachine () {
    total = 0;  // not needed - included for clarity
    history = "0";
  }
  
  public int getTotal () {
    return total;
  }
  
  public void add (int value) {
	  total += value;
	  history += " + " + value;
  }

  public void subtract (int value) {
	  total -= value;
	  history += " - " + value;
  }

  public String toString () {
    return history;
  }

  public void clear() {
	  total = 0;
	  history = "0";
  }
}