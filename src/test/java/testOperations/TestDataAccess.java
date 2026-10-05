package testOperations;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import configuration.ConfigXML;
import domain.*;



public class TestDataAccess {
	protected  EntityManager  db;
	protected  EntityManagerFactory emf;

	ConfigXML  c=ConfigXML.getInstance();


	public TestDataAccess()  {
		
		System.out.println("TestDataAccess created");

		//open();
		
	}

	
	public void open(){
		

		String fileName=c.getDbFilename();
		
		if (c.isDatabaseLocal()) {
			  emf = Persistence.createEntityManagerFactory("objectdb:"+fileName);
			  db = emf.createEntityManager();
		} else {
			Map<String, String> properties = new HashMap<String, String>();
			  properties.put("javax.persistence.jdbc.user", c.getUser());
			  properties.put("javax.persistence.jdbc.password", c.getPassword());

			  emf = Persistence.createEntityManagerFactory("objectdb://"+c.getDatabaseNode()+":"+c.getDatabasePort()+"/"+fileName, properties);

			  db = emf.createEntityManager();
    	   }
		System.out.println("TestDataAccess opened");

		
	}
	public void close(){
		db.close();
		System.out.println("TestDataAccess closed");
	}

	public boolean removeDriver(String driverEmail) {
		System.out.println(">> TestDataAccess: removeRide");
		Driver d = db.find(Driver.class, driverEmail);
		if (d!=null) {
			db.getTransaction().begin();
			db.remove(d);
			db.getTransaction().commit();
			return true;
		} else 
			return false;
    }
	public Driver createDriver(String email, String name) {
		System.out.println(">> TestDataAccess: addDriver");
		Driver driver=null;
			db.getTransaction().begin();
			try {
			    driver=new Driver(name,email);
				db.persist(driver);
				db.getTransaction().commit();
			}
			catch (Exception e){
				e.printStackTrace();
			}
			return driver;
    }
	public boolean existDriver(String email) {
		 return  db.find(Driver.class, email)!=null;
		 

	}
		
		public Driver addDriverWithRide(String email, String name, String from, String to,  Date date, int nPlaces, float price) {
			System.out.println(">> TestDataAccess: addDriverWithRide");
				Driver driver=null;
				db.getTransaction().begin();
				try {
					 driver = db.find(Driver.class, email);
					if (driver==null)
						driver=new Driver(name,email);
				    driver.addRide(from, to, date, nPlaces, price);
					db.getTransaction().commit();
					return driver;
					
				}
				catch (Exception e){
					e.printStackTrace();
				}
				return null;
	    }
		
		
		public boolean existRide(String email, String from, String to, Date date) {
			System.out.println(">> TestDataAccess: existRide");
			Driver d = db.find(Driver.class, email);
			if (d!=null) {
				return d.doesRideExists(from, to, date);
			} else 
				return false;
		}
		public Ride removeRide(String email, String from, String to, Date date ) {
			System.out.println(">> TestDataAccess: removeRide");
			Driver d = db.find(Driver.class, email);
			if (d!=null) {
				db.getTransaction().begin();
				Ride r= d.removeRide(from, to, date);
				db.getTransaction().commit();
				return r;

			} else 
			return null;

		}
		public int addErreklamazioaWithUsers(String bMail, String bName, String dMail, String dName,
				String egoera, float diruIzoztua) {
			System.out.println(">> TestDataAccess: addErreklamazioaWithUsers");
			db.getTransaction().begin();
			Bidaiaria b = null;
			if (bMail != null) {
				b = new Bidaiaria(bMail, bName, bName); // EGOKITU: zure eraikitzailearen arabera
				db.persist(b);
			}
			Driver d = null;
			if (dMail != null) {
				d = new Driver(dMail, dName); // EGOKITU: (email, name) ala (name, email)? Ikusi beheko oharra
				db.persist(d);
			}
			Erreserba erres = new Erreserba(1, null, b);
			erres.setDiruIzoztua(diruIzoztua);
			db.persist(erres);
	 
			Erreklamazioa e = new Erreklamazioa(erres, "Deskripzio proba", b, d);
			e.setEgoera(egoera);
			erres.setErreklamazioa(e);
			db.persist(e);
			db.getTransaction().commit();
			return e.getErreklamazioZenbaki();
		}
	 
		public boolean existErreklamazioa(int errekzbk) {
			return db.find(Erreklamazioa.class, errekzbk) != null;
		}
	 
		/** Erreklamazioaren egoera, edo null ez badago. */
		public String getEgoera(int errekzbk) {
			Erreklamazioa e = db.find(Erreklamazioa.class, errekzbk);
			return e == null ? null : e.getEgoera();
		}
	 
		public float getBidaiariaDirua(String mail) {
			return db.find(Bidaiaria.class, mail).getDirua();
		}
	 
		public float getDriverDirua(String mail) {
			return db.find(Driver.class, mail).getDirua();
		}
	 
		/** Erreklamazioa, bere erreserba eta erabiltzaileak ezabatzen ditu (mail == null bada, saltatu). */
		public void removeErreklamazioaWithUsers(int errekzbk, String bMail, String dMail) {
			System.out.println(">> TestDataAccess: removeErreklamazioaWithUsers");
			db.getTransaction().begin();
			Erreklamazioa e = db.find(Erreklamazioa.class, errekzbk);
			if (e != null) {
				TypedQuery<Erreserba> q = db.createQuery(
						"SELECT r FROM Erreserba r WHERE r.erreklamazioa = :e", Erreserba.class);
				q.setParameter("e", e);
				for (Erreserba r : q.getResultList())
					db.remove(r);
				db.remove(e);
			}
			if (bMail != null) {
				Bidaiaria b = db.find(Bidaiaria.class, bMail);
				if (b != null) db.remove(b);
			}
			if (dMail != null) {
				Driver d = db.find(Driver.class, dMail);
				if (d != null) db.remove(d);
			}
			db.getTransaction().commit();
		}
		public Bidaiaria createBidaiaria(String izena, String abizena, Date jaiotzeData, String sexua, String email, String pasahitza) {
		    Bidaiaria b = null;

		    db.getTransaction().begin();

		    try {
		        b = new Bidaiaria(izena, abizena, jaiotzeData, sexua, email, pasahitza);
		        db.persist(b);
		        db.getTransaction().commit();
		    } catch (Exception e) {
		        e.printStackTrace();
		    }

		    return b;
		}
		
		public boolean existBidaiaria(String email) {
		    return db.find(Bidaiaria.class, email) != null;
		}
		
		public boolean removeBidaiaria(String email) {

		    Bidaiaria b = db.find(Bidaiaria.class, email);

		    if (b != null) {
		        db.getTransaction().begin();
		        db.remove(b);
		        db.getTransaction().commit();
		        return true;
		    }

		    return false;
		}


		
}


