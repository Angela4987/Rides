//	package test;
//
//	import static org.junit.Assert.*;
//
//	import java.text.SimpleDateFormat;
//	import java.util.Date;
//
//	import org.junit.Test;
//
//	import dataaccess.DataAccess;
//	import testOperations.TestDataAccess;
//
//
//public class ErregistratuBDBlackTest {
//
//
//
//	    static DataAccess sut = new DataAccess();
//	    static TestDataAccess testDA = new TestDataAccess();
//
//	    @Test
//	    public void test1() throws Exception {
//
//	        Date d = new SimpleDateFormat("dd/MM/yyyy").parse("20/11/2003");
//
//	        boolean result = sut.erregistratu(
//	                "Aitor",
//	                "Fernandez",
//	                d,
//	                "Gizona",
//	                "Gidaria",
//	                "driver1@gmail.com",
//	                "12345");
//
//	        assertFalse(result);
//	    }
//
//	    @Test
//	    public void test2() throws Exception {
//
//	        Date d = new SimpleDateFormat("dd/MM/yyyy").parse("27/06/2006");
//
//	        testDA.open();
//	        if (testDA.existDriver("salvarez@gmail.com"))
//	            testDA.removeDriver("salvarez@gmail.com");
//	        testDA.close();
//
//	        boolean result = sut.erregistratu(
//	                "Sara",
//	                "Alvarez",
//	                d,
//	                "Emakumea",
//	                "Gidaria",
//	                "salvarez@gmail.com",
//	                "123456");
//
//	        assertTrue(result);
//	    }
//
//	    @Test
//	    public void test3() throws Exception {
//
//	        Date d = new SimpleDateFormat("dd/MM/yyyy").parse("14/03/2000");
//
//	        boolean result = sut.erregistratu(
//	                "Magdalena",
//	                "Sevillano",
//	                d,
//	                "Emakumea",
//	                "Bidaiari",
//	                "bidaiari@gmail.com",
//	                "12345");
//
//	        assertFalse(result);
//	    }
//
//	    @Test
//	    public void test4() throws Exception {
//
//	        Date d = new SimpleDateFormat("dd/MM/yyyy").parse("27/06/2006");
//
//	        testDA.open();
//	        if (testDA.existBidaiaria("salvarez@gmail.com"))
//	            testDA.removeBidaiaria("salvarez@gmail.com");
//	        testDA.close();
//
//	        boolean result = sut.erregistratu(
//	                "Sara",
//	                "Alvarez",
//	                d,
//	                "Emakumea",
//	                "Bidaiari",
//	                "salvarez@gmail.com",
//	                "123456");
//
//	        assertTrue(result);
//	    }
//
//	    @Test
//	    public void test5() {
//	        try {
//	            Date d = new SimpleDateFormat("dd/MM/yyyy").parse("20/11/2003");
//
//	            sut.erregistratu(
//	                    null,
//	                    "Fernandez",
//	                    d,
//	                    "Gizona",
//	                    "Gidaria",
//	                    "driver1@gmail.com",
//	                    "12345");
//
//	            fail();
//	        } catch (Exception e) {
//	            assertTrue(true);
//	        }
//	    }
//
//	    @Test
//	    public void test6() {
//	        try {
//	            Date d = new SimpleDateFormat("dd/MM/yyyy").parse("20/11/2003");
//
//	            sut.erregistratu(
//	                    "Aitor",
//	                    null,
//	                    d,
//	                    "Gizona",
//	                    "Gidaria",
//	                    "driver1@gmail.com",
//	                    "12345");
//
//	            fail();
//	        } catch (Exception e) {
//	            assertTrue(true);
//	        }
//	    }
//
//	    @Test
//	    public void test7() {
//	        try {
//
//	            sut.erregistratu(
//	                    "Aitor",
//	                    "Fernandez",
//	                    null,
//	                    "Gizona",
//	                    "Gidaria",
//	                    "driver1@gmail.com",
//	                    "12345");
//
//	            fail();
//	        } catch (Exception e) {
//	            assertTrue(true);
//	        }
//	    }
//
//	    @Test
//	    public void test8() {
//	        try {
//	            Date d = new SimpleDateFormat("dd/MM/yyyy").parse("20/11/2003");
//
//	            sut.erregistratu(
//	                    "Aitor",
//	                    "Fernandez",
//	                    d,
//	                    null,
//	                    "Gidaria",
//	                    "driver1@gmail.com",
//	                    "12345");
//
//	            fail();
//	        } catch (Exception e) {
//	            assertTrue(true);
//	        }
//	    }
//
//	    @Test
//	    public void test9() {
//	        try {
//	            Date d = new SimpleDateFormat("dd/MM/yyyy").parse("20/11/2003");
//
//	            sut.erregistratu(
//	                    "Aitor",
//	                    "Fernandez",
//	                    d,
//	                    "Gizona",
//	                    null,
//	                    "driver1@gmail.com",
//	                    "12345");
//
//	            fail();
//	        } catch (Exception e) {
//	            assertTrue(true);
//	        }
//	    }
//
//	    @Test
//	    public void test10() {
//	        try {
//	            Date d = new SimpleDateFormat("dd/MM/yyyy").parse("20/11/2003");
//
//	            sut.erregistratu(
//	                    "Aitor",
//	                    "Fernandez",
//	                    d,
//	                    "Gizona",
//	                    "Gidaria",
//	                    null,
//	                    "12345");
//
//	            fail();
//	        } catch (Exception e) {
//	            assertTrue(true);
//	        }
//	    }
//
//	    @Test
//	    public void test11() {
//	        try {
//	            Date d = new SimpleDateFormat("dd/MM/yyyy").parse("20/11/2003");
//
//	            sut.erregistratu(
//	                    "Aitor",
//	                    "Fernandez",
//	                    d,
//	                    "Gizona",
//	                    "Gidaria",
//	                    "driver1@gmail.com",
//	                    null);
//
//	            fail();
//	        } catch (Exception e) {
//	            assertTrue(true);
//	        }
//	    }
//
//	    @Test
//	    public void test12() {
//	        try {
//	            Date d = new SimpleDateFormat("dd/MM/yyyy").parse("20/11/2003");
//
//	            sut.erregistratu(
//	                    "23548",
//	                    "Fernandez",
//	                    d,
//	                    "Gizona",
//	                    "Gidaria",
//	                    "driver1@gmail.com",
//	                    "12345");
//
//	            fail();
//	        } catch (Exception e) {
//	            assertTrue(true);
//	        }
//	    }
//
//	    @Test
//	    public void test13() {
//	        try {
//	            Date d = new SimpleDateFormat("dd/MM/yyyy").parse("20/11/2003");
//
//	            sut.erregistratu(
//	                    "Aitor",
//	                    "5624",
//	                    d,
//	                    "Gizona",
//	                    "Gidaria",
//	                    "driver1@gmail.com",
//	                    "12345");
//
//	            fail();
//	        } catch (Exception e) {
//	            assertTrue(true);
//	        }
//	    }
//
//	    @Test
//	    public void test14() {
//	        try {
//	            fail();
//	        } catch (Exception e) {
//	            assertTrue(true);
//	        }
//	    }
//
//	    @Test
//	    public void test15() {
//	        try {
//	            Date d = new SimpleDateFormat("dd/MM/yyyy").parse("20/11/2003");
//
//	            sut.erregistratu(
//	                    "Aitor",
//	                    "Fernandez",
//	                    d,
//	                    "Elefantea",
//	                    "Gidaria",
//	                    "driver1@gmail.com",
//	                    "12345");
//
//	            fail();
//	        } catch (Exception e) {
//	            assertTrue(true);
//	        }
//	    }
//
//	    @Test
//	    public void test16() {
//	        try {
//	            Date d = new SimpleDateFormat("dd/MM/yyyy").parse("20/11/2003");
//
//	            sut.erregistratu(
//	                    "Aitor",
//	                    "Fernandez",
//	                    d,
//	                    "Gizona",
//	                    "Polizia",
//	                    "driver1@gmail.com",
//	                    "12345");
//
//	            fail();
//	        } catch (Exception e) {
//	            assertTrue(true);
//	        }
//	    }
//
//	    @Test
//	    public void test17() {
//	        try {
//	            Date d = new SimpleDateFormat("dd/MM/yyyy").parse("20/11/2003");
//
//	            sut.erregistratu(
//	                    "Aitor",
//	                    "Fernandez",
//	                    d,
//	                    "Gizona",
//	                    "Gidaria",
//	                    "driver1",
//	                    "12345");
//
//	            fail();
//	        } catch (Exception e) {
//	            assertTrue(true);
//	        }
//	    }
//	}
