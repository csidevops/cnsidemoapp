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


 
}
