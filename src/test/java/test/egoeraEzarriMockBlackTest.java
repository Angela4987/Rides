package test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import javax.persistence.*;
import org.junit.*;
import org.mockito.*;

import dataaccess.DataAccess;
import domain.*;
import exceptions.erreklamazioaEbatzitaException;

public class egoeraEzarriMockBlackTest {
static DataAccess sut;
	
	protected MockedStatic<Persistence> persistenceMock;

	@Mock
	protected  EntityManagerFactory entityManagerFactory;
	@Mock
	protected  EntityManager db;
	@Mock
    protected  EntityTransaction  et;
	
	private Bidaiaria bidaiaria;
	private Driver driver;
	private Erreserba erreserba;
	private Erreklamazioa erreklamazioa;
	private int errekzbk;
 
	@Before
	public void init() {
		MockitoAnnotations.openMocks(this);
		persistenceMock = Mockito.mockStatic(Persistence.class);
		persistenceMock.when(() -> Persistence.createEntityManagerFactory(Mockito.any()))
				.thenReturn(entityManagerFactory);
 
		Mockito.doReturn(db).when(entityManagerFactory).createEntityManager();
		Mockito.doReturn(et).when(db).getTransaction();
		sut = new DataAccess(db);
 
		bidaiaria = new Bidaiaria("bidaiariTest@ehu.eus", "Bidaiari Test", "Bidaiari Test");
		driver = new Driver("driverTest@ehu.eus", "Driver Test");
		errekzbk = 1;
		erreserba = Mockito.mock(Erreserba.class);
		Mockito.doReturn(50f).when(erreserba).getDiruIzoztua();
		erreklamazioa = new Erreklamazioa(erreserba, "Deskripzio proba", bidaiaria, driver);
 
		Mockito.when(db.find(Erreklamazioa.class, errekzbk)).thenReturn(erreklamazioa);
	}
 
	@After
	public void tearDown() {
		persistenceMock.close();
	}
 
	@Test
	public void test1() { // BK 1,2,3,4,5,8
		erreklamazioa.setEgoera("itxaron");
		float diruIzoztua = erreklamazioa.getErreserbarenDiruIzoztua();
		float bDirua = bidaiaria.getDirua();
		float dDirua = driver.getDirua();
		try {
			sut.egoeraEzarri(errekzbk, "onartu");
 
			assertEquals("onartu", erreklamazioa.getEgoera());
			assertEquals(bDirua + diruIzoztua, bidaiaria.getDirua(), 0.001);
			assertEquals(dDirua - diruIzoztua, driver.getDirua(), 0.001);
 
		} catch (erreklamazioaEbatzitaException e) {
			e.printStackTrace();
			fail();
		} catch (Exception e) {
			e.printStackTrace();
			fail();
		}
	}
 
	@Test
	public void test2() { // BK 1,2,3,4,6
		erreklamazioa.setEgoera("itxaron");
		float bDirua = bidaiaria.getDirua();
		float dDirua = driver.getDirua();
		try {
			sut.egoeraEzarri(errekzbk, "deuseztatu");
 
			assertEquals("deuseztatu", erreklamazioa.getEgoera());
			assertEquals(bDirua, bidaiaria.getDirua(), 0.001);
			assertEquals(dDirua, driver.getDirua(), 0.001);
 
		} catch (erreklamazioaEbatzitaException e) {
			e.printStackTrace();
			fail();
		} catch (Exception e) {
			e.printStackTrace();
			fail();
		}
	}
 
	@Test
	public void test3() { // BK 1,2,3,4,7
		erreklamazioa.setEgoera("itxaron");
		float bDirua = bidaiaria.getDirua();
		float dDirua = driver.getDirua();
		try {
			sut.egoeraEzarri(errekzbk, "berrikusten");
 
			assertEquals("berrikusten", erreklamazioa.getEgoera());
			assertEquals(bDirua, bidaiaria.getDirua(), 0.001);
			assertEquals(dDirua, driver.getDirua(), 0.001);
 
		} catch (erreklamazioaEbatzitaException e) {
			e.printStackTrace();
			fail();
		} catch (Exception e) {
			e.printStackTrace();
			fail();
		}
	}
 
