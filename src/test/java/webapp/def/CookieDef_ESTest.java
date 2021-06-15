package webapp.def;

import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import webapp.def.CookieDef;

public class CookieDef_ESTest {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      CookieDef cookieDef0 = new CookieDef();
      assertTrue(CookieDef.REMEMBER_USERNAME_AND_PASSWORD_ON_COOKIE);
  }
}
