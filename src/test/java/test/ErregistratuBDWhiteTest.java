package test;

import static org.junit.Assert.*;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.junit.Test;

import dataaccess.DataAccess;
import testOperations.TestDataAccess;

public class ErregistratuBDWhiteTest {

    static DataAccess sut = new DataAccess();
    static TestDataAccess testDA = new TestDataAccess();

    @Test
    // IF1(T) IF2(F) -> false
    public void test1() {

        String email = "driver1@gmail.com";
        boolean existDriver = false;

        try {

            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
            Date jaiotzeData = sdf.parse("20/11/2003");

            testDA.open();
            existDriver = testDA.existDriver(email);

            if (!existDriver) {
                testDA.createDriver(email, "Aitor Fernandez");
            }

            testDA.close();

            sut.open();

            boolean emaitza = sut.erregistratu(
                    "Aitor",
                    "Fernandez",
                    jaiotzeData,
                    "G",
                    "Gidaria",
                    email,
                    "12345"
            );

            sut.close();

            assertFalse(emaitza);

        } catch (Exception e) {
            fail();
        } finally {

            testDA.open();

            if (!existDriver)
                testDA.removeDriver(email);

            testDA.close();
        }
    }

    @Test
    // IF1(T) IF2(T) -> true
    public void test2() {

        try {

            String email = "salvarez@gmail.com";

            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
            Date jaiotzeData = sdf.parse("27/06/2006");

            testDA.open();

            if (testDA.existDriver(email))
                testDA.removeDriver(email);

            testDA.close();


            boolean emaitza = sut.erregistratu(
            		"Sara",
            		"Alvarez",
            		jaiotzeData,
            		"E",
            		"Gidaria",
            		email,
            		"123456");


            assertTrue(emaitza);

            testDA.open();
            assertTrue(testDA.existDriver(email));
            testDA.removeDriver(email);
            testDA.close();

        } catch (Exception e) {
            fail();
        }
    }

    @Test
    // IF1(F) IF3(F) -> false
    public void test3() {

        String email = "bidaiari@gmail.com";

        try {

            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
            Date jaiotzeData = sdf.parse("14/03/2000");

            testDA.open();

            if (!testDA.existBidaiaria(email)) {
                testDA.createBidaiaria("Magdalena", "Sevillano", jaiotzeData, "E" , email, "12345");
            }

            testDA.close();

            sut.open();

            boolean emaitza = sut.erregistratu(
                    "Magdalena",
                    "Sevilla",
                    jaiotzeData,
                    "E",
                    "Bidaiaria",
                    email,
                    "12345"
            );

            sut.close();

            assertFalse(emaitza);

        } catch (Exception e) {
            fail();
        }
    }

    @Test
    // IF1(F) IF3(T) -> true
    public void test4() {

        String email = "bidaiariaNew@gmail.com";

        try {

            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
            Date jaiotzeData = sdf.parse("27/06/2006");

            testDA.open();

            if (testDA.existBidaiaria(email))
                testDA.removeBidaiaria(email);

            testDA.close();

       
            boolean emaitza = sut.erregistratu(
                    "Sara",
                    "Alvarez",
                    jaiotzeData,
                    "E",
                    "Bidaiaria",
                    email,
                    "123456"
            );

       

            assertTrue(emaitza);

            testDA.open();
            assertTrue(testDA.existBidaiaria(email));
            testDA.removeBidaiaria(email);
            testDA.close();

        } catch (Exception e) {
            fail();
        }
    }
}