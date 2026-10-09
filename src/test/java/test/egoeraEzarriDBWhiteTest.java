package test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import org.junit.Before;
import org.junit.Test;

import dataaccess.DataAccess;
import exceptions.erreklamazioaEbatzitaException;
import testOperations.TestDataAccess;

public class egoeraEzarriDBWhiteTest {

	static DataAccess sut = new DataAccess();

	static TestDataAccess testDA = new TestDataAccess();

	private String bMail;
	private String bName;
	private String dMail;
	private String dName;
	private float diruIzoztua;

	@Before
	public void defaultValues() {
		bMail = "bidaiariTest@ehu.eus";
		bName = "Bidaiari Test";
		dMail = "driverTest@ehu.eus";
		dName = "Driver Test";
		diruIzoztua = 50f;
	}

	@Test
	public void test1() { //Erreklamazioa ebatzita
		testDA.open();
		int errekzbk = testDA.addErreklamazioaWithUsers(bMail, bName, dMail, dName, "onartu", diruIzoztua);
		float bDirua = testDA.getBidaiariaDirua(bMail);
		float dDirua = testDA.getDriverDirua(dMail);
		testDA.close();
		try {
			sut.egoeraEzarri(errekzbk, "deuseztatu");
			fail("Salbuespena bota behar zen");

		} catch (erreklamazioaEbatzitaException e) {
			assertTrue(true);
			testDA.open();
			String egoera = testDA.getEgoera(errekzbk);
			float bDiruaOrain = testDA.getBidaiariaDirua(bMail);
			float dDiruaOrain = testDA.getDriverDirua(dMail);
			testDA.close();
			assertEquals("onartu", egoera);
			assertEquals(bDirua, bDiruaOrain, 0.001);
			assertEquals(dDirua, dDiruaOrain, 0.001);
		} catch (Exception e) {
			e.printStackTrace();
			fail();
		} finally {
			testDA.open();
			testDA.removeErreklamazioaWithUsers(errekzbk, bMail, dMail);
			testDA.close();
		}
	}

	@Test
	public void test2() { //itxaron egoeratik onartu egoerara. Dirua mugitu
		testDA.open();
		int errekzbk = testDA.addErreklamazioaWithUsers(bMail, bName, dMail, dName, "itxaron", diruIzoztua);
		float bDirua = testDA.getBidaiariaDirua(bMail);
		float dDirua = testDA.getDriverDirua(dMail);
		testDA.close();
		try {
			sut.egoeraEzarri(errekzbk, "onartu");

			testDA.open();
			String egoera = testDA.getEgoera(errekzbk);
			float bDiruaOrain = testDA.getBidaiariaDirua(bMail);
			float dDiruaOrain = testDA.getDriverDirua(dMail);
			testDA.close();
			assertEquals("onartu", egoera);
			assertEquals(bDirua + diruIzoztua, bDiruaOrain, 0.001);
			assertEquals(dDirua - diruIzoztua, dDiruaOrain, 0.001);

		} catch (erreklamazioaEbatzitaException e) {
			e.printStackTrace();
			fail();
		} catch (Exception e) {
			e.printStackTrace();
			fail();
		} finally {
			testDA.open();
			testDA.removeErreklamazioaWithUsers(errekzbk, bMail, dMail);
			testDA.close();
		}
	}

	@Test
	public void test3() {  //itxaron egoeratik deuseztatu egoerara
		testDA.open();
		int errekzbk = testDA.addErreklamazioaWithUsers(bMail, bName, dMail, dName, "itxaron", diruIzoztua);
		float bDirua = testDA.getBidaiariaDirua(bMail);
		float dDirua = testDA.getDriverDirua(dMail);
		testDA.close();
		try {
			sut.egoeraEzarri(errekzbk, "deuseztatu");

			testDA.open();
			String egoera = testDA.getEgoera(errekzbk);
			float bDiruaOrain = testDA.getBidaiariaDirua(bMail);
			float dDiruaOrain = testDA.getDriverDirua(dMail);
			testDA.close();
			assertEquals("deuseztatu", egoera);
			assertEquals(bDirua, bDiruaOrain, 0.001);
			assertEquals(dDirua, dDiruaOrain, 0.001);

		} catch (erreklamazioaEbatzitaException e) {
			e.printStackTrace();
			fail();
		} catch (Exception e) {
			e.printStackTrace();
			fail();
		} finally {
			testDA.open();
			testDA.removeErreklamazioaWithUsers(errekzbk, bMail, dMail);
			testDA.close();
		}
	}

	@Test
	public void test4() { //itxaron egoeratik beste edozein egoerara
		testDA.open();
		int errekzbk = testDA.addErreklamazioaWithUsers(bMail, bName, dMail, dName, "itxaron", diruIzoztua);
		float bDirua = testDA.getBidaiariaDirua(bMail);
		float dDirua = testDA.getDriverDirua(dMail);
		testDA.close();
		try {
			sut.egoeraEzarri(errekzbk, "berrikusi");

			testDA.open();
			String egoera = testDA.getEgoera(errekzbk);
			float bDiruaOrain = testDA.getBidaiariaDirua(bMail);
			float dDiruaOrain = testDA.getDriverDirua(dMail);
			testDA.close();
			assertEquals("berrikusi", egoera);
			assertEquals(bDirua, bDiruaOrain, 0.001);
			assertEquals(dDirua, dDiruaOrain, 0.001);

		} catch (erreklamazioaEbatzitaException e) {
			e.printStackTrace();
			fail();
		} catch (Exception e) {
			e.printStackTrace();
			fail();
		} finally {
			testDA.open();
			testDA.removeErreklamazioaWithUsers(errekzbk, bMail, dMail);
			testDA.close();
		}
	}
}
