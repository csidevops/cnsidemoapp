package webapp.pages.view01_login;

import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import webapp.pages.view01_login.LoginMessage;

public class LoginMessage_ESTest {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      LoginMessage loginMessage0 = new LoginMessage();
      loginMessage0.loginMessage = "~XXuEs8~9J<(f";
      loginMessage0.loginMessage = null;
      loginMessage0.toString();
      assertFalse(loginMessage0.isLoginFailure);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      LoginMessage loginMessage0 = new LoginMessage();
      loginMessage0.loginMessage = "~XXuEs8~9J<(f";
      loginMessage0.toString();
      assertFalse(loginMessage0.isLoginFailure);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      LoginMessage loginMessage0 = new LoginMessage();
      loginMessage0.toString();
      assertFalse(loginMessage0.isLoginFailure);
  }
}
