package persistencias;

import java.util.List;
import model.Validade;

public class ValidadeDao extends Dao {
    private static final ValidadeDao instancia = new ValidadeDao();
    
    private ValidadeDao(){}
    
    public static ValidadeDao getInstancia() {
        return instancia;
    }
    
    public List listar() {
        em.clear();
        return em.createNativeQuery("select * from cidade p", Validade.class).getResultList();
    }
}
