package webapp.framework;

import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import webapp.framework.AesCrypter;

public class AesCrypter_ESTest {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      AesCrypter.HexCodec aesCrypter_HexCodec0 = new AesCrypter.HexCodec("");
      aesCrypter_HexCodec0.toString();
      assertEquals("", aesCrypter_HexCodec0.getCharsetName());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      AesCrypter.HexCodec aesCrypter_HexCodec0 = new AesCrypter.HexCodec();
      byte[] byteArray1 = aesCrypter_HexCodec0.decode(byteArray0);
      assertArrayEquals(new byte[] {}, byteArray1);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      int int0 = AesCrypter.HexCodec.toDigit('6', 0);
      assertEquals(6, int0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      AesCrypter.HexCodec aesCrypter_HexCodec0 = new AesCrypter.HexCodec("[charsetName=");
      String string0 = aesCrypter_HexCodec0.getCharsetName();
      assertEquals("[charsetName=", string0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      AesCrypter.HexCodec aesCrypter_HexCodec0 = new AesCrypter.HexCodec("[charsetName=");
      try { 
        aesCrypter_HexCodec0.encode("[charsetName=");
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // [charsetName=
         //
         verifyException("webapp.framework.AesCrypter$HexCodec", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      AesCrypter.HexCodec aesCrypter_HexCodec0 = new AesCrypter.HexCodec("gN*QIh");
      byte[] byteArray0 = new byte[1];
      try { 
        aesCrypter_HexCodec0.decode(byteArray0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // gN*QIh
         //
         verifyException("webapp.framework.AesCrypter$HexCodec", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      AesCrypter.HexCodec aesCrypter_HexCodec0 = new AesCrypter.HexCodec();
      Object object0 = new Object();
      try { 
        aesCrypter_HexCodec0.decode(object0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // java.lang.Object cannot be cast to [C
         //
         verifyException("webapp.framework.AesCrypter$HexCodec", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      byte[] byteArray0 = new byte[2];
      char[] charArray0 = AesCrypter.HexCodec.encodeHex(byteArray0);
      char[] charArray1 = AesCrypter.HexCodec.encodeHex(byteArray0, charArray0);
      //  // Unstable assertion: assertNotSame(charArray1, charArray0);
      //  // Unstable assertion: assertArrayEquals(new char[] {'6', '6', '6', '6'}, charArray0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      byte[] byteArray0 = new byte[2];
      char[] charArray0 = AesCrypter.HexCodec.encodeHex(byteArray0, false);
      //  // Unstable assertion: assertEquals(4, charArray0.length);
      //  // Unstable assertion: assertArrayEquals(new char[] {'6', '6', '6', '6'}, charArray0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      byte[] byteArray0 = new byte[2];
      char[] charArray0 = AesCrypter.HexCodec.encodeHex(byteArray0, true);
      byte[] byteArray1 = AesCrypter.HexCodec.decodeHex(charArray0);
      assertArrayEquals(new byte[] {(byte)0, (byte)0}, byteArray1);
      assertArrayEquals(new char[] {'0', '0', '0', '0'}, charArray0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      char[] charArray0 = new char[3];
      try { 
        AesCrypter.HexCodec.decodeHex(charArray0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Odd number of characters.
         //
         verifyException("webapp.framework.AesCrypter$HexCodec", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      String string0 = AesCrypter.HexCodec.encodeHexString(byteArray0);
      //  // Unstable assertion: assertEquals("66", string0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      AesCrypter.HexCodec aesCrypter_HexCodec0 = new AesCrypter.HexCodec();
      Object object0 = aesCrypter_HexCodec0.encode("UTF-8");
      try { 
        aesCrypter_HexCodec0.encode(object0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // [C cannot be cast to [B
         //
         verifyException("webapp.framework.AesCrypter$HexCodec", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      AesCrypter.HexCodec aesCrypter_HexCodec0 = new AesCrypter.HexCodec();
      try { 
        aesCrypter_HexCodec0.decode((Object) "g3][6");
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Odd number of characters.
         //
         verifyException("webapp.framework.AesCrypter$HexCodec", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      AesCrypter aesCrypter0 = new AesCrypter();
      String string0 = aesCrypter0.decrypt("63692C337B327898B0D693975B63EF66C8241C70AA52551141086F8A6EBC886B");
      assertNotNull(string0);
      assertEquals("Tiz5vSz0l=,:%|*u", string0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      AesCrypter aesCrypter0 = new AesCrypter();
      String string0 = aesCrypter0.decrypt("B4lzez@*v\b%");
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      AesCrypter aesCrypter0 = new AesCrypter();
      String string0 = aesCrypter0.decrypt((String) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      AesCrypter aesCrypter0 = new AesCrypter();
      String string0 = aesCrypter0.decrypt("");
      assertNotNull(string0);
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      AesCrypter aesCrypter0 = new AesCrypter();
      String string0 = aesCrypter0.encrypt((String) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      byte[] byteArray0 = new byte[6];
      AesCrypter.HexCodec aesCrypter_HexCodec0 = new AesCrypter.HexCodec();
      try { 
        aesCrypter_HexCodec0.decode(byteArray0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Illegal hexadecimal character \u0000 at index 0
         //
         verifyException("webapp.framework.AesCrypter$HexCodec", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      AesCrypter aesCrypter0 = new AesCrypter();
      String string0 = aesCrypter0.encrypt("");
      //  // Unstable assertion: assertNotNull(string0);
      //  // Unstable assertion: assertEquals("88DB4E5646CBAC64D6868BD65F2660A6", string0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      AesCrypter.HexCodec aesCrypter_HexCodec0 = new AesCrypter.HexCodec();
      Object object0 = aesCrypter_HexCodec0.encode("UTF-8");
      Object object1 = aesCrypter_HexCodec0.decode(object0);
      assertFalse(object1.equals((Object)object0));
  }
}
