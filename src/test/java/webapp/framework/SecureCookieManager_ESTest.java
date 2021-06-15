package webapp.framework;

import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import webapp.framework.Controller;
import webapp.framework.SecureCookieManager;

public class SecureCookieManager_ESTest {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      SecureCookieManager secureCookieManager0 = new SecureCookieManager((Controller) null);
      // Undeclared exception!
      try { 
        secureCookieManager0.addSecureCookie("*Dj>q$}'", "", 0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("webapp.framework.SecureCookieManager", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      SecureCookieManager secureCookieManager0 = new SecureCookieManager((Controller) null);
      // Undeclared exception!
      try { 
        secureCookieManager0.getSecureCookieValue("");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("webapp.framework.SecureCookieManager", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      SecureCookieManager secureCookieManager0 = new SecureCookieManager((Controller) null);
      // Undeclared exception!
      try { 
        secureCookieManager0.addSecureCookieAsEternal("", "loginMessage");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("webapp.framework.SecureCookieManager", e);
      }
  }
}
