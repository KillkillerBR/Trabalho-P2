package persistencias;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public abstract class Dao {
    protected EntityManagerFactory emf = Persistence.createEntityManagerFactory("Unigran_Gerenciador-de-estoque_jar_1.0-SNAPSHOTPU");
    protected EntityManager em = emf.createEntityManager();
    protected EntityTransaction etx = em.getTransaction();
    
    
    public void salvar(Object o) {
        etx.begin();
        em.persist(o);
        etx.commit();
    }
    
    public void atualiza(Object o) {
        etx.begin();
        em.merge(o);
        etx.commit();
    }
    
    public void remove(Object o) {
        etx.begin();
        em.remove(o);
        etx.commit();
    }
    
    public abstract List listar();
}
