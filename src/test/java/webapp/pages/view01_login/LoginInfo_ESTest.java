package webapp.pages.view01_login;

import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import webapp.pages.view01_login.LoginInfo;

public class LoginInfo_ESTest {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      LoginInfo loginInfo0 = new LoginInfo();
      loginInfo0.userName = "";
      loginInfo0.userName = "";
      loginInfo0.userName = "F5^D|Z={";
      String string0 = loginInfo0.getUserName();
      assertEquals("F5^D|Z={", string0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      LoginInfo loginInfo0 = new LoginInfo();
      loginInfo0.userName = "";
      String string0 = loginInfo0.getUserName();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      LoginInfo loginInfo0 = new LoginInfo();
      loginInfo0.setUserId("6K9!.~i~x@5O?kE[gQo");
      String string0 = loginInfo0.getUserId();
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      LoginInfo loginInfo0 = new LoginInfo();
      loginInfo0.setUserId("");
      String string0 = loginInfo0.getUserId();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      LoginInfo loginInfo0 = new LoginInfo();
      String string0 = loginInfo0.getUserId();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      LoginInfo loginInfo0 = new LoginInfo();
      String string0 = loginInfo0.getUserName();
      assertNull(string0);
  }
}
