	 package test;

	 import static org.junit.Assert.*;

	 import java.text.SimpleDateFormat;
	 import java.util.Date;

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
	 import domain.Bidaiaria;
	 import domain.Driver;


	 public class ErregistratuMockWhiteTest {

	     DataAccess sut;

	     protected MockedStatic<Persistence> persistenceMock;

	     @Mock
	     protected EntityManagerFactory entityManagerFactory;

	     @Mock
	     protected EntityManager db;

	     @Mock
	     protected EntityTransaction et;

	     @Before
	     public void init() {

	         MockitoAnnotations.openMocks(this);

	         persistenceMock = Mockito.mockStatic(Persistence.class);

	         persistenceMock.when(
	                 () -> Persistence.createEntityManagerFactory(Mockito.any()))
	                 .thenReturn(entityManagerFactory);

	         Mockito.doReturn(db)
	                 .when(entityManagerFactory)
	                 .createEntityManager();

	         Mockito.doReturn(et)
	                 .when(db)
	                 .getTransaction();

	         sut = new DataAccess(db);
	     }

	     @After
	     public void tearDown() {
	         persistenceMock.close();
	     }

	     /**
	      * Gidaria existitzen da -> false
	      */
	     @Test
	     public void test1() {

	         try {

	             Date d = new SimpleDateFormat("dd/MM/yyyy")
	                     .parse("20/11/2003");

	             Driver driver =
	                     new Driver("Aitor Fernandez", "driver1@gmail.com");

	             Mockito.when(
	                     db.find(Driver.class, "driver1@gmail.com"))
	                     .thenReturn(driver);

	             boolean result = sut.erregistratu(
	                     "Aitor",
	                     "Fernandez",
	                     d,
	                     "Gizona",
	                     "Gidaria",
	                     "driver1@gmail.com",
	                     "12345");

	             assertFalse(result);

	         } catch (Exception e) {
	             fail();
	         }
	     }

	     /**
	      * Gidaria ez dago -> true
	      */
	     @Test
	     public void test2() {

	         try {

	             Date d = new SimpleDateFormat("dd/MM/yyyy")
	                     .parse("27/06/2006");

	             Mockito.when(
	                     db.find(Driver.class, "salvarez@gmail.com"))
	                     .thenReturn(null);

	             boolean result = sut.erregistratu(
	                     "Sara",
	                     "Alvarez",
	                     d,
	                     "Emakumea",
	                     "Gidaria",
	                     "salvarez@gmail.com",
	                     "123456");

	             assertTrue(result);

	             Mockito.verify(db)
	                     .persist(Mockito.any(Driver.class));

	         } catch (Exception e) {
	             fail();
	         }
	     }

	     /**
	      * Bidaiaria existitzen da -> false
	      */
	     @Test
	     public void test3() {

	         try {

	             Date d = new SimpleDateFormat("dd/MM/yyyy")
	                     .parse("14/03/2000");

	             Bidaiaria b =
	                     new Bidaiaria(
	                             "Magdalena",
	                             "Sevillano",
	                             d,
	                             "E",
	                             "bidaiari@gmail.com",
	                             "12345");

	             Mockito.when(
	                     db.find(Bidaiaria.class,
	                             "bidaiari@gmail.com"))
	                     .thenReturn(b);

	             boolean result = sut.erregistratu(
	                     "Magdalena",
	                     "Sevillano",
	                     d,
	                     "Emakumea",
	                     "Bidaiari",
	                     "bidaiari@gmail.com",
	                     "12345");

	             assertFalse(result);

	         } catch (Exception e) {
	             fail();
	         }
	     }

	     /**
	      * Bidaiaria ez dago -> true
	      */
	     @Test
	     public void test4() {

	         try {

	             Date d = new SimpleDateFormat("dd/MM/yyyy")
	                     .parse("27/06/2006");

	             Mockito.when(
	                     db.find(Bidaiaria.class,
	                             "salvarez@gmail.com"))
	                     .thenReturn(null);

	             boolean result = sut.erregistratu(
	                     "Sara",
	                     "Alvarez",
	                     d,
	                     "Emakumea",
	                     "Bidaiari",
	                     "salvarez@gmail.com",
	                     "123456");

	             assertTrue(result);

	             Mockito.verify(db)
	                     .persist(Mockito.any(Bidaiaria.class));

	         } catch (Exception e) {
	             fail();
	         }
	     }
	 }
