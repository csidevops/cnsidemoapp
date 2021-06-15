package webapp.dao;

import org.junit.Test;
import static org.junit.Assert.*;
import java.sql.Date;
import java.sql.Timestamp;
import java.util.Calendar;
import org.junit.runner.RunWith;
import webapp.dao.DaoDateUtil;

public class DaoDateUtil_ESTest {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      System.setCurrentTimeMillis(0L);
      DaoDateUtil daoDateUtil0 = new DaoDateUtil();
      Timestamp timestamp0 = daoDateUtil0.getTodayAsTimestamp();
      assertEquals("1970-01-01 00:00:00.0", timestamp0.toString());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar();
      DaoDateUtil daoDateUtil0 = new DaoDateUtil();
      Date date0 = daoDateUtil0.getTodayAsSqlDate((Calendar) mockGregorianCalendar0);
      assertNotNull(date0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      System.setCurrentTimeMillis(0L);
      DaoDateUtil daoDateUtil0 = new DaoDateUtil();
      Timestamp timestamp0 = daoDateUtil0.getNowAsTimestamp();
      assertEquals(0, timestamp0.getNanos());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      DaoDateUtil daoDateUtil0 = new DaoDateUtil();
      Timestamp timestamp0 = daoDateUtil0.getNowAsTimestamp();
      long long0 = daoDateUtil0.compareToTodayWith(timestamp0);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      DaoDateUtil daoDateUtil0 = new DaoDateUtil();
      Timestamp timestamp0 = new Timestamp(1L);
      long long0 = daoDateUtil0.compareToTodayWith(timestamp0);
      assertEquals((-1392409281319L), long0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      DaoDateUtil daoDateUtil0 = new DaoDateUtil();
      // Undeclared exception!
      try { 
        daoDateUtil0.getTimeShiftedTimestampFromNow((Calendar) null, 0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("webapp.dao.DaoDateUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar();
      mockGregorianCalendar0.set(0, (-362));
      DaoDateUtil daoDateUtil0 = new DaoDateUtil();
      // Undeclared exception!
      try { 
        daoDateUtil0.getTimeShiftedTimestampFromNow(mockGregorianCalendar0, (-215));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid era
         //
         verifyException("java.util.GregorianCalendar", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      DaoDateUtil daoDateUtil0 = new DaoDateUtil();
      // Undeclared exception!
      try { 
        daoDateUtil0.getTodayAsSqlDate((Calendar) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("webapp.dao.DaoDateUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      DaoDateUtil daoDateUtil0 = new DaoDateUtil();
      Date date0 = daoDateUtil0.getTodayAsSqlDate();
      assertNotNull(date0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      DaoDateUtil daoDateUtil0 = new DaoDateUtil();
      Timestamp timestamp0 = daoDateUtil0.getTodayAsTimestamp();
      assertEquals(320000000, timestamp0.getNanos());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      DaoDateUtil daoDateUtil0 = new DaoDateUtil();
      Timestamp timestamp0 = daoDateUtil0.getNowAsTimestamp();
      System.setCurrentTimeMillis(242L);
      long long0 = daoDateUtil0.compareToTodayWith(timestamp0);
      assertEquals(1392409281078L, long0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      DaoDateUtil daoDateUtil0 = new DaoDateUtil();
      // Undeclared exception!
      try { 
        daoDateUtil0.compareToTodayWith((Timestamp) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("webapp.dao.DaoDateUtil", e);
      }
  }
}