	@Test
	public void test4() { // BK 10
		Mockito.when(db.find(Erreklamazioa.class, -1)).thenReturn(null);
		try {
			sut.egoeraEzarri(-1, "onartu");
			fail();
 
		} catch (NullPointerException e) {
			assertTrue(true);
		} catch (erreklamazioaEbatzitaException e) {
			e.printStackTrace();
			fail();
		} catch (Exception e) {
			e.printStackTrace();
			fail();
		}
	}
 
	@Test
	public void test5() { // BK 1,3,4,11
		erreklamazioa.setEgoera("itxaron");
		float bDirua = bidaiaria.getDirua();
		float dDirua = driver.getDirua();
		try {
			sut.egoeraEzarri(errekzbk, null);
			fail();
 
		} catch (NullPointerException e) {
			assertNull(erreklamazioa.getEgoera());
			assertEquals(bDirua, bidaiaria.getDirua(), 0.001);
			assertEquals(dDirua, driver.getDirua(), 0.001);
		} catch (erreklamazioaEbatzitaException e) {
			e.printStackTrace();
			fail();
		} catch (Exception e) {
			e.printStackTrace();
			fail();
		}
	}
 
	@Test
	public void test6() { // BK 12
		Mockito.when(db.find(Erreklamazioa.class, 999)).thenReturn(null);
		try {
			sut.egoeraEzarri(999, "onartu");
			fail();
 
		} catch (NullPointerException e) {
			assertTrue(true);
		} catch (erreklamazioaEbatzitaException e) {
			e.printStackTrace();
			fail();
		} catch (Exception e) {
			e.printStackTrace();
			fail();
		}
	}
 
	@Test
	public void test7() { // BK 13
		erreklamazioa.setEgoera("onartu");
		float bDirua = bidaiaria.getDirua();
		float dDirua = driver.getDirua();
		try {
			sut.egoeraEzarri(errekzbk, "deuseztatu");
			fail();
 
		} catch (erreklamazioaEbatzitaException e) {
			assertEquals("onartu", erreklamazioa.getEgoera());
			assertEquals(bDirua, bidaiaria.getDirua(), 0.001);
			assertEquals(dDirua, driver.getDirua(), 0.001);
		} catch (Exception e) {
			e.printStackTrace();
			fail();
		}
	}
 
	@Test
	public void test8a() { // BK 1,2,3,4,5,14: bidaiaria == null
		Erreklamazioa e8 = new Erreklamazioa(erreserba, "Deskripzio proba", null, driver);
		Mockito.when(db.find(Erreklamazioa.class, errekzbk)).thenReturn(e8);
		float dDirua = driver.getDirua();
		try {
			sut.egoeraEzarri(errekzbk, "onartu");
			fail();
 
		} catch (NullPointerException e) {
			assertEquals(dDirua, driver.getDirua(), 0.001);
		} catch (erreklamazioaEbatzitaException e) {
			e.printStackTrace();
			fail();
		} catch (Exception e) {
			e.printStackTrace();
			fail();
		}
	}
 
	@Test
	public void test8b() { // BK 1,2,3,4,5,14: driver == null 
		Erreklamazioa e8 = new Erreklamazioa(erreserba, "Deskripzio proba", bidaiaria, null);
		Mockito.when(db.find(Erreklamazioa.class, errekzbk)).thenReturn(e8);
		try {
			sut.egoeraEzarri(errekzbk, "onartu");
			fail();
 
		} catch (NullPointerException e) {
			assertTrue(true);
		} catch (erreklamazioaEbatzitaException e) {
			e.printStackTrace();
			fail();
		} catch (Exception e) {
			e.printStackTrace();
			fail();
		}
	}
}
