package webapp.pages.push01_simple;

import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import webapp.pages.push01_simple.SimpleSSEPushTest;

public class SimpleSSEPushTest_ESTest {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      SimpleSSEPushTest.LiteHttpClient simpleSSEPushTest_LiteHttpClient0 = new SimpleSSEPushTest.LiteHttpClient();
      String string0 = simpleSSEPushTest_LiteHttpClient0.send("!P");
      assertNull(string0);
  }

  
  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      SimpleSSEPushTest.LiteHttpClient simpleSSEPushTest_LiteHttpClient0 = new SimpleSSEPushTest.LiteHttpClient();
      simpleSSEPushTest_LiteHttpClient0.open("http://localhost:8080/example/sse", "http://localhost:8080/example/sse");
      simpleSSEPushTest_LiteHttpClient0.addHeader("3dSlL*uqrAD*x", (String) null);
      String string0 = simpleSSEPushTest_LiteHttpClient0.send("");
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      SimpleSSEPushTest.LiteHttpClient simpleSSEPushTest_LiteHttpClient0 = new SimpleSSEPushTest.LiteHttpClient();
      SimpleSSEPushTest.LiteHttpClient simpleSSEPushTest_LiteHttpClient1 = simpleSSEPushTest_LiteHttpClient0.open("sendString=", "http://localhost:8080/example/sse");
      simpleSSEPushTest_LiteHttpClient1.addHeader("~8K~K<Rg599<(", "");
      String string0 = simpleSSEPushTest_LiteHttpClient0.send();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      SimpleSSEPushTest.LiteHttpClient simpleSSEPushTest_LiteHttpClient0 = new SimpleSSEPushTest.LiteHttpClient();
      simpleSSEPushTest_LiteHttpClient0.open("http://localhost:8080/example/sse", "http://localhost:8080/example/sse");
      simpleSSEPushTest_LiteHttpClient0.setUserAgent("http://localhost:8080/example/sse");
      String string0 = simpleSSEPushTest_LiteHttpClient0.send("");
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      SimpleSSEPushTest simpleSSEPushTest0 = new SimpleSSEPushTest();
  }



  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      MockThrowable mockThrowable0 = new MockThrowable();
      SimpleSSEPushTest.LiteHttpClientException simpleSSEPushTest_LiteHttpClientException0 = new SimpleSSEPushTest.LiteHttpClientException(mockThrowable0);
      SimpleSSEPushTest.LiteHttpClientException simpleSSEPushTest_LiteHttpClientException1 = new SimpleSSEPushTest.LiteHttpClientException((String) null, simpleSSEPushTest_LiteHttpClientException0);
      assertFalse(simpleSSEPushTest_LiteHttpClientException1.equals((Object)simpleSSEPushTest_LiteHttpClientException0));
  }
}
