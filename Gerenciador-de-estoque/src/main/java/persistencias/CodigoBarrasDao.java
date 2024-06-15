package persistencias;

import java.util.List;
import model.CodigoBarras;

public class CodigoBarrasDao extends Dao {
   private static final CodigoBarrasDao instancia = new CodigoBarrasDao();
    
    private CodigoBarrasDao(){}
    
    public static CodigoBarrasDao getInstancia() {
        return instancia;
    }
    
   @Override
    public List listar() {
        em.clear();
        return em.createNativeQuery("select * from CodigoBarras p", CodigoBarras.class).getResultList();
    } 
}
