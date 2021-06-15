package webapp.models;

import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import webapp.models.SecretInfo;

public class SecretInfo_ESTest {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      SecretInfo secretInfo0 = new SecretInfo();
      secretInfo0.setSecretName("mSaD4l_w4<yuesIx|?");
      String string0 = secretInfo0.getSecretName();
      assertEquals("mSaD4l_w4<yuesIx|?", string0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      SecretInfo secretInfo0 = new SecretInfo();
      secretInfo0.setSecretName("");
      String string0 = secretInfo0.getSecretName();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      SecretInfo secretInfo0 = new SecretInfo();
      secretInfo0.setSecretAddress("Pu^c'U<Sf1I");
      String string0 = secretInfo0.getScretAddress();
      assertEquals("Pu^c'U<Sf1I", string0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      SecretInfo secretInfo0 = new SecretInfo();
      secretInfo0.setSecretAddress("");
      String string0 = secretInfo0.getScretAddress();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      SecretInfo secretInfo0 = new SecretInfo();
      String string0 = secretInfo0.getSecretName();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      SecretInfo secretInfo0 = new SecretInfo();
      String string0 = secretInfo0.getScretAddress();
      assertNull(string0);
  }
}
