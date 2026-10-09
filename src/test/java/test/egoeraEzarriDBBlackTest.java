//package test;
//
//import static org.junit.Assert.assertEquals;
//import static org.junit.Assert.assertFalse;
//import static org.junit.Assert.assertTrue;
//import static org.junit.Assert.fail;
//
//import org.junit.Before;
//import org.junit.Test;
//
//import dataaccess.DataAccess;
//import exceptions.erreklamazioaEbatzitaException;
//import testOperations.TestDataAccess;
//
//public class egoeraEzarriDBBlackTest {
//
//	static DataAccess sut = new DataAccess();
//
//	static TestDataAccess testDA = new TestDataAccess();
//
//	private String bMail;
//	private String bName;
//	private String dMail;
//	private String dName;
//	private float diruIzoztua;
//
//	@Before
//	public void defaultValues() {
//		bMail = "bidaiariTest@ehu.eus";
//		bName = "Bidaiari Test";
//		dMail = "driverTest@ehu.eus";
//		dName = "Driver Test";
//		diruIzoztua = 50f;
//	}
//
//	@Test
//	public void test1() {// BK 1,2,3,4,5,8
//		testDA.open();
//		int errekzbk = testDA.addErreklamazioaWithUsers(bMail, bName, dMail, dName, "itxaron", diruIzoztua);
//		float bDirua = testDA.getBidaiariaDirua(bMail);
//		float dDirua = testDA.getDriverDirua(dMail);
//		testDA.close();
//		try {
//			sut.egoeraEzarri(errekzbk, "onartu");
//
//			testDA.open();
//			String egoera = testDA.getEgoera(errekzbk);
//			float bDiruaOrain = testDA.getBidaiariaDirua(bMail);
//			float dDiruaOrain = testDA.getDriverDirua(dMail);
//			testDA.close();
//			assertEquals("onartu", egoera);
//			assertEquals(bDirua + diruIzoztua, bDiruaOrain, 0.001);
//			assertEquals(dDirua - diruIzoztua, dDiruaOrain, 0.001);
//
//		} catch (erreklamazioaEbatzitaException e) {
//			e.printStackTrace();
//			fail();
//		} catch (Exception e) {
//			e.printStackTrace();
//			fail();
//		} finally {
//			testDA.open();
//			testDA.removeErreklamazioaWithUsers(errekzbk, bMail, dMail);
//			testDA.close();
//		}
//	}
//
//	@Test	
//	public void test2() { // BK 1,2,3,4,6
//		testDA.open();
//		int errekzbk = testDA.addErreklamazioaWithUsers(bMail, bName, dMail, dName, "itxaron", diruIzoztua);
//		float bDirua = testDA.getBidaiariaDirua(bMail);
//		float dDirua = testDA.getDriverDirua(dMail);
//		testDA.close();
//		try {
//			sut.egoeraEzarri(errekzbk, "deuseztatu");
//
//			testDA.open();
//			String egoera = testDA.getEgoera(errekzbk);
//			float bDiruaOrain = testDA.getBidaiariaDirua(bMail);
//			float dDiruaOrain = testDA.getDriverDirua(dMail);
//			testDA.close();
//			assertEquals("deuseztatu", egoera);
//			assertEquals(bDirua, bDiruaOrain, 0.001);
//			assertEquals(dDirua, dDiruaOrain, 0.001);
//
//		} catch (erreklamazioaEbatzitaException e) {
//			e.printStackTrace();
//			fail();
//		} catch (Exception e) {
//			e.printStackTrace();
//			fail();
//		} finally {
//			testDA.open();
//			testDA.removeErreklamazioaWithUsers(errekzbk, bMail, dMail);
//			testDA.close();
//		}
//	}
//
//	@Test
//	public void test3() { // BK 1,2,3,4,7
//		testDA.open();
//		int errekzbk = testDA.addErreklamazioaWithUsers(bMail, bName, dMail, dName, "itxaron", diruIzoztua);
//		float bDirua = testDA.getBidaiariaDirua(bMail);
//		float dDirua = testDA.getDriverDirua(dMail);
//		testDA.close();
//		try {
//			sut.egoeraEzarri(errekzbk, "berrikusten");
//
//			testDA.open();
//			String egoera = testDA.getEgoera(errekzbk);
//			float bDiruaOrain = testDA.getBidaiariaDirua(bMail);
//			float dDiruaOrain = testDA.getDriverDirua(dMail);
//			testDA.close();
//			assertEquals("berrikusten", egoera);
//			assertEquals(bDirua, bDiruaOrain, 0.001);
//			assertEquals(dDirua, dDiruaOrain, 0.001);
//
//		} catch (erreklamazioaEbatzitaException e) {
//			e.printStackTrace();
//			fail();
//		} catch (Exception e) {
//			e.printStackTrace();
//			fail();
//		} finally {
//			testDA.open();
//			testDA.removeErreklamazioaWithUsers(errekzbk, bMail, dMail);
//			testDA.close();
//		}
//	}
//
//	@Test
//	public void test4() { // BK 10
//		try {
//			sut.egoeraEzarri(-1, "onartu");
//			fail();
//
//		} catch (NullPointerException e) {
//			assertTrue(true);
//		} catch (erreklamazioaEbatzitaException e) {
//			e.printStackTrace();
//			fail();
//		} catch (Exception e) {
//			e.printStackTrace();
//			fail();
//		}
//	}
//
//	@Test
//	public void test5() { // BK 1,3,4,11
//		testDA.open();
//		int errekzbk = testDA.addErreklamazioaWithUsers(bMail, bName, dMail, dName, "itxaron", diruIzoztua);
//		float bDirua = testDA.getBidaiariaDirua(bMail);
//		float dDirua = testDA.getDriverDirua(dMail);
//		testDA.close();
//		try {
//			sut.egoeraEzarri(errekzbk, null);
//			fail();
//
//		} catch (NullPointerException e) {
//			testDA.open();
//			String egoera = testDA.getEgoera(errekzbk);
//			float bDiruaOrain = testDA.getBidaiariaDirua(bMail);
//			float dDiruaOrain = testDA.getDriverDirua(dMail);
//			testDA.close();
//			assertEquals("itxaron", egoera);
//			assertEquals(bDirua, bDiruaOrain, 0.001);
//			assertEquals(dDirua, dDiruaOrain, 0.001);
//		} catch (erreklamazioaEbatzitaException e) {
//			e.printStackTrace();
//			fail();
//		} catch (Exception e) {
//			e.printStackTrace();
//			fail();
//		} finally {
//			testDA.open();
//			testDA.removeErreklamazioaWithUsers(errekzbk, bMail, dMail);
//			testDA.close();
//		}
//	}
//
//	@Test
//	public void test6() { // BK 12
//		testDA.open();
//		boolean exist = testDA.existErreklamazioa(999);
//		testDA.close();
//		assertFalse(exist);
//		try {
//			sut.egoeraEzarri(999, "onartu");
//			fail();
//
//		} catch (NullPointerException e) {
//			assertTrue(true);
//		} catch (erreklamazioaEbatzitaException e) {
//			e.printStackTrace();
//			fail();
//		} catch (Exception e) {
//			e.printStackTrace();
//			fail();
//		}
//	}
//
//	@Test
//	public void test7() { // BK 13
//		testDA.open();
//		int errekzbk = testDA.addErreklamazioaWithUsers(bMail, bName, dMail, dName, "onartu", diruIzoztua);
//		testDA.close();
//		try {
//			sut.egoeraEzarri(errekzbk, "deuseztatu");
//			fail();
//
//		} catch (erreklamazioaEbatzitaException e) {
//			testDA.open();
//			String egoera = testDA.getEgoera(errekzbk);
//			testDA.close();
//			assertEquals("onartu", egoera);
//		} catch (Exception e) {
//			e.printStackTrace();
//			fail();
//		} finally {
//			testDA.open();
//			testDA.removeErreklamazioaWithUsers(errekzbk, bMail, dMail);
//			testDA.close();
//		}
//	}
//
//	@Test
//	public void test8a() { // BK 1,2,3,4,5,14: bidaiaria == null 
//		testDA.open();
//		int errekzbk = testDA.addErreklamazioaWithUsers(null, null, dMail, dName, "itxaron", diruIzoztua);
//		float dDirua = testDA.getDriverDirua(dMail);
//		testDA.close();
//		try {
//			sut.egoeraEzarri(errekzbk, "onartu");
//			fail();
//
//		} catch (NullPointerException e) {
//			testDA.open();
//			String egoera = testDA.getEgoera(errekzbk);
//			float dDiruaOrain = testDA.getDriverDirua(dMail);
//			testDA.close();
//			assertEquals("itxaron", egoera);
//			assertEquals(dDirua, dDiruaOrain, 0.001);
//		} catch (erreklamazioaEbatzitaException e) {
//			e.printStackTrace();
//			fail();
//		} catch (Exception e) {
//			e.printStackTrace();
//			fail();
//		} finally {
//			testDA.open();
//			testDA.removeErreklamazioaWithUsers(errekzbk, null, dMail);
//			testDA.close();
//		}
//	}
//
//	@Test
//	public void test8b() { // BK 1,2,3,4,5,14: driver == null
//		testDA.open();
//		int errekzbk = testDA.addErreklamazioaWithUsers(bMail, bName, null, null, "itxaron", diruIzoztua);
//		float bDirua = testDA.getBidaiariaDirua(bMail);
//		testDA.close();
//		try {
//			sut.egoeraEzarri(errekzbk, "onartu");
//			fail();
//
//		} catch (NullPointerException e) {
//			testDA.open();
//			String egoera = testDA.getEgoera(errekzbk);
//			float bDiruaOrain = testDA.getBidaiariaDirua(bMail);
//			testDA.close();
//			assertEquals("itxaron", egoera);
//			assertEquals(bDirua, bDiruaOrain, 0.001);
//		} catch (erreklamazioaEbatzitaException e) {
//			e.printStackTrace();
//			fail();
//		} catch (Exception e) {
//			e.printStackTrace();
//			fail();
//		} finally {
//			testDA.open();
//			testDA.removeErreklamazioaWithUsers(errekzbk, bMail, null);
//			testDA.close();
//		}
//	}
//}
