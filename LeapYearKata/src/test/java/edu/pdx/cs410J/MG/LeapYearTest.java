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
  private LeapYear ly = new LeapYear();

  @Test
  public void positiveNumberThatIsDivisibleBy400() {

    assertThat(this.ly.validLeapYear(400), equalTo(true));
  }

  @Test
  public void yearDivisibleBy100AndNotBy400() {
    int year = 1900;
    assertThat(this.ly.validLeapYear(year), equalTo(false));
  }

  @Test
  public void yearDivisibleBy4() {
    int year = 2020;
    assertThat(this.ly.validLeapYear(year), equalTo(true));
  }

  @Test
  public void yearIsNotNegative() {
    int year = -22;
    assertThat(this.ly.validLeapYear(year), equalTo(false));
  }

}
