package sequality;

import org.junit.Test;
import static org.junit.Assert.*;

public class CalculateTest {
  @Test
  public void testSum() {
    Calculate calculate = new Calculate();
    int expected = 5;
    assertEquals(expected, calculate.sum(2, 3));
  }

  @Test
  public void testSumAll() {
    Calculate calculate = new Calculate();
    int expected = 55;
    assertEquals(expected, calculate.sumAll(1, 10));
  }

  @Test
  public void testave() {
    Calculate calculate = new Calculate();
    double expected = 2.5;
    assertEquals(expected, calculate.average(5, 2), 0.0);
  }

  @Test
  public void testsumodd() {
    Calculate calculate = new Calculate();
    int expected = 25;
    assertEquals(expected, calculate.sumodd(1, 10));
  }

  @Test
  public void tessumother() {
    Calculate calculate = new Calculate();
    int expected = 30;
    assertEquals(expected, calculate.sumother(1, 10));
  }
}
