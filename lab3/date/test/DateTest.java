import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class DateTest {

  @Test
  void nextDate_tc01() {
    Date today = new Date(1700, 6, 20);
    Date expectedTomorrow = new Date(1700, 6, 21);
    assertEquals(expectedTomorrow, today.nextDate());
  }

  @Test
  void nextDate_tc02() {
    Date today = new Date(2005, 4, 15);
    Date expectedTomorrow = new Date(2005, 4, 16);
    assertEquals(expectedTomorrow, today.nextDate());
  }

  @Test
  void nextDate_tc03() {
    Date today = new Date(1901, 7, 20);
    Date expectedTomorrow = new Date(1901, 7, 21);
    assertEquals(expectedTomorrow, today.nextDate());
  }

  @Test
  void nextDate_tc04() {
    Date today = new Date(3456, 3, 27);
    Date expectedTomorrow = new Date(3456, 3, 28);
    assertEquals(expectedTomorrow, today.nextDate());
  }

  @Test
  void nextDate_tc05() {
    Date today = new Date(1500, 2, 17);
    Date expectedTomorrow = new Date(1500, 2, 18);
    assertEquals(expectedTomorrow, today.nextDate());
  }

  @Test
  void nextDate_tc06() {
    Date today = new Date(1700, 6, 29);
    Date expectedTomorrow = new Date(1700, 6, 30);
    assertEquals(expectedTomorrow, today.nextDate());
  }

  @Test
  void nextDate_tc07() {
    Date today = new Date(1800, 11, 29);
    Date expectedTomorrow = new Date(1800, 11, 30);
    assertEquals(expectedTomorrow, today.nextDate());
  }

  @Test
  void nextDate_tc08() {
    Date today = new Date(3453, 1, 29);
    Date expectedTomorrow = new Date(3453, 1, 30);
    assertEquals(expectedTomorrow, today.nextDate());
  }

  @Test
  void nextDate_tc09() {
    Date today = new Date(444, 2, 29);
    Date expectedTomorrow = new Date(444, 3, 1);
    assertEquals(expectedTomorrow, today.nextDate());
  }

  @Test
  void nextDate_tc10() {
    Date today = new Date(2005, 4, 30);
    Date expectedTomorrow = new Date(2005, 5, 1);
    assertEquals(expectedTomorrow, today.nextDate());
  }

  @Test
  void nextDate_tc11() {
    Date today = new Date(3453, 1, 30);
    Date expectedTomorrow = new Date(3453, 1, 31);
    assertEquals(expectedTomorrow, today.nextDate());
  }

  @Test
  void nextDate_tc12() {
    Date today = new Date(3456, 3, 30);
    Date expectedTomorrow = new Date(3456, 3, 31);
    assertEquals(expectedTomorrow, today.nextDate());
  }

  @Test
  void nextDate_tc13() {
    Date today = new Date(1901, 7, 31);
    Date expectedTomorrow = new Date(1901, 8, 1);
    assertEquals(expectedTomorrow, today.nextDate());
  }

  @Test
  void nextDate_tc14() {
    Date today = new Date(3453, 1, 31);
    Date expectedTomorrow = new Date(3453, 2, 1);
    assertEquals(expectedTomorrow, today.nextDate());
  }

  @Test
  void nextDate_tc15() {
    Date today = new Date(3456, 12, 31);
    Date expectedTomorrow = new Date(3457, 1, 1);
    assertEquals(expectedTomorrow, today.nextDate());
  }

  @Test
  void nextDate_invalid_tc16() {
    assertThrows(
      IllegalArgumentException.class,
      () -> new Date(1500, 2, 31)
    );
  }

  @Test
  void nextDate_invalid_tc17() {
    assertThrows(
      IllegalArgumentException.class,
      () -> new Date(1500, 2, 29)
    );
  }

  @Test
  void nextDate_invalid_tc18() {
    assertThrows(
      IllegalArgumentException.class,
      () -> new Date(-1, 10, 20)
    );
  }

  @Test
  void nextDate_invalid_tc19() {
    assertThrows(
      IllegalArgumentException.class,
      () -> new Date(1458, 15, 12)
    );
  }

  @Test
  void nextDate_invalid_tc20() {
    assertThrows(
      IllegalArgumentException.class,
      () -> new Date(1975, 6, -50)
    );
  }




  // new test added

  //next date tests
  @Test
  void nextDate_tc16() {

    Date today = new Date(2015, 2, 28);
    Date expectedTomorrow = new Date(2015, 3, 1);
    assertEquals(expectedTomorrow, today.nextDate());
  }

  @Test
  void nextDate_tc17() {
    Date today = new Date(3456, 9, 29);
    Date expectedTomorrow = new Date(3456, 9, 30);
    assertEquals(expectedTomorrow, today.nextDate());
  }

  @Test
  void nextDate_tc18() {
    Date today = new Date(4000, 2, 28);
    Date expectedTomorrow = new Date(4000, 2, 29);
    assertEquals(expectedTomorrow, today.nextDate());
  }
  
  //Exception test
  @Test
  void nextDate_invalid_tc21() {
    assertThrows(
      IllegalArgumentException.class,
      () -> new Date(1975, 6, 31)
    );
  }

  @Test
  void nextDate_invalid_tc22() {
    assertThrows(
      IllegalArgumentException.class,
      () -> new Date(1850, 10, 50)
    );
  }

  @Test
  void nextDate_invalid_tc23() {
    assertThrows(
      IllegalArgumentException.class,
      () -> new Date(1975, -1, 12)
    );
  }
  @Test
  void nextDate_invalid_tc24() {
    assertThrows(
      IllegalArgumentException.class,
      () -> new Date(2000, 2, 31)
    );
  }

  //conversion to string test
  @Test
  void toString_test(){
    Date date = new Date(2017, 4, 3);
    assertEquals("2017/April/3", date.toString());
  }


  // equals method test
  @Test
  void equals_test1_OK(){
    //comparing same dates
    Date date = new Date (1507,8,4);
    assertEquals(true ,date.equals(new Date(1507,8,4)));
  }
  @Test
  void equals_test1_notOK(){
    //different year,month, and date
    Date date = new Date (1910,4,14);
    assertEquals(false,date.equals(new Date(1900,3,21)));
  }
  @Test
  void equals_test2_NotOK(){
    //different date
    Date date = new Date (150,5,20);
    assertEquals(false,date.equals(new Date(150,5,17)));
  }
  @Test
  void equals_test3_NotOK(){
    //different month
    Date date = new Date (3123,9,4);
    assertEquals(false,date.equals(new Date(3123,7,4)));
  }
  @Test
  void equals_test_NotOK(){
    //comparing date instance to different object instance
    Date date = new Date (300,11,13);
    assertEquals(false ,date.equals(new String ("1507")));
  }
}