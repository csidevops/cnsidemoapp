package webapp.pages.push02_use_fw;

import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import webapp.pages.push02_use_fw.SimplePushServiceTest;

public class SimplePushServiceTest_ESTest {


  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      SimplePushServiceTest.LiteHttpClient simplePushServiceTest_LiteHttpClient0 = new SimplePushServiceTest.LiteHttpClient();
      String string0 = simplePushServiceTest_LiteHttpClient0.send("");
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      SimplePushServiceTest.LiteHttpClientException simplePushServiceTest_LiteHttpClientException0 = new SimplePushServiceTest.LiteHttpClientException((Throwable) null);
      SimplePushServiceTest.LiteHttpClientException simplePushServiceTest_LiteHttpClientException1 = new SimplePushServiceTest.LiteHttpClientException((String) null, simplePushServiceTest_LiteHttpClientException0);
      assertFalse(simplePushServiceTest_LiteHttpClientException1.equals((Object)simplePushServiceTest_LiteHttpClientException0));
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      SimplePushServiceTest.LiteHttpClient simplePushServiceTest_LiteHttpClient0 = new SimplePushServiceTest.LiteHttpClient();
      String string0 = simplePushServiceTest_LiteHttpClient0.send();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      SimplePushServiceTest simplePushServiceTest0 = new SimplePushServiceTest();
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      SimplePushServiceTest.LiteHttpClient simplePushServiceTest_LiteHttpClient0 = new SimplePushServiceTest.LiteHttpClient();
      SimplePushServiceTest.LiteHttpClient simplePushServiceTest_LiteHttpClient1 = simplePushServiceTest_LiteHttpClient0.setUserAgent("}kL*cJ");
      simplePushServiceTest_LiteHttpClient0.open("n>^lVE'\"T)dQ", "http://localhost:8080/example/push");
      String string0 = simplePushServiceTest_LiteHttpClient1.send(".Ab3C\u0000Fy@y ");
      assertNull(string0);
  }

  
}
