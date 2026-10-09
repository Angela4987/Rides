package test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockedStatic;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import dataaccess.DataAccess;
import domain.*;
import exceptions.erreklamazioaEbatzitaException;

public class egoeraEzarriMockWhiteTest {
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
	private Erreklamazioa erreklamazioa;
	private int errekzbk;
	
	@Before
    public  void init() {
        MockitoAnnotations.openMocks(this);
        persistenceMock = Mockito.mockStatic(Persistence.class);
		persistenceMock.when(() -> Persistence.createEntityManagerFactory(Mockito.any())).thenReturn(entityManagerFactory);
        
        Mockito.doReturn(db).when(entityManagerFactory).createEntityManager();
		Mockito.doReturn(et).when(db).getTransaction();
	    sut=new DataAccess(db);
	    
	    bidaiaria = new Bidaiaria("bidaiariTest@ehu.eus", "Bidaiari Test","Bidaiari Test");
		driver = new Driver("driverTest@ehu.eus", "Driver Test");
		errekzbk = 1;
		Erreserba erreserba = Mockito.mock(Erreserba.class);
		Mockito.doReturn(50f).when(erreserba).getDiruIzoztua();
		erreklamazioa = new Erreklamazioa(erreserba, "Deskripzio proba", bidaiaria, driver);
		
		Mockito.when(db.find(Erreklamazioa.class, errekzbk)).thenReturn(erreklamazioa);

    }
	@After
    public  void tearDown() {
		persistenceMock.close();
    }
	
	
	@Test
	public void test1() { //Erreklamazioa ebatzita 
		erreklamazioa.setEgoera("onartu");
		float bDirua = bidaiaria.getDirua();
		float dDirua = driver.getDirua();
		try {
			sut.egoeraEzarri(errekzbk, "deuseztatu");
			fail("Salbuespena bota behar zen");
 
		} catch (erreklamazioaEbatzitaException e) {
			assertTrue(true);
			assertEquals("onartu", erreklamazioa.getEgoera());
			assertEquals(bDirua, bidaiaria.getDirua(), 0.001);
			assertEquals(dDirua, driver.getDirua(), 0.001);
		} catch (Exception e) {
			e.printStackTrace();
			fail();
		}
	}
	
	@Test
	public void test2() { //itxaron egoeratik onartu egoerara. Dirua mugitu
		erreklamazioa.setEgoera("itxaron");
		float diruIzoztua = erreklamazioa.getErreserbarenDiruIzoztua(); 
		float bDirua = bidaiaria.getDirua();
		float dDirua = driver.getDirua();
		try {
			sut.egoeraEzarri(errekzbk, "onartu");
 
			assertEquals("onartu", erreklamazioa.getEgoera());
			assertEquals(bDirua + diruIzoztua, bidaiaria.getDirua(), 0.001);
			assertEquals(dDirua - diruIzoztua, driver.getDirua(), 0.001);
			assertEquals(50f, diruIzoztua, 0.001);
 
		} catch (erreklamazioaEbatzitaException e) {
			e.printStackTrace();
			fail();
		} catch (Exception e) {
			e.printStackTrace();
			fail();
		}
	}
	
	@Test
	public void test3() { //itxaron egoeratik deuseztatu egoerara
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
	public void test4() { //itxaron egoeratik beste edozein egoerara
		erreklamazioa.setEgoera("itxaron");
		float bDirua = bidaiaria.getDirua();
		float dDirua = driver.getDirua();
		try {
			sut.egoeraEzarri(errekzbk, "berrikusi");
 
			assertEquals("berrikusi", erreklamazioa.getEgoera());
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
}