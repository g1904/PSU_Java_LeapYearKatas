package edu.pdx.cs410J.MG;

import org.junit.Test;

import java.util.ArrayList;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.IsEqual.equalTo;

/**
 * Unit tests for the Student class.  In addition to the JUnit annotations,
 * they also make use of the <a href="http://hamcrest.org/JavaHamcrest/">hamcrest</a>
 * matchers for more readable assertion statements.
 */
public class LeapYearTest
{

  @Test
  public void positiveNumberThatIsDivisibleBy400() {
    assertThat(new LeapYear().validLeapYear(400), equalTo(true));
  }

  @Test
  public void

}
