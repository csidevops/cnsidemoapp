package webapp.framework.sse;

import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import webapp.framework.sse.MessageEvent;

public class MessageEvent_ESTest {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      MessageEvent.Builder messageEvent_Builder0 = new MessageEvent.Builder();
      messageEvent_Builder0.setRetry(0);
      MessageEvent messageEvent0 = messageEvent_Builder0.build();
      messageEvent0.getRetry();
      assertEquals("retry: 0\n\n", messageEvent0.toString());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      MessageEvent.Builder messageEvent_Builder0 = new MessageEvent.Builder();
      MessageEvent.Builder messageEvent_Builder1 = messageEvent_Builder0.setRetry(1);
      MessageEvent messageEvent0 = messageEvent_Builder1.build();
      messageEvent0.getRetry();
      assertEquals("retry: 1\n\n", messageEvent0.toString());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      MessageEvent.Builder messageEvent_Builder0 = new MessageEvent.Builder();
      messageEvent_Builder0.setRetry((-1872));
      MessageEvent messageEvent0 = messageEvent_Builder0.build();
      messageEvent0.getRetry();
      assertEquals("retry: -1872\n\n", messageEvent0.toString());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      MessageEvent.Builder messageEvent_Builder0 = new MessageEvent.Builder();
      messageEvent_Builder0.setId("id: ");
      MessageEvent messageEvent0 = messageEvent_Builder0.build();
      String string0 = messageEvent0.getId();
      assertEquals("id: ", string0);
      assertNotNull(string0);
      assertEquals("id: id: \n\n", messageEvent0.toString());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      MessageEvent.Builder messageEvent_Builder0 = new MessageEvent.Builder();
      messageEvent_Builder0.setId("");
      MessageEvent messageEvent0 = messageEvent_Builder0.build();
      String string0 = messageEvent0.getId();
      assertNotNull(string0);
      assertEquals("", string0);
      assertEquals("id: \n\n", messageEvent0.toString());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      MessageEvent.Builder messageEvent_Builder0 = new MessageEvent.Builder();
      MessageEvent.Builder messageEvent_Builder1 = messageEvent_Builder0.setEvent("");
      MessageEvent messageEvent0 = messageEvent_Builder1.build();
      String string0 = messageEvent0.getEvent();
      assertEquals("", string0);
      assertEquals("event: \n\n", messageEvent0.toString());
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      MessageEvent.Builder messageEvent_Builder0 = new MessageEvent.Builder();
      MessageEvent.Builder messageEvent_Builder1 = messageEvent_Builder0.setData("0xd%ruv03$yV");
      MessageEvent messageEvent0 = messageEvent_Builder1.build();
      String string0 = messageEvent0.getData();
      assertEquals("data: 0xd%ruv03$yV\n\n", messageEvent0.toString());
      assertNotNull(string0);
      assertEquals("0xd%ruv03$yV", string0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      MessageEvent.Builder messageEvent_Builder0 = new MessageEvent.Builder();
      messageEvent_Builder0.setData("");
      MessageEvent messageEvent0 = messageEvent_Builder0.build();
      String string0 = messageEvent0.getData();
      assertEquals("", string0);
      assertNotNull(string0);
      assertEquals("data: \n\n", messageEvent0.toString());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      MessageEvent.Builder messageEvent_Builder0 = new MessageEvent.Builder();
      MessageEvent messageEvent0 = messageEvent_Builder0.build();
      String string0 = messageEvent0.getEvent();
      assertEquals("\n", messageEvent0.toString());
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      MessageEvent.Builder messageEvent_Builder0 = new MessageEvent.Builder();
      MessageEvent messageEvent0 = messageEvent_Builder0.build();
      String string0 = messageEvent0.getId();
      assertNull(string0);
      assertEquals("\n", messageEvent0.toString());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      MessageEvent.Builder messageEvent_Builder0 = new MessageEvent.Builder();
      MessageEvent messageEvent0 = messageEvent_Builder0.build();
      String string0 = messageEvent0.getData();
      assertEquals("\n", messageEvent0.toString());
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      MessageEvent.Builder messageEvent_Builder0 = new MessageEvent.Builder();
      MessageEvent messageEvent0 = messageEvent_Builder0.build();
      messageEvent0.getRetry();
      assertEquals("\n", messageEvent0.toString());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      MessageEvent.Builder messageEvent_Builder0 = new MessageEvent.Builder();
      MessageEvent messageEvent0 = messageEvent_Builder0.build();
      String string0 = messageEvent0.toString();
      assertNotNull(string0);
      assertEquals("\n", string0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      MessageEvent.Builder messageEvent_Builder0 = new MessageEvent.Builder();
      messageEvent_Builder0.setEvent("_)0v63SVjb b ipQ");
      MessageEvent messageEvent0 = messageEvent_Builder0.build();
      String string0 = messageEvent0.getEvent();
      assertEquals("_)0v63SVjb b ipQ", string0);
      assertEquals("event: _)0v63SVjb b ipQ\n\n", messageEvent0.toString());
      assertNotNull(string0);
  }
}
