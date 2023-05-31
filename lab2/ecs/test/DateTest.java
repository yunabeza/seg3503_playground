import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class DateTest {

  @Test
  void nextDate_test1() {
    Date d = new Date(1700,6,20);
    assertEquals(new Date(1700,6,21), d.nextDate());
  }
  
  @Test
  void nextDate_test2() {
    Date d = new Date(2005,4,15);
    assertEquals(new Date(2005,4,16), d.nextDate());
  }

  @Test
  void nextDate_test3() {
    Date d = new Date(1901,7,20);
    assertEquals(new Date(1901,7,21), d.nextDate());
  }

  @Test
  void nextDate_test4() {
    //Date d = new Date(1500,2,31);
    assertThrows(IllegalArgumentException.class,()->{new Date (1500,2,31).nextDate();},"day must less than 28 for month February on a non leap year.");
  }

  @Test
  void nextDate_test5() {
    assertThrows(IllegalArgumentException.class,()->{new Date (-1,10,20).nextDate();},"year must be greater or equal to 0.");
  }
}