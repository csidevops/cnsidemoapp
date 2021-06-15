package webapp.framework.sse;

import org.junit.Test;
import static org.junit.Assert.*;
import java.util.LinkedList;
import java.util.List;
import org.junit.runner.RunWith;
import webapp.framework.sse.EventTarget;
import webapp.framework.sse.MessageEvent;
import webapp.framework.sse.SSEPushManager;

public class SSEPushManager_ESTest {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      SSEPushManager sSEPushManager0 = new SSEPushManager();
      LinkedList<EventTarget> linkedList0 = new LinkedList<EventTarget>();
      sSEPushManager0.mEventTargetList = (List<EventTarget>) linkedList0;
      linkedList0.add((EventTarget) null);
      List<EventTarget> list0 = sSEPushManager0.getTargetList();
      assertFalse(list0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      SSEPushManager sSEPushManager0 = new SSEPushManager();
      sSEPushManager0.mEventTargetList = null;
      // Undeclared exception!
      try { 
        sSEPushManager0.clearTargets();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("webapp.framework.sse.SSEPushManager", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      SSEPushManager sSEPushManager0 = new SSEPushManager();
      LinkedList<EventTarget> linkedList0 = new LinkedList<EventTarget>();
      sSEPushManager0.mEventTargetList = (List<EventTarget>) linkedList0;
      linkedList0.add((EventTarget) null);
      // Undeclared exception!
      try { 
        sSEPushManager0.broadcast("S>J\"", "");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("webapp.framework.sse.SSEPushManager", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      SSEPushManager sSEPushManager0 = new SSEPushManager();
      MessageEvent messageEvent0 = mock(MessageEvent.class, new ViolatedAssumptionAnswer());
      List<EventTarget> list0 = sSEPushManager0.broadcast(messageEvent0);
      sSEPushManager0.mEventTargetList = list0;
      sSEPushManager0.mEventTargetList = list0;
      sSEPushManager0.mEventTargetList = null;
      List<EventTarget> list1 = sSEPushManager0.getTargetList();
      assertNull(list1);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      SSEPushManager sSEPushManager0 = new SSEPushManager();
      LinkedList<EventTarget> linkedList0 = new LinkedList<EventTarget>();
      sSEPushManager0.mEventTargetList = (List<EventTarget>) linkedList0;
      linkedList0.add((EventTarget) null);
      sSEPushManager0.clearTargets();
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      SSEPushManager sSEPushManager0 = new SSEPushManager();
      LinkedList<EventTarget> linkedList0 = new LinkedList<EventTarget>();
      sSEPushManager0.mEventTargetList = (List<EventTarget>) linkedList0;
      linkedList0.add((EventTarget) null);
      MessageEvent messageEvent0 = mock(MessageEvent.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      try { 
        sSEPushManager0.broadcast(messageEvent0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("webapp.framework.sse.SSEPushManager", e);
      }
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      SSEPushManager sSEPushManager0 = new SSEPushManager();
      // Undeclared exception!
      try { 
        sSEPushManager0.addTarget((EventTarget) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("webapp.framework.sse.SSEPushManager", e);
      }
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      SSEPushManager sSEPushManager0 = new SSEPushManager();
      List<EventTarget> list0 = sSEPushManager0.getTargetList();
      assertEquals(0, list0.size());
  }

  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      SSEPushManager sSEPushManager0 = new SSEPushManager();
      MessageEvent messageEvent0 = mock(MessageEvent.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      try { 
        sSEPushManager0.addTarget((EventTarget) null, messageEvent0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("webapp.framework.sse.SSEPushManager", e);
      }
  }

  @Test(timeout = 4000)
  public void test9()  throws Throwable  {
      SSEPushManager sSEPushManager0 = new SSEPushManager();
      List<EventTarget> list0 = sSEPushManager0.broadcast("`y", "`y");
      assertEquals(0, list0.size());
  }
}
