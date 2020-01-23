package edu.pdx.cs410J.MG;

import edu.pdx.cs410J.lang.Human;

import java.util.ArrayList;
import java.util.Calendar;

/**                                                                                 
 * This class is represents a <code>Student</code>.                                 
 */                                                                                 
public class LeapYear {

  public Boolean validLeapYear(Integer year) {
    if (year > 0) {
      if (year % 400 == 0) return true;
      if (year % 100 == 0) return false;
      if (year % 4 == 0) return true;
    }
    return false;
  }

  /**                                                                               
   * Creates a new <code>LeapYear</code>
   */
  public LeapYear() {

  }


  /**
   * Main program that parses the command line, creates a
   * <code>Student</code>, and prints a description of the LeapYearKata to
   * standard out by invoking its <code>toString</code> method.
   */
  public static void main(String[] args) {
    System.err.println("Missing command line arguments");
    System.exit(1);
  }
}