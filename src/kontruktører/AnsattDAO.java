package kontruktører;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

public class AnsattDAO {

	
	
	
private EntityManagerFactory emf;
	
	public AnsattDAO() {
		emf = Persistence.createEntityManagerFactory("ansattPersistenceUnit");
	}
public void createAnsatt(Ansatt p) {
		
		EntityManager em = emf.createEntityManager();
		EntityTransaction tx = em.getTransaction();

		try {
			tx.begin();
			em.persist(p); //Oppretter en ny rad i databasen
			tx.commit();
		
		} catch (Throwable e) {
			e.printStackTrace();
			tx.rollback();
		} finally {
			em.close();
		}
	}
	
public Ansatt retrieveAnsatt(int id) {

	EntityManager em = emf.createEntityManager();

	Ansatt p = null;
	try {
		p = em.find(Ansatt.class, id);
	} finally {
		em.close();
	}
	
	return p;
}
public List<Ansatt> retrieveAlleAnsatte() {

	EntityManager em = emf.createEntityManager();

	List<Ansatt> ansatte = null;
	try {
		TypedQuery<Ansatt> query = em.createQuery(
		        "SELECT p FROM Ansatt p", Ansatt.class);
		ansatte = query.getResultList();
	} finally {
		em.close();
	}
	return ansatte;
}
	
public void deletePerson(Ansatt p) {
	
	EntityManager em = emf.createEntityManager();

	try {
		em.getTransaction().begin();
		
		em.remove(em.find(Ansatt.class, p.getId()));
		
		em.getTransaction().commit();
	
	} catch (Throwable e) {
		e.printStackTrace();
		em.getTransaction().rollback();
	} finally {
		em.close();
	}
}
	
public Ansatt finnPersonMedId(int id) {
	EntityManager em = emf.createEntityManager();
	Ansatt p = null;

try {
    p = em.find(Ansatt.class, id);

} finally {
    em.close();
}

return p;
}
public Ansatt finnPersonMedBrukernavn(String brukernavn) {
	String queryString = "SELECT k FROM Ansatt k " + "WHERE k.brukernavn = :brukernavn";
	EntityManager em = emf.createEntityManager();
	Ansatt p = null;
	
try {
	TypedQuery<Ansatt> query = em.createQuery(queryString, Ansatt.class);
	query.setParameter("brukernavn", brukernavn);
	p = query.getSingleResult();
	

  
} finally {
    em.close();
}

return p;
}

public void updateAnsatt(int id, String nyStilling, int nyLonn) {

	EntityManager em = emf.createEntityManager();

	try {
		Ansatt p = em.find(Ansatt.class, id);
		p.setStilling(nyStilling);
		p.setManedslonn(nyLonn);
	
	} catch (Throwable e) {
		e.printStackTrace();
		em.getTransaction().rollback();
	} finally {
		em.close();
	}
}
}
