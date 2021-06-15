package webapp.models;

import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import webapp.models.PersonInfo;

public class PersonInfo_ESTest {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      PersonInfo personInfo0 = new PersonInfo();
      personInfo0.setPassword("wD)7S}:?6kL:l\"");
      String string0 = personInfo0.getPassword();
      assertEquals("wD)7S}:?6kL:l\"", string0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      PersonInfo personInfo0 = new PersonInfo();
      personInfo0.setName("Dtc99QXnWxlzzJLUj");
      String string0 = personInfo0.getName();
      assertEquals("Dtc99QXnWxlzzJLUj", string0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      PersonInfo personInfo0 = new PersonInfo();
      personInfo0.setId(1);
      int int0 = personInfo0.getId();
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      PersonInfo personInfo0 = new PersonInfo();
      personInfo0.setArea("`g9=@");
      String string0 = personInfo0.getArea();
      assertEquals("`g9=@", string0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      PersonInfo personInfo0 = new PersonInfo();
      personInfo0.setArea("");
      String string0 = personInfo0.getArea();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      PersonInfo personInfo0 = new PersonInfo();
      int int0 = personInfo0.getId();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      PersonInfo personInfo0 = new PersonInfo();
      personInfo0.setName("");
      String string0 = personInfo0.getName();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      PersonInfo personInfo0 = new PersonInfo();
      String string0 = personInfo0.getArea();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      PersonInfo personInfo0 = new PersonInfo();
      String string0 = personInfo0.getPassword();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      PersonInfo personInfo0 = new PersonInfo();
      personInfo0.setId((-2146));
      int int0 = personInfo0.getId();
      assertEquals((-2146), int0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      PersonInfo personInfo0 = new PersonInfo();
      personInfo0.setPassword("");
      String string0 = personInfo0.getPassword();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      PersonInfo personInfo0 = new PersonInfo();
      String string0 = personInfo0.getName();
      assertNull(string0);
  }
}
